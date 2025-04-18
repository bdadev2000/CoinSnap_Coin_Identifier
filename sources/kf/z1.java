package kf;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.makeramen.roundedimageview.RoundedImageView;

/* loaded from: classes4.dex */
public abstract class z1 extends androidx.databinding.e {
    public final LinearLayout A;
    public final y0 B;
    public final RelativeLayout C;
    public final TextView D;

    /* renamed from: t, reason: collision with root package name */
    public final RoundedImageView f20941t;
    public final LinearLayout u;

    /* renamed from: v, reason: collision with root package name */
    public final LinearLayout f20942v;

    /* renamed from: w, reason: collision with root package name */
    public final LinearLayout f20943w;

    /* renamed from: x, reason: collision with root package name */
    public final FrameLayout f20944x;

    /* renamed from: y, reason: collision with root package name */
    public final LinearLayout f20945y;

    /* renamed from: z, reason: collision with root package name */
    public final FrameLayout f20946z;

    public z1(Object obj, View view, RoundedImageView roundedImageView, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, FrameLayout frameLayout, LinearLayout linearLayout4, FrameLayout frameLayout2, LinearLayout linearLayout5, y0 y0Var, RelativeLayout relativeLayout, TextView textView) {
        super(view, 1, obj);
        this.f20941t = roundedImageView;
        this.u = linearLayout;
        this.f20942v = linearLayout2;
        this.f20943w = linearLayout3;
        this.f20944x = frameLayout;
        this.f20945y = linearLayout4;
        this.f20946z = frameLayout2;
        this.A = linearLayout5;
        this.B = y0Var;
        this.C = relativeLayout;
        this.D = textView;
    }
}
