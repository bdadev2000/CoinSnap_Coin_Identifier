package com.mbridge.msdk.video.dynview.c;

/* loaded from: classes3.dex */
public enum a {
    NOT_FOUND_VIEWOPTION(-1, "ViewOption is null"),
    NOT_FOUND_CONTEXT(-2, "Context is null"),
    NOT_FOUND_LAYOUTNAME(-3, "layout xml name is null"),
    CAMPAIGNEX_IS_NULL(-4, "Campaign size only one"),
    VIEW_CREATE_ERROR(-5, "view create error"),
    NOT_FOUND_ROOTVIEW(-6, "rootview is null");


    /* renamed from: g, reason: collision with root package name */
    private int f18605g;

    /* renamed from: h, reason: collision with root package name */
    private String f18606h;

    a(int i9, String str) {
        this.f18605g = i9;
        this.f18606h = str;
    }

    public final int a() {
        return this.f18605g;
    }

    public final String b() {
        return this.f18606h;
    }
}
