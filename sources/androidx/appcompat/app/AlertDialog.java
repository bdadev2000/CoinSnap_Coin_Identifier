package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.NestedScrollView;
import org.objectweb.asm.Opcodes;

/* loaded from: classes2.dex */
public class AlertDialog extends AppCompatDialog implements DialogInterface {

    /* renamed from: a, reason: collision with root package name */
    public final AlertController f393a;

    /* loaded from: classes2.dex */
    public static class Builder {
        private final AlertController.AlertParams P;
        private final int mTheme;

        public Builder(Context context) {
            this(context, AlertDialog.e(0, context));
        }

        public AlertDialog create() {
            ListAdapter listAdapter;
            AlertDialog alertDialog = new AlertDialog(this.P.f357a, this.mTheme);
            AlertController.AlertParams alertParams = this.P;
            View view = alertParams.f360f;
            AlertController alertController = alertDialog.f393a;
            if (view != null) {
                alertController.G = view;
            } else {
                CharSequence charSequence = alertParams.e;
                if (charSequence != null) {
                    alertController.e = charSequence;
                    TextView textView = alertController.E;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                }
                Drawable drawable = alertParams.d;
                if (drawable != null) {
                    alertController.C = drawable;
                    alertController.B = 0;
                    ImageView imageView = alertController.D;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                        alertController.D.setImageDrawable(drawable);
                    }
                }
                int i2 = alertParams.f359c;
                if (i2 != 0) {
                    alertController.C = null;
                    alertController.B = i2;
                    ImageView imageView2 = alertController.D;
                    if (imageView2 != null) {
                        if (i2 != 0) {
                            imageView2.setVisibility(0);
                            alertController.D.setImageResource(alertController.B);
                        } else {
                            imageView2.setVisibility(8);
                        }
                    }
                }
            }
            CharSequence charSequence2 = alertParams.f361g;
            if (charSequence2 != null) {
                alertController.f337f = charSequence2;
                TextView textView2 = alertController.F;
                if (textView2 != null) {
                    textView2.setText(charSequence2);
                }
            }
            CharSequence charSequence3 = alertParams.f362h;
            if (charSequence3 != null || alertParams.f363i != null) {
                alertController.d(-1, charSequence3, alertParams.f364j, alertParams.f363i);
            }
            CharSequence charSequence4 = alertParams.f365k;
            if (charSequence4 != null || alertParams.f366l != null) {
                alertController.d(-2, charSequence4, alertParams.f367m, alertParams.f366l);
            }
            CharSequence charSequence5 = alertParams.f368n;
            if (charSequence5 != null || alertParams.f369o != null) {
                alertController.d(-3, charSequence5, alertParams.f370p, alertParams.f369o);
            }
            if (alertParams.f375u != null || alertParams.J != null || alertParams.f376v != null) {
                AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) alertParams.f358b.inflate(alertController.K, (ViewGroup) null);
                if (alertParams.F) {
                    listAdapter = alertParams.J == null ? new ArrayAdapter<CharSequence>(alertParams.f357a, alertController.L, alertParams.f375u) { // from class: androidx.appcompat.app.AlertController.AlertParams.1

                        /* renamed from: a */
                        public final /* synthetic */ RecycleListView f379a;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(Context context, int i3, CharSequence[] charSequenceArr, RecycleListView recycleListView2) {
                            super(context, i3, R.id.text1, charSequenceArr);
                            r5 = recycleListView2;
                        }

                        @Override // android.widget.ArrayAdapter, android.widget.Adapter
                        public final View getView(int i3, View view2, ViewGroup viewGroup) {
                            View view3 = super.getView(i3, view2, viewGroup);
                            boolean[] zArr = AlertParams.this.E;
                            if (zArr != null && zArr[i3]) {
                                r5.setItemChecked(i3, true);
                            }
                            return view3;
                        }
                    } : new CursorAdapter(alertParams.f357a, alertParams.J, recycleListView2, alertController) { // from class: androidx.appcompat.app.AlertController.AlertParams.2

                        /* renamed from: a */
                        public final int f381a;

                        /* renamed from: b */
                        public final int f382b;

                        /* renamed from: c */
                        public final /* synthetic */ RecycleListView f383c;
                        public final /* synthetic */ AlertController d;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass2(Context context, Cursor cursor, RecycleListView recycleListView2, AlertController alertController2) {
                            super(context, cursor, false);
                            this.f383c = recycleListView2;
                            this.d = alertController2;
                            Cursor cursor2 = getCursor();
                            this.f381a = cursor2.getColumnIndexOrThrow(AlertParams.this.K);
                            this.f382b = cursor2.getColumnIndexOrThrow(AlertParams.this.L);
                        }

                        @Override // android.widget.CursorAdapter
                        public final void bindView(View view2, Context context, Cursor cursor) {
                            ((CheckedTextView) view2.findViewById(R.id.text1)).setText(cursor.getString(this.f381a));
                            this.f383c.setItemChecked(cursor.getPosition(), cursor.getInt(this.f382b) == 1);
                        }

                        @Override // android.widget.CursorAdapter
                        public final View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                            return AlertParams.this.f358b.inflate(this.d.L, viewGroup, false);
                        }
                    };
                } else {
                    int i3 = alertParams.G ? alertController2.M : alertController2.N;
                    if (alertParams.J != null) {
                        listAdapter = new SimpleCursorAdapter(alertParams.f357a, i3, alertParams.J, new String[]{alertParams.K}, new int[]{R.id.text1});
                    } else {
                        listAdapter = alertParams.f376v;
                        if (listAdapter == null) {
                            listAdapter = new ArrayAdapter(alertParams.f357a, i3, R.id.text1, alertParams.f375u);
                        }
                    }
                }
                alertController2.H = listAdapter;
                alertController2.I = alertParams.H;
                if (alertParams.w != null) {
                    recycleListView2.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: androidx.appcompat.app.AlertController.AlertParams.3

                        /* renamed from: a */
                        public final /* synthetic */ AlertController f385a;

                        public AnonymousClass3(AlertController alertController2) {
                            r2 = alertController2;
                        }

                        @Override // android.widget.AdapterView.OnItemClickListener
                        public final void onItemClick(AdapterView adapterView, View view2, int i4, long j2) {
                            AlertParams alertParams2 = AlertParams.this;
                            DialogInterface.OnClickListener onClickListener = alertParams2.w;
                            AlertController alertController2 = r2;
                            onClickListener.onClick(alertController2.f335b, i4);
                            if (alertParams2.G) {
                                return;
                            }
                            alertController2.f335b.dismiss();
                        }
                    });
                } else if (alertParams.I != null) {
                    recycleListView2.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: androidx.appcompat.app.AlertController.AlertParams.4

                        /* renamed from: a */
                        public final /* synthetic */ RecycleListView f387a;

                        /* renamed from: b */
                        public final /* synthetic */ AlertController f388b;

                        public AnonymousClass4(RecycleListView recycleListView2, AlertController alertController2) {
                            r2 = recycleListView2;
                            r3 = alertController2;
                        }

                        @Override // android.widget.AdapterView.OnItemClickListener
                        public final void onItemClick(AdapterView adapterView, View view2, int i4, long j2) {
                            AlertParams alertParams2 = AlertParams.this;
                            boolean[] zArr = alertParams2.E;
                            RecycleListView recycleListView2 = r2;
                            if (zArr != null) {
                                zArr[i4] = recycleListView2.isItemChecked(i4);
                            }
                            alertParams2.I.onClick(r3.f335b, i4, recycleListView2.isItemChecked(i4));
                        }
                    });
                }
                AdapterView.OnItemSelectedListener onItemSelectedListener = alertParams.M;
                if (onItemSelectedListener != null) {
                    recycleListView2.setOnItemSelectedListener(onItemSelectedListener);
                }
                if (alertParams.G) {
                    recycleListView2.setChoiceMode(1);
                } else if (alertParams.F) {
                    recycleListView2.setChoiceMode(2);
                }
                alertController2.f338g = recycleListView2;
            }
            View view2 = alertParams.f377y;
            if (view2 == null) {
                int i4 = alertParams.x;
                if (i4 != 0) {
                    alertController2.f339h = null;
                    alertController2.f340i = i4;
                    alertController2.f345n = false;
                }
            } else if (alertParams.D) {
                int i5 = alertParams.f378z;
                int i6 = alertParams.A;
                int i7 = alertParams.B;
                int i8 = alertParams.C;
                alertController2.f339h = view2;
                alertController2.f340i = 0;
                alertController2.f345n = true;
                alertController2.f341j = i5;
                alertController2.f342k = i6;
                alertController2.f343l = i7;
                alertController2.f344m = i8;
            } else {
                alertController2.f339h = view2;
                alertController2.f340i = 0;
                alertController2.f345n = false;
            }
            alertDialog.setCancelable(this.P.f371q);
            if (this.P.f371q) {
                alertDialog.setCanceledOnTouchOutside(true);
            }
            alertDialog.setOnCancelListener(this.P.f372r);
            alertDialog.setOnDismissListener(this.P.f373s);
            DialogInterface.OnKeyListener onKeyListener = this.P.f374t;
            if (onKeyListener != null) {
                alertDialog.setOnKeyListener(onKeyListener);
            }
            return alertDialog;
        }

        @NonNull
        public Context getContext() {
            return this.P.f357a;
        }

        public Builder setAdapter(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.f376v = listAdapter;
            alertParams.w = onClickListener;
            return this;
        }

        public Builder setCancelable(boolean z2) {
            this.P.f371q = z2;
            return this;
        }

        public Builder setCursor(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.J = cursor;
            alertParams.K = str;
            alertParams.w = onClickListener;
            return this;
        }

        public Builder setCustomTitle(View view) {
            this.P.f360f = view;
            return this;
        }

        public Builder setIcon(int i2) {
            this.P.f359c = i2;
            return this;
        }

        public Builder setIconAttribute(int i2) {
            TypedValue typedValue = new TypedValue();
            this.P.f357a.getTheme().resolveAttribute(i2, typedValue, true);
            this.P.f359c = typedValue.resourceId;
            return this;
        }

        @Deprecated
        public Builder setInverseBackgroundForced(boolean z2) {
            this.P.getClass();
            return this;
        }

        public Builder setItems(int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.f375u = alertParams.f357a.getResources().getTextArray(i2);
            this.P.w = onClickListener;
            return this;
        }

        public Builder setMessage(int i2) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.f361g = alertParams.f357a.getText(i2);
            return this;
        }

        public Builder setMultiChoiceItems(int i2, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.f375u = alertParams.f357a.getResources().getTextArray(i2);
            AlertController.AlertParams alertParams2 = this.P;
            alertParams2.I = onMultiChoiceClickListener;
            alertParams2.E = zArr;
            alertParams2.F = true;
            return this;
        }

        public Builder setNegativeButton(int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.f365k = alertParams.f357a.getText(i2);
            this.P.f367m = onClickListener;
            return this;
        }

        public Builder setNegativeButtonIcon(Drawable drawable) {
            this.P.f366l = drawable;
            return this;
        }

        public Builder setNeutralButton(int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.f368n = alertParams.f357a.getText(i2);
            this.P.f370p = onClickListener;
            return this;
        }

        public Builder setNeutralButtonIcon(Drawable drawable) {
            this.P.f369o = drawable;
            return this;
        }

        public Builder setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
            this.P.f372r = onCancelListener;
            return this;
        }

        public Builder setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
            this.P.f373s = onDismissListener;
            return this;
        }

        public Builder setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
            this.P.M = onItemSelectedListener;
            return this;
        }

        public Builder setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
            this.P.f374t = onKeyListener;
            return this;
        }

        public Builder setPositiveButton(int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.f362h = alertParams.f357a.getText(i2);
            this.P.f364j = onClickListener;
            return this;
        }

        public Builder setPositiveButtonIcon(Drawable drawable) {
            this.P.f363i = drawable;
            return this;
        }

        @RestrictTo
        public Builder setRecycleOnMeasureEnabled(boolean z2) {
            this.P.getClass();
            return this;
        }

        public Builder setSingleChoiceItems(int i2, int i3, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.f375u = alertParams.f357a.getResources().getTextArray(i2);
            AlertController.AlertParams alertParams2 = this.P;
            alertParams2.w = onClickListener;
            alertParams2.H = i3;
            alertParams2.G = true;
            return this;
        }

        public Builder setTitle(int i2) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.e = alertParams.f357a.getText(i2);
            return this;
        }

        public Builder setView(int i2) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.f377y = null;
            alertParams.x = i2;
            alertParams.D = false;
            return this;
        }

        public AlertDialog show() {
            AlertDialog create = create();
            create.show();
            return create;
        }

        public Builder(Context context, int i2) {
            this.P = new AlertController.AlertParams(new ContextThemeWrapper(context, AlertDialog.e(i2, context)));
            this.mTheme = i2;
        }

        public Builder setIcon(Drawable drawable) {
            this.P.d = drawable;
            return this;
        }

        public Builder setMessage(CharSequence charSequence) {
            this.P.f361g = charSequence;
            return this;
        }

        public Builder setTitle(CharSequence charSequence) {
            this.P.e = charSequence;
            return this;
        }

        public Builder setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.f375u = charSequenceArr;
            alertParams.w = onClickListener;
            return this;
        }

        public Builder setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.f365k = charSequence;
            alertParams.f367m = onClickListener;
            return this;
        }

        public Builder setNeutralButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.f368n = charSequence;
            alertParams.f370p = onClickListener;
            return this;
        }

        public Builder setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.f362h = charSequence;
            alertParams.f364j = onClickListener;
            return this;
        }

        public Builder setView(View view) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.f377y = view;
            alertParams.x = 0;
            alertParams.D = false;
            return this;
        }

        public Builder setMultiChoiceItems(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.f375u = charSequenceArr;
            alertParams.I = onMultiChoiceClickListener;
            alertParams.E = zArr;
            alertParams.F = true;
            return this;
        }

        public Builder setSingleChoiceItems(Cursor cursor, int i2, String str, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.J = cursor;
            alertParams.w = onClickListener;
            alertParams.H = i2;
            alertParams.K = str;
            alertParams.G = true;
            return this;
        }

        @RestrictTo
        @Deprecated
        public Builder setView(View view, int i2, int i3, int i4, int i5) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.f377y = view;
            alertParams.x = 0;
            alertParams.D = true;
            alertParams.f378z = i2;
            alertParams.A = i3;
            alertParams.B = i4;
            alertParams.C = i5;
            return this;
        }

        public Builder setMultiChoiceItems(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.J = cursor;
            alertParams.I = onMultiChoiceClickListener;
            alertParams.L = str;
            alertParams.K = str2;
            alertParams.F = true;
            return this;
        }

        public Builder setSingleChoiceItems(CharSequence[] charSequenceArr, int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.f375u = charSequenceArr;
            alertParams.w = onClickListener;
            alertParams.H = i2;
            alertParams.G = true;
            return this;
        }

        public Builder setSingleChoiceItems(ListAdapter listAdapter, int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.f376v = listAdapter;
            alertParams.w = onClickListener;
            alertParams.H = i2;
            alertParams.G = true;
            return this;
        }
    }

    public AlertDialog(Context context, int i2) {
        super(context, e(i2, context));
        this.f393a = new AlertController(getContext(), this, getWindow());
    }

    public static int e(int i2, Context context) {
        if (((i2 >>> 24) & 255) >= 1) {
            return i2;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(com.cooldev.gba.emulator.gameboy.R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public final AlertController.RecycleListView d() {
        return this.f393a.f338g;
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i2;
        View view;
        int i3;
        ListAdapter listAdapter;
        View findViewById;
        super.onCreate(bundle);
        AlertController alertController = this.f393a;
        alertController.f335b.setContentView(alertController.J);
        Window window = alertController.f336c;
        View findViewById2 = window.findViewById(com.cooldev.gba.emulator.gameboy.R.id.parentPanel);
        View findViewById3 = findViewById2.findViewById(com.cooldev.gba.emulator.gameboy.R.id.topPanel);
        View findViewById4 = findViewById2.findViewById(com.cooldev.gba.emulator.gameboy.R.id.contentPanel);
        View findViewById5 = findViewById2.findViewById(com.cooldev.gba.emulator.gameboy.R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(com.cooldev.gba.emulator.gameboy.R.id.customPanel);
        View view2 = alertController.f339h;
        Context context = alertController.f334a;
        if (view2 == null) {
            view2 = alertController.f340i != 0 ? LayoutInflater.from(context).inflate(alertController.f340i, viewGroup, false) : null;
        }
        boolean z2 = view2 != null;
        if (!z2 || !AlertController.a(view2)) {
            window.setFlags(Opcodes.ACC_DEPRECATED, Opcodes.ACC_DEPRECATED);
        }
        if (z2) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(com.cooldev.gba.emulator.gameboy.R.id.custom);
            frameLayout.addView(view2, new ViewGroup.LayoutParams(-1, -1));
            if (alertController.f345n) {
                frameLayout.setPadding(alertController.f341j, alertController.f342k, alertController.f343l, alertController.f344m);
            }
            if (alertController.f338g != null) {
                ((LinearLayout.LayoutParams) ((LinearLayoutCompat.LayoutParams) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById6 = viewGroup.findViewById(com.cooldev.gba.emulator.gameboy.R.id.topPanel);
        View findViewById7 = viewGroup.findViewById(com.cooldev.gba.emulator.gameboy.R.id.contentPanel);
        View findViewById8 = viewGroup.findViewById(com.cooldev.gba.emulator.gameboy.R.id.buttonPanel);
        ViewGroup c2 = AlertController.c(findViewById6, findViewById3);
        ViewGroup c3 = AlertController.c(findViewById7, findViewById4);
        ViewGroup c4 = AlertController.c(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(com.cooldev.gba.emulator.gameboy.R.id.scrollView);
        alertController.A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        alertController.A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) c3.findViewById(R.id.message);
        alertController.F = textView;
        if (textView != null) {
            CharSequence charSequence = alertController.f337f;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                alertController.A.removeView(alertController.F);
                if (alertController.f338g != null) {
                    ViewGroup viewGroup2 = (ViewGroup) alertController.A.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(alertController.A);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(alertController.f338g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    c3.setVisibility(8);
                }
            }
        }
        Button button = (Button) c4.findViewById(R.id.button1);
        alertController.f346o = button;
        View.OnClickListener onClickListener = alertController.Q;
        button.setOnClickListener(onClickListener);
        boolean isEmpty = TextUtils.isEmpty(alertController.f347p);
        int i4 = alertController.d;
        if (isEmpty && alertController.f349r == null) {
            alertController.f346o.setVisibility(8);
            i2 = 0;
        } else {
            alertController.f346o.setText(alertController.f347p);
            Drawable drawable = alertController.f349r;
            if (drawable != null) {
                drawable.setBounds(0, 0, i4, i4);
                alertController.f346o.setCompoundDrawables(alertController.f349r, null, null, null);
            }
            alertController.f346o.setVisibility(0);
            i2 = 1;
        }
        Button button2 = (Button) c4.findViewById(R.id.button2);
        alertController.f350s = button2;
        button2.setOnClickListener(onClickListener);
        if (TextUtils.isEmpty(alertController.f351t) && alertController.f353v == null) {
            alertController.f350s.setVisibility(8);
        } else {
            alertController.f350s.setText(alertController.f351t);
            Drawable drawable2 = alertController.f353v;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, i4, i4);
                alertController.f350s.setCompoundDrawables(alertController.f353v, null, null, null);
            }
            alertController.f350s.setVisibility(0);
            i2 |= 2;
        }
        Button button3 = (Button) c4.findViewById(R.id.button3);
        alertController.w = button3;
        button3.setOnClickListener(onClickListener);
        if (TextUtils.isEmpty(alertController.x) && alertController.f355z == null) {
            alertController.w.setVisibility(8);
            view = null;
        } else {
            alertController.w.setText(alertController.x);
            Drawable drawable3 = alertController.f355z;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, i4, i4);
                view = null;
                alertController.w.setCompoundDrawables(alertController.f355z, null, null, null);
            } else {
                view = null;
            }
            alertController.w.setVisibility(0);
            i2 |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(com.cooldev.gba.emulator.gameboy.R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i2 == 1) {
                Button button4 = alertController.f346o;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i2 == 2) {
                Button button5 = alertController.f350s;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i2 == 4) {
                Button button6 = alertController.w;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i2 == 0) {
            c4.setVisibility(8);
        }
        if (alertController.G != null) {
            c2.addView(alertController.G, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(com.cooldev.gba.emulator.gameboy.R.id.title_template).setVisibility(8);
        } else {
            alertController.D = (ImageView) window.findViewById(R.id.icon);
            if ((!TextUtils.isEmpty(alertController.e)) && alertController.O) {
                TextView textView2 = (TextView) window.findViewById(com.cooldev.gba.emulator.gameboy.R.id.alertTitle);
                alertController.E = textView2;
                textView2.setText(alertController.e);
                int i5 = alertController.B;
                if (i5 != 0) {
                    alertController.D.setImageResource(i5);
                } else {
                    Drawable drawable4 = alertController.C;
                    if (drawable4 != null) {
                        alertController.D.setImageDrawable(drawable4);
                    } else {
                        alertController.E.setPadding(alertController.D.getPaddingLeft(), alertController.D.getPaddingTop(), alertController.D.getPaddingRight(), alertController.D.getPaddingBottom());
                        alertController.D.setVisibility(8);
                    }
                }
            } else {
                window.findViewById(com.cooldev.gba.emulator.gameboy.R.id.title_template).setVisibility(8);
                alertController.D.setVisibility(8);
                c2.setVisibility(8);
            }
        }
        boolean z3 = viewGroup.getVisibility() != 8;
        int i6 = (c2 == null || c2.getVisibility() == 8) ? 0 : 1;
        boolean z4 = c4.getVisibility() != 8;
        if (!z4 && (findViewById = c3.findViewById(com.cooldev.gba.emulator.gameboy.R.id.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (i6 != 0) {
            NestedScrollView nestedScrollView2 = alertController.A;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View findViewById9 = (alertController.f337f == null && alertController.f338g == null) ? view : c2.findViewById(com.cooldev.gba.emulator.gameboy.R.id.titleDividerNoCustom);
            i3 = 0;
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        } else {
            i3 = 0;
            View findViewById10 = c3.findViewById(com.cooldev.gba.emulator.gameboy.R.id.textSpacerNoTitle);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        AlertController.RecycleListView recycleListView = alertController.f338g;
        if (recycleListView instanceof AlertController.RecycleListView) {
            recycleListView.getClass();
            if (!z4 || i6 == 0) {
                recycleListView.setPadding(recycleListView.getPaddingLeft(), i6 != 0 ? recycleListView.getPaddingTop() : recycleListView.f391a, recycleListView.getPaddingRight(), z4 ? recycleListView.getPaddingBottom() : recycleListView.f392b);
            }
        }
        if (!z3) {
            ViewGroup viewGroup3 = alertController.f338g;
            if (viewGroup3 == null) {
                viewGroup3 = alertController.A;
            }
            if (viewGroup3 != null) {
                int i7 = z4 ? 2 : i3;
                View findViewById11 = window.findViewById(com.cooldev.gba.emulator.gameboy.R.id.scrollIndicatorUp);
                View findViewById12 = window.findViewById(com.cooldev.gba.emulator.gameboy.R.id.scrollIndicatorDown);
                ViewCompat.K(viewGroup3, i6 | i7);
                if (findViewById11 != null) {
                    c3.removeView(findViewById11);
                }
                if (findViewById12 != null) {
                    c3.removeView(findViewById12);
                }
            }
        }
        AlertController.RecycleListView recycleListView2 = alertController.f338g;
        if (recycleListView2 == null || (listAdapter = alertController.H) == null) {
            return;
        }
        recycleListView2.setAdapter(listAdapter);
        int i8 = alertController.I;
        if (i8 > -1) {
            recycleListView2.setItemChecked(i8, true);
            recycleListView2.setSelection(i8);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f393a.A;
        if (nestedScrollView == null || !nestedScrollView.d(keyEvent)) {
            return super.onKeyDown(i2, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f393a.A;
        if (nestedScrollView == null || !nestedScrollView.d(keyEvent)) {
            return super.onKeyUp(i2, keyEvent);
        }
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatDialog, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AlertController alertController = this.f393a;
        alertController.e = charSequence;
        TextView textView = alertController.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
