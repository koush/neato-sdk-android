package com.neatorobotics.sdk.android.robotservices.spotcleaning;

/**
 * Neato
 * Created by Marco on 04/01/2017.
 * Copyright © 2016 Neato Robotics. All rights reserved.
 */

public class SpotCleaningBasic2Service extends SpotCleaningService {

    private static final String TAG = "SpotCleaningBasic2";

    @Override
    public boolean isEcoModeSupported() {
        return true;
    }

    @Override
    public boolean isTurboModeSupported() {
        return true;
    }

    @Override
    public boolean isExtraCareModeSupported() {
        return true;
    }

    @Override
    public boolean isCleaningAreaSupported() {
        return true;
    }

    @Override
    public boolean isCleaningFrequencySupported() {
        return true;
    }

}
