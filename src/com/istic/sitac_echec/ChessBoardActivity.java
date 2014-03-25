package com.istic.sitac_echec;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.GridView;

import com.istic.sit.framework.api.model.IEntity;
import com.istic.sit.framework.view.BoardFragment;
import com.istic.sit.framework.view.MainActivity;
import com.istic.sitac_echec.adapters.CaseBoardAdapter;


public class ChessBoardActivity extends MainActivity {

	/**
	 * MY preferences
	 */
	private static final int MY_BACKGROUND_COLOR = Color.BLACK;
	private static final int MY_NUM_COLUMNS = 8;
	private static final int MY_STRETCH_MODE = GridView.STRETCH_COLUMN_WIDTH;
	private static final int MY_VERTICAL_SPACING = 0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		
		// Initialisation a board
		initializeBackground(TypeBackgroundEnum.Board, savedInstanceState);
		
	}
	
	@Override
	public void onStart() {
		
		super.onStart();
		
		// Retrieve boardFragment
		BoardFragment boardFragment = ((BoardFragment)getFragment());
		
		// Set MY preferences
		boardFragment.setBackgroundColor(MY_BACKGROUND_COLOR);
		boardFragment.setBoardNumColumns(MY_NUM_COLUMNS);
		boardFragment.setBoardStretchMode(MY_STRETCH_MODE);
		boardFragment.setBoardVerticalSpacing(MY_VERTICAL_SPACING);
		boardFragment.setBoardCasesAdapter(new CaseBoardAdapter(this));
		
	}


	public void move( IEntity from , int x, int y ){
		//initializeBackground(TypeBackgroundEnum.Board, savedInstanceState);
	}

	@Override
	public void onCreateSlideMenu() {
		this.addItemMenu(getResources().getString(R.string.menu_exit));
	}

	@Override
	public void onItemMenuClicked(int position, View view) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onItemMenuLongClicked(int position, View view) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean onActionDropFromMenu() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
