package com.mbridge.msdk.dycreator.b;

/* loaded from: classes4.dex */
public enum b {
    NOT_FOUND_VIEWOPTION(-101, "ViewOption is null"),
    NOT_FOUND_CONTEXT(-102, "context is null"),
    FILE_CREATE_VIEW_FILE(-103, "file create view is null"),
    CAMPAIGNEX_IS_NULL(-104, "Campaign size only one"),
    NOT_FOUND_CAMPAIGN(-105, "campaign is null"),
    NOT_FOUND_DYNAMIC_FILE(-106, "dynamic file is not exits"),
    BIND_DATA_FILE_OR_DIR(-107, "data file or file dir is not exits "),
    NOT_FOUND_DYNAMIC_OPTION(-108, "dynamic_option is not exits");


    /* renamed from: i, reason: collision with root package name */
    private int f12667i;

    /* renamed from: j, reason: collision with root package name */
    private String f12668j;

    b(int i10, String str) {
        this.f12667i = i10;
        this.f12668j = str;
    }

    public final int a() {
        return this.f12667i;
    }

    public final String b() {
        return this.f12668j;
    }
}
