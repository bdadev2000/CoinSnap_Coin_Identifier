package com.google.android.material.internal;

import B3.n;
import L3.a;
import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.core.view.ViewCompat;
import b0.AbstractC0547b;
import q.C2630w;

/* loaded from: classes2.dex */
public class CheckableImageButton extends C2630w implements Checkable {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f14090i = {R.attr.state_checked};

    /* renamed from: f, reason: collision with root package name */
    public boolean f14091f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f14092g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f14093h;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.tools.arruler.photomeasure.camera.ruler.R.attr.imageButtonStyle);
        this.f14092g = true;
        this.f14093h = true;
        ViewCompat.setAccessibilityDelegate(this, new n(this, 2));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f14091f;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i9) {
        if (this.f14091f) {
            return View.mergeDrawableStates(super.onCreateDrawableState(i9 + 1), f14090i);
        }
        return super.onCreateDrawableState(i9);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.b);
        setChecked(aVar.f1724d);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, L3.a, b0.b] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? abstractC0547b = new AbstractC0547b(super.onSaveInstanceState());
        abstractC0547b.f1724d = this.f14091f;
        return abstractC0547b;
    }

    public void setCheckable(boolean z8) {
        if (this.f14092g != z8) {
            this.f14092g = z8;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z8) {
        if (this.f14092g && this.f14091f != z8) {
            this.f14091f = z8;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z8) {
        this.f14093h = z8;
    }

    @Override // android.view.View
    public void setPressed(boolean z8) {
        if (this.f14093h) {
            super.setPressed(z8);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f14091f);
    }
}
