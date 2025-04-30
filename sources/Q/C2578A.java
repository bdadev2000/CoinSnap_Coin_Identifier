package q;

import android.R;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.ProgressBar;
import j.AbstractC2379a;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: q.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2578A {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f22504d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22505a = 1;
    public final View b;

    /* renamed from: c, reason: collision with root package name */
    public Object f22506c;

    public C2578A(EditText editText) {
        this.b = editText;
        this.f22506c = new com.bumptech.glide.f(editText);
    }

    public KeyListener a(KeyListener keyListener) {
        if (!(keyListener instanceof NumberKeyListener)) {
            ((a7.b) ((com.bumptech.glide.f) this.f22506c).f12819c).getClass();
            if (!(keyListener instanceof l0.e)) {
                if (keyListener == null) {
                    return null;
                }
                if (!(keyListener instanceof NumberKeyListener)) {
                    return new l0.e(keyListener);
                }
                return keyListener;
            }
            return keyListener;
        }
        return keyListener;
    }

    public void b(AttributeSet attributeSet, int i9) {
        switch (this.f22505a) {
            case 0:
                ProgressBar progressBar = (ProgressBar) this.b;
                l5.k i10 = l5.k.i(progressBar.getContext(), attributeSet, f22504d, i9, 0);
                Drawable f9 = i10.f(0);
                if (f9 != null) {
                    if (f9 instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) f9;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i11 = 0; i11 < numberOfFrames; i11++) {
                            Drawable e4 = e(animationDrawable.getFrame(i11), true);
                            e4.setLevel(10000);
                            animationDrawable2.addFrame(e4, animationDrawable.getDuration(i11));
                        }
                        animationDrawable2.setLevel(10000);
                        f9 = animationDrawable2;
                    }
                    progressBar.setIndeterminateDrawable(f9);
                }
                Drawable f10 = i10.f(1);
                if (f10 != null) {
                    progressBar.setProgressDrawable(e(f10, false));
                }
                i10.j();
                return;
            default:
                TypedArray obtainStyledAttributes = ((EditText) this.b).getContext().obtainStyledAttributes(attributeSet, AbstractC2379a.f20949i, i9, 0);
                try {
                    boolean z8 = true;
                    if (obtainStyledAttributes.hasValue(14)) {
                        z8 = obtainStyledAttributes.getBoolean(14, true);
                    }
                    obtainStyledAttributes.recycle();
                    d(z8);
                    return;
                } catch (Throwable th) {
                    obtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    public l0.b c(InputConnection inputConnection, EditorInfo editorInfo) {
        com.bumptech.glide.f fVar = (com.bumptech.glide.f) this.f22506c;
        if (inputConnection == null) {
            fVar.getClass();
            inputConnection = null;
        } else {
            a7.b bVar = (a7.b) fVar.f12819c;
            bVar.getClass();
            if (!(inputConnection instanceof l0.b)) {
                inputConnection = new l0.b((EditText) bVar.f4077c, inputConnection, editorInfo);
            }
        }
        return (l0.b) inputConnection;
    }

    public void d(boolean z8) {
        l0.i iVar = (l0.i) ((a7.b) ((com.bumptech.glide.f) this.f22506c).f12819c).f4078d;
        if (iVar.f21552f != z8) {
            if (iVar.f21551d != null) {
                j0.j a6 = j0.j.a();
                l0.h hVar = iVar.f21551d;
                a6.getClass();
                C2.m.h(hVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a6.f20972a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a6.b.remove(hVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            iVar.f21552f = z8;
            if (z8) {
                l0.i.a(iVar.b, j0.j.a().b());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable e(Drawable drawable, boolean z8) {
        boolean z9;
        if (drawable instanceof M.g) {
            ((M.h) ((M.g) drawable)).getClass();
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i9 = 0; i9 < numberOfLayers; i9++) {
                    int id = layerDrawable.getId(i9);
                    Drawable drawable2 = layerDrawable.getDrawable(i9);
                    if (id != 16908301 && id != 16908303) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    drawableArr[i9] = e(drawable2, z9);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i10 = 0; i10 < numberOfLayers; i10++) {
                    layerDrawable2.setId(i10, layerDrawable.getId(i10));
                    layerDrawable2.setLayerGravity(i10, layerDrawable.getLayerGravity(i10));
                    layerDrawable2.setLayerWidth(i10, layerDrawable.getLayerWidth(i10));
                    layerDrawable2.setLayerHeight(i10, layerDrawable.getLayerHeight(i10));
                    layerDrawable2.setLayerInsetLeft(i10, layerDrawable.getLayerInsetLeft(i10));
                    layerDrawable2.setLayerInsetRight(i10, layerDrawable.getLayerInsetRight(i10));
                    layerDrawable2.setLayerInsetTop(i10, layerDrawable.getLayerInsetTop(i10));
                    layerDrawable2.setLayerInsetBottom(i10, layerDrawable.getLayerInsetBottom(i10));
                    layerDrawable2.setLayerInsetStart(i10, layerDrawable.getLayerInsetStart(i10));
                    layerDrawable2.setLayerInsetEnd(i10, layerDrawable.getLayerInsetEnd(i10));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (((Bitmap) this.f22506c) == null) {
                    this.f22506c = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                if (z8) {
                    return new ClipDrawable(shapeDrawable, 3, 1);
                }
                return shapeDrawable;
            }
        }
        return drawable;
    }

    public C2578A(ProgressBar progressBar) {
        this.b = progressBar;
    }
}
