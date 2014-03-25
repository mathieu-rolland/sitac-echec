package com.istic.sitac_echec.listeners.dnd;

import android.content.ClipData;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.DragShadowBuilder;
import android.view.View.OnTouchListener;

/**
 * Listener permettant de définir le comportement d'un élément au touché de celui-ci.
 * 
 * @author Anthony LE MEE
 */
public class TouchListener implements OnTouchListener {

	/**
	 * @param view
	 *            La vue de l'élément touché.
	 * @param motionEvent
	 *            L'action effectuée sur l'élément.
	 */
	public boolean onTouch(View view, MotionEvent motionEvent) {
		
		if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
			
			ClipData data = ClipData.newPlainText("", "");
			DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(view);
			view.startDrag(data, shadowBuilder, view, 0);
			view.setVisibility(View.INVISIBLE);
			return true;
			
		} else {
			return false;
		}
		
	} // method
	
} // class
