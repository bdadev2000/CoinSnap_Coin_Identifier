package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class AlertController {
    public NestedScrollView A;
    public Drawable C;
    public ImageView D;
    public TextView E;
    public TextView F;
    public View G;
    public ListAdapter H;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final boolean O;
    public final Handler P;

    /* renamed from: a, reason: collision with root package name */
    public final Context f334a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatDialog f335b;

    /* renamed from: c, reason: collision with root package name */
    public final Window f336c;
    public final int d;
    public CharSequence e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f337f;

    /* renamed from: g, reason: collision with root package name */
    public RecycleListView f338g;

    /* renamed from: h, reason: collision with root package name */
    public View f339h;

    /* renamed from: i, reason: collision with root package name */
    public int f340i;

    /* renamed from: j, reason: collision with root package name */
    public int f341j;

    /* renamed from: k, reason: collision with root package name */
    public int f342k;

    /* renamed from: l, reason: collision with root package name */
    public int f343l;

    /* renamed from: m, reason: collision with root package name */
    public int f344m;

    /* renamed from: o, reason: collision with root package name */
    public Button f346o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f347p;

    /* renamed from: q, reason: collision with root package name */
    public Message f348q;

    /* renamed from: r, reason: collision with root package name */
    public Drawable f349r;

    /* renamed from: s, reason: collision with root package name */
    public Button f350s;

    /* renamed from: t, reason: collision with root package name */
    public CharSequence f351t;

    /* renamed from: u, reason: collision with root package name */
    public Message f352u;

    /* renamed from: v, reason: collision with root package name */
    public Drawable f353v;
    public Button w;
    public CharSequence x;

    /* renamed from: y, reason: collision with root package name */
    public Message f354y;

    /* renamed from: z, reason: collision with root package name */
    public Drawable f355z;

    /* renamed from: n, reason: collision with root package name */
    public boolean f345n = false;
    public int B = 0;
    public int I = -1;
    public final View.OnClickListener Q = new View.OnClickListener() { // from class: androidx.appcompat.app.AlertController.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            Message obtain = (view != alertController.f346o || (message3 = alertController.f348q) == null) ? (view != alertController.f350s || (message2 = alertController.f352u) == null) ? (view != alertController.w || (message = alertController.f354y) == null) ? null : Message.obtain(message) : Message.obtain(message2) : Message.obtain(message3);
            if (obtain != null) {
                obtain.sendToTarget();
            }
            alertController.P.obtainMessage(1, alertController.f335b).sendToTarget();
        }
    };

    /* renamed from: androidx.appcompat.app.AlertController$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    class AnonymousClass2 implements NestedScrollView.OnScrollChangeListener {
        @Override // androidx.core.widget.NestedScrollView.OnScrollChangeListener
        public final void a(NestedScrollView nestedScrollView) {
            AlertController.b(nestedScrollView, null, null);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$3, reason: invalid class name */
    /* loaded from: classes3.dex */
    class AnonymousClass3 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$4, reason: invalid class name */
    /* loaded from: classes3.dex */
    class AnonymousClass4 implements AbsListView.OnScrollListener {
        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScroll(AbsListView absListView, int i2, int i3, int i4) {
            AlertController.b(absListView, null, null);
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScrollStateChanged(AbsListView absListView, int i2) {
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$5, reason: invalid class name */
    /* loaded from: classes3.dex */
    class AnonymousClass5 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* loaded from: classes3.dex */
    public static class AlertParams {
        public int A;
        public int B;
        public int C;
        public boolean[] E;
        public boolean F;
        public boolean G;
        public DialogInterface.OnMultiChoiceClickListener I;
        public Cursor J;
        public String K;
        public String L;
        public AdapterView.OnItemSelectedListener M;

        /* renamed from: a, reason: collision with root package name */
        public final Context f357a;

        /* renamed from: b, reason: collision with root package name */
        public final LayoutInflater f358b;
        public Drawable d;
        public CharSequence e;

        /* renamed from: f, reason: collision with root package name */
        public View f360f;

        /* renamed from: g, reason: collision with root package name */
        public CharSequence f361g;

        /* renamed from: h, reason: collision with root package name */
        public CharSequence f362h;

        /* renamed from: i, reason: collision with root package name */
        public Drawable f363i;

        /* renamed from: j, reason: collision with root package name */
        public DialogInterface.OnClickListener f364j;

        /* renamed from: k, reason: collision with root package name */
        public CharSequence f365k;

        /* renamed from: l, reason: collision with root package name */
        public Drawable f366l;

        /* renamed from: m, reason: collision with root package name */
        public DialogInterface.OnClickListener f367m;

        /* renamed from: n, reason: collision with root package name */
        public CharSequence f368n;

        /* renamed from: o, reason: collision with root package name */
        public Drawable f369o;

        /* renamed from: p, reason: collision with root package name */
        public DialogInterface.OnClickListener f370p;

        /* renamed from: r, reason: collision with root package name */
        public DialogInterface.OnCancelListener f372r;

        /* renamed from: s, reason: collision with root package name */
        public DialogInterface.OnDismissListener f373s;

        /* renamed from: t, reason: collision with root package name */
        public DialogInterface.OnKeyListener f374t;

        /* renamed from: u, reason: collision with root package name */
        public CharSequence[] f375u;

        /* renamed from: v, reason: collision with root package name */
        public ListAdapter f376v;
        public DialogInterface.OnClickListener w;
        public int x;

        /* renamed from: y, reason: collision with root package name */
        public View f377y;

        /* renamed from: z, reason: collision with root package name */
        public int f378z;

        /* renamed from: c, reason: collision with root package name */
        public int f359c = 0;
        public boolean D = false;
        public int H = -1;

        /* renamed from: q, reason: collision with root package name */
        public boolean f371q = true;

        /* loaded from: classes3.dex */
        public interface OnPrepareListViewListener {
        }

        public AlertParams(ContextThemeWrapper contextThemeWrapper) {
            this.f357a = contextThemeWrapper;
            this.f358b = (LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater");
        }
    }

    /* loaded from: classes3.dex */
    public static final class ButtonHandler extends Handler {

        /* renamed from: a, reason: collision with root package name */
        public WeakReference f390a;

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == -3 || i2 == -2 || i2 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f390a.get(), message.what);
            } else {
                if (i2 != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class CheckedItemAdapter extends ArrayAdapter<CharSequence> {
        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final long getItemId(int i2) {
            return i2;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final boolean hasStableIds() {
            return true;
        }
    }

    /* loaded from: classes3.dex */
    public static class RecycleListView extends ListView {

        /* renamed from: a, reason: collision with root package name */
        public final int f391a;

        /* renamed from: b, reason: collision with root package name */
        public final int f392b;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f329u);
            this.f392b = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
            this.f391a = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
        }
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [android.os.Handler, androidx.appcompat.app.AlertController$ButtonHandler] */
    public AlertController(Context context, AppCompatDialog appCompatDialog, Window window) {
        this.f334a = context;
        this.f335b = appCompatDialog;
        this.f336c = window;
        ?? handler = new Handler();
        handler.f390a = new WeakReference(appCompatDialog);
        this.P = handler;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, R.styleable.e, com.cooldev.gba.emulator.gameboy.R.attr.alertDialogStyle, 0);
        this.J = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.K = obtainStyledAttributes.getResourceId(4, 0);
        this.L = obtainStyledAttributes.getResourceId(5, 0);
        this.M = obtainStyledAttributes.getResourceId(7, 0);
        this.N = obtainStyledAttributes.getResourceId(3, 0);
        this.O = obtainStyledAttributes.getBoolean(6, true);
        this.d = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        appCompatDialog.supportRequestWindowFeature(1);
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

    public static void b(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    public static ViewGroup c(View view, View view2) {
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

    public final void d(int i2, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Drawable drawable) {
        Message obtainMessage = onClickListener != null ? this.P.obtainMessage(i2, onClickListener) : null;
        if (i2 == -3) {
            this.x = charSequence;
            this.f354y = obtainMessage;
            this.f355z = drawable;
        } else if (i2 == -2) {
            this.f351t = charSequence;
            this.f352u = obtainMessage;
            this.f353v = drawable;
        } else {
            if (i2 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f347p = charSequence;
            this.f348q = obtainMessage;
            this.f349r = drawable;
        }
    }
}
