package c7;

import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentTransaction;
import e8.C2228c;
import e8.C2231f;
import java.util.List;

/* loaded from: classes3.dex */
public final class U0 {
    public static final C0641m0 Companion = new C0641m0(null);
    private final L cleverCache;
    private final C0647p0 config;
    private final String configExtension;
    private final C0652s0 crashReport;
    private final Boolean disableAdId;
    private final C0658v0 endpoints;
    private final C0664y0 gdpr;
    private final B0 isAdDownloadOptEnabled;
    private final Boolean isCacheableAssetsRequired;
    private final K0 isReportIncentivizedEnabled;
    private final E0 logMetricsSettings;
    private final H0 loggingEnabled;
    private final List<p1> placements;
    private final Boolean rtaDebugging;
    private final N0 session;
    private final Integer signalSessionTimeout;
    private final Boolean signalsDisabled;
    private final Q0 template;
    private final T0 viewability;

    public U0() {
        this((C0658v0) null, (List) null, (C0647p0) null, (C0664y0) null, (H0) null, (C0652s0) null, (T0) null, (B0) null, (K0) null, (Boolean) null, (String) null, (Q0) null, (E0) null, (N0) null, (L) null, (Boolean) null, (Boolean) null, (Integer) null, (Boolean) null, 524287, (G7.f) null);
    }

    public static final void write$Self(U0 u02, d8.b bVar, c8.g gVar) {
        G7.j.e(u02, "self");
        if (Q7.n0.u(bVar, "output", gVar, "serialDesc", gVar) || u02.endpoints != null) {
            bVar.u(gVar, 0, C0654t0.INSTANCE, u02.endpoints);
        }
        if (bVar.o(gVar) || u02.placements != null) {
            bVar.u(gVar, 1, new C2228c(n1.INSTANCE, 0), u02.placements);
        }
        if (bVar.o(gVar) || u02.config != null) {
            bVar.u(gVar, 2, C0643n0.INSTANCE, u02.config);
        }
        if (bVar.o(gVar) || u02.gdpr != null) {
            bVar.u(gVar, 3, C0660w0.INSTANCE, u02.gdpr);
        }
        if (bVar.o(gVar) || u02.loggingEnabled != null) {
            bVar.u(gVar, 4, F0.INSTANCE, u02.loggingEnabled);
        }
        if (bVar.o(gVar) || u02.crashReport != null) {
            bVar.u(gVar, 5, C0649q0.INSTANCE, u02.crashReport);
        }
        if (bVar.o(gVar) || u02.viewability != null) {
            bVar.u(gVar, 6, R0.INSTANCE, u02.viewability);
        }
        if (bVar.o(gVar) || u02.isAdDownloadOptEnabled != null) {
            bVar.u(gVar, 7, C0666z0.INSTANCE, u02.isAdDownloadOptEnabled);
        }
        if (bVar.o(gVar) || u02.isReportIncentivizedEnabled != null) {
            bVar.u(gVar, 8, I0.INSTANCE, u02.isReportIncentivizedEnabled);
        }
        if (bVar.o(gVar) || !G7.j.a(u02.disableAdId, Boolean.TRUE)) {
            bVar.u(gVar, 9, C2231f.f20162a, u02.disableAdId);
        }
        if (bVar.o(gVar) || u02.configExtension != null) {
            bVar.u(gVar, 10, e8.k0.f20172a, u02.configExtension);
        }
        if (bVar.o(gVar) || u02.template != null) {
            bVar.u(gVar, 11, O0.INSTANCE, u02.template);
        }
        if (bVar.o(gVar) || u02.logMetricsSettings != null) {
            bVar.u(gVar, 12, C0.INSTANCE, u02.logMetricsSettings);
        }
        if (bVar.o(gVar) || u02.session != null) {
            bVar.u(gVar, 13, L0.INSTANCE, u02.session);
        }
        if (bVar.o(gVar) || u02.cleverCache != null) {
            bVar.u(gVar, 14, J.INSTANCE, u02.cleverCache);
        }
        if (bVar.o(gVar) || u02.rtaDebugging != null) {
            bVar.u(gVar, 15, C2231f.f20162a, u02.rtaDebugging);
        }
        if (bVar.o(gVar) || u02.isCacheableAssetsRequired != null) {
            bVar.u(gVar, 16, C2231f.f20162a, u02.isCacheableAssetsRequired);
        }
        if (bVar.o(gVar) || u02.signalSessionTimeout != null) {
            bVar.u(gVar, 17, e8.K.f20127a, u02.signalSessionTimeout);
        }
        if (bVar.o(gVar) || u02.signalsDisabled != null) {
            bVar.u(gVar, 18, C2231f.f20162a, u02.signalsDisabled);
        }
    }

