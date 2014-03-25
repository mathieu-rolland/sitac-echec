package com.istic.sitac_echec.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;

import com.istic.sitac_echec.R;
import com.istic.sitac_echec.listeners.dnd.DragListener;
import com.istic.sitac_echec.listeners.dnd.TouchListener;

/**
 * Adaptor for gridView's cases (ie. cases of board chess)
 * 
 * @author Anthony LE MEE
 * 
 */
public class CaseBoardAdapter extends BaseAdapter {

	/**
	 * Context which will be used later
	 */
	private Context context;
	
	/**
	 * Modele représentant l'ensemble des cases du plateau
	 */
	private String[] chessBoardConfiguration = new String[64];

	/**
	 * Constructor
	 * 
	 * @param c
	 *            Context
	 */
	public CaseBoardAdapter(Context c) {

		this.setContext(c);
		
		// Initialisation des cases du plateau
		this.chessBoardConfiguration = new String[] { 
				"wp", "bp","wp", "bp","wp", "bp","wp", "bp",
				"bp", "wp","bp", "wp","bp", "wp","bp", "wp",
				"w", "b","w", "b","w", "b","w", "b",
				"b", "w","b", "w","b", "w","b", "w",
				"w", "b","w", "b","w", "b","w", "b",
				"b", "w","b", "w","b", "w","b", "w",
				"wp", "bp","wp", "bp","wp", "bp","wp", "bp",
				"bp", "wp","bp", "wp","bp", "wp","bp", "wp"
				};

	}

	@Override
	public int getCount() {
		return this.chessBoardConfiguration.length;
	}

	@Override
	public Object getItem(int position) {
		return null;
	}

	@Override
	public long getItemId(int position) {
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		RelativeLayout layout;
		LayoutInflater inflater = (LayoutInflater) getContext()
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

		if (convertView != null) {
			layout = (RelativeLayout) convertView;
		} else {
			layout = (RelativeLayout) inflater.inflate(R.layout.case_chess,
					null);

			if (this.chessBoardConfiguration[position].equals("b")) {
				layout.setBackgroundDrawable(context.getResources().getDrawable(R.drawable.black));
				layout.findViewById(R.id.case_pawn).setBackgroundDrawable(context.getResources().getDrawable(R.drawable.no_pawn));
				layout.findViewById(R.id.case_pawn).setOnDragListener(new DragListener());
			} else if (this.chessBoardConfiguration[position].equals("w")) {
				layout.setBackgroundDrawable(context.getResources().getDrawable(R.drawable.white));
				layout.findViewById(R.id.case_pawn).setBackgroundDrawable(context.getResources().getDrawable(R.drawable.no_pawn));
				layout.findViewById(R.id.case_pawn).setOnDragListener(new DragListener());
			} else if (this.chessBoardConfiguration[position].equals("wp")) {
				layout.setBackgroundDrawable(context.getResources().getDrawable(R.drawable.white));
				layout.findViewById(R.id.case_pawn).setBackgroundDrawable(context.getResources().getDrawable(R.drawable.fou_blanc));
				layout.findViewById(R.id.case_pawn).setOnDragListener(new DragListener());
			} else if (this.chessBoardConfiguration[position].equals("bp")) {
				layout.setBackgroundDrawable(context.getResources().getDrawable(R.drawable.black));
				layout.findViewById(R.id.case_pawn).setBackgroundDrawable(context.getResources().getDrawable(R.drawable.fou_blanc));
				layout.findViewById(R.id.case_pawn).setOnDragListener(new DragListener());
				layout.findViewById(R.id.case_pawn).setOnTouchListener(new TouchListener());
			}
			
		}

		return layout;

	}

	/**
	 * @return the context
	 */
	public Context getContext() {
		return context;
	}

	/**
	 * @param context
	 *            the context to set
	 */
	public void setContext(Context context) {
		this.context = context;
	}

} // class
