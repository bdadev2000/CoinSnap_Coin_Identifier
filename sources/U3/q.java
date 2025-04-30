package U3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes2.dex */
public final class q extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3191a;
    public final /* synthetic */ TextView b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3192c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TextView f3193d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s f3194e;

    public q(s sVar, int i9, TextView textView, int i10, TextView textView2) {
        this.f3194e = sVar;
        this.f3191a = i9;
        this.b = textView;
        this.f3192c = i10;
        this.f3193d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AppCompatTextView appCompatTextView;
        int i9 = this.f3191a;
        s sVar = this.f3194e;
        sVar.f3208n = i9;
        sVar.l = null;
        TextView textView = this.b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f3192c == 1 && (appCompatTextView = sVar.f3212r) != null) {
                appCompatTextView.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f3193d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f3193d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
