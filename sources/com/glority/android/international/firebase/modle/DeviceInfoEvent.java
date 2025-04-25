package com.glority.android.international.firebase.modle;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeviceInfoEvent.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b-\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003¢\u0006\u0002\u0010\u0010J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\rHÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\u0081\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010=\u001a\u00020>HÖ\u0001J\t\u0010?\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0012\"\u0004\b\"\u0010\u0014R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0012\"\u0004\b$\u0010\u0014R\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0012\"\u0004\b&\u0010\u0014R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0012\"\u0004\b(\u0010\u0014R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0012\"\u0004\b*\u0010\u0014R\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0012\"\u0004\b,\u0010\u0014¨\u0006@"}, d2 = {"Lcom/glority/android/international/firebase/modle/DeviceInfoEvent;", "", "os_language_code", "", "app_language_code", "app_version", "os_country_code", "os_hardware_model", "os_version", "os_brand_name", "apps_flyer_id", "os_timezone", "os_font_size", "", "os_screen_size", "os_view_size", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FLjava/lang/String;Ljava/lang/String;)V", "getApp_language_code", "()Ljava/lang/String;", "setApp_language_code", "(Ljava/lang/String;)V", "getApp_version", "setApp_version", "getApps_flyer_id", "setApps_flyer_id", "getOs_brand_name", "setOs_brand_name", "getOs_country_code", "setOs_country_code", "getOs_font_size", "()F", "setOs_font_size", "(F)V", "getOs_hardware_model", "setOs_hardware_model", "getOs_language_code", "setOs_language_code", "getOs_screen_size", "setOs_screen_size", "getOs_timezone", "setOs_timezone", "getOs_version", "setOs_version", "getOs_view_size", "setOs_view_size", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "base-firebase_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final /* data */ class DeviceInfoEvent {
    private String app_language_code;
    private String app_version;
    private String apps_flyer_id;
    private String os_brand_name;
    private String os_country_code;
    private float os_font_size;
    private String os_hardware_model;
    private String os_language_code;
    private String os_screen_size;
    private String os_timezone;
    private String os_version;
    private String os_view_size;

    /* renamed from: component1, reason: from getter */
    public final String getOs_language_code() {
        return this.os_language_code;
    }

    /* renamed from: component10, reason: from getter */
    public final float getOs_font_size() {
        return this.os_font_size;
    }

    /* renamed from: component11, reason: from getter */
    public final String getOs_screen_size() {
        return this.os_screen_size;
    }

    /* renamed from: component12, reason: from getter */
    public final String getOs_view_size() {
        return this.os_view_size;
    }

    /* renamed from: component2, reason: from getter */
    public final String getApp_language_code() {
        return this.app_language_code;
    }

    /* renamed from: component3, reason: from getter */
    public final String getApp_version() {
        return this.app_version;
    }

    /* renamed from: component4, reason: from getter */
    public final String getOs_country_code() {
        return this.os_country_code;
    }

    /* renamed from: component5, reason: from getter */
    public final String getOs_hardware_model() {
        return this.os_hardware_model;
    }

    /* renamed from: component6, reason: from getter */
    public final String getOs_version() {
        return this.os_version;
    }

    /* renamed from: component7, reason: from getter */
    public final String getOs_brand_name() {
        return this.os_brand_name;
    }

    /* renamed from: component8, reason: from getter */
    public final String getApps_flyer_id() {
        return this.apps_flyer_id;
    }

    /* renamed from: component9, reason: from getter */
    public final String getOs_timezone() {
        return this.os_timezone;
    }

    public final DeviceInfoEvent copy(String os_language_code, String app_language_code, String app_version, String os_country_code, String os_hardware_model, String os_version, String os_brand_name, String apps_flyer_id, String os_timezone, float os_font_size, String os_screen_size, String os_view_size) {
        Intrinsics.checkNotNullParameter(os_language_code, "os_language_code");
        Intrinsics.checkNotNullParameter(app_language_code, "app_language_code");
        Intrinsics.checkNotNullParameter(app_version, "app_version");
        Intrinsics.checkNotNullParameter(os_country_code, "os_country_code");
        Intrinsics.checkNotNullParameter(os_hardware_model, "os_hardware_model");
        Intrinsics.checkNotNullParameter(os_version, "os_version");
        Intrinsics.checkNotNullParameter(os_brand_name, "os_brand_name");
        Intrinsics.checkNotNullParameter(apps_flyer_id, "apps_flyer_id");
        Intrinsics.checkNotNullParameter(os_timezone, "os_timezone");
        Intrinsics.checkNotNullParameter(os_screen_size, "os_screen_size");
        Intrinsics.checkNotNullParameter(os_view_size, "os_view_size");
        return new DeviceInfoEvent(os_language_code, app_language_code, app_version, os_country_code, os_hardware_model, os_version, os_brand_name, apps_flyer_id, os_timezone, os_font_size, os_screen_size, os_view_size);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceInfoEvent)) {
            return false;
        }
        DeviceInfoEvent deviceInfoEvent = (DeviceInfoEvent) other;
        return Intrinsics.areEqual(this.os_language_code, deviceInfoEvent.os_language_code) && Intrinsics.areEqual(this.app_language_code, deviceInfoEvent.app_language_code) && Intrinsics.areEqual(this.app_version, deviceInfoEvent.app_version) && Intrinsics.areEqual(this.os_country_code, deviceInfoEvent.os_country_code) && Intrinsics.areEqual(this.os_hardware_model, deviceInfoEvent.os_hardware_model) && Intrinsics.areEqual(this.os_version, deviceInfoEvent.os_version) && Intrinsics.areEqual(this.os_brand_name, deviceInfoEvent.os_brand_name) && Intrinsics.areEqual(this.apps_flyer_id, deviceInfoEvent.apps_flyer_id) && Intrinsics.areEqual(this.os_timezone, deviceInfoEvent.os_timezone) && Float.compare(this.os_font_size, deviceInfoEvent.os_font_size) == 0 && Intrinsics.areEqual(this.os_screen_size, deviceInfoEvent.os_screen_size) && Intrinsics.areEqual(this.os_view_size, deviceInfoEvent.os_view_size);
    }

    public int hashCode() {
        return (((((((((((((((((((((this.os_language_code.hashCode() * 31) + this.app_language_code.hashCode()) * 31) + this.app_version.hashCode()) * 31) + this.os_country_code.hashCode()) * 31) + this.os_hardware_model.hashCode()) * 31) + this.os_version.hashCode()) * 31) + this.os_brand_name.hashCode()) * 31) + this.apps_flyer_id.hashCode()) * 31) + this.os_timezone.hashCode()) * 31) + Float.hashCode(this.os_font_size)) * 31) + this.os_screen_size.hashCode()) * 31) + this.os_view_size.hashCode();
    }

    public String toString() {
        return "DeviceInfoEvent(os_language_code=" + this.os_language_code + ", app_language_code=" + this.app_language_code + ", app_version=" + this.app_version + ", os_country_code=" + this.os_country_code + ", os_hardware_model=" + this.os_hardware_model + ", os_version=" + this.os_version + ", os_brand_name=" + this.os_brand_name + ", apps_flyer_id=" + this.apps_flyer_id + ", os_timezone=" + this.os_timezone + ", os_font_size=" + this.os_font_size + ", os_screen_size=" + this.os_screen_size + ", os_view_size=" + this.os_view_size + ")";
    }

    public DeviceInfoEvent(String os_language_code, String app_language_code, String app_version, String os_country_code, String os_hardware_model, String os_version, String os_brand_name, String apps_flyer_id, String os_timezone, float f, String os_screen_size, String os_view_size) {
        Intrinsics.checkNotNullParameter(os_language_code, "os_language_code");
        Intrinsics.checkNotNullParameter(app_language_code, "app_language_code");
        Intrinsics.checkNotNullParameter(app_version, "app_version");
        Intrinsics.checkNotNullParameter(os_country_code, "os_country_code");
        Intrinsics.checkNotNullParameter(os_hardware_model, "os_hardware_model");
        Intrinsics.checkNotNullParameter(os_version, "os_version");
        Intrinsics.checkNotNullParameter(os_brand_name, "os_brand_name");
        Intrinsics.checkNotNullParameter(apps_flyer_id, "apps_flyer_id");
        Intrinsics.checkNotNullParameter(os_timezone, "os_timezone");
        Intrinsics.checkNotNullParameter(os_screen_size, "os_screen_size");
        Intrinsics.checkNotNullParameter(os_view_size, "os_view_size");
        this.os_language_code = os_language_code;
        this.app_language_code = app_language_code;
        this.app_version = app_version;
        this.os_country_code = os_country_code;
        this.os_hardware_model = os_hardware_model;
        this.os_version = os_version;
        this.os_brand_name = os_brand_name;
        this.apps_flyer_id = apps_flyer_id;
        this.os_timezone = os_timezone;
        this.os_font_size = f;
        this.os_screen_size = os_screen_size;
        this.os_view_size = os_view_size;
    }

    public final String getApp_language_code() {
        return this.app_language_code;
    }

    public final String getApp_version() {
        return this.app_version;
    }

    public final String getOs_country_code() {
        return this.os_country_code;
    }

    public final String getOs_language_code() {
        return this.os_language_code;
    }

    public final void setApp_language_code(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.app_language_code = str;
    }

    public final void setApp_version(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.app_version = str;
    }

    public final void setOs_country_code(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.os_country_code = str;
    }

    public final void setOs_language_code(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.os_language_code = str;
    }

    public final String getApps_flyer_id() {
        return this.apps_flyer_id;
    }

    public final String getOs_brand_name() {
        return this.os_brand_name;
    }

    public final String getOs_hardware_model() {
        return this.os_hardware_model;
    }

    public final String getOs_timezone() {
        return this.os_timezone;
    }

    public final String getOs_version() {
        return this.os_version;
    }

    public final void setApps_flyer_id(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.apps_flyer_id = str;
    }

    public final void setOs_brand_name(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.os_brand_name = str;
    }

    public final void setOs_hardware_model(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.os_hardware_model = str;
    }

    public final void setOs_timezone(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.os_timezone = str;
    }

    public final void setOs_version(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.os_version = str;
    }

    public /* synthetic */ DeviceInfoEvent(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, float f, String str10, String str11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, f, str10, (i & 2048) != 0 ? "default" : str11);
    }

    public final float getOs_font_size() {
        return this.os_font_size;
    }

    public final String getOs_screen_size() {
        return this.os_screen_size;
    }

    public final String getOs_view_size() {
        return this.os_view_size;
    }

    public final void setOs_font_size(float f) {
        this.os_font_size = f;
    }

    public final void setOs_screen_size(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.os_screen_size = str;
    }

    public final void setOs_view_size(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.os_view_size = str;
    }
}
