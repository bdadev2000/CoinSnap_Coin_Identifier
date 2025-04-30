package k;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.view.ViewCompat;
import androidx.core.widget.NestedScrollView;
import com.tools.arruler.photomeasure.camera.ruler.R;

/* renamed from: k.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceC2416e extends y implements DialogInterface {

    /* renamed from: h, reason: collision with root package name */
    public final C2415d f21306h;

    public DialogInterfaceC2416e(ContextThemeWrapper contextThemeWrapper, int i9) {
        super(contextThemeWrapper, g(contextThemeWrapper, i9));
        this.f21306h = new C2415d(getContext(), this, getWindow());
    }

    public static int g(Context context, int i9) {
        if (((i9 >>> 24) & 255) >= 1) {
            return i9;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // k.y, f.m, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i9;
        boolean z8;
        int i10;
        boolean z9;
        ListAdapter listAdapter;
        int i11;
        int i12;
        View findViewById;
        super.onCreate(bundle);
        C2415d c2415d = this.f21306h;
        c2415d.b.setContentView(c2415d.f21276C);
        Window window = c2415d.f21284c;
        View findViewById2 = window.findViewById(R.id.parentPanel);
        View findViewById3 = findViewById2.findViewById(R.id.topPanel);
        View findViewById4 = findViewById2.findViewById(R.id.contentPanel);
        View findViewById5 = findViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(R.id.customPanel);
        window.setFlags(131072, 131072);
        viewGroup.setVisibility(8);
        View findViewById6 = viewGroup.findViewById(R.id.topPanel);
        View findViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup a6 = C2415d.a(findViewById6, findViewById3);
        ViewGroup a9 = C2415d.a(findViewById7, findViewById4);
        ViewGroup a10 = C2415d.a(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        c2415d.f21299t = nestedScrollView;
        int i13 = 0;
        nestedScrollView.setFocusable(false);
        c2415d.f21299t.setNestedScrollingEnabled(false);
        TextView textView = (TextView) a9.findViewById(android.R.id.message);
        c2415d.f21304y = textView;
        if (textView != null) {
            CharSequence charSequence = c2415d.f21287f;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                c2415d.f21299t.removeView(c2415d.f21304y);
                if (c2415d.f21288g != null) {
                    ViewGroup viewGroup2 = (ViewGroup) c2415d.f21299t.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(c2415d.f21299t);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(c2415d.f21288g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    a9.setVisibility(8);
                }
            }
        }
        Button button = (Button) a10.findViewById(android.R.id.button1);
        c2415d.f21289h = button;
        B3.m mVar = c2415d.f21282I;
        button.setOnClickListener(mVar);
        boolean isEmpty = TextUtils.isEmpty(c2415d.f21290i);
        View view = null;
        int i14 = c2415d.f21285d;
        if (isEmpty && c2415d.f21292k == null) {
            c2415d.f21289h.setVisibility(8);
            i9 = 0;
        } else {
            c2415d.f21289h.setText(c2415d.f21290i);
            Drawable drawable = c2415d.f21292k;
            if (drawable != null) {
                drawable.setBounds(0, 0, i14, i14);
                c2415d.f21289h.setCompoundDrawables(c2415d.f21292k, null, null, null);
            }
            c2415d.f21289h.setVisibility(0);
            i9 = 1;
        }
        Button button2 = (Button) a10.findViewById(android.R.id.button2);
        c2415d.l = button2;
        button2.setOnClickListener(mVar);
        if (TextUtils.isEmpty(c2415d.m) && c2415d.f21294o == null) {
            c2415d.l.setVisibility(8);
        } else {
            c2415d.l.setText(c2415d.m);
            Drawable drawable2 = c2415d.f21294o;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, i14, i14);
                c2415d.l.setCompoundDrawables(c2415d.f21294o, null, null, null);
            }
            c2415d.l.setVisibility(0);
            i9 |= 2;
        }
        Button button3 = (Button) a10.findViewById(android.R.id.button3);
        c2415d.f21295p = button3;
        button3.setOnClickListener(mVar);
        if (TextUtils.isEmpty(c2415d.f21296q) && c2415d.f21298s == null) {
            c2415d.f21295p.setVisibility(8);
        } else {
            c2415d.f21295p.setText(c2415d.f21296q);
            Drawable drawable3 = c2415d.f21298s;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, i14, i14);
                c2415d.f21295p.setCompoundDrawables(c2415d.f21298s, null, null, null);
            }
            c2415d.f21295p.setVisibility(0);
            i9 |= 4;
        }
        TypedValue typedValue = new TypedValue();
        c2415d.f21283a.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i9 == 1) {
                Button button4 = c2415d.f21289h;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i9 == 2) {
                Button button5 = c2415d.l;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i9 == 4) {
                Button button6 = c2415d.f21295p;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i9 == 0) {
            a10.setVisibility(8);
        }
        if (c2415d.f21305z != null) {
            a6.addView(c2415d.f21305z, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            c2415d.f21302w = (ImageView) window.findViewById(android.R.id.icon);
            if ((!TextUtils.isEmpty(c2415d.f21286e)) && c2415d.f21280G) {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                c2415d.f21303x = textView2;
                textView2.setText(c2415d.f21286e);
                int i15 = c2415d.f21300u;
                if (i15 != 0) {
                    c2415d.f21302w.setImageResource(i15);
                } else {
                    Drawable drawable4 = c2415d.f21301v;
                    if (drawable4 != null) {
                        c2415d.f21302w.setImageDrawable(drawable4);
                    } else {
                        c2415d.f21303x.setPadding(c2415d.f21302w.getPaddingLeft(), c2415d.f21302w.getPaddingTop(), c2415d.f21302w.getPaddingRight(), c2415d.f21302w.getPaddingBottom());
                        c2415d.f21302w.setVisibility(8);
                    }
                }
            } else {
                window.findViewById(R.id.title_template).setVisibility(8);
                c2415d.f21302w.setVisibility(8);
                a6.setVisibility(8);
            }
        }
        if (viewGroup.getVisibility() != 8) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (a6 != null && a6.getVisibility() != 8) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (a10.getVisibility() != 8) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9 && (findViewById = a9.findViewById(R.id.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (i10 != 0) {
            NestedScrollView nestedScrollView2 = c2415d.f21299t;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            if (c2415d.f21287f != null || c2415d.f21288g != null) {
                view = a6.findViewById(R.id.titleDividerNoCustom);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else {
            View findViewById9 = a9.findViewById(R.id.textSpacerNoTitle);
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = c2415d.f21288g;
        if (alertController$RecycleListView instanceof AlertController$RecycleListView) {
            alertController$RecycleListView.getClass();
            if (!z9 || i10 == 0) {
                int paddingLeft = alertController$RecycleListView.getPaddingLeft();
                if (i10 != 0) {
                    i11 = alertController$RecycleListView.getPaddingTop();
                } else {
                    i11 = alertController$RecycleListView.b;
                }
                int paddingRight = alertController$RecycleListView.getPaddingRight();
                if (z9) {
                    i12 = alertController$RecycleListView.getPaddingBottom();
                } else {
                    i12 = alertController$RecycleListView.f4118c;
                }
                alertController$RecycleListView.setPadding(paddingLeft, i11, paddingRight, i12);
            }
        }
        if (!z8) {
            View view2 = c2415d.f21288g;
            if (view2 == null) {
                view2 = c2415d.f21299t;
            }
            if (view2 != null) {
                if (z9) {
                    i13 = 2;
                }
                View findViewById10 = window.findViewById(R.id.scrollIndicatorUp);
                View findViewById11 = window.findViewById(R.id.scrollIndicatorDown);
                ViewCompat.setScrollIndicators(view2, i10 | i13, 3);
                if (findViewById10 != null) {
                    a9.removeView(findViewById10);
                }
                if (findViewById11 != null) {
                    a9.removeView(findViewById11);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = c2415d.f21288g;
        if (alertController$RecycleListView2 != null && (listAdapter = c2415d.f21274A) != null) {
            alertController$RecycleListView2.setAdapter(listAdapter);
            int i16 = c2415d.f21275B;
            if (i16 > -1) {
                alertController$RecycleListView2.setItemChecked(i16, true);
                alertController$RecycleListView2.setSelection(i16);
            }
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i9, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f21306h.f21299t;
        if (nestedScrollView != null && nestedScrollView.i(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i9, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i9, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f21306h.f21299t;
        if (nestedScrollView != null && nestedScrollView.i(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i9, keyEvent);
    }

    @Override // k.y, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        C2415d c2415d = this.f21306h;
        c2415d.f21286e = charSequence;
        TextView textView = c2415d.f21303x;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
