package com.istic.sitac_echec;

import android.os.Bundle;
import com.istic.sit.framework.view.MainActivity;


public class ChessBoardActivity extends MainActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		initializeBackground(TypeBackgroundEnum.Board);
	}
}
