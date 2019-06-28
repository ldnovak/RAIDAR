package edu.mit.cxsci.raidar.asset.model.raidarp;

import edu.mit.cxsci.raidar.asset.model.raider.marc.pointer.*;

/**
*
* @author Mizanul H. Chowdhuury
* @version 1.0
**/

public class PreviewDetails {
	private StartPoint startPoint;
	private ExpressionType expressionType;

	public StartPoint getStartPoint() {
		return startPoint;
	}
	public void setStartPoint(StartPoint startPoint) {
		this.startPoint = startPoint;
	}
	public ExpressionType getExpressionType() {
		return expressionType;
	}
	public void setExpressionType(ExpressionType expressionType) {
		this.expressionType = expressionType;
	}



}
