package B3;

import P1.B;
import U.t;
import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import b2.InterfaceC0554a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import k.C2412a;
import k.C2413b;
import k.C2415d;
import k.DialogInterfaceC2416e;

/* loaded from: classes2.dex */
public final class g implements t, InterfaceC0554a {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public int f285c;

    /* renamed from: d, reason: collision with root package name */
    public Object f286d;

    public /* synthetic */ g(int i9, int i10, Object obj) {
        this.b = i10;
        this.f286d = obj;
        this.f285c = i9;
    }

    @Override // b2.InterfaceC0554a
    public B a(B b, N1.i iVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) b.get()).compress((Bitmap.CompressFormat) this.f286d, this.f285c, byteArrayOutputStream);
        b.a();
        return new W1.B(byteArrayOutputStream.toByteArray());
    }

    public DialogInterfaceC2416e b() {
        int i9;
        C2413b c2413b = (C2413b) this.f286d;
        DialogInterfaceC2416e dialogInterfaceC2416e = new DialogInterfaceC2416e((ContextThemeWrapper) c2413b.f21262a, this.f285c);
        View view = c2413b.f21265e;
        C2415d c2415d = dialogInterfaceC2416e.f21306h;
        if (view != null) {
            c2415d.f21305z = view;
        } else {
            CharSequence charSequence = c2413b.f21264d;
            if (charSequence != null) {
                c2415d.f21286e = charSequence;
                TextView textView = c2415d.f21303x;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c2413b.f21263c;
            if (drawable != null) {
                c2415d.f21301v = drawable;
                c2415d.f21300u = 0;
                ImageView imageView = c2415d.f21302w;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c2415d.f21302w.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = c2413b.f21266f;
        if (charSequence2 != null) {
            c2415d.f21287f = charSequence2;
            TextView textView2 = c2415d.f21304y;
            if (textView2 != null) {
                textView2.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = c2413b.f21267g;
        if (charSequence3 != null) {
            c2415d.b(-1, charSequence3, (com.facebook.login.g) c2413b.f21268h);
        }
        CharSequence charSequence4 = c2413b.f21269i;
        if (charSequence4 != null) {
            c2415d.b(-3, charSequence4, (com.facebook.login.g) c2413b.f21270j);
        }
        if (c2413b.l != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c2413b.b.inflate(c2415d.f21277D, (ViewGroup) null);
            if (c2413b.f21272n) {
                i9 = c2415d.f21278E;
            } else {
                i9 = c2415d.f21279F;
            }
            ListAdapter listAdapter = c2413b.l;
            if (listAdapter == null) {
                listAdapter = new ArrayAdapter(c2413b.f21262a, i9, R.id.text1, (Object[]) null);
            }
            c2415d.f21274A = listAdapter;
            c2415d.f21275B = c2413b.f21273o;
            if (c2413b.m != null) {
                alertController$RecycleListView.setOnItemClickListener(new C2412a(c2413b, c2415d));
            }
            if (c2413b.f21272n) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            c2415d.f21288g = alertController$RecycleListView;
        }
        dialogInterfaceC2416e.setCancelable(true);
        dialogInterfaceC2416e.setCanceledOnTouchOutside(true);
        dialogInterfaceC2416e.setOnCancelListener(null);
        dialogInterfaceC2416e.setOnDismissListener(null);
        DialogInterface.OnKeyListener onKeyListener = c2413b.f21271k;
        if (onKeyListener != null) {
            dialogInterfaceC2416e.setOnKeyListener(onKeyListener);
        }
        return dialogInterfaceC2416e;
    }

    @Override // U.t
    public boolean c(View view) {
        ((BottomSheetBehavior) this.f286d).H(this.f285c);
        return true;
    }

    public void d(int i9, int i10) {
        int i11 = i10 + i9;
        char[] cArr = (char[]) this.f286d;
        if (cArr.length <= i11) {
            int i12 = i9 * 2;
            if (i11 < i12) {
                i11 = i12;
            }
            char[] copyOf = Arrays.copyOf(cArr, i11);
            G7.j.d(copyOf, "copyOf(this, newSize)");
            this.f286d = copyOf;
        }
    }

    public synchronized List e() {
        return Collections.unmodifiableList(new ArrayList((ArrayList) this.f286d));
    }

    public boolean f() {
        if (this.f285c < ((List) this.f286d).size()) {
            return true;
        }
        return false;
    }

    public void g() {
        g8.c cVar = g8.c.f20496a;
        char[] cArr = (char[]) this.f286d;
        G7.j.e(cArr, "array");
        synchronized (cVar) {
            int i9 = g8.c.f20497c;
            if (cArr.length + i9 < g8.c.f20498d) {
                g8.c.f20497c = i9 + cArr.length;
                g8.c.b.addLast(cArr);
            }
        }
    }

    public synchronized boolean h(List list) {
        ((ArrayList) this.f286d).clear();
        if (list.size() > this.f285c) {
            Log.w("FirebaseCrashlytics", "Ignored 0 entries when adding rollout assignments. Maximum allowable: " + this.f285c, null);
            return ((ArrayList) this.f286d).addAll(list.subList(0, this.f285c));
        }
        return ((ArrayList) this.f286d).addAll(list);
    }

    public void i(String str) {
        G7.j.e(str, MimeTypes.BASE_TYPE_TEXT);
        int length = str.length();
        if (length == 0) {
            return;
        }
        d(this.f285c, length);
        str.getChars(0, str.length(), (char[]) this.f286d, this.f285c);
        this.f285c += length;
    }

    public String toString() {
        switch (this.b) {
            case 7:
                return new String((char[]) this.f286d, 0, this.f285c);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ g(int i9, boolean z8) {
        this.b = i9;
    }

    public /* synthetic */ g(Object[] objArr, int i9, int i10) {
        this.b = i10;
        this.f285c = i9;
        this.f286d = objArr;
    }

    public g(int i9) {
        this.b = i9;
        switch (i9) {
            case 10:
                this.f286d = new ArrayList();
                this.f285c = 128;
                return;
            default:
                this.f286d = Bitmap.CompressFormat.JPEG;
                this.f285c = 100;
                return;
        }
    }

    public g(ArrayList arrayList) {
        this.b = 9;
        this.f286d = arrayList;
    }

    public g(Context context) {
        this.b = 8;
        int g9 = DialogInterfaceC2416e.g(context, 0);
        this.f286d = new C2413b(new ContextThemeWrapper(context, DialogInterfaceC2416e.g(context, g9)));
        this.f285c = g9;
    }
}
