package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

@RestrictTo
/* loaded from: classes3.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public TypedValue f1086a;

    /* renamed from: b, reason: collision with root package name */
    public TypedValue f1087b;

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f1088c;
    public TypedValue d;

    /* renamed from: f, reason: collision with root package name */
    public TypedValue f1089f;

    /* renamed from: g, reason: collision with root package name */
    public TypedValue f1090g;

    /* renamed from: h, reason: collision with root package name */
    public final Rect f1091h;

    /* renamed from: i, reason: collision with root package name */
    public OnAttachListener f1092i;

    /* loaded from: classes3.dex */
    public interface OnAttachListener {
        void a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1091h = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f1089f == null) {
            this.f1089f = new TypedValue();
        }
        return this.f1089f;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f1090g == null) {
            this.f1090g = new TypedValue();
        }
        return this.f1090g;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f1088c == null) {
            this.f1088c = new TypedValue();
        }
        return this.f1088c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.d == null) {
            this.d = new TypedValue();
        }
        return this.d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f1086a == null) {
            this.f1086a = new TypedValue();
        }
        return this.f1086a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f1087b == null) {
            this.f1087b = new TypedValue();
        }
        return this.f1087b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        OnAttachListener onAttachListener = this.f1092i;
        if (onAttachListener != null) {
            onAttachListener.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        OnAttachListener onAttachListener = this.f1092i;
        if (onAttachListener != null) {
            onAttachListener.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b3  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(OnAttachListener onAttachListener) {
        this.f1092i = onAttachListener;
    }
}
