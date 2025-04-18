package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import com.applovin.impl.ea;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* loaded from: classes2.dex */
public class k extends View {

    /* renamed from: a, reason: collision with root package name */
    private final ea f22817a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f22818b;

    /* loaded from: classes2.dex */
    public interface a {
        void a();

        void onFailure();
    }

    public k(ea eaVar, Context context) {
        super(context);
        this.f22817a = eaVar;
        setClickable(false);
        setFocusable(false);
    }

    public boolean a() {
        return this.f22818b;
    }

    public void b() {
        a(null);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f30048a, this, me);
        return super.dispatchTouchEvent(me);
    }

    public String getIdentifier() {
        return this.f22817a.b();
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void a(a aVar) {
        if (this.f22818b) {
            if (aVar != null) {
                aVar.a();
                return;
            }
            return;
        }
        Drawable a2 = this.f22817a.a();
        if (a2 == null) {
            if (aVar != null) {
                aVar.onFailure();
            }
        } else {
            setBackground(a2);
            this.f22818b = true;
            if (aVar != null) {
                aVar.a();
            }
        }
    }
}
