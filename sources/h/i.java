package h;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AlertController$RecycleListView;

/* loaded from: classes.dex */
public final class i {
    public final e a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18619b;

    public i(Context context) {
        this(context, j.h(context, 0));
    }

    @NonNull
    public j create() {
        int i10;
        e eVar = this.a;
        j jVar = new j(eVar.a, this.f18619b);
        View view = eVar.f18536e;
        h hVar = jVar.f18622h;
        if (view != null) {
            hVar.C = view;
        } else {
            CharSequence charSequence = eVar.f18535d;
            if (charSequence != null) {
                hVar.f18597e = charSequence;
                TextView textView = hVar.A;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = eVar.f18534c;
            if (drawable != null) {
                hVar.f18616y = drawable;
                hVar.f18615x = 0;
                ImageView imageView = hVar.f18617z;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    hVar.f18617z.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = eVar.f18537f;
        if (charSequence2 != null) {
            hVar.f18598f = charSequence2;
            TextView textView2 = hVar.B;
            if (textView2 != null) {
                textView2.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = eVar.f18538g;
        if (charSequence3 != null) {
            hVar.e(-1, charSequence3, eVar.f18539h);
        }
        CharSequence charSequence4 = eVar.f18540i;
        if (charSequence4 != null) {
            hVar.e(-2, charSequence4, eVar.f18541j);
        }
        CharSequence charSequence5 = eVar.f18542k;
        if (charSequence5 != null) {
            hVar.e(-3, charSequence5, eVar.f18543l);
        }
        if (eVar.f18545n != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) eVar.f18533b.inflate(hVar.G, (ViewGroup) null);
            if (eVar.f18548q) {
                i10 = hVar.H;
            } else {
                i10 = hVar.I;
            }
            ListAdapter listAdapter = eVar.f18545n;
            if (listAdapter == null) {
                listAdapter = new g(eVar.a, i10);
            }
            hVar.D = listAdapter;
            hVar.E = eVar.f18549r;
            if (eVar.f18546o != null) {
                alertController$RecycleListView.setOnItemClickListener(new d(0, eVar, hVar));
            }
            if (eVar.f18548q) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            hVar.f18599g = alertController$RecycleListView;
        }
        View view2 = eVar.f18547p;
        if (view2 != null) {
            hVar.f18600h = view2;
            hVar.f18601i = 0;
            hVar.f18602j = false;
        }
        jVar.setCancelable(true);
        jVar.setCanceledOnTouchOutside(true);
        jVar.setOnCancelListener(null);
        jVar.setOnDismissListener(null);
        DialogInterface.OnKeyListener onKeyListener = eVar.f18544m;
        if (onKeyListener != null) {
            jVar.setOnKeyListener(onKeyListener);
        }
        return jVar;
    }

    @NonNull
    public Context getContext() {
        return this.a.a;
    }

    public i setNegativeButton(@StringRes int i10, DialogInterface.OnClickListener onClickListener) {
        e eVar = this.a;
        eVar.f18540i = eVar.a.getText(i10);
        eVar.f18541j = onClickListener;
        return this;
    }

    public i setPositiveButton(@StringRes int i10, DialogInterface.OnClickListener onClickListener) {
        e eVar = this.a;
        eVar.f18538g = eVar.a.getText(i10);
        eVar.f18539h = onClickListener;
        return this;
    }

    public i setTitle(@Nullable CharSequence charSequence) {
        this.a.f18535d = charSequence;
        return this;
    }

    public i setView(View view) {
        this.a.f18547p = view;
        return this;
    }

    public i(@NonNull Context context, int i10) {
        this.a = new e(new ContextThemeWrapper(context, j.h(context, i10)));
        this.f18619b = i10;
    }
}
