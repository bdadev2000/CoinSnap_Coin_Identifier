package h;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes.dex */
public final class h {
    public TextView A;
    public TextView B;
    public View C;
    public ListAdapter D;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final boolean J;
    public final f K;
    public final Context a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f18594b;

    /* renamed from: c, reason: collision with root package name */
    public final Window f18595c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18596d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f18597e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f18598f;

    /* renamed from: g, reason: collision with root package name */
    public AlertController$RecycleListView f18599g;

    /* renamed from: h, reason: collision with root package name */
    public View f18600h;

    /* renamed from: i, reason: collision with root package name */
    public int f18601i;

    /* renamed from: k, reason: collision with root package name */
    public Button f18603k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f18604l;

    /* renamed from: m, reason: collision with root package name */
    public Message f18605m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f18606n;

    /* renamed from: o, reason: collision with root package name */
    public Button f18607o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f18608p;

    /* renamed from: q, reason: collision with root package name */
    public Message f18609q;

    /* renamed from: r, reason: collision with root package name */
    public Drawable f18610r;

    /* renamed from: s, reason: collision with root package name */
    public Button f18611s;

    /* renamed from: t, reason: collision with root package name */
    public CharSequence f18612t;
    public Message u;

    /* renamed from: v, reason: collision with root package name */
    public Drawable f18613v;

    /* renamed from: w, reason: collision with root package name */
    public NestedScrollView f18614w;

    /* renamed from: y, reason: collision with root package name */
    public Drawable f18616y;

    /* renamed from: z, reason: collision with root package name */
    public ImageView f18617z;

    /* renamed from: j, reason: collision with root package name */
    public boolean f18602j = false;

    /* renamed from: x, reason: collision with root package name */
    public int f18615x = 0;
    public int E = -1;
    public final b L = new b(this, 0);

    public h(Context context, i0 i0Var, Window window) {
        this.a = context;
        this.f18594b = i0Var;
        this.f18595c = window;
        this.K = new f(i0Var);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, g.a.f17882e, R.attr.alertDialogStyle, 0);
        this.F = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.G = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.H = obtainStyledAttributes.getResourceId(7, 0);
        this.I = obtainStyledAttributes.getResourceId(3, 0);
        this.J = obtainStyledAttributes.getBoolean(6, true);
        this.f18596d = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        i0Var.f().i(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    public static void c(View view, View view2, View view3) {
        int i10;
        int i11 = 0;
        if (view2 != null) {
            if (view.canScrollVertically(-1)) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            view2.setVisibility(i10);
        }
        if (view3 != null) {
            if (!view.canScrollVertically(1)) {
                i11 = 4;
            }
            view3.setVisibility(i11);
        }
    }

    public static ViewGroup d(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final void e(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message message;
        if (onClickListener != null) {
            message = this.K.obtainMessage(i10, onClickListener);
        } else {
            message = null;
        }
        if (i10 != -3) {
            if (i10 != -2) {
                if (i10 == -1) {
                    this.f18604l = charSequence;
                    this.f18605m = message;
                    this.f18606n = null;
                    return;
                }
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f18608p = charSequence;
            this.f18609q = message;
            this.f18610r = null;
            return;
        }
        this.f18612t = charSequence;
        this.u = message;
        this.f18613v = null;
    }
}
