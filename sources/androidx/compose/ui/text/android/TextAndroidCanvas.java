package androidx.compose.ui.text.android;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.common.api.Api;

@StabilityInferred
/* loaded from: classes.dex */
public final class TextAndroidCanvas extends Canvas {

    /* renamed from: a, reason: collision with root package name */
    public Canvas f17112a;

    @Override // android.graphics.Canvas
    public final boolean clipOutPath(Path path) {
        CanvasCompatO canvasCompatO = CanvasCompatO.f17066a;
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            return canvasCompatO.a(canvas, path);
        }
        p0.a.B0("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(RectF rectF) {
        CanvasCompatO canvasCompatO = CanvasCompatO.f17066a;
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            return canvasCompatO.e(canvas, rectF);
        }
        p0.a.B0("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path, Region.Op op) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            return canvas.clipPath(path, op);
        }
        p0.a.B0("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF, Region.Op op) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            return canvas.clipRect(rectF, op);
        }
        p0.a.B0("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void concat(Matrix matrix) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            canvas.concat(matrix);
        } else {
            p0.a.B0("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void disableZ() {
        CanvasCompatQ canvasCompatQ = CanvasCompatQ.f17067a;
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            canvasCompatQ.a(canvas);
        } else {
            p0.a.B0("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawARGB(int i2, int i3, int i4, int i5) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            canvas.drawARGB(i2, i3, i4, i5);
        } else {
            p0.a.B0("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawArc(RectF rectF, float f2, float f3, boolean z2, Paint paint) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            canvas.drawArc(rectF, f2, f3, z2, paint);
        } else {
            p0.a.B0("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, float f2, float f3, Paint paint) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, f2, f3, paint);
        } else {
            p0.a.B0("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmapMesh(Bitmap bitmap, int i2, int i3, float[] fArr, int i4, int[] iArr, int i5, Paint paint) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            canvas.drawBitmapMesh(bitmap, i2, i3, fArr, i4, iArr, i5, paint);
        } else {
            p0.a.B0("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawCircle(float f2, float f3, float f4, Paint paint) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            canvas.drawCircle(f2, f3, f4, paint);
        } else {
            p0.a.B0("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i2) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            canvas.drawColor(i2);
        } else {
            p0.a.B0("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float f2, float f3, RectF rectF2, float f4, float f5, Paint paint) {
        CanvasCompatQ canvasCompatQ = CanvasCompatQ.f17067a;
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            canvasCompatQ.e(canvas, rectF, f2, f3, rectF2, f4, f5, paint);
        } else {
            p0.a.B0("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawGlyphs(int[] iArr, int i2, float[] fArr, int i3, int i4, Font font, Paint paint) {
        CanvasCompatS canvasCompatS = CanvasCompatS.f17069a;
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            canvasCompatS.a(canvas, iArr, i2, fArr, i3, i4, font, paint);
        } else {
            p0.a.B0("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLine(float f2, float f3, float f4, float f5, Paint paint) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            canvas.drawLine(f2, f3, f4, f5, paint);
        } else {
            p0.a.B0("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, int i2, int i3, Paint paint) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            canvas.drawLines(fArr, i2, i3, paint);
        } else {
            p0.a.B0("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawOval(RectF rectF, Paint paint) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            canvas.drawOval(rectF, paint);
        } else {
            p0.a.B0("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPaint(Paint paint) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            canvas.drawPaint(paint);
        } else {
            p0.a.B0("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
        CanvasCompatS canvasCompatS = CanvasCompatS.f17069a;
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            canvasCompatS.b(canvas, ninePatch, rect, paint);
        } else {
            p0.a.B0("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPath(Path path, Paint paint) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            canvas.drawPath(path, paint);
        } else {
            p0.a.B0("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            canvas.drawPicture(picture);
        } else {
            p0.a.B0("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoint(float f2, float f3, Paint paint) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            canvas.drawPoint(f2, f3, paint);
        } else {
            p0.a.B0("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, int i2, int i3, Paint paint) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            canvas.drawPoints(fArr, i2, i3, paint);
        } else {
            p0.a.B0("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(char[] cArr, int i2, int i3, float[] fArr, Paint paint) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            canvas.drawPosText(cArr, i2, i3, fArr, paint);
        } else {
            p0.a.B0("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRGB(int i2, int i3, int i4) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            canvas.drawRGB(i2, i3, i4);
        } else {
            p0.a.B0("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(RectF rectF, Paint paint) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            canvas.drawRect(rectF, paint);
        } else {
            p0.a.B0("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRenderNode(RenderNode renderNode) {
        CanvasCompatQ canvasCompatQ = CanvasCompatQ.f17067a;
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            canvasCompatQ.g(canvas, renderNode);
        } else {
            p0.a.B0("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(RectF rectF, float f2, float f3, Paint paint) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            canvas.drawRoundRect(rectF, f2, f3, paint);
        } else {
            p0.a.B0("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(char[] cArr, int i2, int i3, float f2, float f3, Paint paint) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            canvas.drawText(cArr, i2, i3, f2, f3, paint);
        } else {
            p0.a.B0("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(char[] cArr, int i2, int i3, Path path, float f2, float f3, Paint paint) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            canvas.drawTextOnPath(cArr, i2, i3, path, f2, f3, paint);
        } else {
            p0.a.B0("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(char[] cArr, int i2, int i3, int i4, int i5, float f2, float f3, boolean z2, Paint paint) {
        CanvasCompatM canvasCompatM = CanvasCompatM.f17065a;
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            canvasCompatM.b(canvas, cArr, i2, i3, i4, i5, f2, f3, z2, paint);
        } else {
            p0.a.B0("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawVertices(Canvas.VertexMode vertexMode, int i2, float[] fArr, int i3, float[] fArr2, int i4, int[] iArr, int i5, short[] sArr, int i6, int i7, Paint paint) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            canvas.drawVertices(vertexMode, i2, fArr, i3, fArr2, i4, iArr, i5, sArr, i6, i7, paint);
        } else {
            p0.a.B0("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void enableZ() {
        CanvasCompatQ canvasCompatQ = CanvasCompatQ.f17067a;
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            canvasCompatQ.i(canvas);
        } else {
            p0.a.B0("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean getClipBounds(Rect rect) {
        Canvas canvas = this.f17112a;
        if (canvas == null) {
            p0.a.B0("nativeCanvas");
            throw null;
        }
        boolean clipBounds = canvas.getClipBounds(rect);
        if (clipBounds) {
            rect.set(0, 0, rect.width(), Api.BaseClientBuilder.API_PRIORITY_OTHER);
        }
        return clipBounds;
    }

    @Override // android.graphics.Canvas
    public final int getDensity() {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            return canvas.getDensity();
        }
        p0.a.B0("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final DrawFilter getDrawFilter() {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            return canvas.getDrawFilter();
        }
        p0.a.B0("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getHeight() {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            return canvas.getHeight();
        }
        p0.a.B0("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void getMatrix(Matrix matrix) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            canvas.getMatrix(matrix);
        } else {
            p0.a.B0("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapHeight() {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            return canvas.getMaximumBitmapHeight();
        }
        p0.a.B0("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapWidth() {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            return canvas.getMaximumBitmapWidth();
        }
        p0.a.B0("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getSaveCount() {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            return canvas.getSaveCount();
        }
        p0.a.B0("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getWidth() {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            return canvas.getWidth();
        }
        p0.a.B0("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean isOpaque() {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            return canvas.isOpaque();
        }
        p0.a.B0("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF, Canvas.EdgeType edgeType) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            return canvas.quickReject(rectF, edgeType);
        }
        p0.a.B0("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void restore() {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            canvas.restore();
        } else {
            p0.a.B0("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void restoreToCount(int i2) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            canvas.restoreToCount(i2);
        } else {
            p0.a.B0("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void rotate(float f2) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            canvas.rotate(f2);
        } else {
            p0.a.B0("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final int save() {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            return canvas.save();
        }
        p0.a.B0("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint, int i2) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            return canvas.saveLayer(rectF, paint, i2);
        }
        p0.a.B0("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i2, int i3) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(rectF, i2, i3);
        }
        p0.a.B0("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void scale(float f2, float f3) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            canvas.scale(f2, f3);
        } else {
            p0.a.B0("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setBitmap(Bitmap bitmap) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            canvas.setBitmap(bitmap);
        } else {
            p0.a.B0("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setDensity(int i2) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            canvas.setDensity(i2);
        } else {
            p0.a.B0("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setDrawFilter(DrawFilter drawFilter) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            canvas.setDrawFilter(drawFilter);
        } else {
            p0.a.B0("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setMatrix(Matrix matrix) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            canvas.setMatrix(matrix);
        } else {
            p0.a.B0("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void skew(float f2, float f3) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            canvas.skew(f2, f3);
        } else {
            p0.a.B0("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void translate(float f2, float f3) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            canvas.translate(f2, f3);
        } else {
            p0.a.B0("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(Rect rect) {
        CanvasCompatO canvasCompatO = CanvasCompatO.f17066a;
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            return canvasCompatO.d(canvas, rect);
        }
        p0.a.B0("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            return canvas.clipPath(path);
        }
        p0.a.B0("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect, Region.Op op) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            return canvas.clipRect(rect, op);
        }
        p0.a.B0("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawArc(float f2, float f3, float f4, float f5, float f6, float f7, boolean z2, Paint paint) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            canvas.drawArc(f2, f3, f4, f5, f6, f7, z2, paint);
        } else {
            p0.a.B0("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, rect, rectF, paint);
        } else {
            p0.a.B0("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j2) {
        CanvasCompatQ canvasCompatQ = CanvasCompatQ.f17067a;
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            canvasCompatQ.c(canvas, j2);
        } else {
            p0.a.B0("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, Paint paint) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            canvas.drawLines(fArr, paint);
        } else {
            p0.a.B0("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawOval(float f2, float f3, float f4, float f5, Paint paint) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            canvas.drawOval(f2, f3, f4, f5, paint);
        } else {
            p0.a.B0("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
        CanvasCompatS canvasCompatS = CanvasCompatS.f17069a;
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            canvasCompatS.c(canvas, ninePatch, rectF, paint);
        } else {
            p0.a.B0("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, RectF rectF) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            canvas.drawPicture(picture, rectF);
        } else {
            p0.a.B0("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, Paint paint) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            canvas.drawPoints(fArr, paint);
        } else {
            p0.a.B0("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(String str, float[] fArr, Paint paint) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            canvas.drawPosText(str, fArr, paint);
        } else {
            p0.a.B0("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(Rect rect, Paint paint) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            canvas.drawRect(rect, paint);
        } else {
            p0.a.B0("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(float f2, float f3, float f4, float f5, float f6, float f7, Paint paint) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            canvas.drawRoundRect(f2, f3, f4, f5, f6, f7, paint);
        } else {
            p0.a.B0("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, float f2, float f3, Paint paint) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            canvas.drawText(str, f2, f3, paint);
        } else {
            p0.a.B0("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(String str, Path path, float f2, float f3, Paint paint) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            canvas.drawTextOnPath(str, path, f2, f3, paint);
        } else {
            p0.a.B0("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF) {
        CanvasCompatR canvasCompatR = CanvasCompatR.f17068a;
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            return canvasCompatR.c(canvas, rectF);
        }
        p0.a.B0("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            return canvas.saveLayer(rectF, paint);
        }
        p0.a.B0("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i2) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(rectF, i2);
        }
        p0.a.B0("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(float f2, float f3, float f4, float f5) {
        CanvasCompatO canvasCompatO = CanvasCompatO.f17066a;
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            return canvasCompatO.b(canvas, f2, f3, f4, f5);
        }
        p0.a.B0("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            return canvas.clipRect(rectF);
        }
        p0.a.B0("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, rect, rect2, paint);
        } else {
            p0.a.B0("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i2, PorterDuff.Mode mode) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            canvas.drawColor(i2, mode);
        } else {
            p0.a.B0("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        CanvasCompatQ canvasCompatQ = CanvasCompatQ.f17067a;
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            canvasCompatQ.f(canvas, rectF, fArr, rectF2, fArr2, paint);
        } else {
            p0.a.B0("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, Rect rect) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            canvas.drawPicture(picture, rect);
        } else {
            p0.a.B0("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(float f2, float f3, float f4, float f5, Paint paint) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            canvas.drawRect(f2, f3, f4, f5, paint);
        } else {
            p0.a.B0("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, int i2, int i3, float f2, float f3, Paint paint) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            canvas.drawText(str, i2, i3, f2, f3, paint);
        } else {
            p0.a.B0("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(CharSequence charSequence, int i2, int i3, int i4, int i5, float f2, float f3, boolean z2, Paint paint) {
        CanvasCompatM canvasCompatM = CanvasCompatM.f17065a;
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            canvasCompatM.a(canvas, charSequence, i2, i3, i4, i5, f2, f3, z2, paint);
        } else {
            p0.a.B0("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path, Canvas.EdgeType edgeType) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            return canvas.quickReject(path, edgeType);
        }
        p0.a.B0("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f2, float f3, float f4, float f5, Paint paint, int i2) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            return canvas.saveLayer(f2, f3, f4, f5, paint, i2);
        }
        p0.a.B0("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f2, float f3, float f4, float f5, int i2, int i3) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(f2, f3, f4, f5, i2, i3);
        }
        p0.a.B0("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(int i2, int i3, int i4, int i5) {
        CanvasCompatO canvasCompatO = CanvasCompatO.f17066a;
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            return canvasCompatO.c(canvas, i2, i3, i4, i5);
        }
        p0.a.B0("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            return canvas.clipRect(rect);
        }
        p0.a.B0("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i2, int i3, float f2, float f3, int i4, int i5, boolean z2, Paint paint) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            canvas.drawBitmap(iArr, i2, i3, f2, f3, i4, i5, z2, paint);
        } else {
            p0.a.B0("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i2, BlendMode blendMode) {
        CanvasCompatQ canvasCompatQ = CanvasCompatQ.f17067a;
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            canvasCompatQ.b(canvas, i2, blendMode);
        } else {
            p0.a.B0("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(CharSequence charSequence, int i2, int i3, float f2, float f3, Paint paint) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            canvas.drawText(charSequence, i2, i3, f2, f3, paint);
        } else {
            p0.a.B0("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path) {
        CanvasCompatR canvasCompatR = CanvasCompatR.f17068a;
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            return canvasCompatR.b(canvas, path);
        }
        p0.a.B0("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f2, float f3, float f4, float f5, Paint paint) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            return canvas.saveLayer(f2, f3, f4, f5, paint);
        }
        p0.a.B0("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f2, float f3, float f4, float f5, int i2) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(f2, f3, f4, f5, i2);
        }
        p0.a.B0("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f2, float f3, float f4, float f5, Region.Op op) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            return canvas.clipRect(f2, f3, f4, f5, op);
        }
        p0.a.B0("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, boolean z2, Paint paint) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            canvas.drawBitmap(iArr, i2, i3, i4, i5, i6, i7, z2, paint);
        } else {
            p0.a.B0("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j2, BlendMode blendMode) {
        CanvasCompatQ canvasCompatQ = CanvasCompatQ.f17067a;
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            canvasCompatQ.d(canvas, j2, blendMode);
        } else {
            p0.a.B0("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(MeasuredText measuredText, int i2, int i3, int i4, int i5, float f2, float f3, boolean z2, Paint paint) {
        CanvasCompatQ canvasCompatQ = CanvasCompatQ.f17067a;
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            canvasCompatQ.h(canvas, measuredText, i2, i3, i4, i5, f2, f3, z2, paint);
        } else {
            p0.a.B0("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f2, float f3, float f4, float f5, Canvas.EdgeType edgeType) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            return canvas.quickReject(f2, f3, f4, f5, edgeType);
        }
        p0.a.B0("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f2, float f3, float f4, float f5) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            return canvas.clipRect(f2, f3, f4, f5);
        }
        p0.a.B0("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, matrix, paint);
        } else {
            p0.a.B0("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f2, float f3, float f4, float f5) {
        CanvasCompatR canvasCompatR = CanvasCompatR.f17068a;
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            return canvasCompatR.a(canvas, f2, f3, f4, f5);
        }
        p0.a.B0("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(int i2, int i3, int i4, int i5) {
        Canvas canvas = this.f17112a;
        if (canvas != null) {
            return canvas.clipRect(i2, i3, i4, i5);
        }
        p0.a.B0("nativeCanvas");
        throw null;
    }
}
