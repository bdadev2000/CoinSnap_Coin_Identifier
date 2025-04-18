package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.ResourceManagerInternal;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import com.cooldev.gba.emulator.gameboy.R;

@RestrictTo
/* loaded from: classes4.dex */
public final class AppCompatDrawableManager {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f969b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static AppCompatDrawableManager f970c;

    /* renamed from: a, reason: collision with root package name */
    public ResourceManagerInternal f971a;

    public static synchronized AppCompatDrawableManager a() {
        AppCompatDrawableManager appCompatDrawableManager;
        synchronized (AppCompatDrawableManager.class) {
            try {
                if (f970c == null) {
                    d();
                }
                appCompatDrawableManager = f970c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return appCompatDrawableManager;
    }

    public static synchronized PorterDuffColorFilter c(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter f2;
        synchronized (AppCompatDrawableManager.class) {
            f2 = ResourceManagerInternal.f(i2, mode);
        }
        return f2;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.appcompat.widget.AppCompatDrawableManager, java.lang.Object] */
    public static synchronized void d() {
        synchronized (AppCompatDrawableManager.class) {
            if (f970c == null) {
                ?? obj = new Object();
                f970c = obj;
                obj.f971a = ResourceManagerInternal.b();
                ResourceManagerInternal resourceManagerInternal = f970c.f971a;
                ResourceManagerInternal.ResourceManagerHooks resourceManagerHooks = new ResourceManagerInternal.ResourceManagerHooks() { // from class: androidx.appcompat.widget.AppCompatDrawableManager.1

                    /* renamed from: a, reason: collision with root package name */
                    public final int[] f972a = {2131230846, 2131230844, 2131230770};

                    /* renamed from: b, reason: collision with root package name */
                    public final int[] f973b = {2131230794, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};

                    /* renamed from: c, reason: collision with root package name */
                    public final int[] f974c = {2131230843, 2131230845, 2131230787, R.drawable.abc_text_cursor_material, 2131230840, 2131230841, 2131230842};
                    public final int[] d = {2131230819, R.drawable.abc_cab_background_internal_bg, 2131230818};
                    public final int[] e = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};

                    /* renamed from: f, reason: collision with root package name */
                    public final int[] f975f = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

                    public static boolean f(int i2, int[] iArr) {
                        for (int i3 : iArr) {
                            if (i3 == i2) {
                                return true;
                            }
                        }
                        return false;
                    }

                    public static ColorStateList g(int i2, Context context) {
                        int c2 = ThemeUtils.c(R.attr.colorControlHighlight, context);
                        return new ColorStateList(new int[][]{ThemeUtils.f1228b, ThemeUtils.d, ThemeUtils.f1229c, ThemeUtils.f1230f}, new int[]{ThemeUtils.b(R.attr.colorButtonNormal, context), ColorUtils.d(c2, i2), ColorUtils.d(c2, i2), i2});
                    }

                    public static LayerDrawable h(ResourceManagerInternal resourceManagerInternal2, Context context, int i2) {
                        BitmapDrawable bitmapDrawable;
                        BitmapDrawable bitmapDrawable2;
                        BitmapDrawable bitmapDrawable3;
                        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i2);
                        Drawable d = resourceManagerInternal2.d(context, R.drawable.abc_star_black_48dp);
                        Drawable d2 = resourceManagerInternal2.d(context, R.drawable.abc_star_half_black_48dp);
                        if ((d instanceof BitmapDrawable) && d.getIntrinsicWidth() == dimensionPixelSize && d.getIntrinsicHeight() == dimensionPixelSize) {
                            bitmapDrawable = (BitmapDrawable) d;
                            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
                        } else {
                            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(createBitmap);
                            d.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                            d.draw(canvas);
                            bitmapDrawable = new BitmapDrawable(createBitmap);
                            bitmapDrawable2 = new BitmapDrawable(createBitmap);
                        }
                        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
                        if ((d2 instanceof BitmapDrawable) && d2.getIntrinsicWidth() == dimensionPixelSize && d2.getIntrinsicHeight() == dimensionPixelSize) {
                            bitmapDrawable3 = (BitmapDrawable) d2;
                        } else {
                            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                            Canvas canvas2 = new Canvas(createBitmap2);
                            d2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                            d2.draw(canvas2);
                            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
                        }
                        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
                        layerDrawable.setId(0, android.R.id.background);
                        layerDrawable.setId(1, android.R.id.secondaryProgress);
                        layerDrawable.setId(2, android.R.id.progress);
                        return layerDrawable;
                    }

                    public static void i(Drawable drawable, int i2, PorterDuff.Mode mode) {
                        Drawable mutate = drawable.mutate();
                        if (mode == null) {
                            mode = AppCompatDrawableManager.f969b;
                        }
                        mutate.setColorFilter(AppCompatDrawableManager.c(i2, mode));
                    }

                    @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
                    public final ColorStateList a(int i2, Context context) {
                        if (i2 == R.drawable.abc_edit_text_material) {
                            return ContextCompat.getColorStateList(context, R.color.abc_tint_edittext);
                        }
                        if (i2 == 2131230836) {
                            return ContextCompat.getColorStateList(context, R.color.abc_tint_switch_track);
                        }
                        if (i2 != R.drawable.abc_switch_thumb_material) {
                            if (i2 == R.drawable.abc_btn_default_mtrl_shape) {
                                return g(ThemeUtils.c(R.attr.colorButtonNormal, context), context);
                            }
                            if (i2 == R.drawable.abc_btn_borderless_material) {
                                return g(0, context);
                            }
                            if (i2 == R.drawable.abc_btn_colored_material) {
                                return g(ThemeUtils.c(R.attr.colorAccent, context), context);
                            }
                            if (i2 == 2131230831 || i2 == R.drawable.abc_spinner_textfield_background_material) {
                                return ContextCompat.getColorStateList(context, R.color.abc_tint_spinner);
                            }
                            if (f(i2, this.f973b)) {
                                return ThemeUtils.d(R.attr.colorControlNormal, context);
                            }
                            if (f(i2, this.e)) {
                                return ContextCompat.getColorStateList(context, R.color.abc_tint_default);
                            }
                            if (f(i2, this.f975f)) {
                                return ContextCompat.getColorStateList(context, R.color.abc_tint_btn_checkable);
                            }
                            if (i2 == R.drawable.abc_seekbar_thumb_material) {
                                return ContextCompat.getColorStateList(context, R.color.abc_tint_seek_thumb);
                            }
                            return null;
                        }
                        int[][] iArr = new int[3];
                        int[] iArr2 = new int[3];
                        ColorStateList d = ThemeUtils.d(R.attr.colorSwitchThumbNormal, context);
                        if (d == null || !d.isStateful()) {
                            iArr[0] = ThemeUtils.f1228b;
                            iArr2[0] = ThemeUtils.b(R.attr.colorSwitchThumbNormal, context);
                            iArr[1] = ThemeUtils.e;
                            iArr2[1] = ThemeUtils.c(R.attr.colorControlActivated, context);
                            iArr[2] = ThemeUtils.f1230f;
                            iArr2[2] = ThemeUtils.c(R.attr.colorSwitchThumbNormal, context);
                        } else {
                            int[] iArr3 = ThemeUtils.f1228b;
                            iArr[0] = iArr3;
                            iArr2[0] = d.getColorForState(iArr3, 0);
                            iArr[1] = ThemeUtils.e;
                            iArr2[1] = ThemeUtils.c(R.attr.colorControlActivated, context);
                            iArr[2] = ThemeUtils.f1230f;
                            iArr2[2] = d.getDefaultColor();
                        }
                        return new ColorStateList(iArr, iArr2);
                    }

                    @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
                    public final LayerDrawable b(ResourceManagerInternal resourceManagerInternal2, Context context, int i2) {
                        if (i2 == R.drawable.abc_cab_background_top_material) {
                            return new LayerDrawable(new Drawable[]{resourceManagerInternal2.d(context, R.drawable.abc_cab_background_internal_bg), resourceManagerInternal2.d(context, 2131230787)});
                        }
                        if (i2 == R.drawable.abc_ratingbar_material) {
                            return h(resourceManagerInternal2, context, R.dimen.abc_star_big);
                        }
                        if (i2 == R.drawable.abc_ratingbar_indicator_material) {
                            return h(resourceManagerInternal2, context, R.dimen.abc_star_medium);
                        }
                        if (i2 == R.drawable.abc_ratingbar_small_material) {
                            return h(resourceManagerInternal2, context, R.dimen.abc_star_small);
                        }
                        return null;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:12:0x0067 A[RETURN] */
                    /* JADX WARN: Removed duplicated region for block: B:7:0x0052  */
                    @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final boolean c(android.content.Context r8, int r9, android.graphics.drawable.Drawable r10) {
                        /*
                            r7 = this;
                            android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.AppCompatDrawableManager.f969b
                            int[] r1 = r7.f972a
                            boolean r1 = f(r9, r1)
                            r2 = -1
                            r3 = 0
                            r4 = 1
                            if (r1 == 0) goto L14
                            r9 = 2130968848(0x7f040110, float:1.7546361E38)
                        L10:
                            r1 = r0
                            r0 = r2
                        L12:
                            r5 = r4
                            goto L50
                        L14:
                            int[] r1 = r7.f974c
                            boolean r1 = f(r9, r1)
                            if (r1 == 0) goto L20
                            r9 = 2130968846(0x7f04010e, float:1.7546357E38)
                            goto L10
                        L20:
                            int[] r1 = r7.d
                            boolean r1 = f(r9, r1)
                            r5 = 16842801(0x1010031, float:2.3693695E-38)
                            if (r1 == 0) goto L31
                            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
                        L2d:
                            r1 = r0
                            r0 = r2
                            r9 = r5
                            goto L12
                        L31:
                            r1 = 2131230807(0x7f080057, float:1.8077677E38)
                            if (r9 != r1) goto L46
                            r9 = 1109603123(0x42233333, float:40.8)
                            int r9 = java.lang.Math.round(r9)
                            r1 = 16842800(0x1010030, float:2.3693693E-38)
                            r5 = r4
                            r6 = r0
                            r0 = r9
                            r9 = r1
                            r1 = r6
                            goto L50
                        L46:
                            r1 = 2131230789(0x7f080045, float:1.807764E38)
                            if (r9 != r1) goto L4c
                            goto L2d
                        L4c:
                            r1 = r0
                            r0 = r2
                            r9 = r3
                            r5 = r9
                        L50:
                            if (r5 == 0) goto L67
                            android.graphics.drawable.Drawable r10 = r10.mutate()
                            int r8 = androidx.appcompat.widget.ThemeUtils.c(r9, r8)
                            android.graphics.PorterDuffColorFilter r8 = androidx.appcompat.widget.AppCompatDrawableManager.c(r8, r1)
                            r10.setColorFilter(r8)
                            if (r0 == r2) goto L66
                            r10.setAlpha(r0)
                        L66:
                            return r4
                        L67:
                            return r3
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatDrawableManager.AnonymousClass1.c(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
                    }

                    @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
                    public final PorterDuff.Mode d(int i2) {
                        if (i2 == R.drawable.abc_switch_thumb_material) {
                            return PorterDuff.Mode.MULTIPLY;
                        }
                        return null;
                    }

                    @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
                    public final boolean e(Context context, int i2, Drawable drawable) {
                        if (i2 == R.drawable.abc_seekbar_track_material) {
                            LayerDrawable layerDrawable = (LayerDrawable) drawable;
                            Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                            int c2 = ThemeUtils.c(R.attr.colorControlNormal, context);
                            PorterDuff.Mode mode = AppCompatDrawableManager.f969b;
                            i(findDrawableByLayerId, c2, mode);
                            i(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), ThemeUtils.c(R.attr.colorControlNormal, context), mode);
                            i(layerDrawable.findDrawableByLayerId(android.R.id.progress), ThemeUtils.c(R.attr.colorControlActivated, context), mode);
                            return true;
                        }
                        if (i2 != R.drawable.abc_ratingbar_material && i2 != R.drawable.abc_ratingbar_indicator_material && i2 != R.drawable.abc_ratingbar_small_material) {
                            return false;
                        }
                        LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                        Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                        int b2 = ThemeUtils.b(R.attr.colorControlNormal, context);
                        PorterDuff.Mode mode2 = AppCompatDrawableManager.f969b;
                        i(findDrawableByLayerId2, b2, mode2);
                        i(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), ThemeUtils.c(R.attr.colorControlActivated, context), mode2);
                        i(layerDrawable2.findDrawableByLayerId(android.R.id.progress), ThemeUtils.c(R.attr.colorControlActivated, context), mode2);
                        return true;
                    }
                };
                synchronized (resourceManagerInternal) {
                    resourceManagerInternal.e = resourceManagerHooks;
                }
            }
        }
    }

    public static void e(Drawable drawable, TintInfo tintInfo, int[] iArr) {
        PorterDuff.Mode mode = ResourceManagerInternal.f1169f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z2 = tintInfo.d;
        if (!z2 && !tintInfo.f1235c) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        ColorStateList colorStateList = z2 ? tintInfo.f1233a : null;
        PorterDuff.Mode mode2 = tintInfo.f1235c ? tintInfo.f1234b : ResourceManagerInternal.f1169f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilter = ResourceManagerInternal.f(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public final synchronized Drawable b(Context context, int i2) {
        return this.f971a.d(context, i2);
    }
}
