package bh;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.internal.JsonLexerKt;

/* loaded from: classes4.dex */
public final class t2 {
    public static final l1 Companion = new l1(null);
    private final l0 cleverCache;
    private final o1 config;
    private final String configExtension;
    private final r1 crashReport;
    private final Boolean disableAdId;
    private final u1 endpoints;
    private final x1 gdpr;
    private final a2 isAdDownloadOptEnabled;
    private final Boolean isCacheableAssetsRequired;
    private final j2 isReportIncentivizedEnabled;
    private final d2 logMetricsSettings;
    private final g2 loggingEnabled;
    private final List<o3> placements;
    private final Boolean rtaDebugging;
    private final m2 session;
    private final Integer signalSessionTimeout;
    private final Boolean signalsDisabled;
    private final p2 template;
    private final s2 viewability;

    public t2() {
        this((u1) null, (List) null, (o1) null, (x1) null, (g2) null, (r1) null, (s2) null, (a2) null, (j2) null, (Boolean) null, (String) null, (p2) null, (d2) null, (m2) null, (l0) null, (Boolean) null, (Boolean) null, (Integer) null, (Boolean) null, 524287, (DefaultConstructorMarker) null);
    }

    @SerialName("reuse_assets")
    public static /* synthetic */ void getCleverCache$annotations() {
    }

    @SerialName("config_extension")
    public static /* synthetic */ void getConfigExtension$annotations() {
    }

    @SerialName("crash_report")
    public static /* synthetic */ void getCrashReport$annotations() {
    }

    @SerialName("disable_ad_id")
    public static /* synthetic */ void getDisableAdId$annotations() {
    }

    @SerialName("log_metrics")
    public static /* synthetic */ void getLogMetricsSettings$annotations() {
    }

    @SerialName("logging")
    public static /* synthetic */ void getLoggingEnabled$annotations() {
    }

    @SerialName("rta_debugging")
    public static /* synthetic */ void getRtaDebugging$annotations() {
    }

    @SerialName("session")
    public static /* synthetic */ void getSession$annotations() {
    }

    @SerialName("sdk_session_timeout")
    public static /* synthetic */ void getSignalSessionTimeout$annotations() {
    }

    @SerialName("signals_disabled")
    public static /* synthetic */ void getSignalsDisabled$annotations() {
    }

    @SerialName("template")
    public static /* synthetic */ void getTemplate$annotations() {
    }

    @SerialName("viewability")
    public static /* synthetic */ void getViewability$annotations() {
    }

    @SerialName("ad_load_optimization")
    public static /* synthetic */ void isAdDownloadOptEnabled$annotations() {
    }

    @SerialName("cacheable_assets_required")
    public static /* synthetic */ void isCacheableAssetsRequired$annotations() {
    }

    @SerialName("ri")
    public static /* synthetic */ void isReportIncentivizedEnabled$annotations() {
    }

