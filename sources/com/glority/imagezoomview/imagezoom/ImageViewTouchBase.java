package com.glority.imagezoomview.imagezoom;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.drawable.DrawableKt;
import com.glority.android.xx.constants.LogEvents;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: ImageViewTouchBase.kt */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b&\u0018\u0000 Ù\u00012\u00020\u00012\u00020\u0002:\bÙ\u0001Ú\u0001Û\u0001Ü\u0001B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u001b\u0010\u0015\u001a\u00030\u0081\u00012\u0007\u0010\u0082\u0001\u001a\u00020\u000b2\u0007\u0010\u0083\u0001\u001a\u00020\u000bH\u0004J\b\u0010\u0084\u0001\u001a\u00030\u0081\u0001J\t\u0010\u0085\u0001\u001a\u00020OH\u0004J\t\u0010\u0086\u0001\u001a\u00020OH\u0004J\n\u0010\u0087\u0001\u001a\u00030\u0081\u0001H\u0016J\u0016\u0010\u0088\u0001\u001a\u00030\u0081\u00012\n\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u008a\u0001H\u0004J.\u0010\u008b\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u008c\u0001\u001a\u00020\b2\u0007\u0010\u008d\u0001\u001a\u00020\b2\u0007\u0010\u008e\u0001\u001a\u00020\b2\u0007\u0010\u008f\u0001\u001a\u00020\bH\u0004J\u0013\u0010\u0013\u001a\u00020\u00122\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u001cH\u0004J#\u0010\u0017\u001a\u00020\u00122\u0007\u0010\u0090\u0001\u001a\u00020\u001c2\u0007\u0010\u0082\u0001\u001a\u00020\u000b2\u0007\u0010\u0083\u0001\u001a\u00020\u000bH\u0004J\u0011\u0010\u0091\u0001\u001a\u00020O2\u0006\u0010\u001f\u001a\u00020 H\u0004J\u0011\u0010'\u001a\u00020\u001c2\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u001cJ\u001c\u0010\u0092\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u0093\u0001\u001a\u00020\u001c2\u0007\u0010\u0094\u0001\u001a\u00020\u0012H\u0004J\t\u0010\u0095\u0001\u001a\u00020OH\u0016J\u000f\u0010\u0096\u0001\u001a\u00020OH\u0007¢\u0006\u0003\b\u0097\u0001J\u0012\u0010\u0096\u0001\u001a\u00020O2\u0007\u0010\u0093\u0001\u001a\u00020\u001cH\u0004J\u001b\u0010\u0098\u0001\u001a\u00020O2\u0007\u0010\u0093\u0001\u001a\u00020\u001c2\u0007\u0010\u0099\u0001\u001a\u00020\bH\u0004J\u0012\u0010\u009a\u0001\u001a\u00020O2\u0007\u0010\u0093\u0001\u001a\u00020\u001cH\u0004J\u0012\u0010\u009b\u0001\u001a\u00020O2\u0007\u0010\u0093\u0001\u001a\u00020\u001cH\u0004J$\u0010\u009c\u0001\u001a\u00030\u0081\u00012\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014J.\u0010\u009d\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u009e\u0001\u001a\u00020\b2\u0007\u0010\u009f\u0001\u001a\u00020\b2\u0007\u0010 \u0001\u001a\u00020\b2\u0007\u0010¡\u0001\u001a\u00020\bH\u0016J\u0014\u0010¢\u0001\u001a\u00030\u0081\u00012\b\u0010£\u0001\u001a\u00030¤\u0001H\u0014J\u0014\u0010¥\u0001\u001a\u00030\u0081\u00012\b\u0010¦\u0001\u001a\u00030§\u0001H\u0014J\u0016\u0010¨\u0001\u001a\u00030\u0081\u00012\n\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u008a\u0001H\u0004J\n\u0010©\u0001\u001a\u00030\u0081\u0001H\u0004J7\u0010ª\u0001\u001a\u00030\u0081\u00012\u0007\u0010«\u0001\u001a\u00020\u000b2\u0007\u0010\u008c\u0001\u001a\u00020\b2\u0007\u0010\u008d\u0001\u001a\u00020\b2\u0007\u0010\u008e\u0001\u001a\u00020\b2\u0007\u0010\u008f\u0001\u001a\u00020\bH\u0014J.\u0010¬\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u008c\u0001\u001a\u00020\b2\u0007\u0010\u008d\u0001\u001a\u00020\b2\u0007\u0010\u008e\u0001\u001a\u00020\b2\u0007\u0010\u008f\u0001\u001a\u00020\bH\u0014J.\u0010\u00ad\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u008c\u0001\u001a\u00020O2\u0007\u0010\u008d\u0001\u001a\u00020O2\u0007\u0010\u008e\u0001\u001a\u00020O2\u0007\u0010\u008f\u0001\u001a\u00020OH\u0016J\u0013\u0010®\u0001\u001a\u00030\u0081\u00012\u0007\u0010¯\u0001\u001a\u00020OH\u0004J\u0013\u0010°\u0001\u001a\u00030\u0081\u00012\u0007\u0010¯\u0001\u001a\u00020OH\u0014J\u001e\u0010±\u0001\u001a\u00030\u0081\u00012\b\u0010²\u0001\u001a\u00030³\u00012\b\u0010´\u0001\u001a\u00030³\u0001H\u0004J%\u0010µ\u0001\u001a\u00030\u0081\u00012\u0007\u0010¯\u0001\u001a\u00020O2\u0007\u0010¶\u0001\u001a\u00020O2\u0007\u0010·\u0001\u001a\u00020OH\u0004J\u001c\u0010¸\u0001\u001a\u00030\u0081\u00012\u0007\u0010¹\u0001\u001a\u00020O2\u0007\u0010º\u0001\u001a\u00020OH\u0004J\u0011\u0010»\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u0093\u0001\u001a\u00020\u001cJ\b\u0010¼\u0001\u001a\u00030\u0081\u0001J\b\u0010½\u0001\u001a\u00030\u0081\u0001J\u001a\u0010¾\u0001\u001a\u00030\u0081\u00012\u0007\u0010¿\u0001\u001a\u00020O2\u0007\u0010À\u0001\u001a\u00020OJ&\u0010¾\u0001\u001a\u00030\u0081\u00012\u0007\u0010Á\u0001\u001a\u00020O2\u0007\u0010Â\u0001\u001a\u00020O2\b\u0010Ã\u0001\u001a\u00030Ä\u0001H\u0004J\u0016\u0010Å\u0001\u001a\u00030\u0081\u00012\n\u0010Æ\u0001\u001a\u0005\u0018\u00010Ç\u0001H\u0016J1\u0010Å\u0001\u001a\u00030\u0081\u00012\n\u0010Æ\u0001\u001a\u0005\u0018\u00010Ç\u00012\t\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u001c2\u0007\u0010È\u0001\u001a\u00020O2\u0007\u0010É\u0001\u001a\u00020OJ\u0016\u0010Ê\u0001\u001a\u00030\u0081\u00012\n\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u008a\u0001H\u0016J1\u0010Ê\u0001\u001a\u00030\u0081\u00012\n\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u008a\u00012\t\u0010Ë\u0001\u001a\u0004\u0018\u00010\u001c2\u0007\u0010È\u0001\u001a\u00020O2\u0007\u0010É\u0001\u001a\u00020OJ3\u0010Ì\u0001\u001a\u00030\u0081\u00012\n\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u008a\u00012\t\u0010Ë\u0001\u001a\u0004\u0018\u00010\u001c2\u0007\u0010È\u0001\u001a\u00020O2\u0007\u0010É\u0001\u001a\u00020OH\u0004J\u0013\u0010Í\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u0093\u0001\u001a\u00020\u001cH\u0016J\u0013\u0010Î\u0001\u001a\u00030\u0081\u00012\u0007\u0010Ï\u0001\u001a\u00020\bH\u0016J\u0013\u0010Ð\u0001\u001a\u00030\u0081\u00012\t\u0010Ñ\u0001\u001a\u0004\u0018\u00010@J\u0013\u0010Ò\u0001\u001a\u00030\u0081\u00012\t\u0010Ñ\u0001\u001a\u0004\u0018\u00010dJ\n\u0010Ó\u0001\u001a\u00030\u0081\u0001H\u0004J\u0016\u0010Ô\u0001\u001a\u00030\u0081\u00012\n\u0010Õ\u0001\u001a\u0005\u0018\u00010\u008a\u0001H\u0004J\u001f\u0010Ö\u0001\u001a\u00030\u0081\u00012\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\t\u0010×\u0001\u001a\u0004\u0018\u00010\u0016H\u0004J\u0013\u0010Ø\u0001\u001a\u00030\u0081\u00012\u0007\u0010¯\u0001\u001a\u00020OH\u0004J%\u0010Ø\u0001\u001a\u00030\u0081\u00012\u0007\u0010¯\u0001\u001a\u00020O2\u0007\u0010¶\u0001\u001a\u00020O2\u0007\u0010·\u0001\u001a\u00020OH\u0004J/\u0010Ø\u0001\u001a\u00030\u0081\u00012\u0007\u0010¯\u0001\u001a\u00020O2\u0007\u0010¶\u0001\u001a\u00020O2\u0007\u0010·\u0001\u001a\u00020O2\b\u0010Ã\u0001\u001a\u00030Ä\u0001H\u0004J\u001b\u0010Ø\u0001\u001a\u00030\u0081\u00012\u0007\u0010¯\u0001\u001a\u00020O2\b\u0010Ã\u0001\u001a\u00030Ä\u0001R$\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR$\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020 8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0011\u0010&\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b'\u0010\u001eR\u001a\u0010(\u001a\u00020\u001cX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001e\"\u0004\b*\u0010+R\u001a\u0010,\u001a\u00020\u0012X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0014\"\u0004\b.\u0010/R\u001a\u00100\u001a\u00020\u0012X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0014\"\u0004\b2\u0010/R\u001a\u00103\u001a\u00020\u0012X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0014\"\u0004\b5\u0010/R\u0010\u00106\u001a\u0004\u0018\u000107X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u00108\u001a\u00020\bX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u0014\u0010=\u001a\u00020\u001cX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010\u001eR\u0010\u0010?\u001a\u0004\u0018\u00010@X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010A\u001a\u0004\u0018\u00010BX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0014\u0010G\u001a\u00020HX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u001a\u0010K\u001a\u00020\bX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010:\"\u0004\bM\u0010<R\u001a\u0010N\u001a\u00020OX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u001a\u0010T\u001a\u00020\u000bX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010\u000e\"\u0004\bV\u0010\u0010R\u001a\u0010W\u001a\u00020\bX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010:\"\u0004\bY\u0010<R\u001a\u0010Z\u001a\u00020OX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010Q\"\u0004\b\\\u0010SR\u001a\u0010]\u001a\u00020\u000bX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010\u000e\"\u0004\b_\u0010\u0010R\u001c\u0010`\u001a\u0004\u0018\u00010\u001cX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010\u001e\"\u0004\bb\u0010+R\u0010\u0010c\u001a\u0004\u0018\u00010dX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010e\u001a\u00020 X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bf\u0010#\"\u0004\bg\u0010%R\u001a\u0010h\u001a\u00020\u000bX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010\u000e\"\u0004\bj\u0010\u0010R\u001a\u0010k\u001a\u00020\u0016X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bl\u0010\u0018\"\u0004\bm\u0010\u001aR\u001a\u0010n\u001a\u00020\u001cX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bo\u0010\u001e\"\u0004\bp\u0010+R\u001a\u0010q\u001a\u00020\u000bX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\br\u0010\u000e\"\u0004\bs\u0010\u0010R\u001a\u0010t\u001a\u00020\u0012X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bu\u0010\u0014\"\u0004\bv\u0010/R\u001a\u0010w\u001a\u00020\u0012X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bx\u0010\u0014\"\u0004\by\u0010/R$\u0010{\u001a\u00020O2\u0006\u0010z\u001a\u00020O8F@DX\u0086\u000e¢\u0006\f\u001a\u0004\b|\u0010Q\"\u0004\b}\u0010SR%\u0010~\u001a\u00020O2\u0006\u0010z\u001a\u00020O8F@DX\u0086\u000e¢\u0006\r\u001a\u0004\b\u007f\u0010Q\"\u0005\b\u0080\u0001\u0010S¨\u0006Ý\u0001"}, d2 = {"Lcom/glority/imagezoomview/imagezoom/ImageViewTouchBase;", "Landroidx/appcompat/widget/AppCompatImageView;", "Lcom/glority/imagezoomview/imagezoom/IDisposable;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "<set-?>", "", "bitmapChanged", "getBitmapChanged", "()Z", "setBitmapChanged", "(Z)V", "bitmapRect", "Landroid/graphics/RectF;", "getBitmapRect", "()Landroid/graphics/RectF;", TtmlNode.CENTER, "Landroid/graphics/PointF;", "getCenter", "()Landroid/graphics/PointF;", "setCenter", "(Landroid/graphics/PointF;)V", "displayMatrix", "Landroid/graphics/Matrix;", "getDisplayMatrix", "()Landroid/graphics/Matrix;", "type", "Lcom/glority/imagezoomview/imagezoom/ImageViewTouchBase$DisplayType;", "displayType", "getDisplayType", "()Lcom/glority/imagezoomview/imagezoom/ImageViewTouchBase$DisplayType;", "setDisplayType", "(Lcom/glority/imagezoomview/imagezoom/ImageViewTouchBase$DisplayType;)V", "imageViewMatrix", "getImageViewMatrix", "mBaseMatrix", "getMBaseMatrix", "setMBaseMatrix", "(Landroid/graphics/Matrix;)V", "mBitmapRect", "getMBitmapRect", "setMBitmapRect", "(Landroid/graphics/RectF;)V", "mBitmapRectTmp", "getMBitmapRectTmp", "setMBitmapRectTmp", "mCenterRect", "getMCenterRect", "setMCenterRect", "mCurrentAnimation", "Landroid/animation/Animator;", "mDefaultAnimationDuration", "getMDefaultAnimationDuration", "()I", "setMDefaultAnimationDuration", "(I)V", "mDisplayMatrix", "getMDisplayMatrix", "mDrawableChangeListener", "Lcom/glority/imagezoomview/imagezoom/ImageViewTouchBase$OnDrawableChangeListener;", "mLayoutRunnable", "Ljava/lang/Runnable;", "getMLayoutRunnable", "()Ljava/lang/Runnable;", "setMLayoutRunnable", "(Ljava/lang/Runnable;)V", "mMatrixValues", "", "getMMatrixValues", "()[F", "mMaxFlingVelocity", "getMMaxFlingVelocity", "setMMaxFlingVelocity", "mMaxZoom", "", "getMMaxZoom", "()F", "setMMaxZoom", "(F)V", "mMaxZoomDefined", "getMMaxZoomDefined", "setMMaxZoomDefined", "mMinFlingVelocity", "getMMinFlingVelocity", "setMMinFlingVelocity", "mMinZoom", "getMMinZoom", "setMMinZoom", "mMinZoomDefined", "getMMinZoomDefined", "setMMinZoomDefined", "mNextMatrix", "getMNextMatrix", "setMNextMatrix", "mOnLayoutChangeListener", "Lcom/glority/imagezoomview/imagezoom/ImageViewTouchBase$OnLayoutChangeListener;", "mScaleType", "getMScaleType", "setMScaleType", "mScaleTypeChanged", "getMScaleTypeChanged", "setMScaleTypeChanged", "mScrollPoint", "getMScrollPoint", "setMScrollPoint", "mSuppMatrix", "getMSuppMatrix", "setMSuppMatrix", "mUserScaled", "getMUserScaled", "setMUserScaled", "mViewPort", "getMViewPort", "setMViewPort", "mViewPortOld", "getMViewPortOld", "setMViewPortOld", "value", "maxScale", "getMaxScale", "setMaxScale", "minScale", "getMinScale", "setMinScale", "", "horizontal", "vertical", "clear", "computeMaxZoom", "computeMinZoom", "dispose", "fireOnDrawableChangeListener", "drawable", "Landroid/graphics/drawable/Drawable;", "fireOnLayoutChangeListener", TtmlNode.LEFT, "top", TtmlNode.RIGHT, LogEvents.bottom, "supportMatrix", "getDefaultScale", "getProperBaseMatrix", "matrix", "rect", "getRotation", "getScale", "getScale1", "getValue", "whichValue", "getXScale", "getYScale", "init", TtmlNode.TAG_LAYOUT, "l", "t", "r", "b", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onDrawableChanged", "onImageMatrixChanged", "onLayout", "changed", "onLayoutChanged", "onViewPortChanged", "onZoom", "scale", "onZoomAnimationCompleted", "panBy", "dx", "", "dy", "postScale", "centerX", "centerY", "postTranslate", "deltaX", "deltaY", "printMatrix", "resetDisplay", "resetMatrix", "scrollBy", "x", "y", "distanceX", "distanceY", "durationMs", "", "setImageBitmap", "bitmap", "Landroid/graphics/Bitmap;", "minZoom", "maxZoom", "setImageDrawable", "initialMatrix", "setImageDrawableInternal", "setImageMatrix", "setImageResource", "resId", "setOnDrawableChangedListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnLayoutChangeListener", "stopAllAnimations", "updateDrawable", "newDrawable", "updateRect", "scrollRect", "zoomTo", "Companion", "DisplayType", "OnDrawableChangeListener", "OnLayoutChangeListener", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes6.dex */
public abstract class ImageViewTouchBase extends AppCompatImageView implements IDisposable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static boolean DEBUG = false;
    public static final float MAX_WIDTH = 2000.0f;
    public static final float MIN_SCALE_DIFF = 0.1f;
    public static final String TAG = "ImageViewTouchBase";
    public static final float ZOOM_INVALID = -1.0f;
    private boolean bitmapChanged;
    private PointF center;
    private Matrix mBaseMatrix;
    private RectF mBitmapRect;
    private RectF mBitmapRectTmp;
    private RectF mCenterRect;
    private Animator mCurrentAnimation;
    private int mDefaultAnimationDuration;
    private final Matrix mDisplayMatrix;
    private OnDrawableChangeListener mDrawableChangeListener;
    private Runnable mLayoutRunnable;
    private final float[] mMatrixValues;
    private int mMaxFlingVelocity;
    private float mMaxZoom;
    private boolean mMaxZoomDefined;
    private int mMinFlingVelocity;
    private float mMinZoom;
    private boolean mMinZoomDefined;
    private Matrix mNextMatrix;
    private OnLayoutChangeListener mOnLayoutChangeListener;
    private DisplayType mScaleType;
    private boolean mScaleTypeChanged;
    private PointF mScrollPoint;
    private Matrix mSuppMatrix;
    private boolean mUserScaled;
    private RectF mViewPort;
    private RectF mViewPortOld;

    /* compiled from: ImageViewTouchBase.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/glority/imagezoomview/imagezoom/ImageViewTouchBase$DisplayType;", "", "(Ljava/lang/String;I)V", "NONE", "FIT_TO_SCREEN", "FIT_IF_BIGGER", "FIT_HEIGHT", "FIT_WIDTH", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes6.dex */
    public enum DisplayType {
        NONE,
        FIT_TO_SCREEN,
        FIT_IF_BIGGER,
        FIT_HEIGHT,
        FIT_WIDTH
    }

    /* compiled from: ImageViewTouchBase.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/glority/imagezoomview/imagezoom/ImageViewTouchBase$OnDrawableChangeListener;", "", "onDrawableChanged", "", "drawable", "Landroid/graphics/drawable/Drawable;", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes6.dex */
    public interface OnDrawableChangeListener {
        void onDrawableChanged(Drawable drawable);
    }

    /* compiled from: ImageViewTouchBase.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H&¨\u0006\u000b"}, d2 = {"Lcom/glority/imagezoomview/imagezoom/ImageViewTouchBase$OnLayoutChangeListener;", "", "onLayoutChanged", "", "changed", "", TtmlNode.LEFT, "", "top", TtmlNode.RIGHT, LogEvents.bottom, "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes6.dex */
    public interface OnLayoutChangeListener {
        void onLayoutChanged(boolean changed, int left, int top, int right, int bottom);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImageViewTouchBase(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImageViewTouchBase(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // android.view.View
    public float getRotation() {
        return 0.0f;
    }

    protected final void onImageMatrixChanged() {
    }

    protected final void onZoom(float scale) {
    }

    protected void onZoomAnimationCompleted(float scale) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void updateRect(RectF bitmapRect, PointF scrollRect) {
    }

    public /* synthetic */ ImageViewTouchBase(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageViewTouchBase(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mBaseMatrix = new Matrix();
        this.mSuppMatrix = new Matrix();
        this.mMaxZoom = -1.0f;
        this.mMinZoom = -1.0f;
        this.mDisplayMatrix = new Matrix();
        this.mMatrixValues = new float[9];
        this.mScaleType = DisplayType.FIT_IF_BIGGER;
        this.center = new PointF();
        this.mBitmapRect = new RectF();
        this.mBitmapRectTmp = new RectF();
        this.mCenterRect = new RectF();
        this.mScrollPoint = new PointF();
        this.mViewPort = new RectF();
        this.mViewPortOld = new RectF();
        init(context, attributeSet, i);
    }

    protected final Matrix getMBaseMatrix() {
        return this.mBaseMatrix;
    }

    protected final void setMBaseMatrix(Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "<set-?>");
        this.mBaseMatrix = matrix;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Matrix getMSuppMatrix() {
        return this.mSuppMatrix;
    }

    protected final void setMSuppMatrix(Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "<set-?>");
        this.mSuppMatrix = matrix;
    }

    protected final Matrix getMNextMatrix() {
        return this.mNextMatrix;
    }

    protected final void setMNextMatrix(Matrix matrix) {
        this.mNextMatrix = matrix;
    }

    protected final Runnable getMLayoutRunnable() {
        return this.mLayoutRunnable;
    }

    protected final void setMLayoutRunnable(Runnable runnable) {
        this.mLayoutRunnable = runnable;
    }

    protected final boolean getMUserScaled() {
        return this.mUserScaled;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setMUserScaled(boolean z) {
        this.mUserScaled = z;
    }

    protected final float getMMaxZoom() {
        return this.mMaxZoom;
    }

    protected final void setMMaxZoom(float f) {
        this.mMaxZoom = f;
    }

    protected final float getMMinZoom() {
        return this.mMinZoom;
    }

    protected final void setMMinZoom(float f) {
        this.mMinZoom = f;
    }

    protected final boolean getMMaxZoomDefined() {
        return this.mMaxZoomDefined;
    }

    protected final void setMMaxZoomDefined(boolean z) {
        this.mMaxZoomDefined = z;
    }

    protected final boolean getMMinZoomDefined() {
        return this.mMinZoomDefined;
    }

    protected final void setMMinZoomDefined(boolean z) {
        this.mMinZoomDefined = z;
    }

    protected final Matrix getMDisplayMatrix() {
        return this.mDisplayMatrix;
    }

    protected final float[] getMMatrixValues() {
        return this.mMatrixValues;
    }

    protected final DisplayType getMScaleType() {
        return this.mScaleType;
    }

    protected final void setMScaleType(DisplayType displayType) {
        Intrinsics.checkNotNullParameter(displayType, "<set-?>");
        this.mScaleType = displayType;
    }

    protected final boolean getMScaleTypeChanged() {
        return this.mScaleTypeChanged;
    }

    protected final void setMScaleTypeChanged(boolean z) {
        this.mScaleTypeChanged = z;
    }

    public final boolean getBitmapChanged() {
        return this.bitmapChanged;
    }

    protected final void setBitmapChanged(boolean z) {
        this.bitmapChanged = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int getMDefaultAnimationDuration() {
        return this.mDefaultAnimationDuration;
    }

    protected final void setMDefaultAnimationDuration(int i) {
        this.mDefaultAnimationDuration = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int getMMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    protected final void setMMinFlingVelocity(int i) {
        this.mMinFlingVelocity = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int getMMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    protected final void setMMaxFlingVelocity(int i) {
        this.mMaxFlingVelocity = i;
    }

    protected final PointF getCenter() {
        return this.center;
    }

    protected final void setCenter(PointF pointF) {
        Intrinsics.checkNotNullParameter(pointF, "<set-?>");
        this.center = pointF;
    }

    protected final RectF getMBitmapRect() {
        return this.mBitmapRect;
    }

    protected final void setMBitmapRect(RectF rectF) {
        Intrinsics.checkNotNullParameter(rectF, "<set-?>");
        this.mBitmapRect = rectF;
    }

    protected final RectF getMBitmapRectTmp() {
        return this.mBitmapRectTmp;
    }

    protected final void setMBitmapRectTmp(RectF rectF) {
        Intrinsics.checkNotNullParameter(rectF, "<set-?>");
        this.mBitmapRectTmp = rectF;
    }

    protected final RectF getMCenterRect() {
        return this.mCenterRect;
    }

    protected final void setMCenterRect(RectF rectF) {
        Intrinsics.checkNotNullParameter(rectF, "<set-?>");
        this.mCenterRect = rectF;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final PointF getMScrollPoint() {
        return this.mScrollPoint;
    }

    protected final void setMScrollPoint(PointF pointF) {
        Intrinsics.checkNotNullParameter(pointF, "<set-?>");
        this.mScrollPoint = pointF;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final RectF getMViewPort() {
        return this.mViewPort;
    }

    protected final void setMViewPort(RectF rectF) {
        Intrinsics.checkNotNullParameter(rectF, "<set-?>");
        this.mViewPort = rectF;
    }

    protected final RectF getMViewPortOld() {
        return this.mViewPortOld;
    }

    protected final void setMViewPortOld(RectF rectF) {
        Intrinsics.checkNotNullParameter(rectF, "<set-?>");
        this.mViewPortOld = rectF;
    }

    public final void setOnDrawableChangedListener(OnDrawableChangeListener listener) {
        this.mDrawableChangeListener = listener;
    }

    public final void setOnLayoutChangeListener(OnLayoutChangeListener listener) {
        this.mOnLayoutChangeListener = listener;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void init(Context context, AttributeSet attrs, int defStyle) {
        Intrinsics.checkNotNullParameter(context, "context");
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mDefaultAnimationDuration = getResources().getInteger(R.integer.config_shortAnimTime);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public final void clear() {
        setImageBitmap(null);
    }

    /* renamed from: getDisplayType, reason: from getter */
    public final DisplayType getMScaleType() {
        return this.mScaleType;
    }

    public final void setDisplayType(DisplayType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (type != this.mScaleType) {
            if (DEBUG) {
                Log.i(TAG, Intrinsics.stringPlus("setDisplayType: ", type));
            }
            this.mUserScaled = false;
            this.mScaleType = type;
            this.mScaleTypeChanged = true;
            requestLayout();
        }
    }

    public void onViewPortChanged(float left, float top, float right, float bottom) {
        this.mViewPort.set(left, top, right, bottom);
        this.center.x = this.mViewPort.centerX();
        this.center.y = this.mViewPort.centerY();
    }

    @Override // android.view.View
    public void layout(int l, int t, int r, int b) {
        super.layout(l, t, r, b);
    }

    @Override // android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        float f;
        float f2;
        boolean z;
        float defaultScale;
        float f3;
        boolean z2;
        float f4;
        if (DEBUG) {
            Log.e(TAG, "onLayout: " + changed + ", bitmapChanged: " + this.bitmapChanged + ", scaleChanged: " + this.mScaleTypeChanged);
        }
        if (changed) {
            this.mViewPortOld.set(this.mViewPort);
            onViewPortChanged(left, top, right, bottom);
            f = this.mViewPort.width() - this.mViewPortOld.width();
            f2 = this.mViewPort.height() - this.mViewPortOld.height();
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        super.onLayout(changed, left, top, right, bottom);
        Runnable runnable = this.mLayoutRunnable;
        if (runnable != null) {
            this.mLayoutRunnable = null;
            runnable.run();
        }
        Drawable drawable = getDrawable();
        if (drawable != null) {
            if (changed || this.mScaleTypeChanged || this.bitmapChanged) {
                if (this.bitmapChanged) {
                    this.mUserScaled = false;
                    this.mBaseMatrix.reset();
                    if (!this.mMinZoomDefined) {
                        this.mMinZoom = -1.0f;
                    }
                    if (!this.mMaxZoomDefined) {
                        this.mMaxZoom = -1.0f;
                    }
                }
                float defaultScale2 = getDefaultScale(getMScaleType());
                float scale = getScale(this.mBaseMatrix);
                float scale1 = getScale1();
                float min = Math.min(1.0f, 1.0f / scale);
                getProperBaseMatrix(this.mBaseMatrix, this.mViewPort);
                float scale2 = getScale(this.mBaseMatrix);
                if (DEBUG) {
                    Log.d(TAG, Intrinsics.stringPlus("old matrix scale: ", Float.valueOf(scale)));
                    Log.d(TAG, Intrinsics.stringPlus("new matrix scale: ", Float.valueOf(scale2)));
                    Log.d(TAG, Intrinsics.stringPlus("old min scale: ", Float.valueOf(min)));
                    Log.d(TAG, Intrinsics.stringPlus("old scale: ", Float.valueOf(scale1)));
                }
                if (this.bitmapChanged || this.mScaleTypeChanged) {
                    if (DEBUG) {
                        Log.d(TAG, Intrinsics.stringPlus("display type: ", getMScaleType()));
                        Log.d(TAG, Intrinsics.stringPlus("newMatrix: ", this.mNextMatrix));
                    }
                    Matrix matrix = this.mNextMatrix;
                    if (matrix != null) {
                        this.mSuppMatrix.set(matrix);
                        this.mNextMatrix = null;
                        defaultScale = getScale1();
                    } else {
                        this.mSuppMatrix.reset();
                        defaultScale = getDefaultScale(getMScaleType());
                    }
                    f3 = defaultScale;
                    setImageMatrix(getImageViewMatrix());
                    if (f3 != getScale1()) {
                        if (DEBUG) {
                            Log.v(TAG, "scale != getScale: " + f3 + " != " + getScale1());
                        }
                        zoomTo(f3);
                    }
                } else if (changed) {
                    if (this.mMinZoomDefined) {
                        f4 = -1.0f;
                    } else {
                        f4 = -1.0f;
                        this.mMinZoom = -1.0f;
                    }
                    if (!this.mMaxZoomDefined) {
                        this.mMaxZoom = f4;
                    }
                    setImageMatrix(getImageViewMatrix());
                    postTranslate(-f, -f2);
                    if (!this.mUserScaled) {
                        float defaultScale3 = getDefaultScale(getMScaleType());
                        if (DEBUG) {
                            Log.v(TAG, Intrinsics.stringPlus("!userScaled. scale=", Float.valueOf(defaultScale3)));
                        }
                        zoomTo(defaultScale3);
                        f3 = defaultScale3;
                    } else {
                        f3 = Math.abs(scale1 - min) > 0.1f ? (scale / scale2) * scale1 : 1.0f;
                        if (DEBUG) {
                            Log.v(TAG, Intrinsics.stringPlus("userScaled. scale=", Float.valueOf(f3)));
                        }
                        zoomTo(f3);
                    }
                    if (DEBUG) {
                        Log.d(TAG, Intrinsics.stringPlus("old min scale: ", Float.valueOf(defaultScale2)));
                        Log.d(TAG, Intrinsics.stringPlus("old scale: ", Float.valueOf(scale1)));
                        Log.d(TAG, Intrinsics.stringPlus("new scale: ", Float.valueOf(f3)));
                    }
                } else {
                    f3 = 1.0f;
                }
                if (f3 > getMaxScale() || f3 < getMinScale()) {
                    zoomTo(f3);
                }
                center(true, true);
                if (this.bitmapChanged) {
                    onDrawableChanged(drawable);
                }
                if (changed || this.bitmapChanged || this.mScaleTypeChanged) {
                    onLayoutChanged(left, top, right, bottom);
                }
                if (this.mScaleTypeChanged) {
                    z2 = false;
                    this.mScaleTypeChanged = false;
                } else {
                    z2 = false;
                }
                if (this.bitmapChanged) {
                    this.bitmapChanged = z2;
                }
                if (DEBUG) {
                    Log.d(TAG, "scale: " + getScale1() + ", minScale: " + getMinScale() + ", maxScale: " + getMaxScale());
                    return;
                }
                return;
            }
            return;
        }
        if (this.bitmapChanged) {
            onDrawableChanged(drawable);
        }
        if (changed || this.bitmapChanged || this.mScaleTypeChanged) {
            onLayoutChanged(left, top, right, bottom);
        }
        if (this.bitmapChanged) {
            z = false;
            this.bitmapChanged = false;
        } else {
            z = false;
        }
        if (this.mScaleTypeChanged) {
            this.mScaleTypeChanged = z;
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        if (DEBUG) {
            Log.i(TAG, "onConfigurationChanged. scale: " + getScale1() + ", minScale: " + getMinScale() + ", mUserScaled: " + this.mUserScaled);
        }
        if (this.mUserScaled) {
            this.mUserScaled = Math.abs(getScale1() - getMinScale()) > 0.1f;
        }
        if (DEBUG) {
            Log.v(TAG, Intrinsics.stringPlus("mUserScaled: ", Boolean.valueOf(this.mUserScaled)));
        }
    }

    public final void resetDisplay() {
        this.bitmapChanged = true;
        requestLayout();
    }

    public final void resetMatrix() {
        if (DEBUG) {
            Log.i(TAG, "resetMatrix");
        }
        this.mSuppMatrix = new Matrix();
        float defaultScale = getDefaultScale(getMScaleType());
        setImageMatrix(getImageViewMatrix());
        if (DEBUG) {
            Log.d(TAG, "default scale: " + defaultScale + ", scale: " + defaultScale);
        }
        if (defaultScale != defaultScale) {
            zoomTo(defaultScale);
        }
        postInvalidate();
    }

    protected final float getDefaultScale(DisplayType type) {
        float width;
        float xScale;
        float width2;
        Intrinsics.checkNotNullParameter(type, "type");
        if (type == DisplayType.FIT_TO_SCREEN) {
            return 1.0f;
        }
        if (type == DisplayType.FIT_IF_BIGGER) {
            return Math.min(1.0f, 1.0f / getScale(this.mBaseMatrix));
        }
        if (type == DisplayType.FIT_HEIGHT) {
            width = getHeight();
            xScale = getYScale(this.mBaseMatrix);
            width2 = this.mBitmapRect.height();
        } else if (type == DisplayType.FIT_WIDTH) {
            width = getWidth();
            xScale = getXScale(this.mBaseMatrix);
            width2 = this.mBitmapRect.width();
        } else {
            return 1.0f / getScale(this.mBaseMatrix);
        }
        return width / (xScale * width2);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int resId) {
        setImageDrawable(ResourcesCompat.getDrawable(getResources(), resId, getContext().getTheme()));
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        setImageBitmap(bitmap, null, -1.0f, -1.0f);
    }

    public final void setImageBitmap(Bitmap bitmap, Matrix matrix, float minZoom, float maxZoom) {
        if (bitmap != null) {
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "resources");
            setImageDrawable(new BitmapDrawable(resources, bitmap), matrix, minZoom, maxZoom);
            return;
        }
        setImageDrawable(null, matrix, minZoom, maxZoom);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        setImageDrawable(drawable, null, -1.0f, -1.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, android.graphics.drawable.BitmapDrawable] */
    public final void setImageDrawable(Drawable drawable, final Matrix initialMatrix, final float minZoom, final float maxZoom) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = drawable;
        if (drawable != 0 && drawable.getIntrinsicWidth() > 2000.0f) {
            Bitmap bitmap = DrawableKt.toBitmap(drawable, 2000, (int) ((2000.0f / drawable.getIntrinsicWidth()) * drawable.getIntrinsicHeight()), Bitmap.Config.RGB_565);
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "resources");
            objectRef.element = new BitmapDrawable(resources, bitmap);
        }
        if (getWidth() <= 0) {
            this.mLayoutRunnable = new Runnable() { // from class: com.glority.imagezoomview.imagezoom.ImageViewTouchBase$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    ImageViewTouchBase.m7969setImageDrawable$lambda0(ImageViewTouchBase.this, objectRef, initialMatrix, minZoom, maxZoom);
                }
            };
        } else {
            setImageDrawableInternal((Drawable) objectRef.element, initialMatrix, minZoom, maxZoom);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: setImageDrawable$lambda-0, reason: not valid java name */
    public static final void m7969setImageDrawable$lambda0(ImageViewTouchBase this$0, Ref.ObjectRef realDrawable, Matrix matrix, float f, float f2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(realDrawable, "$realDrawable");
        this$0.setImageDrawable((Drawable) realDrawable.element, matrix, f, f2);
    }

    protected final void setImageDrawableInternal(Drawable drawable, Matrix initialMatrix, float minZoom, float maxZoom) {
        this.mBaseMatrix.reset();
        super.setImageDrawable(drawable);
        if (minZoom != -1.0f && maxZoom != -1.0f) {
            float min = Math.min(minZoom, maxZoom);
            float max = Math.max(min, maxZoom);
            this.mMinZoom = min;
            this.mMaxZoom = max;
            this.mMinZoomDefined = true;
            this.mMaxZoomDefined = true;
            if (getMScaleType() == DisplayType.FIT_TO_SCREEN || getMScaleType() == DisplayType.FIT_IF_BIGGER) {
                if (this.mMinZoom >= 1.0f) {
                    this.mMinZoomDefined = false;
                    this.mMinZoom = -1.0f;
                }
                if (this.mMaxZoom <= 1.0f) {
                    this.mMaxZoomDefined = true;
                    this.mMaxZoom = -1.0f;
                }
            }
        } else {
            this.mMinZoom = -1.0f;
            this.mMaxZoom = -1.0f;
            this.mMinZoomDefined = false;
            this.mMaxZoomDefined = false;
        }
        if (initialMatrix != null) {
            this.mNextMatrix = new Matrix(initialMatrix);
        }
        if (DEBUG) {
            Log.v(TAG, "mMinZoom: " + this.mMinZoom + ", mMaxZoom: " + this.mMaxZoom);
        }
        this.bitmapChanged = true;
        updateDrawable(drawable);
        requestLayout();
    }

    protected final void updateDrawable(Drawable newDrawable) {
        if (newDrawable != null) {
            this.mBitmapRect.set(0.0f, 0.0f, newDrawable.getIntrinsicWidth(), newDrawable.getIntrinsicHeight());
        } else {
            this.mBitmapRect.setEmpty();
        }
    }

    protected final void onDrawableChanged(Drawable drawable) {
        if (DEBUG) {
            Log.i(TAG, "onDrawableChanged");
            Log.v(TAG, "scale: " + getScale1() + ", minScale: " + getMinScale());
        }
        fireOnDrawableChangeListener(drawable);
    }

    protected final void fireOnLayoutChangeListener(int left, int top, int right, int bottom) {
        OnLayoutChangeListener onLayoutChangeListener = this.mOnLayoutChangeListener;
        if (onLayoutChangeListener != null) {
            Intrinsics.checkNotNull(onLayoutChangeListener);
            onLayoutChangeListener.onLayoutChanged(true, left, top, right, bottom);
        }
    }

    protected final void fireOnDrawableChangeListener(Drawable drawable) {
        OnDrawableChangeListener onDrawableChangeListener = this.mDrawableChangeListener;
        if (onDrawableChangeListener != null) {
            Intrinsics.checkNotNull(onDrawableChangeListener);
            onDrawableChangeListener.onDrawableChanged(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onLayoutChanged(int left, int top, int right, int bottom) {
        if (DEBUG) {
            Log.i(TAG, "onLayoutChanged");
        }
        fireOnLayoutChangeListener(left, top, right, bottom);
    }

    protected final float computeMaxZoom() {
        if (getDrawable() == null) {
            return 1.0f;
        }
        float max = Math.max(this.mBitmapRect.width() / this.mViewPort.width(), this.mBitmapRect.height() / this.mViewPort.height()) * 4;
        if (DEBUG) {
            Log.i(TAG, Intrinsics.stringPlus("computeMaxZoom: ", Float.valueOf(max)));
        }
        return max;
    }

    protected final float computeMinZoom() {
        if (DEBUG) {
            Log.i(TAG, "computeMinZoom");
        }
        if (getDrawable() == null) {
            return 1.0f;
        }
        float min = Math.min(1.0f, 1.0f / getScale(this.mBaseMatrix));
        if (DEBUG) {
            Log.i(TAG, Intrinsics.stringPlus("computeMinZoom: ", Float.valueOf(min)));
        }
        return min;
    }

    public final float getMaxScale() {
        if (this.mMaxZoom == -1.0f) {
            this.mMaxZoom = computeMaxZoom();
        }
        return this.mMaxZoom;
    }

    protected final void setMaxScale(float f) {
        if (DEBUG) {
            Log.d(TAG, Intrinsics.stringPlus("setMaxZoom: ", Float.valueOf(f)));
        }
        this.mMaxZoom = f;
    }

    public final float getMinScale() {
        if (DEBUG) {
            Log.i(TAG, Intrinsics.stringPlus("getMinScale, mMinZoom: ", Float.valueOf(this.mMinZoom)));
        }
        if (this.mMinZoom == -1.0f) {
            this.mMinZoom = computeMinZoom();
        }
        if (DEBUG) {
            Log.v(TAG, Intrinsics.stringPlus("mMinZoom: ", Float.valueOf(this.mMinZoom)));
        }
        return this.mMinZoom;
    }

    protected final void setMinScale(float f) {
        if (DEBUG) {
            Log.d(TAG, Intrinsics.stringPlus("setMinZoom: ", Float.valueOf(f)));
        }
        this.mMinZoom = f;
    }

    public final Matrix getImageViewMatrix() {
        return getImageViewMatrix(this.mSuppMatrix);
    }

    public final Matrix getImageViewMatrix(Matrix supportMatrix) {
        this.mDisplayMatrix.set(this.mBaseMatrix);
        this.mDisplayMatrix.postConcat(supportMatrix);
        return this.mDisplayMatrix;
    }

    @Override // android.widget.ImageView
    public void setImageMatrix(Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        boolean z = !Intrinsics.areEqual(getImageMatrix(), matrix);
        super.setImageMatrix(matrix);
        if (z) {
            onImageMatrixChanged();
        }
    }

    public final Matrix getDisplayMatrix() {
        return new Matrix(this.mSuppMatrix);
    }

    protected final void getProperBaseMatrix(Matrix matrix, RectF rect) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Intrinsics.checkNotNullParameter(rect, "rect");
        float width = this.mBitmapRect.width();
        float height = this.mBitmapRect.height();
        matrix.reset();
        float min = Math.min(rect.width() / width, rect.height() / height);
        matrix.postScale(min, min);
        matrix.postTranslate(rect.left, rect.top);
        matrix.postTranslate((rect.width() - (width * min)) / 2.0f, (rect.height() - (height * min)) / 2.0f);
        printMatrix(matrix);
    }

    protected final float getValue(Matrix matrix, int whichValue) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        matrix.getValues(this.mMatrixValues);
        return this.mMatrixValues[whichValue];
    }

    public final void printMatrix(Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        float value = getValue(matrix, 0);
        float value2 = getValue(matrix, 4);
        Log.d(TAG, "matrix: { x: " + getValue(matrix, 2) + ", y: " + getValue(matrix, 5) + ", scalex: " + value + ", scaley: " + value2 + " }");
    }

    public final RectF getBitmapRect() {
        return getBitmapRect(this.mSuppMatrix);
    }

    protected final RectF getBitmapRect(Matrix supportMatrix) {
        getImageViewMatrix(supportMatrix).mapRect(this.mBitmapRectTmp, this.mBitmapRect);
        return this.mBitmapRectTmp;
    }

    protected final float getYScale(Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        return getValue(matrix, 4);
    }

    protected final float getXScale(Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        return getValue(matrix, 0);
    }

    protected final float getScale(Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        return getValue(matrix, 0);
    }

    protected final void center(boolean horizontal, boolean vertical) {
        if (getDrawable() == null) {
            return;
        }
        RectF center = getCenter(this.mSuppMatrix, horizontal, vertical);
        if (center.left == 0.0f && center.top == 0.0f) {
            return;
        }
        postTranslate(center.left, center.top);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.RectF getCenter(android.graphics.Matrix r6, boolean r7, boolean r8) {
        /*
            r5 = this;
            java.lang.String r0 = "supportMatrix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            android.graphics.drawable.Drawable r0 = r5.getDrawable()
            r1 = 0
            if (r0 != 0) goto L12
            android.graphics.RectF r6 = new android.graphics.RectF
            r6.<init>(r1, r1, r1, r1)
            return r6
        L12:
            android.graphics.RectF r0 = r5.mCenterRect
            r0.set(r1, r1, r1, r1)
            android.graphics.RectF r6 = r5.getBitmapRect(r6)
            float r0 = r6.height()
            float r2 = r6.width()
            r3 = 2
            if (r8 == 0) goto L66
            android.graphics.RectF r8 = r5.mViewPort
            float r8 = r8.height()
            int r8 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r8 >= 0) goto L42
            android.graphics.RectF r8 = r5.mViewPort
            float r8 = r8.height()
            float r8 = r8 - r0
            float r0 = (float) r3
            float r8 = r8 / r0
            float r0 = r6.top
            android.graphics.RectF r4 = r5.mViewPort
            float r4 = r4.top
            float r0 = r0 - r4
        L40:
            float r8 = r8 - r0
            goto L67
        L42:
            float r8 = r6.top
            android.graphics.RectF r0 = r5.mViewPort
            float r0 = r0.top
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 <= 0) goto L55
            float r8 = r6.top
            android.graphics.RectF r0 = r5.mViewPort
            float r0 = r0.top
            float r8 = r8 - r0
            float r8 = -r8
            goto L67
        L55:
            float r8 = r6.bottom
            android.graphics.RectF r0 = r5.mViewPort
            float r0 = r0.bottom
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 >= 0) goto L66
            android.graphics.RectF r8 = r5.mViewPort
            float r8 = r8.bottom
            float r0 = r6.bottom
            goto L40
        L66:
            r8 = r1
        L67:
            if (r7 == 0) goto La9
            android.graphics.RectF r7 = r5.mViewPort
            float r7 = r7.width()
            int r7 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r7 >= 0) goto L85
            android.graphics.RectF r7 = r5.mViewPort
            float r7 = r7.width()
            float r7 = r7 - r2
            float r0 = (float) r3
            float r7 = r7 / r0
            float r6 = r6.left
            android.graphics.RectF r0 = r5.mViewPort
            float r0 = r0.left
            float r6 = r6 - r0
        L83:
            float r7 = r7 - r6
            goto Laa
        L85:
            float r7 = r6.left
            android.graphics.RectF r0 = r5.mViewPort
            float r0 = r0.left
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 <= 0) goto L98
            float r6 = r6.left
            android.graphics.RectF r7 = r5.mViewPort
            float r7 = r7.left
            float r6 = r6 - r7
            float r7 = -r6
            goto Laa
        L98:
            float r7 = r6.right
            android.graphics.RectF r0 = r5.mViewPort
            float r0 = r0.right
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 >= 0) goto La9
            android.graphics.RectF r7 = r5.mViewPort
            float r7 = r7.right
            float r6 = r6.right
            goto L83
        La9:
            r7 = r1
        Laa:
            android.graphics.RectF r6 = r5.mCenterRect
            r6.set(r7, r8, r1, r1)
            android.graphics.RectF r6 = r5.mCenterRect
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.imagezoomview.imagezoom.ImageViewTouchBase.getCenter(android.graphics.Matrix, boolean, boolean):android.graphics.RectF");
    }

    protected final void postTranslate(float deltaX, float deltaY) {
        if (deltaX == 0.0f && deltaY == 0.0f) {
            return;
        }
        this.mSuppMatrix.postTranslate(deltaX, deltaY);
        setImageMatrix(getImageViewMatrix());
    }

    protected final void postScale(float scale, float centerX, float centerY) {
        this.mSuppMatrix.postScale(scale, scale, centerX, centerY);
        setImageMatrix(getImageViewMatrix());
    }

    protected final void zoomTo(float scale) {
        if (DEBUG) {
            Log.i(TAG, Intrinsics.stringPlus("zoomTo: ", Float.valueOf(scale)));
        }
        if (scale > getMaxScale()) {
            scale = getMaxScale();
        }
        if (scale < getMinScale()) {
            scale = getMinScale();
        }
        if (DEBUG) {
            Log.d(TAG, Intrinsics.stringPlus("sanitized scale: ", Float.valueOf(scale)));
        }
        PointF pointF = this.center;
        zoomTo(scale, pointF.x, pointF.y);
    }

    public final void zoomTo(float scale, long durationMs) {
        PointF pointF = this.center;
        zoomTo(scale, pointF.x, pointF.y, durationMs);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zoomTo(float scale, float centerX, float centerY) {
        if (scale > getMaxScale()) {
            scale = getMaxScale();
        }
        postScale(scale / getScale(this.mSuppMatrix), centerX, centerY);
        onZoom(scale);
        center(true, true);
    }

    public final void scrollBy(float x, float y) {
        panBy(x, y);
    }

    public final float getScale1() {
        return getScale(this.mSuppMatrix);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void panBy(double dx, double dy) {
        RectF bitmapRect = getBitmapRect();
        this.mScrollPoint.set((float) dx, (float) dy);
        updateRect(bitmapRect, this.mScrollPoint);
        if (this.mScrollPoint.x == 0.0f && this.mScrollPoint.y == 0.0f) {
            return;
        }
        postTranslate(this.mScrollPoint.x, this.mScrollPoint.y);
        center(true, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void stopAllAnimations() {
        Animator animator = this.mCurrentAnimation;
        if (animator != null) {
            Intrinsics.checkNotNull(animator);
            animator.cancel();
            this.mCurrentAnimation = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void scrollBy(float distanceX, float distanceY, long durationMs) {
        final ValueAnimator duration = ValueAnimator.ofFloat(0.0f, distanceX).setDuration(durationMs);
        final ValueAnimator duration2 = ValueAnimator.ofFloat(0.0f, distanceY).setDuration(durationMs);
        stopAllAnimations();
        AnimatorSet animatorSet = new AnimatorSet();
        this.mCurrentAnimation = animatorSet;
        animatorSet.playTogether(duration, duration2);
        Animator animator = this.mCurrentAnimation;
        Intrinsics.checkNotNull(animator);
        animator.setDuration(durationMs);
        Animator animator2 = this.mCurrentAnimation;
        Intrinsics.checkNotNull(animator2);
        animator2.setInterpolator(new DecelerateInterpolator());
        Animator animator3 = this.mCurrentAnimation;
        Intrinsics.checkNotNull(animator3);
        animator3.start();
        duration2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.glority.imagezoomview.imagezoom.ImageViewTouchBase$scrollBy$1
            private float oldValueX;
            private float oldValueY;

            public final float getOldValueX() {
                return this.oldValueX;
            }

            public final void setOldValueX(float f) {
                this.oldValueX = f;
            }

            public final float getOldValueY() {
                return this.oldValueY;
            }

            public final void setOldValueY(float f) {
                this.oldValueY = f;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                Object animatedValue = duration.getAnimatedValue();
                if (animatedValue == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                }
                float floatValue = ((Float) animatedValue).floatValue();
                Object animatedValue2 = duration2.getAnimatedValue();
                if (animatedValue2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                }
                float floatValue2 = ((Float) animatedValue2).floatValue();
                this.panBy(floatValue - this.oldValueX, floatValue2 - this.oldValueY);
                this.oldValueX = floatValue;
                this.oldValueY = floatValue2;
                this.postInvalidateOnAnimation();
            }
        });
        Animator animator4 = this.mCurrentAnimation;
        Intrinsics.checkNotNull(animator4);
        animator4.addListener(new Animator.AnimatorListener() { // from class: com.glority.imagezoomview.imagezoom.ImageViewTouchBase$scrollBy$2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                ImageViewTouchBase imageViewTouchBase = ImageViewTouchBase.this;
                RectF center = imageViewTouchBase.getCenter(imageViewTouchBase.getMSuppMatrix(), true, true);
                if (center.left == 0.0f && center.top == 0.0f) {
                    return;
                }
                ImageViewTouchBase.this.scrollBy(center.left, center.top);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zoomTo(float scale, float centerX, float centerY, long durationMs) {
        if (scale > getMaxScale()) {
            scale = getMaxScale();
        }
        float scale1 = getScale1();
        Matrix matrix = new Matrix(this.mSuppMatrix);
        matrix.postScale(scale, scale, centerX, centerY);
        RectF center = getCenter(matrix, true, true);
        final float f = centerX + (center.left * scale);
        final float f2 = centerY + (center.top * scale);
        stopAllAnimations();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(scale1, scale);
        ofFloat.setDuration(durationMs);
        ofFloat.setInterpolator(new DecelerateInterpolator(1.0f));
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.glority.imagezoomview.imagezoom.ImageViewTouchBase$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ImageViewTouchBase.m7970zoomTo$lambda1(ImageViewTouchBase.this, f, f2, valueAnimator);
            }
        });
        ofFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zoomTo$lambda-1, reason: not valid java name */
    public static final void m7970zoomTo$lambda1(ImageViewTouchBase this$0, float f, float f2, ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
        }
        this$0.zoomTo(((Float) animatedValue).floatValue(), f, f2);
        this$0.postInvalidateOnAnimation();
    }

    @Override // com.glority.imagezoomview.imagezoom.IDisposable
    public void dispose() {
        clear();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Log.d(TAG, "onDraw");
        if (getScaleType() == ImageView.ScaleType.FIT_XY) {
            Drawable drawable = getDrawable();
            if (drawable == null) {
                return;
            }
            drawable.draw(canvas);
            return;
        }
        super.onDraw(canvas);
    }

    /* compiled from: ImageViewTouchBase.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/glority/imagezoomview/imagezoom/ImageViewTouchBase$Companion;", "", "()V", "DEBUG", "", "getDEBUG", "()Z", "setDEBUG", "(Z)V", "MAX_WIDTH", "", "MIN_SCALE_DIFF", "TAG", "", "ZOOM_INVALID", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean getDEBUG() {
            return ImageViewTouchBase.DEBUG;
        }

        public final void setDEBUG(boolean z) {
            ImageViewTouchBase.DEBUG = z;
        }
    }
}
