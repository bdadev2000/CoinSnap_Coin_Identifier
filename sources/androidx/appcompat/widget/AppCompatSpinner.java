package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.activity.f;
import androidx.annotation.DoNotInline;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.TintableBackgroundView;
import java.util.Objects;

/* loaded from: classes2.dex */
public class AppCompatSpinner extends Spinner implements TintableBackgroundView {

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f1013j = {R.attr.spinnerMode};

    /* renamed from: a, reason: collision with root package name */
    public final AppCompatBackgroundHelper f1014a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f1015b;

    /* renamed from: c, reason: collision with root package name */
    public final ForwardingListener f1016c;
    public SpinnerAdapter d;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f1017f;

    /* renamed from: g, reason: collision with root package name */
    public final SpinnerPopup f1018g;

    /* renamed from: h, reason: collision with root package name */
    public int f1019h;

    /* renamed from: i, reason: collision with root package name */
    public final Rect f1020i;

    @RequiresApi
    /* loaded from: classes2.dex */
    public static final class Api23Impl {
        @DoNotInline
        public static void a(@NonNull android.widget.ThemedSpinnerAdapter themedSpinnerAdapter, @Nullable Resources.Theme theme) {
            if (Objects.equals(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                return;
            }
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }

    @VisibleForTesting
    /* loaded from: classes2.dex */
    public class DialogPopup implements SpinnerPopup, DialogInterface.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public AlertDialog f1024a;

        /* renamed from: b, reason: collision with root package name */
        public ListAdapter f1025b;

        /* renamed from: c, reason: collision with root package name */
        public CharSequence f1026c;

        public DialogPopup() {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public final boolean a() {
            AlertDialog alertDialog = this.f1024a;
            if (alertDialog != null) {
                return alertDialog.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public final int b() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public final void d(int i2) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public final void dismiss() {
            AlertDialog alertDialog = this.f1024a;
            if (alertDialog != null) {
                alertDialog.dismiss();
                this.f1024a = null;
            }
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public final CharSequence e() {
            return this.f1026c;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public final Drawable f() {
            return null;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public final void g(CharSequence charSequence) {
            this.f1026c = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public final void h(int i2) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public final void i(int i2) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public final void j(int i2, int i3) {
            if (this.f1025b == null) {
                return;
            }
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            AlertDialog.Builder builder = new AlertDialog.Builder(appCompatSpinner.getPopupContext());
            CharSequence charSequence = this.f1026c;
            if (charSequence != null) {
                builder.setTitle(charSequence);
            }
            builder.setSingleChoiceItems(this.f1025b, appCompatSpinner.getSelectedItemPosition(), this);
            AlertDialog create = builder.create();
            this.f1024a = create;
            AlertController.RecycleListView d = create.d();
            d.setTextDirection(i2);
            d.setTextAlignment(i3);
            this.f1024a.show();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public final int k() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public final void l(ListAdapter listAdapter) {
            this.f1025b = listAdapter;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i2) {
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            appCompatSpinner.setSelection(i2);
            if (appCompatSpinner.getOnItemClickListener() != null) {
                appCompatSpinner.performItemClick(null, i2, this.f1025b.getItemId(i2));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public final void setBackgroundDrawable(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }
    }

    /* loaded from: classes2.dex */
    public static class DropDownAdapter implements ListAdapter, SpinnerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public SpinnerAdapter f1027a;

        /* renamed from: b, reason: collision with root package name */
        public ListAdapter f1028b;

        @Override // android.widget.ListAdapter
        public final boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f1028b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            SpinnerAdapter spinnerAdapter = this.f1027a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public final View getDropDownView(int i2, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f1027a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i2, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i2) {
            SpinnerAdapter spinnerAdapter = this.f1027a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i2);
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i2) {
            SpinnerAdapter spinnerAdapter = this.f1027a;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i2);
        }

        @Override // android.widget.Adapter
        public final int getItemViewType(int i2) {
            return 0;
        }

        @Override // android.widget.Adapter
        public final View getView(int i2, View view, ViewGroup viewGroup) {
            return getDropDownView(i2, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public final int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public final boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f1027a;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public final boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public final boolean isEnabled(int i2) {
            ListAdapter listAdapter = this.f1028b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i2);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1027a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1027a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    @VisibleForTesting
    /* loaded from: classes2.dex */
    public class DropdownPopup extends ListPopupWindow implements SpinnerPopup {
        public CharSequence D;
        public ListAdapter E;
        public final Rect F;
        public int G;

        public DropdownPopup(Context context, AttributeSet attributeSet, int i2) {
            super(context, attributeSet, i2, 0);
            this.F = new Rect();
            this.f1150p = AppCompatSpinner.this;
            this.f1158z = true;
            this.A.setFocusable(true);
            this.f1151q = new AdapterView.OnItemClickListener() { // from class: androidx.appcompat.widget.AppCompatSpinner.DropdownPopup.1
                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view, int i3, long j2) {
                    DropdownPopup dropdownPopup = DropdownPopup.this;
                    AppCompatSpinner.this.setSelection(i3);
                    if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                        AppCompatSpinner.this.performItemClick(view, i3, dropdownPopup.E.getItemId(i3));
                    }
                    dropdownPopup.dismiss();
                }
            };
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public final CharSequence e() {
            return this.D;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public final void g(CharSequence charSequence) {
            this.D = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public final void i(int i2) {
            this.G = i2;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public final void j(int i2, int i3) {
            ViewTreeObserver viewTreeObserver;
            PopupWindow popupWindow = this.A;
            boolean isShowing = popupWindow.isShowing();
            q();
            this.A.setInputMethodMode(2);
            show();
            DropDownListView dropDownListView = this.f1139c;
            dropDownListView.setChoiceMode(1);
            dropDownListView.setTextDirection(i2);
            dropDownListView.setTextAlignment(i3);
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            int selectedItemPosition = appCompatSpinner.getSelectedItemPosition();
            DropDownListView dropDownListView2 = this.f1139c;
            if (popupWindow.isShowing() && dropDownListView2 != null) {
                dropDownListView2.setListSelectionHidden(false);
                dropDownListView2.setSelection(selectedItemPosition);
                if (dropDownListView2.getChoiceMode() != 0) {
                    dropDownListView2.setItemChecked(selectedItemPosition, true);
                }
            }
            if (isShowing || (viewTreeObserver = appCompatSpinner.getViewTreeObserver()) == null) {
                return;
            }
            final ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.appcompat.widget.AppCompatSpinner.DropdownPopup.2
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    DropdownPopup dropdownPopup = DropdownPopup.this;
                    AppCompatSpinner appCompatSpinner2 = AppCompatSpinner.this;
                    dropdownPopup.getClass();
                    if (!appCompatSpinner2.isAttachedToWindow() || !appCompatSpinner2.getGlobalVisibleRect(dropdownPopup.F)) {
                        dropdownPopup.dismiss();
                    } else {
                        dropdownPopup.q();
                        dropdownPopup.show();
                    }
                }
            };
            viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
            this.A.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: androidx.appcompat.widget.AppCompatSpinner.DropdownPopup.3
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    ViewTreeObserver viewTreeObserver2 = AppCompatSpinner.this.getViewTreeObserver();
                    if (viewTreeObserver2 != null) {
                        viewTreeObserver2.removeGlobalOnLayoutListener(onGlobalLayoutListener);
                    }
                }
            });
        }

        @Override // androidx.appcompat.widget.ListPopupWindow, androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public final void l(ListAdapter listAdapter) {
            super.l(listAdapter);
            this.E = listAdapter;
        }

        public final void q() {
            int i2;
            PopupWindow popupWindow = this.A;
            Drawable background = popupWindow.getBackground();
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            if (background != null) {
                background.getPadding(appCompatSpinner.f1020i);
                boolean z2 = ViewUtils.f1295a;
                int layoutDirection = appCompatSpinner.getLayoutDirection();
                Rect rect = appCompatSpinner.f1020i;
                i2 = layoutDirection == 1 ? rect.right : -rect.left;
            } else {
                Rect rect2 = appCompatSpinner.f1020i;
                rect2.right = 0;
                rect2.left = 0;
                i2 = 0;
            }
            int paddingLeft = appCompatSpinner.getPaddingLeft();
            int paddingRight = appCompatSpinner.getPaddingRight();
            int width = appCompatSpinner.getWidth();
            int i3 = appCompatSpinner.f1019h;
            if (i3 == -2) {
                int a2 = appCompatSpinner.a((SpinnerAdapter) this.E, popupWindow.getBackground());
                int i4 = appCompatSpinner.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect3 = appCompatSpinner.f1020i;
                int i5 = (i4 - rect3.left) - rect3.right;
                if (a2 > i5) {
                    a2 = i5;
                }
                p(Math.max(a2, (width - paddingLeft) - paddingRight));
            } else if (i3 == -1) {
                p((width - paddingLeft) - paddingRight);
            } else {
                p(i3);
            }
            boolean z3 = ViewUtils.f1295a;
            this.f1141g = appCompatSpinner.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f1140f) - this.G) + i2 : paddingLeft + this.G + i2;
        }
    }

    @RequiresApi
    @RestrictTo
    /* loaded from: classes2.dex */
    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion {

        /* renamed from: a, reason: collision with root package name */
        public boolean f1033a;

        /* renamed from: b, reason: collision with root package name */
        public int f1034b;

        /* renamed from: c, reason: collision with root package name */
        public int f1035c;

        public final void mapProperties(PropertyMapper propertyMapper) {
            int mapObject;
            int mapObject2;
            mapObject = propertyMapper.mapObject("backgroundTint", com.cooldev.gba.emulator.gameboy.R.attr.backgroundTint);
            this.f1034b = mapObject;
            mapObject2 = propertyMapper.mapObject("backgroundTintMode", com.cooldev.gba.emulator.gameboy.R.attr.backgroundTintMode);
            this.f1035c = mapObject2;
            this.f1033a = true;
        }

        public final void readProperties(Object obj, PropertyReader propertyReader) {
            AppCompatSpinner appCompatSpinner = (AppCompatSpinner) obj;
            if (!this.f1033a) {
                throw f.e();
            }
            propertyReader.readObject(this.f1034b, appCompatSpinner.getBackgroundTintList());
            propertyReader.readObject(this.f1035c, appCompatSpinner.getBackgroundTintMode());
        }
    }

    /* loaded from: classes2.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Object();

        /* renamed from: a, reason: collision with root package name */
        public boolean f1036a;

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$SavedState$1, reason: invalid class name */
        /* loaded from: classes2.dex */
        public class AnonymousClass1 implements Parcelable.Creator<SavedState> {
            /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View$BaseSavedState, androidx.appcompat.widget.AppCompatSpinner$SavedState] */
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                ?? baseSavedState = new View.BaseSavedState(parcel);
                baseSavedState.f1036a = parcel.readByte() != 0;
                return baseSavedState;
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeByte(this.f1036a ? (byte) 1 : (byte) 0);
        }
    }

    @VisibleForTesting
    /* loaded from: classes2.dex */
    public interface SpinnerPopup {
        boolean a();

        int b();

        void d(int i2);

        void dismiss();

        CharSequence e();

        Drawable f();

        void g(CharSequence charSequence);

        void h(int i2);

        void i(int i2);

        void j(int i2, int i3);

        int k();

        void l(ListAdapter listAdapter);

        void setBackgroundDrawable(Drawable drawable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005e, code lost:
    
        if (r5 == null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AppCompatSpinner(android.content.Context r12, android.util.AttributeSet r13, int r14) {
        /*
            r11 = this;
            r11.<init>(r12, r13, r14)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r11.f1020i = r0
            android.content.Context r0 = r11.getContext()
            androidx.appcompat.widget.ThemeUtils.a(r11, r0)
            int[] r0 = androidx.appcompat.R.styleable.f330v
            androidx.appcompat.widget.TintTypedArray r1 = new androidx.appcompat.widget.TintTypedArray
            r2 = 0
            android.content.res.TypedArray r3 = r12.obtainStyledAttributes(r13, r0, r14, r2)
            r1.<init>(r12, r3)
            androidx.appcompat.widget.AppCompatBackgroundHelper r4 = new androidx.appcompat.widget.AppCompatBackgroundHelper
            r4.<init>(r11)
            r11.f1014a = r4
            r4 = 4
            int r3 = r3.getResourceId(r4, r2)
            if (r3 == 0) goto L33
            androidx.appcompat.view.ContextThemeWrapper r4 = new androidx.appcompat.view.ContextThemeWrapper
            r4.<init>(r12, r3)
            r11.f1015b = r4
            goto L35
        L33:
            r11.f1015b = r12
        L35:
            r3 = -1
            r4 = 0
            int[] r5 = androidx.appcompat.widget.AppCompatSpinner.f1013j     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L55
            android.content.res.TypedArray r5 = r12.obtainStyledAttributes(r13, r5, r14, r2)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L55
            boolean r6 = r5.hasValue(r2)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4c
            if (r6 == 0) goto L4e
            int r3 = r5.getInt(r2, r2)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4c
            goto L4e
        L48:
            r12 = move-exception
            r4 = r5
            goto Ld3
        L4c:
            r6 = move-exception
            goto L57
        L4e:
            r5.recycle()
            goto L61
        L52:
            r12 = move-exception
            goto Ld3
        L55:
            r6 = move-exception
            r5 = r4
        L57:
            java.lang.String r7 = "AppCompatSpinner"
            java.lang.String r8 = "Could not read android:spinnerMode"
            android.util.Log.i(r7, r8, r6)     // Catch: java.lang.Throwable -> L48
            if (r5 == 0) goto L61
            goto L4e
        L61:
            r5 = 2
            r6 = 1
            android.content.res.TypedArray r7 = r1.f1237b
            if (r3 == 0) goto L9b
            if (r3 == r6) goto L6a
            goto La8
        L6a:
            androidx.appcompat.widget.AppCompatSpinner$DropdownPopup r3 = new androidx.appcompat.widget.AppCompatSpinner$DropdownPopup
            android.content.Context r8 = r11.f1015b
            r3.<init>(r8, r13, r14)
            android.content.Context r8 = r11.f1015b
            androidx.appcompat.widget.TintTypedArray r0 = androidx.appcompat.widget.TintTypedArray.e(r8, r13, r0, r14)
            android.content.res.TypedArray r8 = r0.f1237b
            r9 = 3
            r10 = -2
            int r8 = r8.getLayoutDimension(r9, r10)
            r11.f1019h = r8
            android.graphics.drawable.Drawable r8 = r0.b(r6)
            r3.setBackgroundDrawable(r8)
            java.lang.String r5 = r7.getString(r5)
            r3.D = r5
            r0.f()
            r11.f1018g = r3
            androidx.appcompat.widget.AppCompatSpinner$1 r0 = new androidx.appcompat.widget.AppCompatSpinner$1
            r0.<init>(r11)
            r11.f1016c = r0
            goto La8
        L9b:
            androidx.appcompat.widget.AppCompatSpinner$DialogPopup r0 = new androidx.appcompat.widget.AppCompatSpinner$DialogPopup
            r0.<init>()
            r11.f1018g = r0
            java.lang.String r3 = r7.getString(r5)
            r0.f1026c = r3
        La8:
            java.lang.CharSequence[] r0 = r7.getTextArray(r2)
            if (r0 == 0) goto Lbf
            android.widget.ArrayAdapter r2 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r2.<init>(r12, r3, r0)
            r12 = 2131558565(0x7f0d00a5, float:1.874245E38)
            r2.setDropDownViewResource(r12)
            r11.setAdapter(r2)
        Lbf:
            r1.f()
            r11.f1017f = r6
            android.widget.SpinnerAdapter r12 = r11.d
            if (r12 == 0) goto Lcd
            r11.setAdapter(r12)
            r11.d = r4
        Lcd:
            androidx.appcompat.widget.AppCompatBackgroundHelper r12 = r11.f1014a
            r12.d(r13, r14)
            return
        Ld3:
            if (r4 == 0) goto Ld8
            r4.recycle()
        Ld8:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i2 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i3 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i3 = Math.max(i3, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i3;
        }
        Rect rect = this.f1020i;
        drawable.getPadding(rect);
        return i3 + rect.left + rect.right;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1014a;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        SpinnerPopup spinnerPopup = this.f1018g;
        return spinnerPopup != null ? spinnerPopup.b() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        SpinnerPopup spinnerPopup = this.f1018g;
        return spinnerPopup != null ? spinnerPopup.k() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f1018g != null ? this.f1019h : super.getDropDownWidth();
    }

    @VisibleForTesting
    public final SpinnerPopup getInternalPopup() {
        return this.f1018g;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        SpinnerPopup spinnerPopup = this.f1018g;
        return spinnerPopup != null ? spinnerPopup.f() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f1015b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        SpinnerPopup spinnerPopup = this.f1018g;
        return spinnerPopup != null ? spinnerPopup.e() : super.getPrompt();
    }

    @Nullable
    @RestrictTo
    public ColorStateList getSupportBackgroundTintList() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1014a;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.b();
        }
        return null;
    }

    @Nullable
    @RestrictTo
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1014a;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        SpinnerPopup spinnerPopup = this.f1018g;
        if (spinnerPopup == null || !spinnerPopup.a()) {
            return;
        }
        spinnerPopup.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f1018g == null || View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (!savedState.f1036a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.appcompat.widget.AppCompatSpinner.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
                if (!appCompatSpinner.getInternalPopup().a()) {
                    appCompatSpinner.f1018g.j(appCompatSpinner.getTextDirection(), appCompatSpinner.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver2 = appCompatSpinner.getViewTreeObserver();
                if (viewTreeObserver2 != null) {
                    viewTreeObserver2.removeOnGlobalLayoutListener(this);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, androidx.appcompat.widget.AppCompatSpinner$SavedState] */
    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        SpinnerPopup spinnerPopup = this.f1018g;
        baseSavedState.f1036a = spinnerPopup != null && spinnerPopup.a();
        return baseSavedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ForwardingListener forwardingListener = this.f1016c;
        if (forwardingListener == null || !forwardingListener.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        SpinnerPopup spinnerPopup = this.f1018g;
        if (spinnerPopup == null) {
            return super.performClick();
        }
        if (spinnerPopup.a()) {
            return true;
        }
        this.f1018g.j(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1014a;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i2) {
        super.setBackgroundResource(i2);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1014a;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.f(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i2) {
        SpinnerPopup spinnerPopup = this.f1018g;
        if (spinnerPopup == null) {
            super.setDropDownHorizontalOffset(i2);
        } else {
            spinnerPopup.i(i2);
            spinnerPopup.d(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i2) {
        SpinnerPopup spinnerPopup = this.f1018g;
        if (spinnerPopup != null) {
            spinnerPopup.h(i2);
        } else {
            super.setDropDownVerticalOffset(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i2) {
        if (this.f1018g != null) {
            this.f1019h = i2;
        } else {
            super.setDropDownWidth(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        SpinnerPopup spinnerPopup = this.f1018g;
        if (spinnerPopup != null) {
            spinnerPopup.setBackgroundDrawable(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(@DrawableRes int i2) {
        setPopupBackgroundDrawable(AppCompatResources.a(getPopupContext(), i2));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        SpinnerPopup spinnerPopup = this.f1018g;
        if (spinnerPopup != null) {
            spinnerPopup.g(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @RestrictTo
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1014a;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.h(colorStateList);
        }
    }

    @RestrictTo
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1014a;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.i(mode);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.appcompat.widget.AppCompatSpinner$DropDownAdapter, android.widget.ListAdapter, java.lang.Object] */
    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1017f) {
            this.d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        SpinnerPopup spinnerPopup = this.f1018g;
        if (spinnerPopup != 0) {
            Context context = this.f1015b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            ?? obj = new Object();
            obj.f1027a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                obj.f1028b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (spinnerAdapter instanceof android.widget.ThemedSpinnerAdapter) {
                    Api23Impl.a((android.widget.ThemedSpinnerAdapter) spinnerAdapter, theme);
                } else if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                    ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                    if (themedSpinnerAdapter.getDropDownViewTheme() == null) {
                        themedSpinnerAdapter.z();
                    }
                }
            }
            spinnerPopup.l(obj);
        }
    }
}
