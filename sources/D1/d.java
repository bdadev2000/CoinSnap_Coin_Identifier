package D1;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import java.io.IOException;
import v1.v;
import v1.w;
import v1.y;
import y1.r;

/* loaded from: classes.dex */
public final class d extends b {

    /* renamed from: C, reason: collision with root package name */
    public final i f671C;

    /* renamed from: D, reason: collision with root package name */
    public final Rect f672D;

    /* renamed from: E, reason: collision with root package name */
    public final Rect f673E;

    /* renamed from: F, reason: collision with root package name */
    public final w f674F;

    /* renamed from: G, reason: collision with root package name */
    public r f675G;

    /* renamed from: H, reason: collision with root package name */
    public r f676H;

    public d(v vVar, e eVar) {
        super(vVar, eVar);
        w wVar;
        this.f671C = new i(3, 2);
        this.f672D = new Rect();
        this.f673E = new Rect();
        v1.i iVar = vVar.b;
        if (iVar == null) {
            wVar = null;
        } else {
            wVar = (w) iVar.c().get(eVar.f682g);
        }
        this.f674F = wVar;
    }

    @Override // D1.b, x1.e
    public final void c(RectF rectF, Matrix matrix, boolean z8) {
        super.c(rectF, matrix, z8);
        if (this.f674F != null) {
            float c9 = H1.i.c();
            rectF.set(0.0f, 0.0f, r3.f23562a * c9, r3.b * c9);
            this.f651n.mapRect(rectF);
        }
    }

    @Override // D1.b, A1.f
    public final void g(E1.d dVar, Object obj) {
        super.g(dVar, obj);
        if (obj == y.f23572F) {
            if (dVar == null) {
                this.f675G = null;
                return;
            } else {
                this.f675G = new r(dVar, null);
                return;
            }
        }
        if (obj == y.f23575I) {
            if (dVar == null) {
                this.f676H = null;
            } else {
                this.f676H = new r(dVar, null);
            }
        }
    }

    @Override // D1.b
    public final void k(Canvas canvas, Matrix matrix, int i9) {
        Bitmap bitmap;
        Bitmap bitmap2;
        Context context;
        r rVar = this.f676H;
        v vVar = this.f652o;
        w wVar = this.f674F;
        if (rVar == null || (bitmap = (Bitmap) rVar.e()) == null) {
            String str = this.f653p.f682g;
            z1.a aVar = vVar.f23546i;
            if (aVar != null) {
                Drawable.Callback callback = vVar.getCallback();
                if (callback == null || !(callback instanceof View)) {
                    context = null;
                } else {
                    context = ((View) callback).getContext();
                }
                Context context2 = aVar.f24497a;
                if (context2 instanceof Application) {
                    context = context.getApplicationContext();
                }
                if (context != context2) {
                    vVar.f23546i = null;
                }
            }
            if (vVar.f23546i == null) {
                vVar.f23546i = new z1.a(vVar.getCallback(), vVar.f23547j, vVar.b.c());
            }
            z1.a aVar2 = vVar.f23546i;
            if (aVar2 != null) {
                String str2 = aVar2.b;
                w wVar2 = (w) aVar2.f24498c.get(str);
                if (wVar2 != null) {
                    bitmap2 = wVar2.f23566f;
                    if (bitmap2 == null) {
                        Context context3 = aVar2.f24497a;
                        if (context3 != null) {
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inScaled = true;
                            options.inDensity = 160;
                            String str3 = wVar2.f23564d;
                            if (str3.startsWith("data:") && str3.indexOf("base64,") > 0) {
                                try {
                                    byte[] decode = Base64.decode(str3.substring(str3.indexOf(44) + 1), 0);
                                    bitmap2 = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                                    synchronized (z1.a.f24496d) {
                                        ((w) aVar2.f24498c.get(str)).f23566f = bitmap2;
                                    }
                                } catch (IllegalArgumentException e4) {
                                    H1.c.c("data URL did not have correct base64 format.", e4);
                                }
                            } else {
                                try {
                                    if (!TextUtils.isEmpty(str2)) {
                                        try {
                                            Bitmap decodeStream = BitmapFactory.decodeStream(context3.getAssets().open(str2 + str3), null, options);
                                            if (decodeStream == null) {
                                                H1.c.b("Decoded image `" + str + "` is null.");
                                            } else {
                                                int i10 = wVar2.f23562a;
                                                int i11 = wVar2.b;
                                                H1.h hVar = H1.i.f1367a;
                                                if (decodeStream.getWidth() == i10 && decodeStream.getHeight() == i11) {
                                                    bitmap2 = decodeStream;
                                                } else {
                                                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeStream, i10, i11, true);
                                                    decodeStream.recycle();
                                                    bitmap2 = createScaledBitmap;
                                                }
                                                synchronized (z1.a.f24496d) {
                                                    ((w) aVar2.f24498c.get(str)).f23566f = bitmap2;
                                                }
                                            }
                                        } catch (IllegalArgumentException e9) {
                                            H1.c.c("Unable to decode image `" + str + "`.", e9);
                                        }
                                    } else {
                                        throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                                    }
                                } catch (IOException e10) {
                                    H1.c.c("Unable to open asset.", e10);
                                }
                            }
                        }
                    }
                    bitmap = bitmap2;
                }
                bitmap2 = null;
                bitmap = bitmap2;
            } else {
                bitmap = null;
            }
            if (bitmap == null) {
                if (wVar != null) {
                    bitmap = wVar.f23566f;
                } else {
                    bitmap = null;
                }
            }
        }
        if (bitmap != null && !bitmap.isRecycled() && wVar != null) {
            float c9 = H1.i.c();
            i iVar = this.f671C;
            iVar.setAlpha(i9);
            r rVar2 = this.f675G;
            if (rVar2 != null) {
                iVar.setColorFilter((ColorFilter) rVar2.e());
            }
            canvas.save();
            canvas.concat(matrix);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            Rect rect = this.f672D;
            rect.set(0, 0, width, height);
            boolean z8 = vVar.f23550o;
            Rect rect2 = this.f673E;
            if (z8) {
                rect2.set(0, 0, (int) (wVar.f23562a * c9), (int) (wVar.b * c9));
            } else {
                rect2.set(0, 0, (int) (bitmap.getWidth() * c9), (int) (bitmap.getHeight() * c9));
            }
            canvas.drawBitmap(bitmap, rect, rect2, iVar);
            canvas.restore();
        }
    }
}
