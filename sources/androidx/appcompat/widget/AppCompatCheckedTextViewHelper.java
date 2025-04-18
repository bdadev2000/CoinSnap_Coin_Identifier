package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.DrawableCompat;

@RestrictTo
/* loaded from: classes4.dex */
class AppCompatCheckedTextViewHelper {

    /* renamed from: a, reason: collision with root package name */
    public final CheckedTextView f961a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f962b = null;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f963c = null;
    public boolean d = false;
    public boolean e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f964f;

    public AppCompatCheckedTextViewHelper(CheckedTextView checkedTextView) {
        this.f961a = checkedTextView;
    }

    public final void a() {
        CheckedTextView checkedTextView = this.f961a;
        Drawable checkMarkDrawable = checkedTextView.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.d || this.e) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.d) {
                    DrawableCompat.j(mutate, this.f962b);
                }
                if (this.e) {
                    DrawableCompat.k(mutate, this.f963c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(checkedTextView.getDrawableState());
                }
                checkedTextView.setCheckMarkDrawable(mutate);
            }
        }
    }
}
