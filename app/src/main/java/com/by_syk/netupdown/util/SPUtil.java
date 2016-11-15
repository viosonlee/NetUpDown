package com.by_syk.netupdown.util;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Author:李烽
 * Date:2016-11-10
 * FIXME
 * Todo
 */

public class SPUtil {
    private static final String LOCATION = "location";
    private static final String LOCATION_X = "locationX";
    private static final String LOCATION_Y = "locationY";
    private static final String CAN_MOVE = "can_move";
    private static SharedPreferences preferences;

    private static SharedPreferences getPreferences(Context context) {
        if (preferences == null)
            preferences = context.getSharedPreferences(LOCATION, Context.MODE_PRIVATE);
        return preferences;
    }

    public static void saveLocationX(Context context, int x) {
        getPreferences(context).edit().putInt(LOCATION_X, x).commit();
    }

    public static void saveLocationY(Context context, int y) {
        getPreferences(context).edit().putInt(LOCATION_Y, y).commit();
    }

    public static int getLocationX(Context context) {
        return getPreferences(context).getInt(LOCATION_X, 0);
    }

    public static int getLocationY(Context context) {
        return getPreferences(context).getInt(LOCATION_Y, 0);
    }

    public static void saveCanMove(Context context, boolean canMove) {
        getPreferences(context).edit().putBoolean(CAN_MOVE, canMove);
    }

    public static boolean getCanMove(Context c) {
        return getPreferences(c).getBoolean(CAN_MOVE, false);
    }
}
