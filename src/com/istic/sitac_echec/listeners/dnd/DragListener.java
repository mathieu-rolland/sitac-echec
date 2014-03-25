package com.istic.sitac_echec.listeners.dnd;

import android.graphics.Color;
import android.view.DragEvent;
import android.view.View;
import android.view.View.OnDragListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/**
 * Listener permettant de définir le comportement d'un élément une fois déplacé.
 * 
 * @author Anthony LE MEE
 */
public class DragListener implements OnDragListener {

	/**
	 * @param view
	 *            La vue de l'élément déplacé.
	 * @param motionEvent
	 *            L'action effectuée sur l'élément.
	 */
	@Override
	public boolean onDrag(View v, DragEvent event) {
		
		int action = event.getAction();
		switch (action) {
			case DragEvent.ACTION_DRAG_STARTED:
				// do nothing
				break;
			case DragEvent.ACTION_DRAG_ENTERED:
				v.setBackgroundColor(Color.RED);
				break;
			case DragEvent.ACTION_DRAG_EXITED:
				v.setBackgroundColor(Color.YELLOW);
				break;
			case DragEvent.ACTION_DROP:
				// Dropped, reassign View to ViewGroup
				View view = (View) event.getLocalState();
				ViewGroup owner = (ViewGroup) view.getParent();
				owner.removeView(view);
				LinearLayout container = (LinearLayout) v;
				container.addView(view);
				view.setVisibility(View.VISIBLE);
				break;
			case DragEvent.ACTION_DRAG_ENDED:
				v.setBackgroundColor(Color.MAGENTA);
			default:
				break;
		}
		
		return true;
	
	}

} // class
