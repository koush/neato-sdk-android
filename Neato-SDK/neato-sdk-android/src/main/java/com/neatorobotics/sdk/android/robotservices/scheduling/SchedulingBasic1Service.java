package com.neatorobotics.sdk.android.robotservices.scheduling;

/**
 * Neato
 * Created by Marco on 04/01/2017.
 * Copyright © 2016 Neato Robotics. All rights reserved.
 */

public class SchedulingBasic1Service extends SchedulingService {

    private static final String TAG = "SchedulingBasic1";

    @Override
    public boolean isEcoModeSupported() {
        return true;
    }

    @Override
    public boolean isTurboModeSupported() {
        return true;
    }
}
