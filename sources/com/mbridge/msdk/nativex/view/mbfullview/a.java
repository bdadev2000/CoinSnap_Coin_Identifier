package com.mbridge.msdk.nativex.view.mbfullview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.LinearInterpolator;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.c.b;
import com.mbridge.msdk.foundation.same.c.c;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.d;
import com.mbridge.msdk.foundation.tools.v;
import com.mbridge.msdk.nativex.view.mbfullview.BaseView;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    private static volatile a f14264b;
    private WeakReference<Context> a;

    /* renamed from: com.mbridge.msdk.nativex.view.mbfullview.a$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[BaseView.a.values().length];
            a = iArr;
            try {
                iArr[BaseView.a.FULL_TOP_VIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[BaseView.a.FULL_MIDDLE_VIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: com.mbridge.msdk.nativex.view.mbfullview.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class C0183a implements c {

        /* renamed from: b, reason: collision with root package name */
        private WeakReference<MBridgeTopFullView> f14267b;

        public C0183a(MBridgeTopFullView mBridgeTopFullView) {
            this.f14267b = new WeakReference<>(mBridgeTopFullView);
        }

        @Override // com.mbridge.msdk.foundation.same.c.c
        public final void onFailedLoad(String str, String str2) {
        }

        @Override // com.mbridge.msdk.foundation.same.c.c
        public final void onSuccessLoad(Bitmap bitmap, String str) {
            WeakReference<MBridgeTopFullView> weakReference = this.f14267b;
            if (weakReference != null && weakReference.get() != null) {
                this.f14267b.get().getMBridgeFullViewDisplayIcon().setImageBitmap(a.a(a.this, bitmap, 25));
            }
        }
    }

    private a(Context context) {
        this.a = new WeakReference<>(context);
    }

    public static a a(Context context) {
        if (f14264b == null) {
            synchronized (a.class) {
                if (f14264b == null) {
                    f14264b = new a(context);
                }
            }
        }
        return f14264b;
    }

    public final void a(BaseView.a aVar, CampaignEx campaignEx, BaseView baseView) {
        int i10 = AnonymousClass2.a[aVar.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                return;
            }
            baseView.getMBridgeFullTvInstall().setText(campaignEx.getAdCall());
            return;
        }
        MBridgeTopFullView mBridgeTopFullView = (MBridgeTopFullView) baseView;
        if (mBridgeTopFullView != null) {
            Context context = this.a.get();
            if (context != null) {
                b.a(context).a(campaignEx.getIconUrl(), new C0183a(mBridgeTopFullView));
            }
            mBridgeTopFullView.getMBridgeFullViewDisplayTitle().setText(campaignEx.getAppName());
            mBridgeTopFullView.getMBridgeFullViewDisplayDscription().setText(campaignEx.getAppDesc());
            mBridgeTopFullView.getMBridgeFullTvInstall().setText(campaignEx.getAdCall());
            mBridgeTopFullView.getStarLevelLayoutView().setRating((int) campaignEx.getRating());
        }
    }

    public final void a(boolean z10, BaseView baseView, int i10) {
        RelativeLayout.LayoutParams layoutParams;
        Context context = this.a.get();
        if (context != null) {
            if (z10) {
                layoutParams = new RelativeLayout.LayoutParams((int) (a(z10) / 3.0f), ai.a(context, 45.0f));
                layoutParams.addRule(11);
                layoutParams.addRule(12);
                layoutParams.bottomMargin = ai.a(context, 10.0f);
                layoutParams.rightMargin = d.a(context) && i10 == 0 ? ai.a(context, 8.0f) + ai.c(context) : ai.a(context, 8.0f);
            } else {
                layoutParams = new RelativeLayout.LayoutParams(-1, ai.a(context, 45.0f));
                layoutParams.addRule(12);
            }
            baseView.getmAnimationContent().setLayoutParams(layoutParams);
        }
    }

    private float a(boolean z10) {
        try {
            Context context = this.a.get();
            if (context == null) {
                return 0.0f;
            }
            float h10 = ai.h(context);
            return z10 ? h10 + ai.c(context) : h10;
        } catch (Throwable th2) {
            th2.printStackTrace();
            return 0.0f;
        }
    }

    public final void a(final boolean z10, boolean z11, final BaseView baseView) {
        int parseColor = Color.parseColor("#ff264870");
        baseView.getmAnimationPlayer().setBackgroundColor(parseColor);
        Context context = this.a.get();
        if (!z10) {
            if (baseView.style != BaseView.a.FULL_MIDDLE_VIEW) {
                if (context != null) {
                    baseView.getmAnimationContent().setBackgroundResource(v.a(context, "mbridge_nativex_cta_por_pre", "drawable"));
                    baseView.getmAnimationPlayer().setBackgroundResource(v.a(context, "mbridge_nativex_cta_por_pre", "drawable"));
                    return;
                }
                return;
            }
        } else {
            if (baseView.style == BaseView.a.FULL_TOP_VIEW && context != null) {
                baseView.getmAnimationContent().setBackgroundResource(v.a(context, "mbridge_nativex_fullview_background", "drawable"));
                baseView.getmAnimationPlayer().setBackgroundColor(parseColor);
            }
            if (z11) {
                baseView.getmAnimationPlayer().getBackground().setAlpha(80);
            } else {
                baseView.getmAnimationPlayer().setBackgroundColor(Color.parseColor("#ff4c8fdf"));
                baseView.getmAnimationPlayer().getBackground().setAlpha(200);
            }
        }
        if (z11) {
            new Handler().postDelayed(new Runnable() { // from class: com.mbridge.msdk.nativex.view.mbfullview.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    int i10;
                    baseView.getmAnimationPlayer().setBackgroundColor(Color.parseColor("#ff4c8fdf"));
                    Drawable background = baseView.getmAnimationPlayer().getBackground();
                    if (z10) {
                        i10 = 200;
                    } else {
                        i10 = 255;
                    }
                    background.setAlpha(i10);
                    a.a(a.this, baseView.getmAnimationPlayer());
                }
            }, 1000L);
        }
    }

    public final void a(View view, BaseView baseView) {
        if (view == null || baseView == null) {
            return;
        }
        view.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        baseView.f14257i.addView(view);
    }

    public final void a(BaseView baseView, boolean z10) {
        if (baseView != null) {
            baseView.setSystemUiVisibility(z10 ? 0 : 4098);
        }
    }

    public static /* synthetic */ Bitmap a(a aVar, Bitmap bitmap, int i10) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        RectF rectF = new RectF(rect);
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-12434878);
        bitmap.getWidth();
        float f10 = i10;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return createBitmap;
    }

    public static /* synthetic */ void a(a aVar, View view) {
        if (view == null) {
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.2f, 1.0f);
        alphaAnimation.setDuration(800L);
        alphaAnimation.setInterpolator(new LinearInterpolator());
        alphaAnimation.setRepeatCount(2);
        alphaAnimation.setRepeatMode(1);
        view.startAnimation(alphaAnimation);
    }
}
