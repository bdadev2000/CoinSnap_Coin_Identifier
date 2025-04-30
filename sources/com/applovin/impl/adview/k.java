package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.applovin.impl.ca;

/* loaded from: classes.dex */
public class k extends View {

    /* renamed from: a, reason: collision with root package name */
    private final ca f6716a;
    private boolean b;

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void onFailure();
    }

    public k(ca caVar, Context context) {
        super(context);
        this.f6716a = caVar;
        setClickable(false);
        setFocusable(false);
    }

    public boolean a() {
        return this.b;
    }

    public void b() {
        a(null);
    }

    public String getIdentifier() {
        return this.f6716a.b();
    }

    public void a(a aVar) {
        if (this.b) {
            if (aVar != null) {
                aVar.a();
                return;
            }
            return;
        }
        Drawable a6 = this.f6716a.a();
        if (a6 == null) {
            if (aVar != null) {
                aVar.onFailure();
            }
        } else {
            setBackground(a6);
            this.b = true;
            if (aVar != null) {
                aVar.a();
            }
        }
    }
}