    @JvmStatic
    public static final void write$Self(t2 self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        boolean z26;
        boolean z27;
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        boolean z28 = false;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.endpoints != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            output.encodeNullableSerializableElement(serialDesc, 0, s1.INSTANCE, self.endpoints);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.placements != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            output.encodeNullableSerializableElement(serialDesc, 1, new ArrayListSerializer(m3.INSTANCE), self.placements);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.config != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            output.encodeNullableSerializableElement(serialDesc, 2, m1.INSTANCE, self.config);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.gdpr != null) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13) {
            output.encodeNullableSerializableElement(serialDesc, 3, v1.INSTANCE, self.gdpr);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.loggingEnabled != null) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z14) {
            output.encodeNullableSerializableElement(serialDesc, 4, e2.INSTANCE, self.loggingEnabled);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.crashReport != null) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (z15) {
            output.encodeNullableSerializableElement(serialDesc, 5, p1.INSTANCE, self.crashReport);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.viewability != null) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (z16) {
            output.encodeNullableSerializableElement(serialDesc, 6, q2.INSTANCE, self.viewability);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.isAdDownloadOptEnabled != null) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (z17) {
            output.encodeNullableSerializableElement(serialDesc, 7, y1.INSTANCE, self.isAdDownloadOptEnabled);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.isReportIncentivizedEnabled != null) {
            z18 = true;
        } else {
            z18 = false;
        }
        if (z18) {
            output.encodeNullableSerializableElement(serialDesc, 8, h2.INSTANCE, self.isReportIncentivizedEnabled);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || !Intrinsics.areEqual(self.disableAdId, Boolean.TRUE)) {
            z19 = true;
        } else {
            z19 = false;
        }
        if (z19) {
            output.encodeNullableSerializableElement(serialDesc, 9, BooleanSerializer.INSTANCE, self.disableAdId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.configExtension != null) {
            z20 = true;
        } else {
            z20 = false;
        }
        if (z20) {
            output.encodeNullableSerializableElement(serialDesc, 10, StringSerializer.INSTANCE, self.configExtension);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.template != null) {
            z21 = true;
        } else {
            z21 = false;
        }
        if (z21) {
            output.encodeNullableSerializableElement(serialDesc, 11, n2.INSTANCE, self.template);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 12) || self.logMetricsSettings != null) {
            z22 = true;
        } else {
            z22 = false;
        }
        if (z22) {
            output.encodeNullableSerializableElement(serialDesc, 12, b2.INSTANCE, self.logMetricsSettings);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 13) || self.session != null) {
            z23 = true;
        } else {
            z23 = false;
        }
        if (z23) {
            output.encodeNullableSerializableElement(serialDesc, 13, k2.INSTANCE, self.session);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 14) || self.cleverCache != null) {
            z24 = true;
        } else {
            z24 = false;
        }
        if (z24) {
            output.encodeNullableSerializableElement(serialDesc, 14, j0.INSTANCE, self.cleverCache);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 15) || self.rtaDebugging != null) {
            z25 = true;
        } else {
            z25 = false;
        }
        if (z25) {
            output.encodeNullableSerializableElement(serialDesc, 15, BooleanSerializer.INSTANCE, self.rtaDebugging);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 16) || self.isCacheableAssetsRequired != null) {
            z26 = true;
        } else {
            z26 = false;
        }
        if (z26) {
            output.encodeNullableSerializableElement(serialDesc, 16, BooleanSerializer.INSTANCE, self.isCacheableAssetsRequired);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 17) || self.signalSessionTimeout != null) {
            z27 = true;
        } else {
            z27 = false;
        }
        if (z27) {
            output.encodeNullableSerializableElement(serialDesc, 17, IntSerializer.INSTANCE, self.signalSessionTimeout);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 18) || self.signalsDisabled != null) {
            z28 = true;
        }
        if (z28) {
            output.encodeNullableSerializableElement(serialDesc, 18, BooleanSerializer.INSTANCE, self.signalsDisabled);
        }
    }

    public final u1 component1() {
        return this.endpoints;
    }

    public final Boolean component10() {
        return this.disableAdId;
    }

    public final String component11() {
        return this.configExtension;
    }

    public final p2 component12() {
        return this.template;
    }

    public final d2 component13() {
        return this.logMetricsSettings;
    }

    public final m2 component14() {
        return this.session;
    }

    public final l0 component15() {
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

    public final List<o3> component2() {
        return this.placements;
    }

    public final o1 component3() {
        return this.config;
    }

    public final x1 component4() {
        return this.gdpr;
    }

    public final g2 component5() {
        return this.loggingEnabled;
    }

    public final r1 component6() {
        return this.crashReport;
    }

    public final s2 component7() {
        return this.viewability;
    }

    public final a2 component8() {
        return this.isAdDownloadOptEnabled;
    }

    public final j2 component9() {
        return this.isReportIncentivizedEnabled;
    }

    public final t2 copy(u1 u1Var, List<o3> list, o1 o1Var, x1 x1Var, g2 g2Var, r1 r1Var, s2 s2Var, a2 a2Var, j2 j2Var, Boolean bool, String str, p2 p2Var, d2 d2Var, m2 m2Var, l0 l0Var, Boolean bool2, Boolean bool3, Integer num, Boolean bool4) {
        return new t2(u1Var, list, o1Var, x1Var, g2Var, r1Var, s2Var, a2Var, j2Var, bool, str, p2Var, d2Var, m2Var, l0Var, bool2, bool3, num, bool4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t2)) {
            return false;
        }
        t2 t2Var = (t2) obj;
        return Intrinsics.areEqual(this.endpoints, t2Var.endpoints) && Intrinsics.areEqual(this.placements, t2Var.placements) && Intrinsics.areEqual(this.config, t2Var.config) && Intrinsics.areEqual(this.gdpr, t2Var.gdpr) && Intrinsics.areEqual(this.loggingEnabled, t2Var.loggingEnabled) && Intrinsics.areEqual(this.crashReport, t2Var.crashReport) && Intrinsics.areEqual(this.viewability, t2Var.viewability) && Intrinsics.areEqual(this.isAdDownloadOptEnabled, t2Var.isAdDownloadOptEnabled) && Intrinsics.areEqual(this.isReportIncentivizedEnabled, t2Var.isReportIncentivizedEnabled) && Intrinsics.areEqual(this.disableAdId, t2Var.disableAdId) && Intrinsics.areEqual(this.configExtension, t2Var.configExtension) && Intrinsics.areEqual(this.template, t2Var.template) && Intrinsics.areEqual(this.logMetricsSettings, t2Var.logMetricsSettings) && Intrinsics.areEqual(this.session, t2Var.session) && Intrinsics.areEqual(this.cleverCache, t2Var.cleverCache) && Intrinsics.areEqual(this.rtaDebugging, t2Var.rtaDebugging) && Intrinsics.areEqual(this.isCacheableAssetsRequired, t2Var.isCacheableAssetsRequired) && Intrinsics.areEqual(this.signalSessionTimeout, t2Var.signalSessionTimeout) && Intrinsics.areEqual(this.signalsDisabled, t2Var.signalsDisabled);
    }

    public final l0 getCleverCache() {
        return this.cleverCache;
    }

    public final o1 getConfig() {
        return this.config;
    }

    public final String getConfigExtension() {
        return this.configExtension;
    }

    public final r1 getCrashReport() {
        return this.crashReport;
    }

    public final Boolean getDisableAdId() {
        return this.disableAdId;
    }

    public final u1 getEndpoints() {
        return this.endpoints;
    }

    public final x1 getGdpr() {
        return this.gdpr;
    }

    public final d2 getLogMetricsSettings() {
        return this.logMetricsSettings;
    }

    public final g2 getLoggingEnabled() {
        return this.loggingEnabled;
    }

    public final List<o3> getPlacements() {
        return this.placements;
    }

    public final Boolean getRtaDebugging() {
        return this.rtaDebugging;
    }

    public final m2 getSession() {
        return this.session;
    }

    public final Integer getSignalSessionTimeout() {
        return this.signalSessionTimeout;
    }

    public final Boolean getSignalsDisabled() {
        return this.signalsDisabled;
    }

    public final p2 getTemplate() {
        return this.template;
    }

    public final s2 getViewability() {
        return this.viewability;
    }

    public int hashCode() {
        u1 u1Var = this.endpoints;
        int hashCode = (u1Var == null ? 0 : u1Var.hashCode()) * 31;
        List<o3> list = this.placements;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        o1 o1Var = this.config;
        int hashCode3 = (hashCode2 + (o1Var == null ? 0 : o1Var.hashCode())) * 31;
        x1 x1Var = this.gdpr;
        int hashCode4 = (hashCode3 + (x1Var == null ? 0 : x1Var.hashCode())) * 31;
        g2 g2Var = this.loggingEnabled;
        int hashCode5 = (hashCode4 + (g2Var == null ? 0 : g2Var.hashCode())) * 31;
        r1 r1Var = this.crashReport;
        int hashCode6 = (hashCode5 + (r1Var == null ? 0 : r1Var.hashCode())) * 31;
        s2 s2Var = this.viewability;
        int hashCode7 = (hashCode6 + (s2Var == null ? 0 : s2Var.hashCode())) * 31;
        a2 a2Var = this.isAdDownloadOptEnabled;
        int hashCode8 = (hashCode7 + (a2Var == null ? 0 : a2Var.hashCode())) * 31;
        j2 j2Var = this.isReportIncentivizedEnabled;
        int hashCode9 = (hashCode8 + (j2Var == null ? 0 : j2Var.hashCode())) * 31;
        Boolean bool = this.disableAdId;
        int hashCode10 = (hashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.configExtension;
        int hashCode11 = (hashCode10 + (str == null ? 0 : str.hashCode())) * 31;
        p2 p2Var = this.template;
        int hashCode12 = (hashCode11 + (p2Var == null ? 0 : p2Var.hashCode())) * 31;
        d2 d2Var = this.logMetricsSettings;
        int hashCode13 = (hashCode12 + (d2Var == null ? 0 : d2Var.hashCode())) * 31;
        m2 m2Var = this.session;
        int hashCode14 = (hashCode13 + (m2Var == null ? 0 : m2Var.hashCode())) * 31;
        l0 l0Var = this.cleverCache;
        int hashCode15 = (hashCode14 + (l0Var == null ? 0 : l0Var.hashCode())) * 31;
        Boolean bool2 = this.rtaDebugging;
        int hashCode16 = (hashCode15 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isCacheableAssetsRequired;
        int hashCode17 = (hashCode16 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num = this.signalSessionTimeout;
        int hashCode18 = (hashCode17 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool4 = this.signalsDisabled;
        return hashCode18 + (bool4 != null ? bool4.hashCode() : 0);
    }

    public final a2 isAdDownloadOptEnabled() {
        return this.isAdDownloadOptEnabled;
    }

    public final Boolean isCacheableAssetsRequired() {
        return this.isCacheableAssetsRequired;
    }

    public final j2 isReportIncentivizedEnabled() {
        return this.isReportIncentivizedEnabled;
    }

    public String toString() {
        return "ConfigPayload(endpoints=" + this.endpoints + ", placements=" + this.placements + ", config=" + this.config + ", gdpr=" + this.gdpr + ", loggingEnabled=" + this.loggingEnabled + ", crashReport=" + this.crashReport + ", viewability=" + this.viewability + ", isAdDownloadOptEnabled=" + this.isAdDownloadOptEnabled + ", isReportIncentivizedEnabled=" + this.isReportIncentivizedEnabled + ", disableAdId=" + this.disableAdId + ", configExtension=" + this.configExtension + ", template=" + this.template + ", logMetricsSettings=" + this.logMetricsSettings + ", session=" + this.session + ", cleverCache=" + this.cleverCache + ", rtaDebugging=" + this.rtaDebugging + ", isCacheableAssetsRequired=" + this.isCacheableAssetsRequired + ", signalSessionTimeout=" + this.signalSessionTimeout + ", signalsDisabled=" + this.signalsDisabled + ')';
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ t2(int i10, u1 u1Var, List list, o1 o1Var, x1 x1Var, @SerialName("logging") g2 g2Var, @SerialName("crash_report") r1 r1Var, @SerialName("viewability") s2 s2Var, @SerialName("ad_load_optimization") a2 a2Var, @SerialName("ri") j2 j2Var, @SerialName("disable_ad_id") Boolean bool, @SerialName("config_extension") String str, @SerialName("template") p2 p2Var, @SerialName("log_metrics") d2 d2Var, @SerialName("session") m2 m2Var, @SerialName("reuse_assets") l0 l0Var, @SerialName("rta_debugging") Boolean bool2, @SerialName("cacheable_assets_required") Boolean bool3, @SerialName("sdk_session_timeout") Integer num, @SerialName("signals_disabled") Boolean bool4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i10 & 0) != 0) {
            PluginExceptionsKt.throwMissingFieldException(i10, 0, k1.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.endpoints = null;
        } else {
            this.endpoints = u1Var;
        }
        if ((i10 & 2) == 0) {
            this.placements = null;
        } else {
            this.placements = list;
        }
        if ((i10 & 4) == 0) {
            this.config = null;
        } else {
            this.config = o1Var;
        }
        if ((i10 & 8) == 0) {
            this.gdpr = null;
        } else {
            this.gdpr = x1Var;
        }
        if ((i10 & 16) == 0) {
            this.loggingEnabled = null;
        } else {
            this.loggingEnabled = g2Var;
        }
        if ((i10 & 32) == 0) {
            this.crashReport = null;
        } else {
            this.crashReport = r1Var;
        }
        if ((i10 & 64) == 0) {
            this.viewability = null;
        } else {
            this.viewability = s2Var;
        }
        if ((i10 & 128) == 0) {
            this.isAdDownloadOptEnabled = null;
        } else {
            this.isAdDownloadOptEnabled = a2Var;
        }
        if ((i10 & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
            this.isReportIncentivizedEnabled = null;
        } else {
            this.isReportIncentivizedEnabled = j2Var;
        }
        this.disableAdId = (i10 & 512) == 0 ? Boolean.TRUE : bool;
        if ((i10 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) == 0) {
            this.configExtension = null;
        } else {
            this.configExtension = str;
        }
        if ((i10 & 2048) == 0) {
            this.template = null;
        } else {
            this.template = p2Var;
        }
        if ((i10 & 4096) == 0) {
            this.logMetricsSettings = null;
        } else {
            this.logMetricsSettings = d2Var;
        }
        if ((i10 & 8192) == 0) {
            this.session = null;
        } else {
            this.session = m2Var;
        }
        if ((i10 & JsonLexerKt.BATCH_SIZE) == 0) {
            this.cleverCache = null;
        } else {
            this.cleverCache = l0Var;
        }
        if ((32768 & i10) == 0) {
            this.rtaDebugging = null;
        } else {
            this.rtaDebugging = bool2;
        }
        if ((65536 & i10) == 0) {
            this.isCacheableAssetsRequired = null;
        } else {
            this.isCacheableAssetsRequired = bool3;
        }
        if ((131072 & i10) == 0) {
            this.signalSessionTimeout = null;
        } else {
            this.signalSessionTimeout = num;
        }
        if ((i10 & 262144) == 0) {
            this.signalsDisabled = null;
        } else {
            this.signalsDisabled = bool4;
        }
    }

    public t2(u1 u1Var, List<o3> list, o1 o1Var, x1 x1Var, g2 g2Var, r1 r1Var, s2 s2Var, a2 a2Var, j2 j2Var, Boolean bool, String str, p2 p2Var, d2 d2Var, m2 m2Var, l0 l0Var, Boolean bool2, Boolean bool3, Integer num, Boolean bool4) {
        this.endpoints = u1Var;
        this.placements = list;
        this.config = o1Var;
        this.gdpr = x1Var;
        this.loggingEnabled = g2Var;
        this.crashReport = r1Var;
        this.viewability = s2Var;
        this.isAdDownloadOptEnabled = a2Var;
        this.isReportIncentivizedEnabled = j2Var;
        this.disableAdId = bool;
        this.configExtension = str;
        this.template = p2Var;
        this.logMetricsSettings = d2Var;
        this.session = m2Var;
        this.cleverCache = l0Var;
        this.rtaDebugging = bool2;
        this.isCacheableAssetsRequired = bool3;
        this.signalSessionTimeout = num;
        this.signalsDisabled = bool4;
    }

    public /* synthetic */ t2(u1 u1Var, List list, o1 o1Var, x1 x1Var, g2 g2Var, r1 r1Var, s2 s2Var, a2 a2Var, j2 j2Var, Boolean bool, String str, p2 p2Var, d2 d2Var, m2 m2Var, l0 l0Var, Boolean bool2, Boolean bool3, Integer num, Boolean bool4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : u1Var, (i10 & 2) != 0 ? null : list, (i10 & 4) != 0 ? null : o1Var, (i10 & 8) != 0 ? null : x1Var, (i10 & 16) != 0 ? null : g2Var, (i10 & 32) != 0 ? null : r1Var, (i10 & 64) != 0 ? null : s2Var, (i10 & 128) != 0 ? null : a2Var, (i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : j2Var, (i10 & 512) != 0 ? Boolean.TRUE : bool, (i10 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? null : str, (i10 & 2048) != 0 ? null : p2Var, (i10 & 4096) != 0 ? null : d2Var, (i10 & 8192) != 0 ? null : m2Var, (i10 & JsonLexerKt.BATCH_SIZE) != 0 ? null : l0Var, (i10 & 32768) != 0 ? null : bool2, (i10 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? null : bool3, (i10 & 131072) != 0 ? null : num, (i10 & 262144) != 0 ? null : bool4);
    }
}
