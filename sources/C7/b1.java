package c7;

import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentTransaction;

/* loaded from: classes3.dex */
public class b1 {
    public static final a1 Companion = new a1(null);
    private String androidId;
    private String appSetId;
    private float batteryLevel;
    private int batterySaverEnabled;
    private String batteryState;
    private String connectionType;
    private String connectionTypeDetail;
    private boolean isGooglePlayServicesAvailable;
    private boolean isSideloadEnabled;
    private boolean isTv;
    private String language;
    private String locale;
    private String osName;
    private int sdCardAvailable;
    private int soundEnabled;
    private String timeZone;
    private float volumeLevel;

    public b1() {
        this.soundEnabled = 1;
        this.sdCardAvailable = 1;
    }

    public static final void write$Self(b1 b1Var, d8.b bVar, c8.g gVar) {
        G7.j.e(b1Var, "self");
        if (Q7.n0.u(bVar, "output", gVar, "serialDesc", gVar) || b1Var.androidId != null) {
            bVar.u(gVar, 0, e8.k0.f20172a, b1Var.androidId);
        }
        if (bVar.o(gVar) || b1Var.isGooglePlayServicesAvailable) {
            bVar.v(gVar, 1, b1Var.isGooglePlayServicesAvailable);
        }
        if (bVar.o(gVar) || b1Var.appSetId != null) {
            bVar.u(gVar, 2, e8.k0.f20172a, b1Var.appSetId);
        }
        if (bVar.o(gVar) || !Float.valueOf(b1Var.batteryLevel).equals(Float.valueOf(0.0f))) {
            bVar.t(gVar, 3, b1Var.batteryLevel);
        }
        if (bVar.o(gVar) || b1Var.batteryState != null) {
            bVar.u(gVar, 4, e8.k0.f20172a, b1Var.batteryState);
        }
        if (bVar.o(gVar) || b1Var.batterySaverEnabled != 0) {
            bVar.C(5, b1Var.batterySaverEnabled, gVar);
        }
        if (bVar.o(gVar) || b1Var.connectionType != null) {
            bVar.u(gVar, 6, e8.k0.f20172a, b1Var.connectionType);
        }
        if (bVar.o(gVar) || b1Var.connectionTypeDetail != null) {
            bVar.u(gVar, 7, e8.k0.f20172a, b1Var.connectionTypeDetail);
        }
        if (bVar.o(gVar) || b1Var.locale != null) {
            bVar.u(gVar, 8, e8.k0.f20172a, b1Var.locale);
        }
        if (bVar.o(gVar) || b1Var.language != null) {
            bVar.u(gVar, 9, e8.k0.f20172a, b1Var.language);
        }
        if (bVar.o(gVar) || b1Var.timeZone != null) {
            bVar.u(gVar, 10, e8.k0.f20172a, b1Var.timeZone);
        }
        if (bVar.o(gVar) || !Float.valueOf(b1Var.volumeLevel).equals(Float.valueOf(0.0f))) {
            bVar.t(gVar, 11, b1Var.volumeLevel);
        }
        if (bVar.o(gVar) || b1Var.soundEnabled != 1) {
            bVar.C(12, b1Var.soundEnabled, gVar);
        }
        if (bVar.o(gVar) || b1Var.isTv) {
            bVar.v(gVar, 13, b1Var.isTv);
        }
        if (bVar.o(gVar) || b1Var.sdCardAvailable != 1) {
            bVar.C(14, b1Var.sdCardAvailable, gVar);
        }
        if (bVar.o(gVar) || b1Var.isSideloadEnabled) {
            bVar.v(gVar, 15, b1Var.isSideloadEnabled);
        }
        if (bVar.o(gVar) || b1Var.osName != null) {
            bVar.u(gVar, 16, e8.k0.f20172a, b1Var.osName);
        }
    }

    public final String getAndroidId() {
        return this.androidId;
    }

    public final String getAppSetId() {
        return this.appSetId;
    }

    public final float getBatteryLevel() {
        return this.batteryLevel;
    }

    public final int getBatterySaverEnabled() {
        return this.batterySaverEnabled;
    }

    public final String getBatteryState() {
        return this.batteryState;
    }

    public final String getConnectionType() {
        return this.connectionType;
    }

