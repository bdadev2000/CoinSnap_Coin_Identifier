package com.google.android.material.chip;

import F3.a;
import F3.b;
import F3.c;
import F3.d;
import F3.e;
import L3.k;
import M.g;
import M.h;
import R3.v;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.StringRes;
import androidx.core.app.NotificationCompat;
import androidx.core.view.ViewCompat;
import com.facebook.appevents.n;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import q.C2619q;
import w3.AbstractC2861a;
import x3.C2921b;
import z2.i;

/* loaded from: classes2.dex */
public class Chip extends C2619q implements d, v, Checkable {

    /* renamed from: g, reason: collision with root package name */
    public e f13993g;

    /* renamed from: h, reason: collision with root package name */
    public InsetDrawable f13994h;

    /* renamed from: i, reason: collision with root package name */
    public RippleDrawable f13995i;

    /* renamed from: j, reason: collision with root package name */
    public View.OnClickListener f13996j;

    /* renamed from: k, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f13997k;
    public boolean l;
    public boolean m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f13998n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f13999o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f14000p;

    /* renamed from: q, reason: collision with root package name */
    public int f14001q;

    /* renamed from: r, reason: collision with root package name */
    public int f14002r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f14003s;

    /* renamed from: t, reason: collision with root package name */
    public final c f14004t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f14005u;

    /* renamed from: v, reason: collision with root package name */
    public final Rect f14006v;

    /* renamed from: w, reason: collision with root package name */
    public final RectF f14007w;

    /* renamed from: x, reason: collision with root package name */
    public final a f14008x;

    /* renamed from: y, reason: collision with root package name */
    public static final Rect f13991y = new Rect();

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f13992z = {R.attr.state_selected};

    /* renamed from: A, reason: collision with root package name */
    public static final int[] f13990A = {R.attr.state_checkable};

