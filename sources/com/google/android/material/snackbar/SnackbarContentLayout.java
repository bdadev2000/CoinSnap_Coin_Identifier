package com.google.android.material.snackbar;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.plantcare.ai.identifier.plantid.R;
import s9.a;
import v8.u0;

/* loaded from: classes3.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    public TextView f11795b;

    /* renamed from: c, reason: collision with root package name */
    public Button f11796c;

    /* renamed from: d, reason: collision with root package name */
    public int f11797d;

    public SnackbarContentLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        u0.h0(context, R.attr.motionEasingEmphasizedInterpolator, a.f24933b);
    }

    public final boolean a(int i10, int i11, int i12) {
        boolean z10;
        if (i10 != getOrientation()) {
            setOrientation(i10);
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f11795b.getPaddingTop() == i11 && this.f11795b.getPaddingBottom() == i12) {
            return z10;
        }
        TextView textView = this.f11795b;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i11, textView.getPaddingEnd(), i12);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i11, textView.getPaddingRight(), i12);
        return true;
    }

    public Button getActionView() {
        return this.f11796c;
    }

    public TextView getMessageView() {
        return this.f11795b;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f11795b = (TextView) findViewById(R.id.snackbar_text);
        this.f11796c = (Button) findViewById(R.id.snackbar_action);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        if (a(1, r0, r0 - r2) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        if (r1 == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        super.onMeasure(r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0054, code lost:
    
        if (a(0, r0, r0) != false) goto L26;
     */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.getOrientation()
            r1 = 1
            if (r0 != r1) goto Lb
            return
        Lb:
            android.content.res.Resources r0 = r7.getResources()
            r2 = 2131166145(0x7f0703c1, float:1.7946527E38)
            int r0 = r0.getDimensionPixelSize(r2)
            android.content.res.Resources r2 = r7.getResources()
            r3 = 2131166144(0x7f0703c0, float:1.7946525E38)
            int r2 = r2.getDimensionPixelSize(r3)
            android.widget.TextView r3 = r7.f11795b
            android.text.Layout r3 = r3.getLayout()
            r4 = 0
            if (r3 == 0) goto L32
            int r3 = r3.getLineCount()
            if (r3 <= r1) goto L32
            r3 = r1
            goto L33
        L32:
            r3 = r4
        L33:
            if (r3 == 0) goto L4c
            int r5 = r7.f11797d
            if (r5 <= 0) goto L4c
            android.widget.Button r5 = r7.f11796c
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f11797d
            if (r5 <= r6) goto L4c
            int r2 = r0 - r2
            boolean r0 = r7.a(r1, r0, r2)
            if (r0 == 0) goto L57
            goto L58
        L4c:
            if (r3 == 0) goto L4f
            goto L50
        L4f:
            r0 = r2
        L50:
            boolean r0 = r7.a(r4, r0, r0)
            if (r0 == 0) goto L57
            goto L58
        L57:
            r1 = r4
        L58:
            if (r1 == 0) goto L5d
            super.onMeasure(r8, r9)
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    public void setMaxInlineActionWidth(int i10) {
        this.f11797d = i10;
    }
}
