package com.istic.sitac_echec;

import android.os.Bundle;
import android.view.Menu;
import com.istic.sit.R;

import com.istic.sit.framework.view.ChessBoard;


public class ChessBoardActivity extends ChessBoard {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.chess_board);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