    public Chip(Context context, AttributeSet attributeSet) {
        super(W3.a.a(context, attributeSet, com.tools.arruler.photomeasure.camera.ruler.R.attr.chipStyle, com.tools.arruler.photomeasure.camera.ruler.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, com.tools.arruler.photomeasure.camera.ruler.R.attr.chipStyle);
        O3.d dVar;
        C2921b c2921b;
        C2921b c2921b2;
        int resourceId;
        int resourceId2;
        int resourceId3;
        this.f14006v = new Rect();
        this.f14007w = new RectF();
        this.f14008x = new a(this, 0);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") == null) {
                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") == null) {
                    if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") == null) {
                        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") == null) {
                            if (attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) == 1) {
                                if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                                    Log.w("Chip", "Chip text must be vertically center and start aligned");
                                }
                            } else {
                                throw new UnsupportedOperationException("Chip does not support multi-line text");
                            }
                        } else {
                            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                        }
                    } else {
                        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                    }
                } else {
                    throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
                }
            } else {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
        }
        e eVar = new e(context2, attributeSet);
        int[] iArr = AbstractC2861a.f23663c;
        TypedArray f9 = k.f(eVar.f1189g0, attributeSet, iArr, com.tools.arruler.photomeasure.camera.ruler.R.attr.chipStyle, com.tools.arruler.photomeasure.camera.ruler.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        eVar.f1166H0 = f9.hasValue(37);
        Context context3 = eVar.f1189g0;
        ColorStateList p2 = android.support.v4.media.session.a.p(context3, f9, 24);
        if (eVar.f1208z != p2) {
            eVar.f1208z = p2;
            eVar.onStateChange(eVar.getState());
        }
        ColorStateList p7 = android.support.v4.media.session.a.p(context3, f9, 11);
        if (eVar.f1151A != p7) {
            eVar.f1151A = p7;
            eVar.onStateChange(eVar.getState());
        }
        float dimension = f9.getDimension(19, 0.0f);
        if (eVar.f1153B != dimension) {
            eVar.f1153B = dimension;
            eVar.invalidateSelf();
            eVar.v();
        }
        if (f9.hasValue(12)) {
            eVar.B(f9.getDimension(12, 0.0f));
        }
        eVar.G(android.support.v4.media.session.a.p(context3, f9, 22));
        eVar.H(f9.getDimension(23, 0.0f));
        eVar.Q(android.support.v4.media.session.a.p(context3, f9, 36));
        String text = f9.getText(5);
        text = text == null ? "" : text;
        if (!TextUtils.equals(eVar.f1163G, text)) {
            eVar.f1163G = text;
            eVar.f1195m0.f1797d = true;
            eVar.invalidateSelf();
            eVar.v();
        }
        if (f9.hasValue(0) && (resourceId3 = f9.getResourceId(0, 0)) != 0) {
            dVar = new O3.d(context3, resourceId3);
        } else {
            dVar = null;
        }
        dVar.f2175k = f9.getDimension(1, dVar.f2175k);
        eVar.R(dVar);
        int i9 = f9.getInt(3, 0);
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 == 3) {
                    eVar.f1160E0 = TextUtils.TruncateAt.END;
                }
            } else {
                eVar.f1160E0 = TextUtils.TruncateAt.MIDDLE;
            }
        } else {
            eVar.f1160E0 = TextUtils.TruncateAt.START;
        }
        eVar.F(f9.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            eVar.F(f9.getBoolean(15, false));
        }
        eVar.C(android.support.v4.media.session.a.r(context3, f9, 14));
        if (f9.hasValue(17)) {
            eVar.E(android.support.v4.media.session.a.p(context3, f9, 17));
        }
        eVar.D(f9.getDimension(16, -1.0f));
        eVar.N(f9.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            eVar.N(f9.getBoolean(26, false));
        }
        eVar.I(android.support.v4.media.session.a.r(context3, f9, 25));
        eVar.M(android.support.v4.media.session.a.p(context3, f9, 30));
        eVar.K(f9.getDimension(28, 0.0f));
        eVar.x(f9.getBoolean(6, false));
        eVar.A(f9.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            eVar.A(f9.getBoolean(8, false));
        }
        eVar.y(android.support.v4.media.session.a.r(context3, f9, 7));
        if (f9.hasValue(9)) {
            eVar.z(android.support.v4.media.session.a.p(context3, f9, 9));
        }
        if (f9.hasValue(39) && (resourceId2 = f9.getResourceId(39, 0)) != 0) {
            c2921b = C2921b.a(context3, resourceId2);
        } else {
            c2921b = null;
        }
        eVar.f1180W = c2921b;
        if (f9.hasValue(33) && (resourceId = f9.getResourceId(33, 0)) != 0) {
            c2921b2 = C2921b.a(context3, resourceId);
        } else {
            c2921b2 = null;
        }
        eVar.f1181X = c2921b2;
        float dimension2 = f9.getDimension(21, 0.0f);
        if (eVar.f1182Y != dimension2) {
            eVar.f1182Y = dimension2;
            eVar.invalidateSelf();
            eVar.v();
        }
        eVar.P(f9.getDimension(35, 0.0f));
        eVar.O(f9.getDimension(34, 0.0f));
        float dimension3 = f9.getDimension(41, 0.0f);
        if (eVar.f1185b0 != dimension3) {
            eVar.f1185b0 = dimension3;
            eVar.invalidateSelf();
            eVar.v();
        }
        float dimension4 = f9.getDimension(40, 0.0f);
        if (eVar.f1186c0 != dimension4) {
            eVar.f1186c0 = dimension4;
            eVar.invalidateSelf();
            eVar.v();
        }
        eVar.L(f9.getDimension(29, 0.0f));
        eVar.J(f9.getDimension(27, 0.0f));
        float dimension5 = f9.getDimension(13, 0.0f);
        if (eVar.f0 != dimension5) {
            eVar.f0 = dimension5;
            eVar.invalidateSelf();
            eVar.v();
        }
        eVar.f1164G0 = f9.getDimensionPixelSize(4, Integer.MAX_VALUE);
        f9.recycle();
        k.a(context2, attributeSet, com.tools.arruler.photomeasure.camera.ruler.R.attr.chipStyle, com.tools.arruler.photomeasure.camera.ruler.R.style.Widget_MaterialComponents_Chip_Action);
        k.b(context2, attributeSet, iArr, com.tools.arruler.photomeasure.camera.ruler.R.attr.chipStyle, com.tools.arruler.photomeasure.camera.ruler.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.tools.arruler.photomeasure.camera.ruler.R.attr.chipStyle, com.tools.arruler.photomeasure.camera.ruler.R.style.Widget_MaterialComponents_Chip_Action);
        this.f14000p = obtainStyledAttributes.getBoolean(32, false);
        this.f14002r = (int) Math.ceil(obtainStyledAttributes.getDimension(20, (float) Math.ceil(TypedValue.applyDimension(1, 48, getContext().getResources().getDisplayMetrics()))));
        obtainStyledAttributes.recycle();
        setChipDrawable(eVar);
        eVar.j(ViewCompat.getElevation(this));
        k.a(context2, attributeSet, com.tools.arruler.photomeasure.camera.ruler.R.attr.chipStyle, com.tools.arruler.photomeasure.camera.ruler.R.style.Widget_MaterialComponents_Chip_Action);
        k.b(context2, attributeSet, iArr, com.tools.arruler.photomeasure.camera.ruler.R.attr.chipStyle, com.tools.arruler.photomeasure.camera.ruler.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, com.tools.arruler.photomeasure.camera.ruler.R.attr.chipStyle, com.tools.arruler.photomeasure.camera.ruler.R.style.Widget_MaterialComponents_Chip_Action);
        boolean hasValue = obtainStyledAttributes2.hasValue(37);
        obtainStyledAttributes2.recycle();
        this.f14004t = new c(this, this);
        e();
        if (!hasValue) {
            setOutlineProvider(new b(this));
        }
        setChecked(this.l);
        setText(eVar.f1163G);
        setEllipsize(eVar.f1160E0);
        h();
        if (!this.f13993g.f1162F0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        g();
        if (this.f14000p) {
            setMinHeight(this.f14002r);
        }
        this.f14001q = ViewCompat.getLayoutDirection(this);
        super.setOnCheckedChangeListener(new E6.c(this, 1));
    }

    @NonNull
    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.f14007w;
        rectF.setEmpty();
        if (c() && this.f13996j != null) {
            e eVar = this.f13993g;
            Rect bounds = eVar.getBounds();
            rectF.setEmpty();
            if (eVar.U()) {
                float f9 = eVar.f0 + eVar.f1188e0 + eVar.f1174Q + eVar.f1187d0 + eVar.f1186c0;
                if (M.b.a(eVar) == 0) {
                    float f10 = bounds.right;
                    rectF.right = f10;
                    rectF.left = f10 - f9;
                } else {
                    float f11 = bounds.left;
                    rectF.left = f11;
                    rectF.right = f11 + f9;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i9 = (int) closeIconTouchBounds.left;
        int i10 = (int) closeIconTouchBounds.top;
        int i11 = (int) closeIconTouchBounds.right;
        int i12 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.f14006v;
        rect.set(i9, i10, i11, i12);
        return rect;
    }

    @Nullable
    private O3.d getTextAppearance() {
        e eVar = this.f13993g;
        if (eVar != null) {
            return eVar.f1195m0.f1799f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z8) {
        if (this.f13998n != z8) {
            this.f13998n = z8;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z8) {
        if (this.m != z8) {
            this.m = z8;
            refreshDrawableState();
        }
    }

    public final void b(int i9) {
        int i10;
        this.f14002r = i9;
        int i11 = 0;
        if (!this.f14000p) {
            InsetDrawable insetDrawable = this.f13994h;
            if (insetDrawable != null) {
                if (insetDrawable != null) {
                    this.f13994h = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr = P3.a.f2414a;
                    f();
                    return;
                }
                return;
            }
            int[] iArr2 = P3.a.f2414a;
            f();
            return;
        }
        int max = Math.max(0, i9 - ((int) this.f13993g.f1153B));
        int max2 = Math.max(0, i9 - this.f13993g.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            InsetDrawable insetDrawable2 = this.f13994h;
            if (insetDrawable2 != null) {
                if (insetDrawable2 != null) {
                    this.f13994h = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr3 = P3.a.f2414a;
                    f();
                    return;
                }
                return;
            }
            int[] iArr4 = P3.a.f2414a;
            f();
            return;
        }
        if (max2 > 0) {
            i10 = max2 / 2;
        } else {
            i10 = 0;
        }
        if (max > 0) {
            i11 = max / 2;
        }
        int i12 = i11;
        if (this.f13994h != null) {
            Rect rect = new Rect();
            this.f13994h.getPadding(rect);
            if (rect.top == i12 && rect.bottom == i12 && rect.left == i10 && rect.right == i10) {
                int[] iArr5 = P3.a.f2414a;
                f();
                return;
            }
        }
        if (getMinHeight() != i9) {
            setMinHeight(i9);
        }
        if (getMinWidth() != i9) {
            setMinWidth(i9);
        }
        this.f13994h = new InsetDrawable((Drawable) this.f13993g, i10, i12, i10, i12);
        int[] iArr6 = P3.a.f2414a;
        f();
    }

    public final boolean c() {
        e eVar = this.f13993g;
        if (eVar != null) {
            Object obj = eVar.f1172N;
            if (obj != null) {
                if (obj instanceof g) {
                    ((h) ((g) obj)).getClass();
                    obj = null;
                }
            } else {
                obj = null;
            }
            if (obj != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean d() {
        e eVar = this.f13993g;
        if (eVar != null && eVar.f1176S) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i9;
        int i10;
        if (!this.f14005u) {
            return super.dispatchHoverEvent(motionEvent);
        }
        c cVar = this.f14004t;
        AccessibilityManager accessibilityManager = cVar.f5351h;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action != 7 && action != 9) {
                if (action == 10 && (i10 = cVar.m) != Integer.MIN_VALUE) {
                    if (i10 == Integer.MIN_VALUE) {
                        return true;
                    }
                    cVar.m = Integer.MIN_VALUE;
                    cVar.q(i10, NotificationCompat.FLAG_LOCAL_ONLY);
                    return true;
                }
            } else {
                float x9 = motionEvent.getX();
                float y4 = motionEvent.getY();
                Chip chip = cVar.f1148q;
                if (chip.c() && chip.getCloseIconTouchBounds().contains(x9, y4)) {
                    i9 = 1;
                } else {
                    i9 = 0;
                }
                int i11 = cVar.m;
                if (i11 != i9) {
                    cVar.m = i9;
                    cVar.q(i9, 128);
                    cVar.q(i11, NotificationCompat.FLAG_LOCAL_ONLY);
                }
                if (i9 != Integer.MIN_VALUE) {
                    return true;
                }
            }
        }
        if (super.dispatchHoverEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f14005u) {
            return super.dispatchKeyEvent(keyEvent);
        }
        c cVar = this.f14004t;
        cVar.getClass();
        boolean z8 = false;
        int i9 = 0;
        z8 = false;
        z8 = false;
        z8 = false;
        z8 = false;
        z8 = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i10 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode != 19) {
                                    if (keyCode != 21) {
                                        if (keyCode != 22) {
                                            i10 = 130;
                                        }
                                    } else {
                                        i10 = 17;
                                    }
                                } else {
                                    i10 = 33;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z9 = false;
                                while (i9 < repeatCount && cVar.m(i10, null)) {
                                    i9++;
                                    z9 = true;
                                }
                                z8 = z9;
                                break;
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i11 = cVar.l;
                    if (i11 != Integer.MIN_VALUE) {
                        Chip chip = cVar.f1148q;
                        if (i11 == 0) {
                            chip.performClick();
                        } else if (i11 == 1) {
                            chip.playSoundEffect(0);
                            View.OnClickListener onClickListener = chip.f13996j;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            if (chip.f14005u) {
                                chip.f14004t.q(1, 1);
                            }
                        }
                    }
                    z8 = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                z8 = cVar.m(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                z8 = cVar.m(1, null);
            }
        }
        if (z8 && cVar.l != Integer.MIN_VALUE) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // q.C2619q, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i9;
        super.drawableStateChanged();
        e eVar = this.f13993g;
        boolean z8 = false;
        if (eVar != null && e.u(eVar.f1172N)) {
            e eVar2 = this.f13993g;
            ?? isEnabled = isEnabled();
            int i10 = isEnabled;
            if (this.f13999o) {
                i10 = isEnabled + 1;
            }
            int i11 = i10;
            if (this.f13998n) {
                i11 = i10 + 1;
            }
            int i12 = i11;
            if (this.m) {
                i12 = i11 + 1;
            }
            int i13 = i12;
            if (isChecked()) {
                i13 = i12 + 1;
            }
            int[] iArr = new int[i13];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i9 = 1;
            } else {
                i9 = 0;
            }
            if (this.f13999o) {
                iArr[i9] = 16842908;
                i9++;
            }
            if (this.f13998n) {
                iArr[i9] = 16843623;
                i9++;
            }
            if (this.m) {
                iArr[i9] = 16842919;
                i9++;
            }
            if (isChecked()) {
                iArr[i9] = 16842913;
            }
            if (!Arrays.equals(eVar2.f1152A0, iArr)) {
                eVar2.f1152A0 = iArr;
                if (eVar2.U()) {
                    z8 = eVar2.w(eVar2.getState(), iArr);
                }
            }
        }
        if (z8) {
            invalidate();
        }
    }

    public final void e() {
        e eVar;
        if (c() && (eVar = this.f13993g) != null && eVar.f1171M && this.f13996j != null) {
            ViewCompat.setAccessibilityDelegate(this, this.f14004t);
            this.f14005u = true;
        } else {
            ViewCompat.setAccessibilityDelegate(this, null);
            this.f14005u = false;
        }
    }

    public final void f() {
        this.f13995i = new RippleDrawable(P3.a.a(this.f13993g.f1161F), getBackgroundDrawable(), null);
        e eVar = this.f13993g;
        if (eVar.f1154B0) {
            eVar.f1154B0 = false;
            eVar.f1156C0 = null;
            eVar.onStateChange(eVar.getState());
        }
        ViewCompat.setBackground(this, this.f13995i);
        g();
    }

    public final void g() {
        e eVar;
        if (!TextUtils.isEmpty(getText()) && (eVar = this.f13993g) != null) {
            int r9 = (int) (eVar.r() + eVar.f0 + eVar.f1186c0);
            e eVar2 = this.f13993g;
            int q9 = (int) (eVar2.q() + eVar2.f1182Y + eVar2.f1185b0);
            if (this.f13994h != null) {
                Rect rect = new Rect();
                this.f13994h.getPadding(rect);
                q9 += rect.left;
                r9 += rect.right;
            }
            ViewCompat.setPaddingRelative(this, q9, getPaddingTop(), r9, getPaddingBottom());
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    @NonNull
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f14003s)) {
            return this.f14003s;
        }
        if (d()) {
            getParent();
            return "android.widget.Button";
        }
        if (isClickable()) {
            return "android.widget.Button";
        }
        return "android.view.View";
    }

    @Nullable
    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f13994h;
        if (insetDrawable == null) {
            return this.f13993g;
        }
        return insetDrawable;
    }

    @Nullable
    public Drawable getCheckedIcon() {
        e eVar = this.f13993g;
        if (eVar != null) {
            return eVar.f1178U;
        }
        return null;
    }

    @Nullable
    public ColorStateList getCheckedIconTint() {
        e eVar = this.f13993g;
        if (eVar != null) {
            return eVar.f1179V;
        }
        return null;
    }

    @Nullable
    public ColorStateList getChipBackgroundColor() {
        e eVar = this.f13993g;
        if (eVar != null) {
            return eVar.f1151A;
        }
        return null;
    }

    public float getChipCornerRadius() {
        e eVar = this.f13993g;
        if (eVar == null) {
            return 0.0f;
        }
        return Math.max(0.0f, eVar.s());
    }

    public Drawable getChipDrawable() {
        return this.f13993g;
    }

    public float getChipEndPadding() {
        e eVar = this.f13993g;
        if (eVar != null) {
            return eVar.f0;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public Drawable getChipIcon() {
        Drawable drawable;
        e eVar = this.f13993g;
        if (eVar == null || (drawable = eVar.f1167I) == 0) {
            return null;
        }
        if (drawable instanceof g) {
            ((h) ((g) drawable)).getClass();
            return null;
        }
        return drawable;
    }

    public float getChipIconSize() {
        e eVar = this.f13993g;
        if (eVar != null) {
            return eVar.f1169K;
        }
        return 0.0f;
    }

    @Nullable
    public ColorStateList getChipIconTint() {
        e eVar = this.f13993g;
        if (eVar != null) {
            return eVar.f1168J;
        }
        return null;
    }

    public float getChipMinHeight() {
        e eVar = this.f13993g;
        if (eVar != null) {
            return eVar.f1153B;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        e eVar = this.f13993g;
        if (eVar != null) {
            return eVar.f1182Y;
        }
        return 0.0f;
    }

    @Nullable
    public ColorStateList getChipStrokeColor() {
        e eVar = this.f13993g;
        if (eVar != null) {
            return eVar.f1157D;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        e eVar = this.f13993g;
        if (eVar != null) {
            return eVar.f1159E;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public Drawable getCloseIcon() {
        Drawable drawable;
        e eVar = this.f13993g;
        if (eVar == null || (drawable = eVar.f1172N) == 0) {
            return null;
        }
        if (drawable instanceof g) {
            ((h) ((g) drawable)).getClass();
            return null;
        }
        return drawable;
    }

    @Nullable
    public CharSequence getCloseIconContentDescription() {
        e eVar = this.f13993g;
        if (eVar != null) {
            return eVar.f1175R;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        e eVar = this.f13993g;
        if (eVar != null) {
            return eVar.f1188e0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        e eVar = this.f13993g;
        if (eVar != null) {
            return eVar.f1174Q;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        e eVar = this.f13993g;
        if (eVar != null) {
            return eVar.f1187d0;
        }
        return 0.0f;
    }

    @Nullable
    public ColorStateList getCloseIconTint() {
        e eVar = this.f13993g;
        if (eVar != null) {
            return eVar.f1173P;
        }
        return null;
    }

    @Override // android.widget.TextView
    @Nullable
    public TextUtils.TruncateAt getEllipsize() {
        e eVar = this.f13993g;
        if (eVar != null) {
            return eVar.f1160E0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f14005u) {
            c cVar = this.f14004t;
            if (cVar.l == 1 || cVar.f5354k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    @Nullable
    public C2921b getHideMotionSpec() {
        e eVar = this.f13993g;
        if (eVar != null) {
            return eVar.f1181X;
        }
        return null;
    }

    public float getIconEndPadding() {
        e eVar = this.f13993g;
        if (eVar != null) {
            return eVar.f1184a0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        e eVar = this.f13993g;
        if (eVar != null) {
            return eVar.f1183Z;
        }
        return 0.0f;
    }

    @Nullable
    public ColorStateList getRippleColor() {
        e eVar = this.f13993g;
        if (eVar != null) {
            return eVar.f1161F;
        }
        return null;
    }

    @NonNull
    public R3.k getShapeAppearanceModel() {
        return this.f13993g.b.f2643a;
    }

    @Nullable
    public C2921b getShowMotionSpec() {
        e eVar = this.f13993g;
        if (eVar != null) {
            return eVar.f1180W;
        }
        return null;
    }

    public float getTextEndPadding() {
        e eVar = this.f13993g;
        if (eVar != null) {
            return eVar.f1186c0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        e eVar = this.f13993g;
        if (eVar != null) {
            return eVar.f1185b0;
        }
        return 0.0f;
    }

    public final void h() {
        TextPaint paint = getPaint();
        e eVar = this.f13993g;
        if (eVar != null) {
            paint.drawableState = eVar.getState();
        }
        O3.d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.f14008x);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        i.q(this, this.f13993g);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i9) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i9 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f13992z);
        }
        if (d()) {
            View.mergeDrawableStates(onCreateDrawableState, f13990A);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z8, int i9, Rect rect) {
        super.onFocusChanged(z8, i9, rect);
        if (this.f14005u) {
            c cVar = this.f14004t;
            int i10 = cVar.l;
            if (i10 != Integer.MIN_VALUE) {
                cVar.j(i10);
            }
            if (z8) {
                cVar.m(i9, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                setCloseIconHovered(false);
            }
        } else {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(d());
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i9) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return super.onResolvePointerIcon(motionEvent, i9);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i9) {
        super.onRtlPropertiesChanged(i9);
        if (this.f14001q != i9) {
            this.f14001q = i9;
            g();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r0 != 3) goto L28;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L4a
            if (r0 == r3) goto L2c
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L45
            goto L50
        L21:
            boolean r0 = r5.m
            if (r0 == 0) goto L50
            if (r1 != 0) goto L2a
            r5.setCloseIconPressed(r2)
        L2a:
            r0 = r3
            goto L51
        L2c:
            boolean r0 = r5.m
            if (r0 == 0) goto L45
            r5.playSoundEffect(r2)
            android.view.View$OnClickListener r0 = r5.f13996j
            if (r0 == 0) goto L3a
            r0.onClick(r5)
        L3a:
            boolean r0 = r5.f14005u
            if (r0 == 0) goto L43
            F3.c r0 = r5.f14004t
            r0.q(r3, r3)
        L43:
            r0 = r3
            goto L46
        L45:
            r0 = r2
        L46:
            r5.setCloseIconPressed(r2)
            goto L51
        L4a:
            if (r1 == 0) goto L50
            r5.setCloseIconPressed(r3)
            goto L2a
        L50:
            r0 = r2
        L51:
            if (r0 != 0) goto L59
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L5a
        L59:
            r2 = r3
        L5a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(@Nullable CharSequence charSequence) {
        this.f14003s = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.f13995i) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        } else {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i9) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // q.C2619q, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.f13995i) {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        } else {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // q.C2619q, android.view.View
    public void setBackgroundResource(int i9) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z8) {
        e eVar = this.f13993g;
        if (eVar != null) {
            eVar.x(z8);
        }
    }

    public void setCheckableResource(int i9) {
        e eVar = this.f13993g;
        if (eVar != null) {
            eVar.x(eVar.f1189g0.getResources().getBoolean(i9));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z8) {
        e eVar = this.f13993g;
        if (eVar == null) {
            this.l = z8;
        } else if (eVar.f1176S) {
            super.setChecked(z8);
        }
    }

    public void setCheckedIcon(@Nullable Drawable drawable) {
        e eVar = this.f13993g;
        if (eVar != null) {
            eVar.y(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z8) {
        setCheckedIconVisible(z8);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i9) {
        setCheckedIconVisible(i9);
    }

    public void setCheckedIconResource(int i9) {
        e eVar = this.f13993g;
        if (eVar != null) {
            eVar.y(n.g(eVar.f1189g0, i9));
        }
    }

    public void setCheckedIconTint(@Nullable ColorStateList colorStateList) {
        e eVar = this.f13993g;
        if (eVar != null) {
            eVar.z(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i9) {
        e eVar = this.f13993g;
        if (eVar != null) {
            eVar.z(I.h.getColorStateList(eVar.f1189g0, i9));
        }
    }

    public void setCheckedIconVisible(int i9) {
        e eVar = this.f13993g;
        if (eVar != null) {
            eVar.A(eVar.f1189g0.getResources().getBoolean(i9));
        }
    }

    public void setChipBackgroundColor(@Nullable ColorStateList colorStateList) {
        e eVar = this.f13993g;
        if (eVar != null && eVar.f1151A != colorStateList) {
            eVar.f1151A = colorStateList;
            eVar.onStateChange(eVar.getState());
        }
    }

    public void setChipBackgroundColorResource(int i9) {
        ColorStateList colorStateList;
        e eVar = this.f13993g;
        if (eVar != null && eVar.f1151A != (colorStateList = I.h.getColorStateList(eVar.f1189g0, i9))) {
            eVar.f1151A = colorStateList;
            eVar.onStateChange(eVar.getState());
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f9) {
        e eVar = this.f13993g;
        if (eVar != null) {
            eVar.B(f9);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i9) {
        e eVar = this.f13993g;
        if (eVar != null) {
            eVar.B(eVar.f1189g0.getResources().getDimension(i9));
        }
    }

    public void setChipDrawable(@NonNull e eVar) {
        e eVar2 = this.f13993g;
        if (eVar2 != eVar) {
            if (eVar2 != null) {
                eVar2.f1158D0 = new WeakReference(null);
            }
            this.f13993g = eVar;
            eVar.f1162F0 = false;
            eVar.f1158D0 = new WeakReference(this);
            b(this.f14002r);
        }
    }

    public void setChipEndPadding(float f9) {
        e eVar = this.f13993g;
        if (eVar != null && eVar.f0 != f9) {
            eVar.f0 = f9;
            eVar.invalidateSelf();
            eVar.v();
        }
    }

    public void setChipEndPaddingResource(int i9) {
        e eVar = this.f13993g;
        if (eVar != null) {
            float dimension = eVar.f1189g0.getResources().getDimension(i9);
            if (eVar.f0 != dimension) {
                eVar.f0 = dimension;
                eVar.invalidateSelf();
                eVar.v();
            }
        }
    }

    public void setChipIcon(@Nullable Drawable drawable) {
        e eVar = this.f13993g;
        if (eVar != null) {
            eVar.C(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z8) {
        setChipIconVisible(z8);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i9) {
        setChipIconVisible(i9);
    }

    public void setChipIconResource(int i9) {
        e eVar = this.f13993g;
        if (eVar != null) {
            eVar.C(n.g(eVar.f1189g0, i9));
        }
    }

    public void setChipIconSize(float f9) {
        e eVar = this.f13993g;
        if (eVar != null) {
            eVar.D(f9);
        }
    }

    public void setChipIconSizeResource(int i9) {
        e eVar = this.f13993g;
        if (eVar != null) {
            eVar.D(eVar.f1189g0.getResources().getDimension(i9));
        }
    }

    public void setChipIconTint(@Nullable ColorStateList colorStateList) {
        e eVar = this.f13993g;
        if (eVar != null) {
            eVar.E(colorStateList);
        }
    }

    public void setChipIconTintResource(int i9) {
        e eVar = this.f13993g;
        if (eVar != null) {
            eVar.E(I.h.getColorStateList(eVar.f1189g0, i9));
        }
    }

    public void setChipIconVisible(int i9) {
        e eVar = this.f13993g;
        if (eVar != null) {
            eVar.F(eVar.f1189g0.getResources().getBoolean(i9));
        }
    }

    public void setChipMinHeight(float f9) {
        e eVar = this.f13993g;
        if (eVar != null && eVar.f1153B != f9) {
            eVar.f1153B = f9;
            eVar.invalidateSelf();
            eVar.v();
        }
    }

    public void setChipMinHeightResource(int i9) {
        e eVar = this.f13993g;
        if (eVar != null) {
            float dimension = eVar.f1189g0.getResources().getDimension(i9);
            if (eVar.f1153B != dimension) {
                eVar.f1153B = dimension;
                eVar.invalidateSelf();
                eVar.v();
            }
        }
    }

    public void setChipStartPadding(float f9) {
        e eVar = this.f13993g;
        if (eVar != null && eVar.f1182Y != f9) {
            eVar.f1182Y = f9;
            eVar.invalidateSelf();
            eVar.v();
        }
    }

    public void setChipStartPaddingResource(int i9) {
        e eVar = this.f13993g;
        if (eVar != null) {
            float dimension = eVar.f1189g0.getResources().getDimension(i9);
            if (eVar.f1182Y != dimension) {
                eVar.f1182Y = dimension;
                eVar.invalidateSelf();
                eVar.v();
            }
        }
    }

    public void setChipStrokeColor(@Nullable ColorStateList colorStateList) {
        e eVar = this.f13993g;
        if (eVar != null) {
            eVar.G(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i9) {
        e eVar = this.f13993g;
        if (eVar != null) {
            eVar.G(I.h.getColorStateList(eVar.f1189g0, i9));
        }
    }

    public void setChipStrokeWidth(float f9) {
        e eVar = this.f13993g;
        if (eVar != null) {
            eVar.H(f9);
        }
    }

    public void setChipStrokeWidthResource(int i9) {
        e eVar = this.f13993g;
        if (eVar != null) {
            eVar.H(eVar.f1189g0.getResources().getDimension(i9));
        }
    }

    @Deprecated
    public void setChipText(@Nullable CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(@StringRes int i9) {
        setText(getResources().getString(i9));
    }

    public void setCloseIcon(@Nullable Drawable drawable) {
        e eVar = this.f13993g;
        if (eVar != null) {
            eVar.I(drawable);
        }
        e();
    }

    public void setCloseIconContentDescription(@Nullable CharSequence charSequence) {
        R.b bVar;
        e eVar = this.f13993g;
        if (eVar != null && eVar.f1175R != charSequence) {
            String str = R.b.f2602d;
            if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
                bVar = R.b.f2605g;
            } else {
                bVar = R.b.f2604f;
            }
            B3.e eVar2 = bVar.f2607c;
            eVar.f1175R = bVar.c(charSequence);
            eVar.invalidateSelf();
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z8) {
        setCloseIconVisible(z8);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i9) {
        setCloseIconVisible(i9);
    }

    public void setCloseIconEndPadding(float f9) {
        e eVar = this.f13993g;
        if (eVar != null) {
            eVar.J(f9);
        }
    }

    public void setCloseIconEndPaddingResource(int i9) {
        e eVar = this.f13993g;
        if (eVar != null) {
            eVar.J(eVar.f1189g0.getResources().getDimension(i9));
        }
    }

    public void setCloseIconResource(int i9) {
        e eVar = this.f13993g;
        if (eVar != null) {
            eVar.I(n.g(eVar.f1189g0, i9));
        }
        e();
    }

    public void setCloseIconSize(float f9) {
        e eVar = this.f13993g;
        if (eVar != null) {
            eVar.K(f9);
        }
    }

    public void setCloseIconSizeResource(int i9) {
        e eVar = this.f13993g;
        if (eVar != null) {
            eVar.K(eVar.f1189g0.getResources().getDimension(i9));
        }
    }

    public void setCloseIconStartPadding(float f9) {
        e eVar = this.f13993g;
        if (eVar != null) {
            eVar.L(f9);
        }
    }

    public void setCloseIconStartPaddingResource(int i9) {
        e eVar = this.f13993g;
        if (eVar != null) {
            eVar.L(eVar.f1189g0.getResources().getDimension(i9));
        }
    }

    public void setCloseIconTint(@Nullable ColorStateList colorStateList) {
        e eVar = this.f13993g;
        if (eVar != null) {
            eVar.M(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i9) {
        e eVar = this.f13993g;
        if (eVar != null) {
            eVar.M(I.h.getColorStateList(eVar.f1189g0, i9));
        }
    }

    public void setCloseIconVisible(int i9) {
        setCloseIconVisible(getResources().getBoolean(i9));
    }

    @Override // q.C2619q, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
                return;
            }
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // q.C2619q, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
                return;
            }
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i9, int i10, int i11, int i12) {
        if (i9 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i11 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i9, i10, i11, i12);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i9, int i10, int i11, int i12) {
        if (i9 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i11 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i9, i10, i11, i12);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f9) {
        super.setElevation(f9);
        e eVar = this.f13993g;
        if (eVar != null) {
            eVar.j(f9);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f13993g == null) {
            return;
        }
        if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
            super.setEllipsize(truncateAt);
            e eVar = this.f13993g;
            if (eVar != null) {
                eVar.f1160E0 = truncateAt;
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
    }

    public void setEnsureMinTouchTargetSize(boolean z8) {
        this.f14000p = z8;
        b(this.f14002r);
    }

    @Override // android.widget.TextView
    public void setGravity(int i9) {
        if (i9 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i9);
        }
    }

    public void setHideMotionSpec(@Nullable C2921b c2921b) {
        e eVar = this.f13993g;
        if (eVar != null) {
            eVar.f1181X = c2921b;
        }
    }

    public void setHideMotionSpecResource(int i9) {
        e eVar = this.f13993g;
        if (eVar != null) {
            eVar.f1181X = C2921b.a(eVar.f1189g0, i9);
        }
    }

    public void setIconEndPadding(float f9) {
        e eVar = this.f13993g;
        if (eVar != null) {
            eVar.O(f9);
        }
    }

    public void setIconEndPaddingResource(int i9) {
        e eVar = this.f13993g;
        if (eVar != null) {
            eVar.O(eVar.f1189g0.getResources().getDimension(i9));
        }
    }

    public void setIconStartPadding(float f9) {
        e eVar = this.f13993g;
        if (eVar != null) {
            eVar.P(f9);
        }
    }

    public void setIconStartPaddingResource(int i9) {
        e eVar = this.f13993g;
        if (eVar != null) {
            eVar.P(eVar.f1189g0.getResources().getDimension(i9));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i9) {
        if (this.f13993g == null) {
            return;
        }
        super.setLayoutDirection(i9);
    }

    @Override // android.widget.TextView
    public void setLines(int i9) {
        if (i9 <= 1) {
            super.setLines(i9);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i9) {
        if (i9 <= 1) {
            super.setMaxLines(i9);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i9) {
        super.setMaxWidth(i9);
        e eVar = this.f13993g;
        if (eVar != null) {
            eVar.f1164G0 = i9;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i9) {
        if (i9 <= 1) {
            super.setMinLines(i9);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(@Nullable CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f13997k = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f13996j = onClickListener;
        e();
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        e eVar = this.f13993g;
        if (eVar != null) {
            eVar.Q(colorStateList);
        }
        if (!this.f13993g.f1154B0) {
            f();
        }
    }

    public void setRippleColorResource(int i9) {
        e eVar = this.f13993g;
        if (eVar != null) {
            eVar.Q(I.h.getColorStateList(eVar.f1189g0, i9));
            if (!this.f13993g.f1154B0) {
                f();
            }
        }
    }

    @Override // R3.v
    public void setShapeAppearanceModel(@NonNull R3.k kVar) {
        this.f13993g.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(@Nullable C2921b c2921b) {
        e eVar = this.f13993g;
        if (eVar != null) {
            eVar.f1180W = c2921b;
        }
    }

    public void setShowMotionSpecResource(int i9) {
        e eVar = this.f13993g;
        if (eVar != null) {
            eVar.f1180W = C2921b.a(eVar.f1189g0, i9);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z8) {
        if (z8) {
            super.setSingleLine(z8);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        CharSequence charSequence2;
        e eVar = this.f13993g;
        if (eVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        if (eVar.f1162F0) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        super.setText(charSequence2, bufferType);
        e eVar2 = this.f13993g;
        if (eVar2 != null && !TextUtils.equals(eVar2.f1163G, charSequence)) {
            eVar2.f1163G = charSequence;
            eVar2.f1195m0.f1797d = true;
            eVar2.invalidateSelf();
            eVar2.v();
        }
    }

    public void setTextAppearance(@Nullable O3.d dVar) {
        e eVar = this.f13993g;
        if (eVar != null) {
            eVar.R(dVar);
        }
        h();
    }

    public void setTextAppearanceResource(int i9) {
        setTextAppearance(getContext(), i9);
    }

    public void setTextEndPadding(float f9) {
        e eVar = this.f13993g;
        if (eVar != null && eVar.f1186c0 != f9) {
            eVar.f1186c0 = f9;
            eVar.invalidateSelf();
            eVar.v();
        }
    }

    public void setTextEndPaddingResource(int i9) {
        e eVar = this.f13993g;
        if (eVar != null) {
            float dimension = eVar.f1189g0.getResources().getDimension(i9);
            if (eVar.f1186c0 != dimension) {
                eVar.f1186c0 = dimension;
                eVar.invalidateSelf();
                eVar.v();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i9, float f9) {
        super.setTextSize(i9, f9);
        e eVar = this.f13993g;
        if (eVar != null) {
            float applyDimension = TypedValue.applyDimension(i9, f9, getResources().getDisplayMetrics());
            L3.i iVar = eVar.f1195m0;
            O3.d dVar = iVar.f1799f;
            if (dVar != null) {
                dVar.f2175k = applyDimension;
                iVar.f1795a.setTextSize(applyDimension);
                eVar.v();
                eVar.invalidateSelf();
            }
        }
        h();
    }

    public void setTextStartPadding(float f9) {
        e eVar = this.f13993g;
        if (eVar != null && eVar.f1185b0 != f9) {
            eVar.f1185b0 = f9;
            eVar.invalidateSelf();
            eVar.v();
        }
    }

    public void setTextStartPaddingResource(int i9) {
        e eVar = this.f13993g;
        if (eVar != null) {
            float dimension = eVar.f1189g0.getResources().getDimension(i9);
            if (eVar.f1185b0 != dimension) {
                eVar.f1185b0 = dimension;
                eVar.invalidateSelf();
                eVar.v();
            }
        }
    }

    public void setCloseIconVisible(boolean z8) {
        e eVar = this.f13993g;
        if (eVar != null) {
            eVar.N(z8);
        }
        e();
    }

    public void setCheckedIconVisible(boolean z8) {
        e eVar = this.f13993g;
        if (eVar != null) {
            eVar.A(z8);
        }
    }

    public void setChipIconVisible(boolean z8) {
        e eVar = this.f13993g;
        if (eVar != null) {
            eVar.F(z8);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i9) {
        super.setTextAppearance(context, i9);
        e eVar = this.f13993g;
        if (eVar != null) {
            eVar.R(new O3.d(eVar.f1189g0, i9));
        }
        h();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i9) {
        super.setTextAppearance(i9);
        e eVar = this.f13993g;
        if (eVar != null) {
            eVar.R(new O3.d(eVar.f1189g0, i9));
        }
        h();
    }

    public void setInternalOnCheckedChangeListener(@Nullable L3.e eVar) {
    }
}
