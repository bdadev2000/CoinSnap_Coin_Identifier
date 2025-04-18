package na;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes3.dex */
public final class o extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f22659b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f22660c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TextView f22661d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f22662e;

    public o(q qVar, int i10, TextView textView, int i11, TextView textView2) {
        this.f22662e = qVar;
        this.a = i10;
        this.f22659b = textView;
        this.f22660c = i11;
        this.f22661d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AppCompatTextView appCompatTextView;
        int i10 = this.a;
        q qVar = this.f22662e;
        qVar.f22675n = i10;
        qVar.f22673l = null;
        TextView textView = this.f22659b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f22660c == 1 && (appCompatTextView = qVar.f22679r) != null) {
                appCompatTextView.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f22661d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f22661d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
