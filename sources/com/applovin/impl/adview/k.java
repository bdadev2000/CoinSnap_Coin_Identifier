package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.applovin.impl.ca;

/* loaded from: classes.dex */
public class k extends View {
    private final ca a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f3718b;

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void onFailure();
    }

    public k(ca caVar, Context context) {
        super(context);
        this.a = caVar;
        setClickable(false);
        setFocusable(false);
    }

    public boolean a() {
        return this.f3718b;
    }

    public void b() {
        a(null);
    }

    public String getIdentifier() {
        return this.a.b();
    }

    public void a(a aVar) {
        if (this.f3718b) {
            if (aVar != null) {
                aVar.a();
                return;
            }
            return;
        }
        Drawable a10 = this.a.a();
        if (a10 == null) {
            if (aVar != null) {
                aVar.onFailure();
            }
        } else {
            setBackground(a10);
            this.f3718b = true;
            if (aVar != null) {
                aVar.a();
            }
        }
    }
}
