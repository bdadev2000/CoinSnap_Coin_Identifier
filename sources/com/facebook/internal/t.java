package com.facebook.internal;

import android.R;
import com.applovin.sdk.AppLovinMediationProvider;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;

/* loaded from: classes3.dex */
public enum t {
    Unknown(-1),
    Core(0),
    AppEvents(C.DEFAULT_BUFFER_SEGMENT_SIZE),
    CodelessEvents(65792),
    CloudBridge(67584),
    RestrictiveDataFiltering(66048),
    AAM(66304),
    PrivacyProtection(66560),
    SuggestedEvents(66561),
    IntelligentIntegrity(66562),
    ModelRequest(66563),
    ProtectedMode(66564),
    MACARuleMatching(66565),
    EventDeactivation(66816),
    OnDeviceEventProcessing(67072),
    OnDevicePostInstallEventProcessing(67073),
    IapLogging(67328),
    IapLoggingLib2(67329),
    Instrument(131072),
    CrashReport(131328),
    CrashShield(131329),
    ThreadCheck(131330),
    ErrorReport(131584),
    AnrReport(131840),
    Monitoring(196608),
    ServiceUpdateCompliance(196864),
    /* JADX INFO: Fake field, exist only in values array */
    Login(262144),
    /* JADX INFO: Fake field, exist only in values array */
    Elora(327680),
    /* JADX INFO: Fake field, exist only in values array */
    Login(16777216),
    ChromeCustomTabsPrefetching(R.attr.theme),
    IgnoreAppSwitchToLoggedOut(R.id.background),
    BypassAppSwitch(R.style.Animation),
    /* JADX INFO: Fake field, exist only in values array */
    Share(33554432);


    /* renamed from: b, reason: collision with root package name */
    public final int f11100b;

    t(int i10) {
        this.f11100b = i10;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static t[] valuesCustom() {
        return (t[]) Arrays.copyOf(values(), 33);
    }

    @Override // java.lang.Enum
    public final String toString() {
        switch (ordinal()) {
            case 1:
                return "CoreKit";
            case 2:
                return "AppEvents";
            case 3:
                return "CodelessEvents";
            case 4:
                return "AppEventsCloudbridge";
            case 5:
                return "RestrictiveDataFiltering";
            case 6:
                return "AAM";
            case 7:
                return "PrivacyProtection";
            case 8:
                return "SuggestedEvents";
            case 9:
                return "IntelligentIntegrity";
            case 10:
                return "ModelRequest";
            case 11:
                return "ProtectedMode";
            case 12:
                return "MACARuleMatching";
            case 13:
                return "EventDeactivation";
            case 14:
                return "OnDeviceEventProcessing";
            case 15:
                return "OnDevicePostInstallEventProcessing";
            case 16:
                return "IAPLogging";
            case 17:
                return "IAPLoggingLib2";
            case 18:
                return "Instrument";
            case 19:
                return "CrashReport";
            case 20:
                return "CrashShield";
            case 21:
                return "ThreadCheck";
            case 22:
                return "ErrorReport";
            case 23:
                return "AnrReport";
            case 24:
                return "Monitoring";
            case 25:
                return "ServiceUpdateCompliance";
            case 26:
                return "Megatron";
            case 27:
                return "Elora";
            case 28:
                return "LoginKit";
            case NOTIFICATION_REDIRECT_VALUE:
                return "ChromeCustomTabsPrefetching";
            case 30:
                return "IgnoreAppSwitchToLoggedOut";
            case TEMPLATE_HTML_SIZE_VALUE:
                return "BypassAppSwitch";
            case 32:
                return "ShareKit";
            default:
                return AppLovinMediationProvider.UNKNOWN;
        }
    }
}
