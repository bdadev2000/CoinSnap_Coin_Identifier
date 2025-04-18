package com.applovin.impl.adview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class e extends View {
    protected float a;

    /* renamed from: b, reason: collision with root package name */
    protected final Context f3699b;

    /* loaded from: classes.dex */
    public enum a {
        WHITE_ON_BLACK(0),
        WHITE_ON_TRANSPARENT(1),
        INVISIBLE(2),
        TRANSPARENT_SKIP(3);

        private final int a;

        a(int i10) {
            this.a = i10;
        }

        public int b() {
            return this.a;
        }
    }

    public e(Context context) {
        super(context);
        this.a = 1.0f;
        this.f3699b = context;
    }

    public void a(int i10) {
        setViewScale(i10 / 30.0f);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = (int) getSize();
            layoutParams.height = (int) getSize();
        }
    }

    public float getSize() {
        return this.a * 30.0f;
    }

    public abstract a getStyle();

    public void setViewScale(float f10) {
        this.a = f10;
    }

    public static e a(a aVar, Context context) {
        if (aVar.equals(a.INVISIBLE)) {
            return new h(context);
        }
        if (aVar.equals(a.WHITE_ON_TRANSPARENT)) {
            return new i(context);
        }
        if (aVar.equals(a.TRANSPARENT_SKIP)) {
            return new j(context);
        }
        return new n(context);
    }
}
