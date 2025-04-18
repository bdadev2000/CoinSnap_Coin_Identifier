package bh;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.internal.JsonLexerKt;

/* loaded from: classes4.dex */
public class a3 {
    public static final z2 Companion = new z2(null);
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

    public a3() {
        this.soundEnabled = 1;
        this.sdCardAvailable = 1;
    }

    @SerialName("android_id")
    public static /* synthetic */ void getAndroidId$annotations() {
    }

    @SerialName("app_set_id")
    public static /* synthetic */ void getAppSetId$annotations() {
    }

    @SerialName("battery_level")
    public static /* synthetic */ void getBatteryLevel$annotations() {
    }

    @SerialName("battery_saver_enabled")
    public static /* synthetic */ void getBatterySaverEnabled$annotations() {
    }

    @SerialName("battery_state")
    public static /* synthetic */ void getBatteryState$annotations() {
    }

    @SerialName("connection_type")
    public static /* synthetic */ void getConnectionType$annotations() {
    }

    @SerialName("connection_type_detail")
    public static /* synthetic */ void getConnectionTypeDetail$annotations() {
    }

    @SerialName("os_name")
    public static /* synthetic */ void getOsName$annotations() {
    }

    @SerialName("sd_card_available")
    public static /* synthetic */ void getSdCardAvailable$annotations() {
    }

    @SerialName("sound_enabled")
    public static /* synthetic */ void getSoundEnabled$annotations() {
    }

    @SerialName("time_zone")
    public static /* synthetic */ void getTimeZone$annotations() {
    }

    @SerialName("volume_level")
    public static /* synthetic */ void getVolumeLevel$annotations() {
    }

    @SerialName("is_google_play_services_available")
    public static /* synthetic */ void isGooglePlayServicesAvailable$annotations() {
    }

    @SerialName("is_sideload_enabled")
    public static /* synthetic */ void isSideloadEnabled$annotations() {
    }

    @SerialName("is_tv")
    public static /* synthetic */ void isTv$annotations() {
    }

