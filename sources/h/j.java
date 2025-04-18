package h;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.appcompat.widget.c2;
import androidx.core.view.ViewCompat;
import androidx.core.widget.NestedScrollView;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes.dex */
public final class j extends i0 implements DialogInterface {

    /* renamed from: h, reason: collision with root package name */
    public final h f18622h;

    public j(Context context, int i10) {
        super(context, h(context, i10));
        this.f18622h = new h(getContext(), this, getWindow());
    }

    public static int h(Context context, int i10) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // h.i0, androidx.activity.o, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        boolean z10;
        int i10;
        View view;
        boolean z11;
        boolean z12;
        boolean z13;
        int i11;
        boolean z14;
        ListAdapter listAdapter;
        int i12;
        int i13;
        View findViewById;
        View findViewById2;
        super.onCreate(bundle);
        h hVar = this.f18622h;
        hVar.f18594b.setContentView(hVar.F);
        Window window = hVar.f18595c;
        View findViewById3 = window.findViewById(R.id.parentPanel);
        View findViewById4 = findViewById3.findViewById(R.id.topPanel);
        View findViewById5 = findViewById3.findViewById(R.id.contentPanel);
        View findViewById6 = findViewById3.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(R.id.customPanel);
        View view2 = hVar.f18600h;
        int i14 = 0;
        Context context = hVar.a;
        if (view2 == null) {
            if (hVar.f18601i != 0) {
                view2 = LayoutInflater.from(context).inflate(hVar.f18601i, viewGroup, false);
            } else {
                view2 = null;
            }
        }
        if (view2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || !h.a(view2)) {
            window.setFlags(131072, 131072);
        }
        if (z10) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout.addView(view2, new ViewGroup.LayoutParams(-1, -1));
            if (hVar.f18602j) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (hVar.f18599g != null) {
                ((LinearLayout.LayoutParams) ((c2) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById7 = viewGroup.findViewById(R.id.topPanel);
        View findViewById8 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById9 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup d10 = h.d(findViewById7, findViewById4);
        ViewGroup d11 = h.d(findViewById8, findViewById5);
        ViewGroup d12 = h.d(findViewById9, findViewById6);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        hVar.f18614w = nestedScrollView;
        nestedScrollView.setFocusable(false);
        hVar.f18614w.setNestedScrollingEnabled(false);
        TextView textView = (TextView) d11.findViewById(android.R.id.message);
        hVar.B = textView;
        if (textView != null) {
            CharSequence charSequence = hVar.f18598f;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                hVar.f18614w.removeView(hVar.B);
                if (hVar.f18599g != null) {
                    ViewGroup viewGroup2 = (ViewGroup) hVar.f18614w.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(hVar.f18614w);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(hVar.f18599g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    d11.setVisibility(8);
                }
            }
        }
        Button button = (Button) d12.findViewById(android.R.id.button1);
        hVar.f18603k = button;
        b bVar = hVar.L;
        button.setOnClickListener(bVar);
        boolean isEmpty = TextUtils.isEmpty(hVar.f18604l);
        int i15 = hVar.f18596d;
        if (isEmpty && hVar.f18606n == null) {
            hVar.f18603k.setVisibility(8);
            i10 = 0;
        } else {
            hVar.f18603k.setText(hVar.f18604l);
            Drawable drawable = hVar.f18606n;
            if (drawable != null) {
                drawable.setBounds(0, 0, i15, i15);
                hVar.f18603k.setCompoundDrawables(hVar.f18606n, null, null, null);
            }
            hVar.f18603k.setVisibility(0);
            i10 = 1;
        }
        Button button2 = (Button) d12.findViewById(android.R.id.button2);
        hVar.f18607o = button2;
        button2.setOnClickListener(bVar);
        if (TextUtils.isEmpty(hVar.f18608p) && hVar.f18610r == null) {
            hVar.f18607o.setVisibility(8);
        } else {
            hVar.f18607o.setText(hVar.f18608p);
            Drawable drawable2 = hVar.f18610r;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, i15, i15);
                hVar.f18607o.setCompoundDrawables(hVar.f18610r, null, null, null);
            }
            hVar.f18607o.setVisibility(0);
            i10 |= 2;
        }
        Button button3 = (Button) d12.findViewById(android.R.id.button3);
        hVar.f18611s = button3;
        button3.setOnClickListener(bVar);
        if (TextUtils.isEmpty(hVar.f18612t) && hVar.f18613v == null) {
            hVar.f18611s.setVisibility(8);
            view = null;
        } else {
            hVar.f18611s.setText(hVar.f18612t);
            Drawable drawable3 = hVar.f18613v;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, i15, i15);
                view = null;
                hVar.f18611s.setCompoundDrawables(hVar.f18613v, null, null, null);
            } else {
                view = null;
            }
            hVar.f18611s.setVisibility(0);
            i10 |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (i10 == 1) {
                h.b(hVar.f18603k);
            } else if (i10 == 2) {
                h.b(hVar.f18607o);
            } else if (i10 == 4) {
                h.b(hVar.f18611s);
            }
        }
        if (i10 != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z12) {
            d12.setVisibility(8);
        }
        if (hVar.C != null) {
            d10.addView(hVar.C, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            hVar.f18617z = (ImageView) window.findViewById(android.R.id.icon);
            if ((!TextUtils.isEmpty(hVar.f18597e)) && hVar.J) {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                hVar.A = textView2;
                textView2.setText(hVar.f18597e);
                int i16 = hVar.f18615x;
                if (i16 != 0) {
                    hVar.f18617z.setImageResource(i16);
                } else {
                    Drawable drawable4 = hVar.f18616y;
                    if (drawable4 != null) {
                        hVar.f18617z.setImageDrawable(drawable4);
                    } else {
                        hVar.A.setPadding(hVar.f18617z.getPaddingLeft(), hVar.f18617z.getPaddingTop(), hVar.f18617z.getPaddingRight(), hVar.f18617z.getPaddingBottom());
                        hVar.f18617z.setVisibility(8);
                    }
                }
            } else {
                window.findViewById(R.id.title_template).setVisibility(8);
                hVar.f18617z.setVisibility(8);
                d10.setVisibility(8);
            }
        }
        if (viewGroup.getVisibility() != 8) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (d10 != null && d10.getVisibility() != 8) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        if (d12.getVisibility() != 8) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (!z14 && (findViewById2 = d11.findViewById(R.id.textSpacerNoButtons)) != null) {
            findViewById2.setVisibility(0);
        }
        if (i11 != 0) {
            NestedScrollView nestedScrollView2 = hVar.f18614w;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            if (hVar.f18598f == null && hVar.f18599g == null) {
                findViewById = view;
            } else {
                findViewById = d10.findViewById(R.id.titleDividerNoCustom);
            }
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
        } else {
            View findViewById10 = d11.findViewById(R.id.textSpacerNoTitle);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = hVar.f18599g;
        if (alertController$RecycleListView instanceof AlertController$RecycleListView) {
            alertController$RecycleListView.getClass();
            if (!z14 || i11 == 0) {
                int paddingLeft = alertController$RecycleListView.getPaddingLeft();
                if (i11 != 0) {
                    i12 = alertController$RecycleListView.getPaddingTop();
                } else {
                    i12 = alertController$RecycleListView.f631b;
                }
                int paddingRight = alertController$RecycleListView.getPaddingRight();
                if (z14) {
                    i13 = alertController$RecycleListView.getPaddingBottom();
                } else {
                    i13 = alertController$RecycleListView.f632c;
                }
                alertController$RecycleListView.setPadding(paddingLeft, i12, paddingRight, i13);
            }
        }
        if (!z13) {
            View view3 = hVar.f18599g;
            if (view3 == null) {
                view3 = hVar.f18614w;
            }
            if (view3 != null) {
                if (z14) {
                    i14 = 2;
                }
                View findViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View findViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                ViewCompat.setScrollIndicators(view3, i11 | i14, 3);
                if (findViewById11 != null) {
                    d11.removeView(findViewById11);
                }
                if (findViewById12 != null) {
                    d11.removeView(findViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = hVar.f18599g;
        if (alertController$RecycleListView2 != null && (listAdapter = hVar.D) != null) {
            alertController$RecycleListView2.setAdapter(listAdapter);
            int i17 = hVar.E;
            if (i17 > -1) {
                alertController$RecycleListView2.setItemChecked(i17, true);
                alertController$RecycleListView2.setSelection(i17);
            }
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        boolean z10;
        NestedScrollView nestedScrollView = this.f18622h.f18614w;
        if (nestedScrollView != null && nestedScrollView.i(keyEvent)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        boolean z10;
        NestedScrollView nestedScrollView = this.f18622h.f18614w;
        if (nestedScrollView != null && nestedScrollView.i(keyEvent)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    @Override // h.i0, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        h hVar = this.f18622h;
        hVar.f18597e = charSequence;
        TextView textView = hVar.A;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
