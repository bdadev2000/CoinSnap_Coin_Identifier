package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.appcompat.widget.a0;
import androidx.core.view.ViewCompat;
import ea.a;
import v9.d;

/* loaded from: classes3.dex */
public class CheckableImageButton extends a0 implements Checkable {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f11765i = {R.attr.state_checked};

    /* renamed from: f, reason: collision with root package name */
    public boolean f11766f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f11767g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f11768h;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.plantcare.ai.identifier.plantid.R.attr.imageButtonStyle);
        this.f11767g = true;
        this.f11768h = true;
        ViewCompat.setAccessibilityDelegate(this, new d(this, 2));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f11766f;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        if (this.f11766f) {
            return View.mergeDrawableStates(super.onCreateDrawableState(i10 + 1), f11765i);
        }
        return super.onCreateDrawableState(i10);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.f26666b);
        setChecked(aVar.f17204d);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.f17204d = this.f11766f;
        return aVar;
    }

    public void setCheckable(boolean z10) {
        if (this.f11767g != z10) {
            this.f11767g = z10;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (this.f11767g && this.f11766f != z10) {
            this.f11766f = z10;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z10) {
        this.f11768h = z10;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        if (this.f11768h) {
            super.setPressed(z10);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f11766f);
    }
}