    @JvmStatic
    public static final void write$Self(a3 self, CompositeEncoder output, SerialDescriptor serialDesc) {
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
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        boolean z26 = false;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.androidId != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.androidId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.isGooglePlayServicesAvailable) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            output.encodeBooleanElement(serialDesc, 1, self.isGooglePlayServicesAvailable);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.appSetId != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.appSetId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !Intrinsics.areEqual((Object) Float.valueOf(self.batteryLevel), (Object) Float.valueOf(0.0f))) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13) {
            output.encodeFloatElement(serialDesc, 3, self.batteryLevel);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.batteryState != null) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z14) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.batteryState);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.batterySaverEnabled != 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (z15) {
            output.encodeIntElement(serialDesc, 5, self.batterySaverEnabled);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.connectionType != null) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (z16) {
            output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.connectionType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.connectionTypeDetail != null) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (z17) {
            output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.connectionTypeDetail);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.locale != null) {
            z18 = true;
        } else {
            z18 = false;
        }
        if (z18) {
            output.encodeNullableSerializableElement(serialDesc, 8, StringSerializer.INSTANCE, self.locale);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.language != null) {
            z19 = true;
        } else {
            z19 = false;
        }
        if (z19) {
            output.encodeNullableSerializableElement(serialDesc, 9, StringSerializer.INSTANCE, self.language);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.timeZone != null) {
            z20 = true;
        } else {
            z20 = false;
        }
        if (z20) {
            output.encodeNullableSerializableElement(serialDesc, 10, StringSerializer.INSTANCE, self.timeZone);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || !Intrinsics.areEqual((Object) Float.valueOf(self.volumeLevel), (Object) Float.valueOf(0.0f))) {
            z21 = true;
        } else {
            z21 = false;
        }
        if (z21) {
            output.encodeFloatElement(serialDesc, 11, self.volumeLevel);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 12) || self.soundEnabled != 1) {
            z22 = true;
        } else {
            z22 = false;
        }
        if (z22) {
            output.encodeIntElement(serialDesc, 12, self.soundEnabled);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 13) || self.isTv) {
            z23 = true;
        } else {
            z23 = false;
        }
        if (z23) {
            output.encodeBooleanElement(serialDesc, 13, self.isTv);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 14) || self.sdCardAvailable != 1) {
            z24 = true;
        } else {
            z24 = false;
        }
        if (z24) {
            output.encodeIntElement(serialDesc, 14, self.sdCardAvailable);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 15) || self.isSideloadEnabled) {
            z25 = true;
        } else {
            z25 = false;
        }
        if (z25) {
            output.encodeBooleanElement(serialDesc, 15, self.isSideloadEnabled);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 16) || self.osName != null) {
            z26 = true;
        }
        if (z26) {
            output.encodeNullableSerializableElement(serialDesc, 16, StringSerializer.INSTANCE, self.osName);
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

    public final void setBatteryLevel(float f10) {
        this.batteryLevel = f10;
    }

    public final void setBatterySaverEnabled(int i10) {
        this.batterySaverEnabled = i10;
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

    public final void setGooglePlayServicesAvailable(boolean z10) {
        this.isGooglePlayServicesAvailable = z10;
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

    public final void setSdCardAvailable(int i10) {
        this.sdCardAvailable = i10;
    }

    public final void setSideloadEnabled(boolean z10) {
        this.isSideloadEnabled = z10;
    }

    public final void setSoundEnabled(int i10) {
        this.soundEnabled = i10;
    }

    public final void setTimeZone(String str) {
        this.timeZone = str;
    }

    public final void setTv(boolean z10) {
        this.isTv = z10;
    }

    public final void setVolumeLevel(float f10) {
        this.volumeLevel = f10;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ a3(int i10, @SerialName("android_id") String str, @SerialName("is_google_play_services_available") boolean z10, @SerialName("app_set_id") String str2, @SerialName("battery_level") float f10, @SerialName("battery_state") String str3, @SerialName("battery_saver_enabled") int i11, @SerialName("connection_type") String str4, @SerialName("connection_type_detail") String str5, String str6, String str7, @SerialName("time_zone") String str8, @SerialName("volume_level") float f11, @SerialName("sound_enabled") int i12, @SerialName("is_tv") boolean z11, @SerialName("sd_card_available") int i13, @SerialName("is_sideload_enabled") boolean z12, @SerialName("os_name") String str9, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i10 & 0) != 0) {
            PluginExceptionsKt.throwMissingFieldException(i10, 0, y2.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.androidId = null;
        } else {
            this.androidId = str;
        }
        if ((i10 & 2) == 0) {
            this.isGooglePlayServicesAvailable = false;
        } else {
            this.isGooglePlayServicesAvailable = z10;
        }
        if ((i10 & 4) == 0) {
            this.appSetId = null;
        } else {
            this.appSetId = str2;
        }
        if ((i10 & 8) == 0) {
            this.batteryLevel = 0.0f;
        } else {
            this.batteryLevel = f10;
        }
        if ((i10 & 16) == 0) {
            this.batteryState = null;
        } else {
            this.batteryState = str3;
        }
        if ((i10 & 32) == 0) {
            this.batterySaverEnabled = 0;
        } else {
            this.batterySaverEnabled = i11;
        }
        if ((i10 & 64) == 0) {
            this.connectionType = null;
        } else {
            this.connectionType = str4;
        }
        if ((i10 & 128) == 0) {
            this.connectionTypeDetail = null;
        } else {
            this.connectionTypeDetail = str5;
        }
        if ((i10 & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
            this.locale = null;
        } else {
            this.locale = str6;
        }
        if ((i10 & 512) == 0) {
            this.language = null;
        } else {
            this.language = str7;
        }
        if ((i10 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) == 0) {
            this.timeZone = null;
        } else {
            this.timeZone = str8;
        }
        if ((i10 & 2048) == 0) {
            this.volumeLevel = 0.0f;
        } else {
            this.volumeLevel = f11;
        }
        if ((i10 & 4096) == 0) {
            this.soundEnabled = 1;
        } else {
            this.soundEnabled = i12;
        }
        if ((i10 & 8192) == 0) {
            this.isTv = false;
        } else {
            this.isTv = z11;
        }
        if ((i10 & JsonLexerKt.BATCH_SIZE) == 0) {
            this.sdCardAvailable = 1;
        } else {
            this.sdCardAvailable = i13;
        }
        if ((32768 & i10) == 0) {
            this.isSideloadEnabled = false;
        } else {
            this.isSideloadEnabled = z12;
        }
        if ((i10 & C.DEFAULT_BUFFER_SEGMENT_SIZE) == 0) {
            this.osName = null;
        } else {
            this.osName = str9;
        }
    }
}
