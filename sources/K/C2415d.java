package k;

import android.content.Context;
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
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.tools.arruler.photomeasure.camera.ruler.R;
import j.AbstractC2379a;
import java.lang.ref.WeakReference;

/* renamed from: k.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2415d {

    /* renamed from: A, reason: collision with root package name */
    public ListAdapter f21274A;

    /* renamed from: C, reason: collision with root package name */
    public final int f21276C;

    /* renamed from: D, reason: collision with root package name */
    public final int f21277D;

    /* renamed from: E, reason: collision with root package name */
    public final int f21278E;

    /* renamed from: F, reason: collision with root package name */
    public final int f21279F;

    /* renamed from: G, reason: collision with root package name */
    public final boolean f21280G;

    /* renamed from: H, reason: collision with root package name */
    public final com.facebook.internal.C f21281H;

    /* renamed from: a, reason: collision with root package name */
    public final Context f21283a;
    public final y b;

    /* renamed from: c, reason: collision with root package name */
    public final Window f21284c;

    /* renamed from: d, reason: collision with root package name */
    public final int f21285d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f21286e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f21287f;

    /* renamed from: g, reason: collision with root package name */
    public AlertController$RecycleListView f21288g;

    /* renamed from: h, reason: collision with root package name */
    public Button f21289h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f21290i;

    /* renamed from: j, reason: collision with root package name */
    public Message f21291j;

    /* renamed from: k, reason: collision with root package name */
    public Drawable f21292k;
    public Button l;
    public CharSequence m;

    /* renamed from: n, reason: collision with root package name */
    public Message f21293n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f21294o;

    /* renamed from: p, reason: collision with root package name */
    public Button f21295p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f21296q;

    /* renamed from: r, reason: collision with root package name */
    public Message f21297r;

    /* renamed from: s, reason: collision with root package name */
    public Drawable f21298s;

    /* renamed from: t, reason: collision with root package name */
    public NestedScrollView f21299t;

    /* renamed from: v, reason: collision with root package name */
    public Drawable f21301v;

    /* renamed from: w, reason: collision with root package name */
    public ImageView f21302w;

    /* renamed from: x, reason: collision with root package name */
    public TextView f21303x;

    /* renamed from: y, reason: collision with root package name */
    public TextView f21304y;

    /* renamed from: z, reason: collision with root package name */
    public View f21305z;

    /* renamed from: u, reason: collision with root package name */
    public int f21300u = 0;

    /* renamed from: B, reason: collision with root package name */
    public int f21275B = -1;

    /* renamed from: I, reason: collision with root package name */
    public final B3.m f21282I = new B3.m(this, 3);

    public C2415d(Context context, y yVar, Window window) {
        this.f21283a = context;
        this.b = yVar;
        this.f21284c = window;
        com.facebook.internal.C c9 = new com.facebook.internal.C();
        c9.b = new WeakReference(yVar);
        this.f21281H = c9;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC2379a.f20945e, R.attr.alertDialogStyle, 0);
        this.f21276C = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.f21277D = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f21278E = obtainStyledAttributes.getResourceId(7, 0);
        this.f21279F = obtainStyledAttributes.getResourceId(3, 0);
        this.f21280G = obtainStyledAttributes.getBoolean(6, true);
        this.f21285d = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        yVar.d().i(1);
    }

    public static ViewGroup a(View view, View view2) {
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

    public final void b(int i9, CharSequence charSequence, com.facebook.login.g gVar) {
        Message message;
        if (gVar != null) {
            message = this.f21281H.obtainMessage(i9, gVar);
        } else {
            message = null;
        }
        if (i9 != -3) {
            if (i9 != -2) {
                if (i9 == -1) {
                    this.f21290i = charSequence;
                    this.f21291j = message;
                    this.f21292k = null;
                    return;
                }
                throw new IllegalArgumentException("Button does not exist");
            }
            this.m = charSequence;
            this.f21293n = message;
            this.f21294o = null;
            return;
        }
        this.f21296q = charSequence;
        this.f21297r = message;
        this.f21298s = null;
    }
}