    public final String getConnectionTypeDetail() {
        return this.connectionTypeDetail;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getLocale() {
        return this.locale;
    }

    public final String getOsName() {
        return this.osName;
    }

    public final int getSdCardAvailable() {
        return this.sdCardAvailable;
    }

    public final int getSoundEnabled() {
        return this.soundEnabled;
    }

    public final String getTimeZone() {
        return this.timeZone;
    }

    public final float getVolumeLevel() {
        return this.volumeLevel;
    }

    public final boolean isGooglePlayServicesAvailable() {
        return this.isGooglePlayServicesAvailable;
    }

    public final boolean isSideloadEnabled() {
        return this.isSideloadEnabled;
    }

    public final boolean isTv() {
        return this.isTv;
    }

    public final void setAndroidId(String str) {
        this.androidId = str;
    }

    public final void setAppSetId(String str) {
        this.appSetId = str;
    }

    public final void setBatteryLevel(float f9) {
        this.batteryLevel = f9;
    }

    public final void setBatterySaverEnabled(int i9) {
        this.batterySaverEnabled = i9;
    }

    public final void setBatteryState(String str) {
        this.batteryState = str;
    }

    public final void setConnectionType(String str) {
        this.connectionType = str;
    }

    public final void setConnectionTypeDetail(String str) {
        this.connectionTypeDetail = str;
    }

    public final void setGooglePlayServicesAvailable(boolean z8) {
        this.isGooglePlayServicesAvailable = z8;
    }

    public final void setLanguage(String str) {
        this.language = str;
    }

    public final void setLocale(String str) {
        this.locale = str;
    }

    public final void setOsName(String str) {
        this.osName = str;
    }

    public final void setSdCardAvailable(int i9) {
        this.sdCardAvailable = i9;
    }

    public final void setSideloadEnabled(boolean z8) {
        this.isSideloadEnabled = z8;
    }

    public final void setSoundEnabled(int i9) {
        this.soundEnabled = i9;
    }

    public final void setTimeZone(String str) {
        this.timeZone = str;
    }

    public final void setTv(boolean z8) {
        this.isTv = z8;
    }

    public final void setVolumeLevel(float f9) {
        this.volumeLevel = f9;
    }

    public /* synthetic */ b1(int i9, String str, boolean z8, String str2, float f9, String str3, int i10, String str4, String str5, String str6, String str7, String str8, float f10, int i11, boolean z9, int i12, boolean z10, String str9, e8.g0 g0Var) {
        if ((i9 & 1) == 0) {
            this.androidId = null;
        } else {
            this.androidId = str;
        }
        if ((i9 & 2) == 0) {
            this.isGooglePlayServicesAvailable = false;
        } else {
            this.isGooglePlayServicesAvailable = z8;
        }
        if ((i9 & 4) == 0) {
            this.appSetId = null;
        } else {
            this.appSetId = str2;
        }
        if ((i9 & 8) == 0) {
            this.batteryLevel = 0.0f;
        } else {
            this.batteryLevel = f9;
        }
        if ((i9 & 16) == 0) {
            this.batteryState = null;
        } else {
            this.batteryState = str3;
        }
        if ((i9 & 32) == 0) {
            this.batterySaverEnabled = 0;
        } else {
            this.batterySaverEnabled = i10;
        }
        if ((i9 & 64) == 0) {
            this.connectionType = null;
        } else {
            this.connectionType = str4;
        }
        if ((i9 & 128) == 0) {
            this.connectionTypeDetail = null;
        } else {
            this.connectionTypeDetail = str5;
        }
        if ((i9 & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
            this.locale = null;
        } else {
            this.locale = str6;
        }
        if ((i9 & 512) == 0) {
            this.language = null;
        } else {
            this.language = str7;
        }
        if ((i9 & 1024) == 0) {
            this.timeZone = null;
        } else {
            this.timeZone = str8;
        }
        if ((i9 & 2048) == 0) {
            this.volumeLevel = 0.0f;
        } else {
            this.volumeLevel = f10;
        }
        if ((i9 & 4096) == 0) {
            this.soundEnabled = 1;
        } else {
            this.soundEnabled = i11;
        }
        if ((i9 & FragmentTransaction.TRANSIT_EXIT_MASK) == 0) {
            this.isTv = false;
        } else {
            this.isTv = z9;
        }
        if ((i9 & 16384) == 0) {
            this.sdCardAvailable = 1;
        } else {
            this.sdCardAvailable = i12;
        }
        if ((32768 & i9) == 0) {
            this.isSideloadEnabled = false;
        } else {
            this.isSideloadEnabled = z10;
        }
        if ((i9 & 65536) == 0) {
            this.osName = null;
        } else {
            this.osName = str9;
        }
    }

    public static /* synthetic */ void getAndroidId$annotations() {
    }

    public static /* synthetic */ void getAppSetId$annotations() {
    }

    public static /* synthetic */ void getBatteryLevel$annotations() {
    }

    public static /* synthetic */ void getBatterySaverEnabled$annotations() {
    }

    public static /* synthetic */ void getBatteryState$annotations() {
    }

    public static /* synthetic */ void getConnectionType$annotations() {
    }

    public static /* synthetic */ void getConnectionTypeDetail$annotations() {
    }

    public static /* synthetic */ void getOsName$annotations() {
    }

    public static /* synthetic */ void getSdCardAvailable$annotations() {
    }

    public static /* synthetic */ void getSoundEnabled$annotations() {
    }

    public static /* synthetic */ void getTimeZone$annotations() {
    }

    public static /* synthetic */ void getVolumeLevel$annotations() {
    }

    public static /* synthetic */ void isGooglePlayServicesAvailable$annotations() {
    }

    public static /* synthetic */ void isSideloadEnabled$annotations() {
    }

    public static /* synthetic */ void isTv$annotations() {
    }
}
