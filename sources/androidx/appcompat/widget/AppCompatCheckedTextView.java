package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.widget.CheckedTextView;
import androidx.activity.f;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.TextViewCompat;
import androidx.core.widget.TintableCheckedTextView;
import androidx.core.widget.TintableCompoundDrawablesView;
import com.cooldev.gba.emulator.gameboy.R;

/* loaded from: classes4.dex */
public class AppCompatCheckedTextView extends CheckedTextView implements TintableCheckedTextView, TintableBackgroundView, EmojiCompatConfigurationView, TintableCompoundDrawablesView {

    /* renamed from: a, reason: collision with root package name */
    public final AppCompatCheckedTextViewHelper f953a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatBackgroundHelper f954b;

    /* renamed from: c, reason: collision with root package name */
    public final AppCompatTextHelper f955c;
    public AppCompatEmojiTextHelper d;

    @RequiresApi
    @RestrictTo
    /* loaded from: classes3.dex */
    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion {

        /* renamed from: a, reason: collision with root package name */
        public boolean f956a;

        /* renamed from: b, reason: collision with root package name */
        public int f957b;

        /* renamed from: c, reason: collision with root package name */
        public int f958c;
        public int d;
        public int e;

        /* renamed from: f, reason: collision with root package name */
        public int f959f;

        /* renamed from: g, reason: collision with root package name */
        public int f960g;

        public final void mapProperties(PropertyMapper propertyMapper) {
            int mapObject;
            int mapObject2;
            int mapObject3;
            int mapObject4;
            int mapObject5;
            int mapObject6;
            mapObject = propertyMapper.mapObject("backgroundTint", R.attr.backgroundTint);
            this.f957b = mapObject;
            mapObject2 = propertyMapper.mapObject("backgroundTintMode", R.attr.backgroundTintMode);
            this.f958c = mapObject2;
            mapObject3 = propertyMapper.mapObject("checkMarkTint", R.attr.checkMarkTint);
            this.d = mapObject3;
            mapObject4 = propertyMapper.mapObject("checkMarkTintMode", R.attr.checkMarkTintMode);
            this.e = mapObject4;
            mapObject5 = propertyMapper.mapObject("drawableTint", R.attr.drawableTint);
            this.f959f = mapObject5;
            mapObject6 = propertyMapper.mapObject("drawableTintMode", R.attr.drawableTintMode);
            this.f960g = mapObject6;
            this.f956a = true;
        }

        public final void readProperties(Object obj, PropertyReader propertyReader) {
            AppCompatCheckedTextView appCompatCheckedTextView = (AppCompatCheckedTextView) obj;
            if (!this.f956a) {
                throw f.e();
            }
            propertyReader.readObject(this.f957b, appCompatCheckedTextView.getBackgroundTintList());
            propertyReader.readObject(this.f958c, appCompatCheckedTextView.getBackgroundTintMode());
            propertyReader.readObject(this.d, appCompatCheckedTextView.getCheckMarkTintList());
            propertyReader.readObject(this.e, appCompatCheckedTextView.getCheckMarkTintMode());
            propertyReader.readObject(this.f959f, appCompatCheckedTextView.getCompoundDrawableTintList());
            propertyReader.readObject(this.f960g, appCompatCheckedTextView.getCompoundDrawableTintMode());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0080 A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:3:0x0047, B:5:0x004e, B:8:0x0054, B:9:0x0079, B:11:0x0080, B:12:0x0087, B:14:0x008e, B:21:0x0062, B:23:0x0068, B:25:0x006e), top: B:2:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008e A[Catch: all -> 0x0060, TRY_LEAVE, TryCatch #0 {all -> 0x0060, blocks: (B:3:0x0047, B:5:0x004e, B:8:0x0054, B:9:0x0079, B:11:0x0080, B:12:0x0087, B:14:0x008e, B:21:0x0062, B:23:0x0068, B:25:0x006e), top: B:2:0x0047 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AppCompatCheckedTextView(android.content.Context r9, android.util.AttributeSet r10) {
        /*
            r8 = this;
            r6 = 2130968793(0x7f0400d9, float:1.754625E38)
            androidx.appcompat.widget.TintContextWrapper.a(r9)
            r8.<init>(r9, r10, r6)
            android.content.Context r9 = r8.getContext()
            androidx.appcompat.widget.ThemeUtils.a(r8, r9)
            androidx.appcompat.widget.AppCompatTextHelper r9 = new androidx.appcompat.widget.AppCompatTextHelper
            r9.<init>(r8)
            r8.f955c = r9
            r9.f(r10, r6)
            r9.b()
            androidx.appcompat.widget.AppCompatBackgroundHelper r9 = new androidx.appcompat.widget.AppCompatBackgroundHelper
            r9.<init>(r8)
            r8.f954b = r9
            r9.d(r10, r6)
            androidx.appcompat.widget.AppCompatCheckedTextViewHelper r9 = new androidx.appcompat.widget.AppCompatCheckedTextViewHelper
            r9.<init>(r8)
            r8.f953a = r9
            android.content.Context r9 = r8.getContext()
            int[] r2 = androidx.appcompat.R.styleable.f320l
            androidx.appcompat.widget.TintTypedArray r9 = androidx.appcompat.widget.TintTypedArray.e(r9, r10, r2, r6)
            android.content.res.TypedArray r7 = r9.f1237b
            android.content.Context r1 = r8.getContext()
            android.content.res.TypedArray r4 = r9.f1237b
            r0 = r8
            r3 = r10
            r5 = r6
            androidx.core.view.ViewCompat.z(r0, r1, r2, r3, r4, r5)
            r0 = 1
            boolean r1 = r7.hasValue(r0)     // Catch: java.lang.Throwable -> L60
            r2 = 0
            if (r1 == 0) goto L62
            int r0 = r7.getResourceId(r0, r2)     // Catch: java.lang.Throwable -> L60
            if (r0 == 0) goto L62
            android.content.Context r1 = r8.getContext()     // Catch: java.lang.Throwable -> L60 android.content.res.Resources.NotFoundException -> L62
            android.graphics.drawable.Drawable r0 = androidx.appcompat.content.res.AppCompatResources.a(r1, r0)     // Catch: java.lang.Throwable -> L60 android.content.res.Resources.NotFoundException -> L62
            r8.setCheckMarkDrawable(r0)     // Catch: java.lang.Throwable -> L60 android.content.res.Resources.NotFoundException -> L62
            goto L79
        L60:
            r10 = move-exception
            goto La6
        L62:
            boolean r0 = r7.hasValue(r2)     // Catch: java.lang.Throwable -> L60
            if (r0 == 0) goto L79
            int r0 = r7.getResourceId(r2, r2)     // Catch: java.lang.Throwable -> L60
            if (r0 == 0) goto L79
            android.content.Context r1 = r8.getContext()     // Catch: java.lang.Throwable -> L60
            android.graphics.drawable.Drawable r0 = androidx.appcompat.content.res.AppCompatResources.a(r1, r0)     // Catch: java.lang.Throwable -> L60
            r8.setCheckMarkDrawable(r0)     // Catch: java.lang.Throwable -> L60
        L79:
            r0 = 2
            boolean r1 = r7.hasValue(r0)     // Catch: java.lang.Throwable -> L60
            if (r1 == 0) goto L87
            android.content.res.ColorStateList r0 = r9.a(r0)     // Catch: java.lang.Throwable -> L60
            r8.setCheckMarkTintList(r0)     // Catch: java.lang.Throwable -> L60
        L87:
            r0 = 3
            boolean r1 = r7.hasValue(r0)     // Catch: java.lang.Throwable -> L60
            if (r1 == 0) goto L9b
            r1 = -1
            int r0 = r7.getInt(r0, r1)     // Catch: java.lang.Throwable -> L60
            r1 = 0
            android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.DrawableUtils.c(r0, r1)     // Catch: java.lang.Throwable -> L60
            r8.setCheckMarkTintMode(r0)     // Catch: java.lang.Throwable -> L60
        L9b:
            r9.f()
            androidx.appcompat.widget.AppCompatEmojiTextHelper r9 = r8.getEmojiTextViewHelper()
            r9.a(r10, r6)
            return
        La6:
            r9.f()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatCheckedTextView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @NonNull
    private AppCompatEmojiTextHelper getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new AppCompatEmojiTextHelper(this);
        }
        return this.d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatTextHelper appCompatTextHelper = this.f955c;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.b();
        }
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f954b;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.a();
        }
        AppCompatCheckedTextViewHelper appCompatCheckedTextViewHelper = this.f953a;
        if (appCompatCheckedTextViewHelper != null) {
            appCompatCheckedTextViewHelper.a();
        }
    }

    @Override // android.widget.TextView
    @Nullable
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return TextViewCompat.j(super.getCustomSelectionActionModeCallback());
    }

    @Nullable
    @RestrictTo
    public ColorStateList getSupportBackgroundTintList() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f954b;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.b();
        }
        return null;
    }

    @Nullable
    @RestrictTo
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f954b;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.c();
        }
        return null;
    }

    @Nullable
    @RestrictTo
    public ColorStateList getSupportCheckMarkTintList() {
        AppCompatCheckedTextViewHelper appCompatCheckedTextViewHelper = this.f953a;
        if (appCompatCheckedTextViewHelper != null) {
            return appCompatCheckedTextViewHelper.f962b;
        }
        return null;
    }

    @Nullable
    @RestrictTo
    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        AppCompatCheckedTextViewHelper appCompatCheckedTextViewHelper = this.f953a;
        if (appCompatCheckedTextViewHelper != null) {
            return appCompatCheckedTextViewHelper.f963c;
        }
        return null;
    }

    @Nullable
    @RestrictTo
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f955c.d();
    }

    @Nullable
    @RestrictTo
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f955c.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AppCompatHintHelper.a(this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().b(z2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f954b;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i2) {
        super.setBackgroundResource(i2);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f954b;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.f(i2);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(@Nullable Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        AppCompatCheckedTextViewHelper appCompatCheckedTextViewHelper = this.f953a;
        if (appCompatCheckedTextViewHelper != null) {
            if (appCompatCheckedTextViewHelper.f964f) {
                appCompatCheckedTextViewHelper.f964f = false;
            } else {
                appCompatCheckedTextViewHelper.f964f = true;
                appCompatCheckedTextViewHelper.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.f955c;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.f955c;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@Nullable ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.k(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().c(z2);
    }

    @RestrictTo
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f954b;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.h(colorStateList);
        }
    }

    @RestrictTo
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f954b;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.i(mode);
        }
    }

    @RestrictTo
    public void setSupportCheckMarkTintList(@Nullable ColorStateList colorStateList) {
        AppCompatCheckedTextViewHelper appCompatCheckedTextViewHelper = this.f953a;
        if (appCompatCheckedTextViewHelper != null) {
            appCompatCheckedTextViewHelper.f962b = colorStateList;
            appCompatCheckedTextViewHelper.d = true;
            appCompatCheckedTextViewHelper.a();
        }
    }

    @RestrictTo
    public void setSupportCheckMarkTintMode(@Nullable PorterDuff.Mode mode) {
        AppCompatCheckedTextViewHelper appCompatCheckedTextViewHelper = this.f953a;
        if (appCompatCheckedTextViewHelper != null) {
            appCompatCheckedTextViewHelper.f963c = mode;
            appCompatCheckedTextViewHelper.e = true;
            appCompatCheckedTextViewHelper.a();
        }
    }

    @RestrictTo
    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList) {
        AppCompatTextHelper appCompatTextHelper = this.f955c;
        appCompatTextHelper.k(colorStateList);
        appCompatTextHelper.b();
    }

    @RestrictTo
    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode) {
        AppCompatTextHelper appCompatTextHelper = this.f955c;
        appCompatTextHelper.l(mode);
        appCompatTextHelper.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        AppCompatTextHelper appCompatTextHelper = this.f955c;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.g(i2, context);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(@DrawableRes int i2) {
        setCheckMarkDrawable(AppCompatResources.a(getContext(), i2));
    }
}
