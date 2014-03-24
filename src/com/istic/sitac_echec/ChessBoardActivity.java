package com.istic.sitac_echec;

import android.os.Bundle;

import com.istic.sit.framework.view.MainActivity;


public class ChessBoardActivity extends MainActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		initializeBackground(TypeBackgroundEnum.Board, savedInstanceState);
	}

	@Override
	public void onCreateSlideMenu() {
		this.addItemMenu(getResources().getString(R.string.menu_exit));
	}

	@Override
	public void onItemMenuClicked(int position) {
		// TODO Auto-generated method stub
		
	}
}
