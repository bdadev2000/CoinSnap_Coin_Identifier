package com.mbridge.msdk.foundation.controller.authoritycontroller;

import com.mbridge.msdk.MBridgeConstans;

/* loaded from: classes3.dex */
public class a {
    public final void a(int i9) {
        com.mbridge.msdk.foundation.a.a.a.a().a(MBridgeConstans.AUTHORITY_GENERAL_DATA, String.valueOf(i9));
        com.mbridge.msdk.foundation.a.a.a.a().a(MBridgeConstans.AUTHORITY_DEVICE_ID, String.valueOf(i9));
        com.mbridge.msdk.foundation.a.a.a.a().a(MBridgeConstans.AUTHORITY_SERIAL_ID, String.valueOf(i9));
    }

    public void authDeviceIdStatus(int i9) {
        com.mbridge.msdk.foundation.a.a.a.a().a(MBridgeConstans.AUTHORITY_DEVICE_ID, String.valueOf(i9));
    }

    public void authGenDataStatus(int i9) {
        com.mbridge.msdk.foundation.a.a.a.a().a(MBridgeConstans.AUTHORITY_GENERAL_DATA, String.valueOf(i9));
    }

    public void authOther(int i9) {
        com.mbridge.msdk.foundation.a.a.a.a().a(MBridgeConstans.AUTHORITY_OTHER, String.valueOf(i9));
    }

    public void authSerialIdStatus(int i9) {
        com.mbridge.msdk.foundation.a.a.a.a().a(MBridgeConstans.AUTHORITY_SERIAL_ID, String.valueOf(i9));
    }

    public int getAuthDeviceIdStatus() {
        if (!com.mbridge.msdk.foundation.a.a.a.a().a(MBridgeConstans.AUTHORITY_DEVICE_ID).equals("")) {
            return Integer.parseInt(com.mbridge.msdk.foundation.a.a.a.a().a(MBridgeConstans.AUTHORITY_DEVICE_ID));
        }
        return 1;
    }

    public int getAuthGenDataStatus() {
        if (!com.mbridge.msdk.foundation.a.a.a.a().a(MBridgeConstans.AUTHORITY_GENERAL_DATA).equals("")) {
            return Integer.parseInt(com.mbridge.msdk.foundation.a.a.a.a().a(MBridgeConstans.AUTHORITY_GENERAL_DATA));
        }
        return 1;
    }

    public int getAuthSerialIdStatus() {
        if (!com.mbridge.msdk.foundation.a.a.a.a().a(MBridgeConstans.AUTHORITY_SERIAL_ID).equals("")) {
            return Integer.parseInt(com.mbridge.msdk.foundation.a.a.a.a().a(MBridgeConstans.AUTHORITY_SERIAL_ID));
        }
        return 1;
    }
}