    public final C0658v0 component1() {
        return this.endpoints;
    }

    public final Boolean component10() {
        return this.disableAdId;
    }

    public final String component11() {
        return this.configExtension;
    }

    public final Q0 component12() {
        return this.template;
    }

    public final E0 component13() {
        return this.logMetricsSettings;
    }

    public final N0 component14() {
        return this.session;
    }

    public final L component15() {
        return this.cleverCache;
    }

    public final Boolean component16() {
        return this.rtaDebugging;
    }

    public final Boolean component17() {
        return this.isCacheableAssetsRequired;
    }

    public final Integer component18() {
        return this.signalSessionTimeout;
    }

    public final Boolean component19() {
        return this.signalsDisabled;
    }

    public final List<p1> component2() {
        return this.placements;
    }

    public final C0647p0 component3() {
        return this.config;
    }

    public final C0664y0 component4() {
        return this.gdpr;
    }

    public final H0 component5() {
        return this.loggingEnabled;
    }

    public final C0652s0 component6() {
        return this.crashReport;
    }

    public final T0 component7() {
        return this.viewability;
    }

    public final B0 component8() {
        return this.isAdDownloadOptEnabled;
    }

    public final K0 component9() {
        return this.isReportIncentivizedEnabled;
    }

    public final U0 copy(C0658v0 c0658v0, List<p1> list, C0647p0 c0647p0, C0664y0 c0664y0, H0 h02, C0652s0 c0652s0, T0 t02, B0 b02, K0 k02, Boolean bool, String str, Q0 q02, E0 e02, N0 n02, L l, Boolean bool2, Boolean bool3, Integer num, Boolean bool4) {
        return new U0(c0658v0, list, c0647p0, c0664y0, h02, c0652s0, t02, b02, k02, bool, str, q02, e02, n02, l, bool2, bool3, num, bool4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U0)) {
            return false;
        }
        U0 u02 = (U0) obj;
        if (G7.j.a(this.endpoints, u02.endpoints) && G7.j.a(this.placements, u02.placements) && G7.j.a(this.config, u02.config) && G7.j.a(this.gdpr, u02.gdpr) && G7.j.a(this.loggingEnabled, u02.loggingEnabled) && G7.j.a(this.crashReport, u02.crashReport) && G7.j.a(this.viewability, u02.viewability) && G7.j.a(this.isAdDownloadOptEnabled, u02.isAdDownloadOptEnabled) && G7.j.a(this.isReportIncentivizedEnabled, u02.isReportIncentivizedEnabled) && G7.j.a(this.disableAdId, u02.disableAdId) && G7.j.a(this.configExtension, u02.configExtension) && G7.j.a(this.template, u02.template) && G7.j.a(this.logMetricsSettings, u02.logMetricsSettings) && G7.j.a(this.session, u02.session) && G7.j.a(this.cleverCache, u02.cleverCache) && G7.j.a(this.rtaDebugging, u02.rtaDebugging) && G7.j.a(this.isCacheableAssetsRequired, u02.isCacheableAssetsRequired) && G7.j.a(this.signalSessionTimeout, u02.signalSessionTimeout) && G7.j.a(this.signalsDisabled, u02.signalsDisabled)) {
            return true;
        }
        return false;
    }

    public final L getCleverCache() {
        return this.cleverCache;
    }

    public final C0647p0 getConfig() {
        return this.config;
    }

    public final String getConfigExtension() {
        return this.configExtension;
    }

    public final C0652s0 getCrashReport() {
        return this.crashReport;
    }

    public final Boolean getDisableAdId() {
        return this.disableAdId;
    }

    public final C0658v0 getEndpoints() {
        return this.endpoints;
    }

    public final C0664y0 getGdpr() {
        return this.gdpr;
    }

    public final E0 getLogMetricsSettings() {
        return this.logMetricsSettings;
    }

    public final H0 getLoggingEnabled() {
        return this.loggingEnabled;
    }

    public final List<p1> getPlacements() {
        return this.placements;
    }

    public final Boolean getRtaDebugging() {
        return this.rtaDebugging;
    }

    public final N0 getSession() {
        return this.session;
    }

    public final Integer getSignalSessionTimeout() {
        return this.signalSessionTimeout;
    }

    public final Boolean getSignalsDisabled() {
        return this.signalsDisabled;
    }

    public final Q0 getTemplate() {
        return this.template;
    }

    public final T0 getViewability() {
        return this.viewability;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int hashCode16;
        int hashCode17;
        int hashCode18;
        C0658v0 c0658v0 = this.endpoints;
        int i9 = 0;
        if (c0658v0 == null) {
            hashCode = 0;
        } else {
            hashCode = c0658v0.hashCode();
        }
        int i10 = hashCode * 31;
        List<p1> list = this.placements;
        if (list == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        C0647p0 c0647p0 = this.config;
        if (c0647p0 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c0647p0.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        C0664y0 c0664y0 = this.gdpr;
        if (c0664y0 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = c0664y0.hashCode();
        }
        int i13 = (i12 + hashCode4) * 31;
        H0 h02 = this.loggingEnabled;
        if (h02 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = h02.hashCode();
        }
        int i14 = (i13 + hashCode5) * 31;
        C0652s0 c0652s0 = this.crashReport;
        if (c0652s0 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = c0652s0.hashCode();
        }
        int i15 = (i14 + hashCode6) * 31;
        T0 t02 = this.viewability;
        if (t02 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = t02.hashCode();
        }
        int i16 = (i15 + hashCode7) * 31;
        B0 b02 = this.isAdDownloadOptEnabled;
        if (b02 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = b02.hashCode();
        }
        int i17 = (i16 + hashCode8) * 31;
        K0 k02 = this.isReportIncentivizedEnabled;
        if (k02 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = k02.hashCode();
        }
        int i18 = (i17 + hashCode9) * 31;
        Boolean bool = this.disableAdId;
        if (bool == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = bool.hashCode();
        }
        int i19 = (i18 + hashCode10) * 31;
        String str = this.configExtension;
        if (str == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str.hashCode();
        }
        int i20 = (i19 + hashCode11) * 31;
        Q0 q02 = this.template;
        if (q02 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = q02.hashCode();
        }
        int i21 = (i20 + hashCode12) * 31;
        E0 e02 = this.logMetricsSettings;
        if (e02 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = e02.hashCode();
        }
        int i22 = (i21 + hashCode13) * 31;
        N0 n02 = this.session;
        if (n02 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = n02.hashCode();
        }
        int i23 = (i22 + hashCode14) * 31;
        L l = this.cleverCache;
        if (l == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = l.hashCode();
        }
        int i24 = (i23 + hashCode15) * 31;
        Boolean bool2 = this.rtaDebugging;
        if (bool2 == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = bool2.hashCode();
        }
        int i25 = (i24 + hashCode16) * 31;
        Boolean bool3 = this.isCacheableAssetsRequired;
        if (bool3 == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = bool3.hashCode();
        }
        int i26 = (i25 + hashCode17) * 31;
        Integer num = this.signalSessionTimeout;
        if (num == null) {
            hashCode18 = 0;
        } else {
            hashCode18 = num.hashCode();
        }
        int i27 = (i26 + hashCode18) * 31;
        Boolean bool4 = this.signalsDisabled;
        if (bool4 != null) {
            i9 = bool4.hashCode();
        }
        return i27 + i9;
    }

    public final B0 isAdDownloadOptEnabled() {
        return this.isAdDownloadOptEnabled;
    }

    public final Boolean isCacheableAssetsRequired() {
        return this.isCacheableAssetsRequired;
    }

    public final K0 isReportIncentivizedEnabled() {
        return this.isReportIncentivizedEnabled;
    }

    public String toString() {
        return "ConfigPayload(endpoints=" + this.endpoints + ", placements=" + this.placements + ", config=" + this.config + ", gdpr=" + this.gdpr + ", loggingEnabled=" + this.loggingEnabled + ", crashReport=" + this.crashReport + ", viewability=" + this.viewability + ", isAdDownloadOptEnabled=" + this.isAdDownloadOptEnabled + ", isReportIncentivizedEnabled=" + this.isReportIncentivizedEnabled + ", disableAdId=" + this.disableAdId + ", configExtension=" + this.configExtension + ", template=" + this.template + ", logMetricsSettings=" + this.logMetricsSettings + ", session=" + this.session + ", cleverCache=" + this.cleverCache + ", rtaDebugging=" + this.rtaDebugging + ", isCacheableAssetsRequired=" + this.isCacheableAssetsRequired + ", signalSessionTimeout=" + this.signalSessionTimeout + ", signalsDisabled=" + this.signalsDisabled + ')';
    }

    public /* synthetic */ U0(int i9, C0658v0 c0658v0, List list, C0647p0 c0647p0, C0664y0 c0664y0, H0 h02, C0652s0 c0652s0, T0 t02, B0 b02, K0 k02, Boolean bool, String str, Q0 q02, E0 e02, N0 n02, L l, Boolean bool2, Boolean bool3, Integer num, Boolean bool4, e8.g0 g0Var) {
        if ((i9 & 1) == 0) {
            this.endpoints = null;
        } else {
            this.endpoints = c0658v0;
        }
        if ((i9 & 2) == 0) {
            this.placements = null;
        } else {
            this.placements = list;
        }
        if ((i9 & 4) == 0) {
            this.config = null;
        } else {
            this.config = c0647p0;
        }
        if ((i9 & 8) == 0) {
            this.gdpr = null;
        } else {
            this.gdpr = c0664y0;
        }
        if ((i9 & 16) == 0) {
            this.loggingEnabled = null;
        } else {
            this.loggingEnabled = h02;
        }
        if ((i9 & 32) == 0) {
            this.crashReport = null;
        } else {
            this.crashReport = c0652s0;
        }
        if ((i9 & 64) == 0) {
            this.viewability = null;
        } else {
            this.viewability = t02;
        }
        if ((i9 & 128) == 0) {
            this.isAdDownloadOptEnabled = null;
        } else {
            this.isAdDownloadOptEnabled = b02;
        }
        if ((i9 & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
            this.isReportIncentivizedEnabled = null;
        } else {
            this.isReportIncentivizedEnabled = k02;
        }
        this.disableAdId = (i9 & 512) == 0 ? Boolean.TRUE : bool;
        if ((i9 & 1024) == 0) {
            this.configExtension = null;
        } else {
            this.configExtension = str;
        }
        if ((i9 & 2048) == 0) {
            this.template = null;
        } else {
            this.template = q02;
        }
        if ((i9 & 4096) == 0) {
            this.logMetricsSettings = null;
        } else {
            this.logMetricsSettings = e02;
        }
        if ((i9 & FragmentTransaction.TRANSIT_EXIT_MASK) == 0) {
            this.session = null;
        } else {
            this.session = n02;
        }
        if ((i9 & 16384) == 0) {
            this.cleverCache = null;
        } else {
            this.cleverCache = l;
        }
        if ((32768 & i9) == 0) {
            this.rtaDebugging = null;
        } else {
            this.rtaDebugging = bool2;
        }
        if ((65536 & i9) == 0) {
            this.isCacheableAssetsRequired = null;
        } else {
            this.isCacheableAssetsRequired = bool3;
        }
        if ((131072 & i9) == 0) {
            this.signalSessionTimeout = null;
        } else {
            this.signalSessionTimeout = num;
        }
        if ((i9 & 262144) == 0) {
            this.signalsDisabled = null;
        } else {
            this.signalsDisabled = bool4;
        }
    }

    public U0(C0658v0 c0658v0, List<p1> list, C0647p0 c0647p0, C0664y0 c0664y0, H0 h02, C0652s0 c0652s0, T0 t02, B0 b02, K0 k02, Boolean bool, String str, Q0 q02, E0 e02, N0 n02, L l, Boolean bool2, Boolean bool3, Integer num, Boolean bool4) {
        this.endpoints = c0658v0;
        this.placements = list;
        this.config = c0647p0;
        this.gdpr = c0664y0;
        this.loggingEnabled = h02;
        this.crashReport = c0652s0;
        this.viewability = t02;
        this.isAdDownloadOptEnabled = b02;
        this.isReportIncentivizedEnabled = k02;
        this.disableAdId = bool;
        this.configExtension = str;
        this.template = q02;
        this.logMetricsSettings = e02;
        this.session = n02;
        this.cleverCache = l;
        this.rtaDebugging = bool2;
        this.isCacheableAssetsRequired = bool3;
        this.signalSessionTimeout = num;
        this.signalsDisabled = bool4;
    }

    public /* synthetic */ U0(C0658v0 c0658v0, List list, C0647p0 c0647p0, C0664y0 c0664y0, H0 h02, C0652s0 c0652s0, T0 t02, B0 b02, K0 k02, Boolean bool, String str, Q0 q02, E0 e02, N0 n02, L l, Boolean bool2, Boolean bool3, Integer num, Boolean bool4, int i9, G7.f fVar) {
        this((i9 & 1) != 0 ? null : c0658v0, (i9 & 2) != 0 ? null : list, (i9 & 4) != 0 ? null : c0647p0, (i9 & 8) != 0 ? null : c0664y0, (i9 & 16) != 0 ? null : h02, (i9 & 32) != 0 ? null : c0652s0, (i9 & 64) != 0 ? null : t02, (i9 & 128) != 0 ? null : b02, (i9 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : k02, (i9 & 512) != 0 ? Boolean.TRUE : bool, (i9 & 1024) != 0 ? null : str, (i9 & 2048) != 0 ? null : q02, (i9 & 4096) != 0 ? null : e02, (i9 & FragmentTransaction.TRANSIT_EXIT_MASK) != 0 ? null : n02, (i9 & 16384) != 0 ? null : l, (i9 & 32768) != 0 ? null : bool2, (i9 & 65536) != 0 ? null : bool3, (i9 & 131072) != 0 ? null : num, (i9 & 262144) != 0 ? null : bool4);
    }

    public static /* synthetic */ void getCleverCache$annotations() {
    }

    public static /* synthetic */ void getConfigExtension$annotations() {
    }

    public static /* synthetic */ void getCrashReport$annotations() {
    }

    public static /* synthetic */ void getDisableAdId$annotations() {
    }

    public static /* synthetic */ void getLogMetricsSettings$annotations() {
    }

    public static /* synthetic */ void getLoggingEnabled$annotations() {
    }

    public static /* synthetic */ void getRtaDebugging$annotations() {
    }

    public static /* synthetic */ void getSession$annotations() {
    }

    public static /* synthetic */ void getSignalSessionTimeout$annotations() {
    }

    public static /* synthetic */ void getSignalsDisabled$annotations() {
    }

    public static /* synthetic */ void getTemplate$annotations() {
    }

    public static /* synthetic */ void getViewability$annotations() {
    }

    public static /* synthetic */ void isAdDownloadOptEnabled$annotations() {
    }

    public static /* synthetic */ void isCacheableAssetsRequired$annotations() {
    }

    public static /* synthetic */ void isReportIncentivizedEnabled$annotations() {
    }
}
