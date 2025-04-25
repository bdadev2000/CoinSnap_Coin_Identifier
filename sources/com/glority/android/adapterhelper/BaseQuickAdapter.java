package com.glority.android.adapterhelper;

import android.animation.Animator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.glority.android.adapterhelper.BaseQuickAdapter;
import com.glority.android.adapterhelper.BaseViewHolder;
import com.glority.android.adapterhelper.animation.AlphaInAnimation;
import com.glority.android.adapterhelper.animation.BaseAnimation;
import com.glority.android.adapterhelper.animation.ScaleInAnimation;
import com.glority.android.adapterhelper.animation.SlideInBottomAnimation;
import com.glority.android.adapterhelper.animation.SlideInLeftAnimation;
import com.glority.android.adapterhelper.animation.SlideInRightAnimation;
import com.glority.android.adapterhelper.diff.BaseQuickAdapterListUpdateCallback;
import com.glority.android.adapterhelper.diff.BaseQuickDiffCallback;
import com.glority.android.adapterhelper.loadmore.LoadMoreView;
import com.glority.android.adapterhelper.loadmore.SimpleLoadMoreView;
import com.glority.android.adapterhelper.util.MultiTypeDelegate;
import com.glority.android.core.data.LogEventArguments;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* compiled from: BaseQuickAdapter.kt */
@Metadata(d1 = {"\u0000\u0092\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b9\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000 \u008c\u0002*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00020\u0004:\u0012\u008b\u0002\u008c\u0002\u008d\u0002\u008e\u0002\u008f\u0002\u0090\u0002\u0091\u0002\u0092\u0002\u0093\u0002B\u0017\b\u0016\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B#\b\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006¢\u0006\u0002\u0010\nJ#\u0010\u007f\u001a\u00030\u0080\u00012\t\b\u0001\u0010\u0081\u0001\u001a\u00020\t2\u0007\u0010\u0082\u0001\u001a\u00028\u0000H\u0007¢\u0006\u0003\u0010\u0083\u0001J\u0014\u0010\u0084\u0001\u001a\u00030\u0080\u00012\b\u0010\u0085\u0001\u001a\u00030\u0086\u0001H\u0002J\u0016\u0010\u0087\u0001\u001a\u00030\u0080\u00012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0003\u0010\u0088\u0001J!\u0010\u0087\u0001\u001a\u00030\u0080\u00012\t\b\u0001\u0010\u0081\u0001\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0003\u0010\u0083\u0001J\"\u0010\u0087\u0001\u001a\u00030\u0080\u00012\t\b\u0001\u0010\u0081\u0001\u001a\u00020\t2\r\u0010\u0089\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006J\u0018\u0010\u0087\u0001\u001a\u00030\u0080\u00012\u000e\u0010\u0089\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u008a\u0001J(\u0010\u008b\u0001\u001a\u00020\t2\u0007\u0010\u008c\u0001\u001a\u00020\u000e2\t\b\u0002\u0010\u008d\u0001\u001a\u00020\t2\t\b\u0002\u0010\u008e\u0001\u001a\u00020\tH\u0007J(\u0010\u008f\u0001\u001a\u00020\t2\u0007\u0010\u0090\u0001\u001a\u00020\u000e2\t\b\u0002\u0010\u008d\u0001\u001a\u00020\t2\t\b\u0002\u0010\u008e\u0001\u001a\u00020\tH\u0007J\u0010\u0010\u0091\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0092\u0001H\u0002J\u0013\u0010\u0093\u0001\u001a\u00030\u0080\u00012\u0007\u0010\u0081\u0001\u001a\u00020\tH\u0002J\u0013\u0010\u0094\u0001\u001a\u00030\u0080\u00012\u0007\u0010\u0095\u0001\u001a\u00020\tH\u0002J\u0010\u0010\u0096\u0001\u001a\u00030\u0080\u00012\u0006\u0010|\u001a\u00020{J\u0015\u0010\u0097\u0001\u001a\u00030\u0080\u00012\t\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u0003H\u0002J\n\u0010\u0099\u0001\u001a\u00030\u0080\u0001H\u0002J\b\u0010\u009a\u0001\u001a\u00030\u0080\u0001J\u0013\u0010\u009b\u0001\u001a\u00030\u0080\u00012\u0007\u0010\u009c\u0001\u001a\u00020\tH\u0002J\"\u0010\u009d\u0001\u001a\u00030\u0080\u00012\u0007\u0010\u009e\u0001\u001a\u00028\u00012\u0007\u0010\u0082\u0001\u001a\u00028\u0000H$¢\u0006\u0003\u0010\u009f\u0001J5\u0010 \u0001\u001a\u00030\u0080\u00012\u0007\u0010\u009e\u0001\u001a\u00028\u00012\t\u0010\u0082\u0001\u001a\u0004\u0018\u00018\u00002\u000f\u0010¡\u0001\u001a\n\u0012\u0005\u0012\u00030¢\u00010\u0092\u0001H\u0014¢\u0006\u0003\u0010£\u0001J\u0018\u0010¤\u0001\u001a\u00028\u00012\u0007\u0010¥\u0001\u001a\u00020\u000eH\u0014¢\u0006\u0003\u0010¦\u0001J#\u0010¤\u0001\u001a\u00028\u00012\n\u0010§\u0001\u001a\u0005\u0018\u00010¨\u00012\u0006\u0010\b\u001a\u00020\tH\u0014¢\u0006\u0003\u0010©\u0001J*\u0010ª\u0001\u001a\u0004\u0018\u00018\u00012\f\u0010«\u0001\u001a\u0007\u0012\u0002\b\u00030¬\u00012\t\u0010¥\u0001\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0003\u0010\u00ad\u0001J\u0011\u0010®\u0001\u001a\u00030\u0080\u00012\u0007\u0010¯\u0001\u001a\u00020$J\u0012\u0010°\u0001\u001a\u00020\t2\u0007\u0010\u0081\u0001\u001a\u00020\tH\u0016J\u001e\u0010±\u0001\u001a\t\u0012\u0002\b\u0003\u0018\u00010¬\u00012\f\u0010«\u0001\u001a\u0007\u0012\u0002\b\u00030¬\u0001H\u0002J\u001a\u0010²\u0001\u001a\u0004\u0018\u00018\u00002\t\b\u0001\u0010\u0081\u0001\u001a\u00020\t¢\u0006\u0003\u0010³\u0001J\t\u0010´\u0001\u001a\u00020\tH\u0016J\u0013\u0010µ\u0001\u001a\u00030¶\u00012\u0007\u0010\u0081\u0001\u001a\u00020\tH\u0016J\u001a\u0010·\u0001\u001a\u00020\t2\t\u0010\u0082\u0001\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0003\u0010¸\u0001J\u001f\u0010¹\u0001\u001a\u00020\u000e2\b\b\u0001\u0010\b\u001a\u00020\t2\n\u0010§\u0001\u001a\u0005\u0018\u00010¨\u0001H\u0014J\u0012\u0010º\u0001\u001a\u00020\t2\u0007\u0010\u0081\u0001\u001a\u00020\tH\u0016J\u0019\u0010»\u0001\u001a\u00028\u00012\b\u0010§\u0001\u001a\u00030¨\u0001H\u0002¢\u0006\u0003\u0010¼\u0001J'\u0010½\u0001\u001a\u0004\u0018\u00010\u000e2\b\u0010|\u001a\u0004\u0018\u00010{2\u0007\u0010\u0081\u0001\u001a\u00020\t2\t\b\u0001\u0010¾\u0001\u001a\u00020\tJ\u001d\u0010½\u0001\u001a\u0004\u0018\u00010\u000e2\u0007\u0010\u0081\u0001\u001a\u00020\t2\t\b\u0001\u0010¾\u0001\u001a\u00020\tJ\u0011\u0010¿\u0001\u001a\u00030\u0080\u00012\u0007\u0010À\u0001\u001a\u00020$J\u0012\u0010Á\u0001\u001a\u00020$2\u0007\u0010Â\u0001\u001a\u00020\tH\u0004J\u0011\u0010Ã\u0001\u001a\u00030\u0080\u00012\u0007\u0010Ã\u0001\u001a\u00020$J\b\u0010Ä\u0001\u001a\u00030\u0080\u0001J\u0015\u0010Å\u0001\u001a\u00030\u0080\u00012\t\b\u0002\u0010Æ\u0001\u001a\u00020$H\u0007J\b\u0010Ç\u0001\u001a\u00030\u0080\u0001J\b\u0010È\u0001\u001a\u00030\u0080\u0001J\u0012\u0010É\u0001\u001a\u00030\u0080\u00012\u0006\u0010|\u001a\u00020{H\u0016J\"\u0010Ê\u0001\u001a\u00030\u0080\u00012\u0007\u0010\u0085\u0001\u001a\u00028\u00012\u0007\u0010\u0081\u0001\u001a\u00020\tH\u0016¢\u0006\u0003\u0010Ë\u0001J3\u0010Ê\u0001\u001a\u00030\u0080\u00012\u0007\u0010\u0085\u0001\u001a\u00028\u00012\u0007\u0010\u0081\u0001\u001a\u00020\t2\u000f\u0010¡\u0001\u001a\n\u0012\u0005\u0012\u00030¢\u00010\u0092\u0001H\u0016¢\u0006\u0003\u0010Ì\u0001J$\u0010Í\u0001\u001a\u00028\u00012\n\u0010§\u0001\u001a\u0005\u0018\u00010¨\u00012\u0007\u0010Î\u0001\u001a\u00020\tH\u0014¢\u0006\u0003\u0010©\u0001J\"\u0010Ï\u0001\u001a\u00028\u00012\b\u0010§\u0001\u001a\u00030¨\u00012\u0007\u0010Î\u0001\u001a\u00020\tH\u0016¢\u0006\u0003\u0010©\u0001J\u0019\u0010Ð\u0001\u001a\u00030\u0080\u00012\u0007\u0010\u0085\u0001\u001a\u00028\u0001H\u0016¢\u0006\u0003\u0010Ñ\u0001J\b\u0010Ò\u0001\u001a\u00030\u0080\u0001J\u0013\u0010Ò\u0001\u001a\u00030\u0080\u00012\t\u0010Ó\u0001\u001a\u0004\u0018\u00010;J\u0013\u0010Ò\u0001\u001a\u00030\u0080\u00012\t\b\u0001\u0010Ô\u0001\u001a\u00020\tJ\u0013\u0010Õ\u0001\u001a\u00030\u0080\u00012\u0007\u0010Ö\u0001\u001a\u00020VH\u0002J\u0011\u0010×\u0001\u001a\u00030\u0080\u00012\u0007\u0010\u0081\u0001\u001a\u00020\tJ\u0015\u0010Ø\u0001\u001a\u00030\u0080\u00012\t\b\u0001\u0010\u0081\u0001\u001a\u00020\tH\u0016J\b\u0010Ù\u0001\u001a\u00030\u0080\u0001J\b\u0010Ú\u0001\u001a\u00030\u0080\u0001J\u0013\u0010Û\u0001\u001a\u00030\u0080\u00012\t\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u000eJ\u0013\u0010Ü\u0001\u001a\u00030\u0080\u00012\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u000eJ\u0017\u0010Ý\u0001\u001a\u00030\u0080\u00012\r\u0010\u0005\u001a\t\u0012\u0004\u0012\u00028\u00000\u008a\u0001J!\u0010Þ\u0001\u001a\u00030\u0080\u00012\t\b\u0001\u0010\u008d\u0001\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0003\u0010\u0083\u0001J\u0011\u0010ß\u0001\u001a\u00030\u0080\u00012\u0007\u0010à\u0001\u001a\u00020\tJ\u0010\u0010á\u0001\u001a\u00030\u0080\u00012\u0006\u0010\r\u001a\u00020\u000eJ\u0012\u0010á\u0001\u001a\u00030\u0080\u00012\u0006\u0010\b\u001a\u00020\tH\u0007J\u001c\u0010á\u0001\u001a\u00030\u0080\u00012\u0006\u0010\b\u001a\u00020\t2\n\u0010â\u0001\u001a\u0005\u0018\u00010¨\u0001J\u0011\u0010ã\u0001\u001a\u00030\u0080\u00012\u0007\u0010¯\u0001\u001a\u00020$J\u0010\u0010ä\u0001\u001a\u00020\t2\u0007\u0010\u0090\u0001\u001a\u00020\u000eJ\u0019\u0010ä\u0001\u001a\u00020\t2\u0007\u0010\u0090\u0001\u001a\u00020\u000e2\u0007\u0010\u008d\u0001\u001a\u00020\tJ\"\u0010ä\u0001\u001a\u00020\t2\u0007\u0010\u0090\u0001\u001a\u00020\u000e2\u0007\u0010\u008d\u0001\u001a\u00020\t2\u0007\u0010\u008e\u0001\u001a\u00020\tJ\u0014\u0010å\u0001\u001a\u00030\u0080\u00012\b\u0010\u0085\u0001\u001a\u00030\u0086\u0001H\u0004J\u0011\u0010æ\u0001\u001a\u00030\u0080\u00012\u0007\u0010ç\u0001\u001a\u00020$J\u001a\u0010è\u0001\u001a\u00030\u0080\u00012\u0007\u0010ç\u0001\u001a\u00020$2\u0007\u0010é\u0001\u001a\u00020$J\u0010\u0010ê\u0001\u001a\u00020\t2\u0007\u0010\u0090\u0001\u001a\u00020\u000eJ\u0019\u0010ê\u0001\u001a\u00020\t2\u0007\u0010\u0090\u0001\u001a\u00020\u000e2\u0007\u0010\u008d\u0001\u001a\u00020\tJ\"\u0010ê\u0001\u001a\u00020\t2\u0007\u0010\u0090\u0001\u001a\u00020\u000e2\u0007\u0010\u008d\u0001\u001a\u00020\t2\u0007\u0010\u008e\u0001\u001a\u00020\tJ\u0011\u0010ë\u0001\u001a\u00030\u0080\u00012\u0007\u0010ì\u0001\u001a\u00020QJ\u001a\u0010í\u0001\u001a\u00030\u0080\u00012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006H\u0016J$\u0010î\u0001\u001a\u00030\u0080\u00012\b\u0010ï\u0001\u001a\u00030ð\u00012\u000e\u0010\u0089\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0092\u0001H\u0016J\u001a\u0010î\u0001\u001a\u00030\u0080\u00012\u000e\u0010ñ\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000ò\u0001H\u0016J#\u0010î\u0001\u001a\u00030\u0080\u00012\u000e\u0010ñ\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000ò\u00012\u0007\u0010ó\u0001\u001a\u00020$H\u0016J\u0011\u0010ô\u0001\u001a\u00030\u0080\u00012\u0007\u0010õ\u0001\u001a\u00020\tJh\u0010g\u001a\u00030\u0080\u00012_\u0010ö\u0001\u001aZ\u0012\u001e\u0012\u001c\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0000¢\u0006\u000f\bø\u0001\u0012\n\bù\u0001\u0012\u0005\b\b(ú\u0001\u0012\u0016\u0012\u00140\u000e¢\u0006\u000f\bø\u0001\u0012\n\bù\u0001\u0012\u0005\b\b(¥\u0001\u0012\u0016\u0012\u00140\t¢\u0006\u000f\bø\u0001\u0012\n\bù\u0001\u0012\u0005\b\b(\u0081\u0001\u0012\u0005\u0012\u00030\u0080\u00010÷\u0001J\u001a\u0010û\u0001\u001a\u00030\u0080\u00012\u0007\u0010ü\u0001\u001a\u00020\u000e2\u0007\u0010\u0081\u0001\u001a\u00020\tJh\u0010s\u001a\u00030\u0080\u00012_\u0010ö\u0001\u001aZ\u0012\u001e\u0012\u001c\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0000¢\u0006\u000f\bø\u0001\u0012\n\bù\u0001\u0012\u0005\b\b(ú\u0001\u0012\u0016\u0012\u00140\u000e¢\u0006\u000f\bø\u0001\u0012\n\bù\u0001\u0012\u0005\b\b(¥\u0001\u0012\u0016\u0012\u00140\t¢\u0006\u000f\bø\u0001\u0012\n\bù\u0001\u0012\u0005\b\b(\u0081\u0001\u0012\u0005\u0012\u00030\u0080\u00010÷\u0001J\u0019\u0010ý\u0001\u001a\u00020$2\u0007\u0010ü\u0001\u001a\u00020\u000e2\u0007\u0010\u0081\u0001\u001a\u00020\tJ\u0019\u0010þ\u0001\u001a\u00030\u0080\u00012\u0006\u0010|\u001a\u00020{2\u0007\u0010Ö\u0001\u001a\u00020VJ\u0011\u0010ÿ\u0001\u001a\u00030\u0080\u00012\u0007\u0010\u0080\u0002\u001a\u00020\tJ\u0012\u0010\u0081\u0002\u001a\u00030\u0080\u00012\u0006\u0010|\u001a\u00020{H\u0002J\u0013\u0010\u0082\u0002\u001a\u00030\u0080\u00012\t\u0010\u0083\u0002\u001a\u0004\u0018\u00010YJ\u0011\u0010\u0084\u0002\u001a\u00030\u0080\u00012\u0007\u0010\u0085\u0002\u001a\u00020\tJ\u0013\u0010\u0086\u0002\u001a\u00030\u0080\u00012\t\u0010\u0087\u0002\u001a\u0004\u0018\u00010\\J\u001d\u0010\u0088\u0002\u001a\u00030\u0080\u00012\b\u0010\u0089\u0002\u001a\u00030\u008a\u00022\u0007\u0010\u008d\u0001\u001a\u00020\tH\u0004R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0013R\u0014\u0010\u001b\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0013R\"\u0010\u001d\u001a\u0004\u0018\u00010\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\u001f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b \u0010\u0013R\u0014\u0010!\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0013R\u001a\u0010#\u001a\u00020$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010%\"\u0004\b&\u0010'R\u001a\u0010(\u001a\u00020$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010%\"\u0004\b)\u0010'R\u001e\u0010*\u001a\u00020$2\u0006\u0010\u0014\u001a\u00020$@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b*\u0010%R\u001e\u0010+\u001a\u00020$2\u0006\u0010\u0014\u001a\u00020$@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b+\u0010%R\u001a\u0010,\u001a\u00020$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010%\"\u0004\b-\u0010'R\u001a\u0010.\u001a\u00020$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010%\"\u0004\b/\u0010'R\u0011\u00100\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b1\u0010\u0013R\u0011\u00102\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b3\u0010\u0013R\u001c\u00104\u001a\u0004\u0018\u000105X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0010\u0010:\u001a\u0004\u0018\u00010;X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010<\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\f\"\u0004\b>\u0010\u0007R\u000e\u0010?\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010@\u001a\u0004\u0018\u00010AX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020GX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010J\u001a\u0004\u0018\u00010K8\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R\u001a\u0010L\u001a\u00020\tX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\u0013\"\u0004\bN\u0010OR\u000e\u0010P\u001a\u00020QX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010U\u001a\u0004\u0018\u00010VX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010W\u001a\u00020;X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010X\u001a\u0004\u0018\u00010YX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010Z\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010[\u001a\u0004\u0018\u00010\\X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010]\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010^X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u001c\u0010c\u001a\u0004\u0018\u00010dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\u001c\u0010i\u001a\u0004\u0018\u00010jX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\u001c\u0010o\u001a\u0004\u0018\u00010pX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR\u001c\u0010u\u001a\u0004\u0018\u00010vX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR\"\u0010|\u001a\u0004\u0018\u00010{2\b\u0010\u0014\u001a\u0004\u0018\u00010{@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\b}\u0010~¨\u0006\u0094\u0002"}, d2 = {"Lcom/glority/android/adapterhelper/BaseQuickAdapter;", ExifInterface.GPS_DIRECTION_TRUE, "K", "Lcom/glority/android/adapterhelper/BaseViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "data", "", "(Ljava/util/List;)V", "layoutResId", "", "(ILjava/util/List;)V", "getData", "()Ljava/util/List;", "emptyView", "Landroid/view/View;", "getEmptyView", "()Landroid/view/View;", "emptyViewCount", "getEmptyViewCount", "()I", "<set-?>", "Landroid/widget/LinearLayout;", "footerLayout", "getFooterLayout", "()Landroid/widget/LinearLayout;", "footerLayoutCount", "getFooterLayoutCount", "footerViewPosition", "getFooterViewPosition", "headerLayout", "getHeaderLayout", "headerLayoutCount", "getHeaderLayoutCount", "headerViewPosition", "getHeaderViewPosition", "isFooterViewAsFlow", "", "()Z", "setFooterViewAsFlow", "(Z)V", "isHeaderViewAsFlow", "setHeaderViewAsFlow", "isLoadMoreEnable", "isLoading", "isUpFetchEnable", "setUpFetchEnable", "isUpFetching", "setUpFetching", "loadMoreViewCount", "getLoadMoreViewCount", "loadMoreViewPosition", "getLoadMoreViewPosition", "mContext", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "mCustomAnimation", "Lcom/glority/android/adapterhelper/animation/BaseAnimation;", "mData", "getMData", "setMData", "mDuration", "mEmptyLayout", "Landroid/widget/FrameLayout;", "mEnableLoadMoreEndClick", "mFirstOnlyEnable", "mFootAndEmptyEnable", "mHeadAndEmptyEnable", "mInterpolator", "Landroid/view/animation/Interpolator;", "mIsUseEmpty", "mLastPosition", "mLayoutInflater", "Landroid/view/LayoutInflater;", "mLayoutResId", "getMLayoutResId", "setMLayoutResId", "(I)V", "mLoadMoreView", "Lcom/glority/android/adapterhelper/loadmore/LoadMoreView;", "mNextLoadEnable", "mOpenAnimationEnable", "mPreLoadNumber", "mRequestLoadMoreListener", "Lcom/glority/android/adapterhelper/BaseQuickAdapter$RequestLoadMoreListener;", "mSelectAnimation", "mSpanSizeLookup", "Lcom/glority/android/adapterhelper/BaseQuickAdapter$SpanSizeLookup;", "mStartUpFetchPosition", "mUpFetchListener", "Lcom/glority/android/adapterhelper/BaseQuickAdapter$UpFetchListener;", "multiTypeDelegate", "Lcom/glority/android/adapterhelper/util/MultiTypeDelegate;", "getMultiTypeDelegate", "()Lcom/glority/android/adapterhelper/util/MultiTypeDelegate;", "setMultiTypeDelegate", "(Lcom/glority/android/adapterhelper/util/MultiTypeDelegate;)V", "onItemChildClickListener", "Lcom/glority/android/adapterhelper/BaseQuickAdapter$OnItemChildClickListener;", "getOnItemChildClickListener", "()Lcom/glority/android/adapterhelper/BaseQuickAdapter$OnItemChildClickListener;", "setOnItemChildClickListener", "(Lcom/glority/android/adapterhelper/BaseQuickAdapter$OnItemChildClickListener;)V", "onItemChildLongClickListener", "Lcom/glority/android/adapterhelper/BaseQuickAdapter$OnItemChildLongClickListener;", "getOnItemChildLongClickListener", "()Lcom/glority/android/adapterhelper/BaseQuickAdapter$OnItemChildLongClickListener;", "setOnItemChildLongClickListener", "(Lcom/glority/android/adapterhelper/BaseQuickAdapter$OnItemChildLongClickListener;)V", "onItemClickListener", "Lcom/glority/android/adapterhelper/BaseQuickAdapter$OnItemClickListener;", "getOnItemClickListener", "()Lcom/glority/android/adapterhelper/BaseQuickAdapter$OnItemClickListener;", "setOnItemClickListener", "(Lcom/glority/android/adapterhelper/BaseQuickAdapter$OnItemClickListener;)V", "onItemLongClickListener", "Lcom/glority/android/adapterhelper/BaseQuickAdapter$OnItemLongClickListener;", "getOnItemLongClickListener", "()Lcom/glority/android/adapterhelper/BaseQuickAdapter$OnItemLongClickListener;", "setOnItemLongClickListener", "(Lcom/glority/android/adapterhelper/BaseQuickAdapter$OnItemLongClickListener;)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "add", "", "position", "item", "(ILjava/lang/Object;)V", "addAnimation", "holder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "addData", "(Ljava/lang/Object;)V", "newData", "", "addFooterView", "footer", "index", "orientation", "addHeaderView", "header", "assertMDataIsMutable", "", "autoLoadMore", "autoUpFetch", "positions", "bindToRecyclerView", "bindViewClickListener", "baseViewHolder", "checkNotNull", "closeLoadAnimation", "compatibilityDataSizeChanged", LogEventArguments.ARG_SIZE, "convert", "helper", "(Lcom/glority/android/adapterhelper/BaseViewHolder;Ljava/lang/Object;)V", "convertPayloads", "payloads", "", "(Lcom/glority/android/adapterhelper/BaseViewHolder;Ljava/lang/Object;Ljava/util/List;)V", "createBaseViewHolder", "view", "(Landroid/view/View;)Lcom/glority/android/adapterhelper/BaseViewHolder;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;I)Lcom/glority/android/adapterhelper/BaseViewHolder;", "createGenericKInstance", "z", "Ljava/lang/Class;", "(Ljava/lang/Class;Landroid/view/View;)Lcom/glority/android/adapterhelper/BaseViewHolder;", "enableLoadMoreEndClick", "enable", "getDefItemViewType", "getInstancedGenericKClass", "getItem", "(I)Ljava/lang/Object;", "getItemCount", "getItemId", "", "getItemPosition", "(Ljava/lang/Object;)I", "getItemView", "getItemViewType", "getLoadingView", "(Landroid/view/ViewGroup;)Lcom/glority/android/adapterhelper/BaseViewHolder;", "getViewByPosition", "viewId", "isFirstOnly", "firstOnly", "isFixedViewType", "type", "isUseEmpty", "loadMoreComplete", "loadMoreEnd", "gone", "loadMoreFail", "notifyLoadMoreToLoading", "onAttachedToRecyclerView", "onBindViewHolder", "(Lcom/glority/android/adapterhelper/BaseViewHolder;I)V", "(Lcom/glority/android/adapterhelper/BaseViewHolder;ILjava/util/List;)V", "onCreateDefViewHolder", "viewType", "onCreateViewHolder", "onViewAttachedToWindow", "(Lcom/glority/android/adapterhelper/BaseViewHolder;)V", "openLoadAnimation", "animation", "animationType", "openLoadMore", "requestLoadMoreListener", "refreshNotifyItemChanged", "remove", "removeAllFooterView", "removeAllHeaderView", "removeFooterView", "removeHeaderView", "replaceData", "setData", "setDuration", TypedValues.TransitionType.S_DURATION, "setEmptyView", "viewGroup", "setEnableLoadMore", "setFooterView", "setFullSpan", "setHeaderAndEmpty", "isHeadAndEmpty", "setHeaderFooterEmpty", "isFootAndEmpty", "setHeaderView", "setLoadMoreView", "loadingView", "setNewData", "setNewDiffData", "diffResult", "Landroidx/recyclerview/widget/DiffUtil$DiffResult;", "baseQuickDiffCallback", "Lcom/glority/android/adapterhelper/diff/BaseQuickDiffCallback;", "detectMoves", "setNotDoAnimationCount", "count", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "adapter", "setOnItemClick", "v", "setOnItemLongClick", "setOnLoadMoreListener", "setPreLoadNumber", "preLoadNumber", "setRecyclerView", "setSpanSizeLookup", "spanSizeLookup", "setStartUpFetchPosition", "startUpFetchPosition", "setUpFetchListener", "upFetchListener", "startAnim", "anim", "Landroid/animation/Animator;", "AnimationType", "Companion", "OnItemChildClickListener", "OnItemChildLongClickListener", "OnItemClickListener", "OnItemLongClickListener", "RequestLoadMoreListener", "SpanSizeLookup", "UpFetchListener", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public abstract class BaseQuickAdapter<T, K extends BaseViewHolder> extends RecyclerView.Adapter<K> {
    public static final int ALPHA = 1;
    public static final int EMPTY_VIEW = 1365;
    public static final int FOOTER_VIEW = 819;
    public static final int HEADER_VIEW = 273;
    public static final int LOADING_VIEW = 546;
    public static final int SCALING = 2;
    public static final int SLIDING_BOTTOM = 3;
    public static final int SLIDING_LEFT = 4;
    public static final int SLIDING_RIGHT = 5;
    private LinearLayout footerLayout;
    private LinearLayout headerLayout;
    private boolean isFooterViewAsFlow;
    private boolean isHeaderViewAsFlow;
    private boolean isLoadMoreEnable;
    private boolean isLoading;
    private boolean isUpFetchEnable;
    private boolean isUpFetching;
    private Context mContext;
    private BaseAnimation mCustomAnimation;
    private List<? extends T> mData;
    private int mDuration;
    private FrameLayout mEmptyLayout;
    private boolean mEnableLoadMoreEndClick;
    private boolean mFirstOnlyEnable;
    private boolean mFootAndEmptyEnable;
    private boolean mHeadAndEmptyEnable;
    private final Interpolator mInterpolator;
    private boolean mIsUseEmpty;
    private int mLastPosition;
    protected LayoutInflater mLayoutInflater;
    private int mLayoutResId;
    private LoadMoreView mLoadMoreView;
    private boolean mNextLoadEnable;
    private boolean mOpenAnimationEnable;
    private int mPreLoadNumber;
    private RequestLoadMoreListener mRequestLoadMoreListener;
    private BaseAnimation mSelectAnimation;
    private SpanSizeLookup mSpanSizeLookup;
    private int mStartUpFetchPosition;
    private UpFetchListener mUpFetchListener;
    private MultiTypeDelegate<T> multiTypeDelegate;
    private OnItemChildClickListener onItemChildClickListener;
    private OnItemChildLongClickListener onItemChildLongClickListener;
    private OnItemClickListener onItemClickListener;
    private OnItemLongClickListener onItemLongClickListener;
    private RecyclerView recyclerView;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "BaseQuickAdapter";

    /* compiled from: BaseQuickAdapter.kt */
    @Retention(RetentionPolicy.SOURCE)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/glority/android/adapterhelper/BaseQuickAdapter$AnimationType;", "", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes.dex */
    public @interface AnimationType {
    }

    /* compiled from: BaseQuickAdapter.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/glority/android/adapterhelper/BaseQuickAdapter$OnItemChildClickListener;", "", "onItemChildClick", "", "adapter", "Lcom/glority/android/adapterhelper/BaseQuickAdapter;", "view", "Landroid/view/View;", "position", "", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes.dex */
    public interface OnItemChildClickListener {
        void onItemChildClick(BaseQuickAdapter<?, ?> adapter, View view, int position);
    }

    /* compiled from: BaseQuickAdapter.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\u0010\u0010\u0004\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/glority/android/adapterhelper/BaseQuickAdapter$OnItemChildLongClickListener;", "", "onItemChildLongClick", "", "adapter", "Lcom/glority/android/adapterhelper/BaseQuickAdapter;", "view", "Landroid/view/View;", "position", "", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes.dex */
    public interface OnItemChildLongClickListener {
        boolean onItemChildLongClick(BaseQuickAdapter<?, ?> adapter, View view, int position);
    }

    /* compiled from: BaseQuickAdapter.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/glority/android/adapterhelper/BaseQuickAdapter$OnItemClickListener;", "", "onItemClick", "", "adapter", "Lcom/glority/android/adapterhelper/BaseQuickAdapter;", "view", "Landroid/view/View;", "position", "", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes.dex */
    public interface OnItemClickListener {
        void onItemClick(BaseQuickAdapter<?, ?> adapter, View view, int position);
    }

    /* compiled from: BaseQuickAdapter.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\u0010\u0010\u0004\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/glority/android/adapterhelper/BaseQuickAdapter$OnItemLongClickListener;", "", "onItemLongClick", "", "adapter", "Lcom/glority/android/adapterhelper/BaseQuickAdapter;", "view", "Landroid/view/View;", "position", "", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes.dex */
    public interface OnItemLongClickListener {
        boolean onItemLongClick(BaseQuickAdapter<?, ?> adapter, View view, int position);
    }

    /* compiled from: BaseQuickAdapter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/glority/android/adapterhelper/BaseQuickAdapter$RequestLoadMoreListener;", "", "onLoadMoreRequested", "", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes.dex */
    public interface RequestLoadMoreListener {
        void onLoadMoreRequested();
    }

    /* compiled from: BaseQuickAdapter.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/glority/android/adapterhelper/BaseQuickAdapter$SpanSizeLookup;", "", "getSpanSize", "", "gridLayoutManager", "Landroidx/recyclerview/widget/GridLayoutManager;", "position", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes.dex */
    public interface SpanSizeLookup {
        int getSpanSize(GridLayoutManager gridLayoutManager, int position);
    }

    /* compiled from: BaseQuickAdapter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/glority/android/adapterhelper/BaseQuickAdapter$UpFetchListener;", "", "onUpFetch", "", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes.dex */
    public interface UpFetchListener {
        void onUpFetch();
    }

    public BaseQuickAdapter(int i) {
        this(i, null, 2, 0 == true ? 1 : 0);
    }

    public final int addFooterView(View footer) {
        Intrinsics.checkNotNullParameter(footer, "footer");
        return addFooterView$default(this, footer, 0, 0, 6, null);
    }

    public final int addFooterView(View footer, int i) {
        Intrinsics.checkNotNullParameter(footer, "footer");
        return addFooterView$default(this, footer, i, 0, 4, null);
    }

    public final int addHeaderView(View header) {
        Intrinsics.checkNotNullParameter(header, "header");
        return addHeaderView$default(this, header, 0, 0, 6, null);
    }

    public final int addHeaderView(View header, int i) {
        Intrinsics.checkNotNullParameter(header, "header");
        return addHeaderView$default(this, header, i, 0, 4, null);
    }

    protected abstract void convert(K helper, T item);

    protected void convertPayloads(K helper, T item, List<Object> payloads) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int position) {
        return position;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean isFixedViewType(int type) {
        return type == 1365 || type == 273 || type == 819 || type == 546;
    }

    public final void loadMoreEnd() {
        loadMoreEnd$default(this, false, 1, null);
    }

    public /* synthetic */ BaseQuickAdapter(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        onBindViewHolder((BaseQuickAdapter<T, K>) viewHolder, i, (List<Object>) list);
    }

    public BaseQuickAdapter(int i, ArrayList arrayList) {
        this.mLoadMoreView = new SimpleLoadMoreView();
        this.mFirstOnlyEnable = true;
        this.mInterpolator = new LinearInterpolator();
        this.mDuration = 300;
        this.mLastPosition = -1;
        this.mSelectAnimation = new AlphaInAnimation(0.0f, 1, null);
        this.mIsUseEmpty = true;
        this.mPreLoadNumber = 1;
        this.mStartUpFetchPosition = 1;
        this.mData = arrayList == null ? new ArrayList() : arrayList;
        if (i != 0) {
            this.mLayoutResId = i;
        }
    }

    /* renamed from: isLoadMoreEnable, reason: from getter */
    public final boolean getIsLoadMoreEnable() {
        return this.isLoadMoreEnable;
    }

    /* renamed from: isLoading, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final OnItemClickListener getOnItemClickListener() {
        return this.onItemClickListener;
    }

    public final void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public final OnItemLongClickListener getOnItemLongClickListener() {
        return this.onItemLongClickListener;
    }

    public final void setOnItemLongClickListener(OnItemLongClickListener onItemLongClickListener) {
        this.onItemLongClickListener = onItemLongClickListener;
    }

    public final OnItemChildClickListener getOnItemChildClickListener() {
        return this.onItemChildClickListener;
    }

    public final void setOnItemChildClickListener(OnItemChildClickListener onItemChildClickListener) {
        this.onItemChildClickListener = onItemChildClickListener;
    }

    public final OnItemChildLongClickListener getOnItemChildLongClickListener() {
        return this.onItemChildLongClickListener;
    }

    public final void setOnItemChildLongClickListener(OnItemChildLongClickListener onItemChildLongClickListener) {
        this.onItemChildLongClickListener = onItemChildLongClickListener;
    }

    public final LinearLayout getHeaderLayout() {
        return this.headerLayout;
    }

    public final LinearLayout getFooterLayout() {
        return this.footerLayout;
    }

    protected final Context getMContext() {
        return this.mContext;
    }

    protected final void setMContext(Context context) {
        this.mContext = context;
    }

    protected final int getMLayoutResId() {
        return this.mLayoutResId;
    }

    protected final void setMLayoutResId(int i) {
        this.mLayoutResId = i;
    }

    public final List<T> getMData() {
        return this.mData;
    }

    public final void setMData(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.mData = list;
    }

    /* renamed from: isUpFetchEnable, reason: from getter */
    public final boolean getIsUpFetchEnable() {
        return this.isUpFetchEnable;
    }

    public final void setUpFetchEnable(boolean z) {
        this.isUpFetchEnable = z;
    }

    /* renamed from: isUpFetching, reason: from getter */
    public final boolean getIsUpFetching() {
        return this.isUpFetching;
    }

    public final void setUpFetching(boolean z) {
        this.isUpFetching = z;
    }

    protected final RecyclerView getRecyclerView() {
        return this.recyclerView;
    }

    /* renamed from: isHeaderViewAsFlow, reason: from getter */
    public final boolean getIsHeaderViewAsFlow() {
        return this.isHeaderViewAsFlow;
    }

    public final void setHeaderViewAsFlow(boolean z) {
        this.isHeaderViewAsFlow = z;
    }

    /* renamed from: isFooterViewAsFlow, reason: from getter */
    public final boolean getIsFooterViewAsFlow() {
        return this.isFooterViewAsFlow;
    }

    public final void setFooterViewAsFlow(boolean z) {
        this.isFooterViewAsFlow = z;
    }

    private final void setRecyclerView(RecyclerView recyclerView) {
        this.recyclerView = recyclerView;
    }

    private final void checkNotNull() {
        if (this.recyclerView == null) {
            throw new IllegalStateException("please bind recyclerView first!".toString());
        }
    }

    public final void setOnItemChildClickListener(final Function3<? super BaseQuickAdapter<?, ?>, ? super View, ? super Integer, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onItemChildClickListener = new OnItemChildClickListener() { // from class: com.glority.android.adapterhelper.BaseQuickAdapter$setOnItemChildClickListener$1
            @Override // com.glority.android.adapterhelper.BaseQuickAdapter.OnItemChildClickListener
            public void onItemChildClick(BaseQuickAdapter<?, ?> adapter, View view, int position) {
                Intrinsics.checkNotNullParameter(adapter, "adapter");
                Intrinsics.checkNotNullParameter(view, "view");
                listener.invoke(adapter, view, Integer.valueOf(position));
            }
        };
    }

    public final void setOnItemClickListener(final Function3<? super BaseQuickAdapter<?, ?>, ? super View, ? super Integer, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onItemClickListener = new OnItemClickListener() { // from class: com.glority.android.adapterhelper.BaseQuickAdapter$setOnItemClickListener$1
            @Override // com.glority.android.adapterhelper.BaseQuickAdapter.OnItemClickListener
            public void onItemClick(BaseQuickAdapter<?, ?> adapter, View view, int position) {
                Intrinsics.checkNotNullParameter(adapter, "adapter");
                Intrinsics.checkNotNullParameter(view, "view");
                listener.invoke(adapter, view, Integer.valueOf(position));
            }
        };
    }

    public final void bindToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (!(this.recyclerView == null)) {
            throw new IllegalStateException("Don't bind twice".toString());
        }
        setRecyclerView(recyclerView);
        recyclerView.setAdapter(this);
    }

    private final void openLoadMore(RequestLoadMoreListener requestLoadMoreListener) {
        this.mRequestLoadMoreListener = requestLoadMoreListener;
        this.mNextLoadEnable = true;
        this.isLoadMoreEnable = true;
        this.isLoading = false;
    }

    public final void setOnLoadMoreListener(RecyclerView recyclerView, RequestLoadMoreListener requestLoadMoreListener) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(requestLoadMoreListener, "requestLoadMoreListener");
        openLoadMore(requestLoadMoreListener);
        if (this.recyclerView == null) {
            setRecyclerView(recyclerView);
        }
    }

    public final void setStartUpFetchPosition(int startUpFetchPosition) {
        this.mStartUpFetchPosition = startUpFetchPosition;
    }

    private final void autoUpFetch(int positions) {
        UpFetchListener upFetchListener;
        if (!this.isUpFetchEnable || this.isUpFetching || positions > this.mStartUpFetchPosition || (upFetchListener = this.mUpFetchListener) == null) {
            return;
        }
        Intrinsics.checkNotNull(upFetchListener);
        upFetchListener.onUpFetch();
    }

    public final void setUpFetchListener(UpFetchListener upFetchListener) {
        this.mUpFetchListener = upFetchListener;
    }

    public final void setNotDoAnimationCount(int count) {
        this.mLastPosition = count;
    }

    public final void setLoadMoreView(LoadMoreView loadingView) {
        Intrinsics.checkNotNullParameter(loadingView, "loadingView");
        this.mLoadMoreView = loadingView;
    }

    public final int getLoadMoreViewCount() {
        if (this.mRequestLoadMoreListener == null || !this.isLoadMoreEnable) {
            return 0;
        }
        return ((this.mNextLoadEnable || !this.mLoadMoreView.isLoadEndMoreGone()) && this.mData.size() != 0) ? 1 : 0;
    }

    public final int getLoadMoreViewPosition() {
        return getHeaderLayoutCount() + this.mData.size() + getFooterLayoutCount();
    }

    public static /* synthetic */ void loadMoreEnd$default(BaseQuickAdapter baseQuickAdapter, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadMoreEnd");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        baseQuickAdapter.loadMoreEnd(z);
    }

    public final void loadMoreEnd(boolean gone) {
        if (getLoadMoreViewCount() == 0) {
            return;
        }
        this.isLoading = false;
        this.mNextLoadEnable = false;
        this.mLoadMoreView.setLoadEndMoreGone(gone);
        if (gone) {
            notifyItemRemoved(getLoadMoreViewPosition());
        } else {
            this.mLoadMoreView.setLoadMoreStatus(4);
            notifyItemChanged(getLoadMoreViewPosition());
        }
    }

    public final void loadMoreComplete() {
        if (getLoadMoreViewCount() == 0) {
            return;
        }
        this.isLoading = false;
        this.mNextLoadEnable = true;
        this.mLoadMoreView.setLoadMoreStatus(1);
        notifyItemChanged(getLoadMoreViewPosition());
    }

    public final void loadMoreFail() {
        if (getLoadMoreViewCount() == 0) {
            return;
        }
        this.isLoading = false;
        this.mLoadMoreView.setLoadMoreStatus(3);
        notifyItemChanged(getLoadMoreViewPosition());
    }

    public final void setEnableLoadMore(boolean enable) {
        int loadMoreViewCount = getLoadMoreViewCount();
        this.isLoadMoreEnable = enable;
        int loadMoreViewCount2 = getLoadMoreViewCount();
        if (loadMoreViewCount == 1) {
            if (loadMoreViewCount2 == 0) {
                notifyItemRemoved(getLoadMoreViewPosition());
            }
        } else if (loadMoreViewCount2 == 1) {
            this.mLoadMoreView.setLoadMoreStatus(1);
            notifyItemInserted(getLoadMoreViewPosition());
        }
    }

    public final void setDuration(int duration) {
        this.mDuration = duration;
    }

    public final void refreshNotifyItemChanged(int position) {
        notifyItemChanged(position + getHeaderLayoutCount());
    }

    public BaseQuickAdapter(List<? extends T> list) {
        this(0, list);
    }

    public void setNewData(List<? extends T> data) {
        if (data == null) {
            data = new ArrayList();
        }
        this.mData = data;
        if (this.mRequestLoadMoreListener != null) {
            this.mNextLoadEnable = true;
            this.isLoadMoreEnable = true;
            this.isLoading = false;
            this.mLoadMoreView.setLoadMoreStatus(1);
        }
        this.mLastPosition = -1;
        notifyDataSetChanged();
    }

    public void setNewDiffData(BaseQuickDiffCallback<T> baseQuickDiffCallback) {
        Intrinsics.checkNotNullParameter(baseQuickDiffCallback, "baseQuickDiffCallback");
        setNewDiffData((BaseQuickDiffCallback) baseQuickDiffCallback, false);
    }

    public void setNewDiffData(BaseQuickDiffCallback<T> baseQuickDiffCallback, boolean detectMoves) {
        Intrinsics.checkNotNullParameter(baseQuickDiffCallback, "baseQuickDiffCallback");
        if (getEmptyViewCount() == 1) {
            setNewData(baseQuickDiffCallback.getNewList());
            return;
        }
        baseQuickDiffCallback.setOldList(getData());
        DiffUtil.DiffResult calculateDiff = DiffUtil.calculateDiff(baseQuickDiffCallback, detectMoves);
        Intrinsics.checkNotNullExpressionValue(calculateDiff, "calculateDiff(baseQuickDiffCallback, detectMoves)");
        calculateDiff.dispatchUpdatesTo(new BaseQuickAdapterListUpdateCallback(this));
        this.mData = baseQuickDiffCallback.getNewList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setNewDiffData(DiffUtil.DiffResult diffResult, List<T> newData) {
        Intrinsics.checkNotNullParameter(diffResult, "diffResult");
        Intrinsics.checkNotNullParameter(newData, "newData");
        if (getEmptyViewCount() == 1) {
            setNewData(newData);
        } else {
            diffResult.dispatchUpdatesTo(new BaseQuickAdapterListUpdateCallback(this));
            this.mData = newData;
        }
    }

    @Deprecated(message = "use {@link #addData(int, Object)} instead")
    public final void add(int position, T item) {
        addData(position, (int) item);
    }

    public final void addData(int position, T data) {
        assertMDataIsMutable().add(position, data);
        notifyItemInserted(position + getHeaderLayoutCount());
        compatibilityDataSizeChanged(1);
    }

    public final void addData(T data) {
        assertMDataIsMutable().add(data);
        notifyItemInserted(this.mData.size() + getHeaderLayoutCount());
        compatibilityDataSizeChanged(1);
    }

    public void remove(int position) {
        assertMDataIsMutable().remove(position);
        int headerLayoutCount = position + getHeaderLayoutCount();
        notifyItemRemoved(headerLayoutCount);
        compatibilityDataSizeChanged(0);
        notifyItemRangeChanged(headerLayoutCount, this.mData.size() - headerLayoutCount);
    }

    public final void setData(int index, T data) {
        assertMDataIsMutable().set(index, data);
        notifyItemChanged(index + getHeaderLayoutCount());
    }

    public final void addData(int position, List<? extends T> newData) {
        Intrinsics.checkNotNullParameter(newData, "newData");
        assertMDataIsMutable().addAll(position, newData);
        notifyItemRangeInserted(position + getHeaderLayoutCount(), newData.size());
        compatibilityDataSizeChanged(newData.size());
    }

    public final void addData(Collection<? extends T> newData) {
        Intrinsics.checkNotNullParameter(newData, "newData");
        assertMDataIsMutable().addAll(newData);
        notifyItemRangeInserted((this.mData.size() - newData.size()) + getHeaderLayoutCount(), newData.size());
        compatibilityDataSizeChanged(newData.size());
    }

    public final void replaceData(Collection<? extends T> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (data != this.mData) {
            assertMDataIsMutable().clear();
            assertMDataIsMutable().addAll(data);
        }
        notifyDataSetChanged();
    }

    private final void compatibilityDataSizeChanged(int size) {
        if (this.mData.size() == size) {
            notifyDataSetChanged();
        }
    }

    public final List<T> getData() {
        return this.mData;
    }

    public final T getItem(int position) {
        if (position < 0 || position >= this.mData.size()) {
            return null;
        }
        return this.mData.get(position);
    }

    public final int getHeaderLayoutCount() {
        LinearLayout linearLayout = this.headerLayout;
        if (linearLayout != null) {
            Intrinsics.checkNotNull(linearLayout);
            if (linearLayout.getChildCount() != 0) {
                return 1;
            }
        }
        return 0;
    }

    public final int getFooterLayoutCount() {
        LinearLayout linearLayout = this.footerLayout;
        if (linearLayout != null) {
            Intrinsics.checkNotNull(linearLayout);
            if (linearLayout.getChildCount() != 0) {
                return 1;
            }
        }
        return 0;
    }

    public final int getEmptyViewCount() {
        FrameLayout frameLayout = this.mEmptyLayout;
        if (frameLayout == null) {
            return 0;
        }
        Intrinsics.checkNotNull(frameLayout);
        return (frameLayout.getChildCount() != 0 && this.mIsUseEmpty && this.mData.size() == 0) ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        int i = 1;
        if (1 != getEmptyViewCount()) {
            return getLoadMoreViewCount() + getHeaderLayoutCount() + this.mData.size() + getFooterLayoutCount();
        }
        if (this.mHeadAndEmptyEnable && getHeaderLayoutCount() != 0) {
            i = 2;
        }
        return (!this.mFootAndEmptyEnable || getFooterLayoutCount() == 0) ? i : i + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        if (getEmptyViewCount() == 1) {
            boolean z = this.mHeadAndEmptyEnable && getHeaderLayoutCount() != 0;
            if (position != 0) {
                return position != 1 ? FOOTER_VIEW : FOOTER_VIEW;
            }
            if (z) {
                return HEADER_VIEW;
            }
            return EMPTY_VIEW;
        }
        int headerLayoutCount = getHeaderLayoutCount();
        if (position < headerLayoutCount) {
            return HEADER_VIEW;
        }
        int i = position - headerLayoutCount;
        int size = this.mData.size();
        if (i < size) {
            return getDefItemViewType(i);
        }
        return i - size < getFooterLayoutCount() ? FOOTER_VIEW : LOADING_VIEW;
    }

    public int getDefItemViewType(int position) {
        MultiTypeDelegate<T> multiTypeDelegate = this.multiTypeDelegate;
        if (multiTypeDelegate != null) {
            Intrinsics.checkNotNull(multiTypeDelegate);
            return multiTypeDelegate.getDefItemViewType(this.mData, position);
        }
        return super.getItemViewType(position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public K onCreateViewHolder(ViewGroup parent, int viewType) {
        K createBaseViewHolder;
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        this.mContext = context;
        this.mLayoutInflater = LayoutInflater.from(context);
        if (viewType == 273) {
            LinearLayout linearLayout = this.headerLayout;
            Intrinsics.checkNotNull(linearLayout);
            createBaseViewHolder = createBaseViewHolder(linearLayout);
        } else if (viewType == 546) {
            createBaseViewHolder = getLoadingView(parent);
        } else if (viewType == 819) {
            LinearLayout linearLayout2 = this.footerLayout;
            Intrinsics.checkNotNull(linearLayout2);
            createBaseViewHolder = createBaseViewHolder(linearLayout2);
        } else if (viewType == 1365) {
            FrameLayout frameLayout = this.mEmptyLayout;
            Intrinsics.checkNotNull(frameLayout);
            createBaseViewHolder = createBaseViewHolder(frameLayout);
        } else {
            createBaseViewHolder = onCreateDefViewHolder(parent, viewType);
            bindViewClickListener(createBaseViewHolder);
        }
        if (createBaseViewHolder != null) {
            createBaseViewHolder.setAdapter(this);
        }
        return createBaseViewHolder;
    }

    private final K getLoadingView(ViewGroup parent) {
        View view;
        K createBaseViewHolder = createBaseViewHolder(getItemView(this.mLoadMoreView.getLayoutId(), parent));
        if (createBaseViewHolder != null && (view = createBaseViewHolder.itemView) != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.adapterhelper.BaseQuickAdapter$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    BaseQuickAdapter.m7691getLoadingView$lambda2(BaseQuickAdapter.this, view2);
                }
            });
        }
        return createBaseViewHolder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getLoadingView$lambda-2, reason: not valid java name */
    public static final void m7691getLoadingView$lambda2(BaseQuickAdapter this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.mLoadMoreView.getLoadMoreStatus() == 3) {
            this$0.notifyLoadMoreToLoading();
        }
        if (this$0.mEnableLoadMoreEndClick && this$0.mLoadMoreView.getLoadMoreStatus() == 4) {
            this$0.notifyLoadMoreToLoading();
        }
    }

    public final void notifyLoadMoreToLoading() {
        if (this.mLoadMoreView.getLoadMoreStatus() == 2) {
            return;
        }
        this.mLoadMoreView.setLoadMoreStatus(1);
        notifyItemChanged(getLoadMoreViewPosition());
    }

    public final void enableLoadMoreEndClick(boolean enable) {
        this.mEnableLoadMoreEndClick = enable;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(K holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        K k = holder;
        super.onViewAttachedToWindow((BaseQuickAdapter<T, K>) k);
        int itemViewType = holder.getItemViewType();
        if (itemViewType == 273 || itemViewType == 546 || itemViewType == 819 || itemViewType == 1365) {
            setFullSpan(k);
        } else {
            addAnimation(k);
        }
    }

    protected final void setFullSpan(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder.itemView.getLayoutParams() instanceof StaggeredGridLayoutManager.LayoutParams) {
            ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams");
            }
            ((StaggeredGridLayoutManager.LayoutParams) layoutParams).setFullSpan(true);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        final RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            ((GridLayoutManager) layoutManager).setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup(this) { // from class: com.glority.android.adapterhelper.BaseQuickAdapter$onAttachedToRecyclerView$1
                final /* synthetic */ BaseQuickAdapter<T, K> this$0;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.this$0 = this;
                }

                @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
                public int getSpanSize(int position) {
                    BaseQuickAdapter.SpanSizeLookup spanSizeLookup;
                    BaseQuickAdapter.SpanSizeLookup spanSizeLookup2;
                    int itemViewType = this.this$0.getItemViewType(position);
                    if (itemViewType == 273 && this.this$0.getIsHeaderViewAsFlow()) {
                        return 1;
                    }
                    if (itemViewType == 819 && this.this$0.getIsFooterViewAsFlow()) {
                        return 1;
                    }
                    spanSizeLookup = ((BaseQuickAdapter) this.this$0).mSpanSizeLookup;
                    if (spanSizeLookup == null) {
                        if (this.this$0.isFixedViewType(itemViewType)) {
                            return ((GridLayoutManager) layoutManager).getSpanCount();
                        }
                        return 1;
                    }
                    if (this.this$0.isFixedViewType(itemViewType)) {
                        return ((GridLayoutManager) layoutManager).getSpanCount();
                    }
                    spanSizeLookup2 = ((BaseQuickAdapter) this.this$0).mSpanSizeLookup;
                    Intrinsics.checkNotNull(spanSizeLookup2);
                    return spanSizeLookup2.getSpanSize((GridLayoutManager) layoutManager, position - this.this$0.getHeaderLayoutCount());
                }
            });
        }
    }

    public final void setSpanSizeLookup(SpanSizeLookup spanSizeLookup) {
        this.mSpanSizeLookup = spanSizeLookup;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(K holder, int position) {
        T item;
        Intrinsics.checkNotNullParameter(holder, "holder");
        autoUpFetch(position);
        autoLoadMore(position);
        int itemViewType = holder.getItemViewType();
        if (itemViewType == 0) {
            T item2 = getItem(position - getHeaderLayoutCount());
            if (item2 == null) {
                return;
            }
            convert(holder, item2);
            return;
        }
        if (itemViewType != 273) {
            if (itemViewType == 546) {
                this.mLoadMoreView.convert(holder);
            } else {
                if (itemViewType == 819 || itemViewType == 1365 || (item = getItem(position - getHeaderLayoutCount())) == null) {
                    return;
                }
                convert(holder, item);
            }
        }
    }

    public void onBindViewHolder(K holder, int position, List<Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        if (payloads.isEmpty()) {
            onBindViewHolder((BaseQuickAdapter<T, K>) holder, position);
            return;
        }
        autoUpFetch(position);
        autoLoadMore(position);
        int itemViewType = holder.getItemViewType();
        if (itemViewType == 0) {
            convertPayloads(holder, getItem(position - getHeaderLayoutCount()), payloads);
            return;
        }
        if (itemViewType != 273) {
            if (itemViewType == 546) {
                this.mLoadMoreView.convert(holder);
            } else {
                if (itemViewType == 819 || itemViewType == 1365) {
                    return;
                }
                convertPayloads(holder, getItem(position - getHeaderLayoutCount()), payloads);
            }
        }
    }

    private final void bindViewClickListener(final BaseViewHolder baseViewHolder) {
        if (baseViewHolder == null) {
            return;
        }
        View view = baseViewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "baseViewHolder.itemView");
        if (this.onItemClickListener != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.adapterhelper.BaseQuickAdapter$$ExternalSyntheticLambda2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    BaseQuickAdapter.m7689bindViewClickListener$lambda5(BaseViewHolder.this, this, view2);
                }
            });
        }
        if (this.onItemLongClickListener != null) {
            view.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.glority.android.adapterhelper.BaseQuickAdapter$$ExternalSyntheticLambda3
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    boolean m7690bindViewClickListener$lambda6;
                    m7690bindViewClickListener$lambda6 = BaseQuickAdapter.m7690bindViewClickListener$lambda6(BaseViewHolder.this, this, view2);
                    return m7690bindViewClickListener$lambda6;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bindViewClickListener$lambda-5, reason: not valid java name */
    public static final void m7689bindViewClickListener$lambda5(BaseViewHolder baseViewHolder, BaseQuickAdapter this$0, View v) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int adapterPosition = baseViewHolder.getAdapterPosition();
        if (adapterPosition == -1) {
            return;
        }
        int headerLayoutCount = adapterPosition - this$0.getHeaderLayoutCount();
        Intrinsics.checkNotNullExpressionValue(v, "v");
        this$0.setOnItemClick(v, headerLayoutCount);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bindViewClickListener$lambda-6, reason: not valid java name */
    public static final boolean m7690bindViewClickListener$lambda6(BaseViewHolder baseViewHolder, BaseQuickAdapter this$0, View v) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int adapterPosition = baseViewHolder.getAdapterPosition();
        if (adapterPosition == -1) {
            return false;
        }
        int headerLayoutCount = adapterPosition - this$0.getHeaderLayoutCount();
        Intrinsics.checkNotNullExpressionValue(v, "v");
        return this$0.setOnItemLongClick(v, headerLayoutCount);
    }

    public final void setOnItemClick(View v, int position) {
        Intrinsics.checkNotNullParameter(v, "v");
        OnItemClickListener onItemClickListener = this.onItemClickListener;
        if (onItemClickListener == null) {
            return;
        }
        onItemClickListener.onItemClick(this, v, position);
    }

    public final boolean setOnItemLongClick(View v, int position) {
        Intrinsics.checkNotNullParameter(v, "v");
        OnItemLongClickListener onItemLongClickListener = this.onItemLongClickListener;
        Intrinsics.checkNotNull(onItemLongClickListener);
        return onItemLongClickListener.onItemLongClick(this, v, position);
    }

    public final MultiTypeDelegate<T> getMultiTypeDelegate() {
        return this.multiTypeDelegate;
    }

    public final void setMultiTypeDelegate(MultiTypeDelegate<T> multiTypeDelegate) {
        this.multiTypeDelegate = multiTypeDelegate;
    }

    protected K onCreateDefViewHolder(ViewGroup parent, int viewType) {
        int i = this.mLayoutResId;
        MultiTypeDelegate<T> multiTypeDelegate = this.multiTypeDelegate;
        if (multiTypeDelegate != null) {
            Intrinsics.checkNotNull(multiTypeDelegate);
            i = multiTypeDelegate.getLayoutId(viewType);
        }
        return createBaseViewHolder(parent, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public K createBaseViewHolder(ViewGroup parent, int layoutResId) {
        return createBaseViewHolder(getItemView(layoutResId, parent));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public K createBaseViewHolder(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Class<?> cls = null;
        for (Class<?> cls2 = getClass(); cls == null && cls2 != null; cls2 = cls2.getSuperclass()) {
            cls = getInstancedGenericKClass(cls2);
        }
        K createGenericKInstance = cls != null ? createGenericKInstance(cls, view) : null;
        return createGenericKInstance == null ? (K) new BaseViewHolder(view) : createGenericKInstance;
    }

    private final K createGenericKInstance(Class<?> z, View view) {
        try {
            if (z.isMemberClass() && !Modifier.isStatic(z.getModifiers())) {
                Constructor<?> declaredConstructor = z.getDeclaredConstructor(getClass(), View.class);
                Intrinsics.checkNotNullExpressionValue(declaredConstructor, "z.getDeclaredConstructor…aClass, View::class.java)");
                declaredConstructor.setAccessible(true);
                Object newInstance = declaredConstructor.newInstance(this, view);
                if (newInstance != null) {
                    return (K) newInstance;
                }
                throw new NullPointerException("null cannot be cast to non-null type K of com.glority.android.adapterhelper.BaseQuickAdapter");
            }
            Constructor<?> declaredConstructor2 = z.getDeclaredConstructor(View.class);
            Intrinsics.checkNotNullExpressionValue(declaredConstructor2, "z.getDeclaredConstructor(View::class.java)");
            declaredConstructor2.setAccessible(true);
            Object newInstance2 = declaredConstructor2.newInstance(view);
            if (newInstance2 != null) {
                return (K) newInstance2;
            }
            throw new NullPointerException("null cannot be cast to non-null type K of com.glority.android.adapterhelper.BaseQuickAdapter");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return null;
        } catch (InstantiationException e2) {
            e2.printStackTrace();
            return null;
        } catch (NoSuchMethodException e3) {
            e3.printStackTrace();
            return null;
        } catch (InvocationTargetException e4) {
            e4.printStackTrace();
            return null;
        }
    }

    private final Class<?> getInstancedGenericKClass(Class<?> z) {
        Type genericSuperclass = z.getGenericSuperclass();
        if (!(genericSuperclass instanceof ParameterizedType)) {
            return null;
        }
        Type[] types = ((ParameterizedType) genericSuperclass).getActualTypeArguments();
        Intrinsics.checkNotNullExpressionValue(types, "types");
        int length = types.length;
        int i = 0;
        while (i < length) {
            Type type = types[i];
            i++;
            if (type instanceof Class) {
                Class<?> cls = (Class) type;
                if (BaseViewHolder.class.isAssignableFrom(cls)) {
                    return cls;
                }
            } else if (type instanceof ParameterizedType) {
                Type rawType = ((ParameterizedType) type).getRawType();
                if (rawType instanceof Class) {
                    Class<?> cls2 = (Class) rawType;
                    if (BaseViewHolder.class.isAssignableFrom(cls2)) {
                        return cls2;
                    }
                } else {
                    continue;
                }
            } else {
                continue;
            }
        }
        return null;
    }

    public static /* synthetic */ int addHeaderView$default(BaseQuickAdapter baseQuickAdapter, View view, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addHeaderView");
        }
        if ((i3 & 2) != 0) {
            i = -1;
        }
        if ((i3 & 4) != 0) {
            i2 = 1;
        }
        return baseQuickAdapter.addHeaderView(view, i, i2);
    }

    public final int addHeaderView(View header, int index, int orientation) {
        int headerViewPosition;
        Intrinsics.checkNotNullParameter(header, "header");
        if (this.headerLayout == null) {
            LinearLayout linearLayout = new LinearLayout(header.getContext());
            this.headerLayout = linearLayout;
            if (orientation == 1) {
                Intrinsics.checkNotNull(linearLayout);
                linearLayout.setOrientation(1);
                LinearLayout linearLayout2 = this.headerLayout;
                Intrinsics.checkNotNull(linearLayout2);
                linearLayout2.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            } else {
                Intrinsics.checkNotNull(linearLayout);
                linearLayout.setOrientation(0);
                LinearLayout linearLayout3 = this.headerLayout;
                Intrinsics.checkNotNull(linearLayout3);
                linearLayout3.setLayoutParams(new RecyclerView.LayoutParams(-2, -1));
            }
        }
        LinearLayout linearLayout4 = this.headerLayout;
        Intrinsics.checkNotNull(linearLayout4);
        int childCount = linearLayout4.getChildCount();
        if (index < 0 || index > childCount) {
            index = childCount;
        }
        LinearLayout linearLayout5 = this.headerLayout;
        Intrinsics.checkNotNull(linearLayout5);
        linearLayout5.addView(header, index);
        LinearLayout linearLayout6 = this.headerLayout;
        Intrinsics.checkNotNull(linearLayout6);
        if (linearLayout6.getChildCount() == 1 && (headerViewPosition = getHeaderViewPosition()) != -1) {
            notifyItemInserted(headerViewPosition);
        }
        return index;
    }

    public final int setHeaderView(View header) {
        Intrinsics.checkNotNullParameter(header, "header");
        return setHeaderView(header, 0, 1);
    }

    public final int setHeaderView(View header, int index) {
        Intrinsics.checkNotNullParameter(header, "header");
        return setHeaderView(header, index, 1);
    }

    public final int setHeaderView(View header, int index, int orientation) {
        Intrinsics.checkNotNullParameter(header, "header");
        LinearLayout linearLayout = this.headerLayout;
        if (linearLayout != null) {
            Intrinsics.checkNotNull(linearLayout);
            if (linearLayout.getChildCount() > index) {
                LinearLayout linearLayout2 = this.headerLayout;
                Intrinsics.checkNotNull(linearLayout2);
                linearLayout2.removeViewAt(index);
                LinearLayout linearLayout3 = this.headerLayout;
                Intrinsics.checkNotNull(linearLayout3);
                linearLayout3.addView(header, index);
                return index;
            }
        }
        return addHeaderView(header, index, orientation);
    }

    public static /* synthetic */ int addFooterView$default(BaseQuickAdapter baseQuickAdapter, View view, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addFooterView");
        }
        if ((i3 & 2) != 0) {
            i = -1;
        }
        if ((i3 & 4) != 0) {
            i2 = 1;
        }
        return baseQuickAdapter.addFooterView(view, i, i2);
    }

    public final int addFooterView(View footer, int index, int orientation) {
        int footerViewPosition;
        Intrinsics.checkNotNullParameter(footer, "footer");
        if (this.footerLayout == null) {
            LinearLayout linearLayout = new LinearLayout(footer.getContext());
            this.footerLayout = linearLayout;
            if (orientation == 1) {
                Intrinsics.checkNotNull(linearLayout);
                linearLayout.setOrientation(1);
                LinearLayout linearLayout2 = this.footerLayout;
                Intrinsics.checkNotNull(linearLayout2);
                linearLayout2.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            } else {
                Intrinsics.checkNotNull(linearLayout);
                linearLayout.setOrientation(0);
                LinearLayout linearLayout3 = this.footerLayout;
                Intrinsics.checkNotNull(linearLayout3);
                linearLayout3.setLayoutParams(new RecyclerView.LayoutParams(-2, -1));
            }
        }
        LinearLayout linearLayout4 = this.footerLayout;
        Intrinsics.checkNotNull(linearLayout4);
        int childCount = linearLayout4.getChildCount();
        if (index < 0 || index > childCount) {
            index = childCount;
        }
        LinearLayout linearLayout5 = this.footerLayout;
        Intrinsics.checkNotNull(linearLayout5);
        linearLayout5.addView(footer, index);
        LinearLayout linearLayout6 = this.footerLayout;
        Intrinsics.checkNotNull(linearLayout6);
        if (linearLayout6.getChildCount() == 1 && (footerViewPosition = getFooterViewPosition()) != -1) {
            notifyItemInserted(footerViewPosition);
        }
        return index;
    }

    public final int setFooterView(View header) {
        Intrinsics.checkNotNullParameter(header, "header");
        return setFooterView(header, 0, 1);
    }

    public final int setFooterView(View header, int index) {
        Intrinsics.checkNotNullParameter(header, "header");
        return setFooterView(header, index, 1);
    }

    public final int setFooterView(View header, int index, int orientation) {
        Intrinsics.checkNotNullParameter(header, "header");
        LinearLayout linearLayout = this.footerLayout;
        if (linearLayout != null) {
            Intrinsics.checkNotNull(linearLayout);
            if (linearLayout.getChildCount() > index) {
                LinearLayout linearLayout2 = this.footerLayout;
                Intrinsics.checkNotNull(linearLayout2);
                linearLayout2.removeViewAt(index);
                LinearLayout linearLayout3 = this.footerLayout;
                Intrinsics.checkNotNull(linearLayout3);
                linearLayout3.addView(header, index);
                return index;
            }
        }
        return addFooterView(header, index, orientation);
    }

    public final void removeHeaderView(View header) {
        int headerViewPosition;
        if (getHeaderLayoutCount() == 0) {
            return;
        }
        LinearLayout linearLayout = this.headerLayout;
        Intrinsics.checkNotNull(linearLayout);
        linearLayout.removeView(header);
        LinearLayout linearLayout2 = this.headerLayout;
        Intrinsics.checkNotNull(linearLayout2);
        if (linearLayout2.getChildCount() != 0 || (headerViewPosition = getHeaderViewPosition()) == -1) {
            return;
        }
        notifyItemRemoved(headerViewPosition);
    }

    public final void removeFooterView(View footer) {
        int footerViewPosition;
        if (getFooterLayoutCount() == 0) {
            return;
        }
        LinearLayout linearLayout = this.footerLayout;
        Intrinsics.checkNotNull(linearLayout);
        linearLayout.removeView(footer);
        LinearLayout linearLayout2 = this.footerLayout;
        Intrinsics.checkNotNull(linearLayout2);
        if (linearLayout2.getChildCount() != 0 || (footerViewPosition = getFooterViewPosition()) == -1) {
            return;
        }
        notifyItemRemoved(footerViewPosition);
    }

    public final void removeAllHeaderView() {
        if (getHeaderLayoutCount() == 0) {
            return;
        }
        LinearLayout linearLayout = this.headerLayout;
        Intrinsics.checkNotNull(linearLayout);
        linearLayout.removeAllViews();
        int headerViewPosition = getHeaderViewPosition();
        if (headerViewPosition != -1) {
            notifyItemRemoved(headerViewPosition);
        }
    }

    public final void removeAllFooterView() {
        if (getFooterLayoutCount() == 0) {
            return;
        }
        LinearLayout linearLayout = this.footerLayout;
        Intrinsics.checkNotNull(linearLayout);
        linearLayout.removeAllViews();
        int footerViewPosition = getFooterViewPosition();
        if (footerViewPosition != -1) {
            notifyItemRemoved(footerViewPosition);
        }
    }

    private final int getHeaderViewPosition() {
        return (getEmptyViewCount() != 1 || this.mHeadAndEmptyEnable) ? 0 : -1;
    }

    private final int getFooterViewPosition() {
        int i = 1;
        if (getEmptyViewCount() == 1) {
            if (this.mHeadAndEmptyEnable && getHeaderLayoutCount() != 0) {
                i = 2;
            }
            if (this.mFootAndEmptyEnable) {
                return i;
            }
            return -1;
        }
        return getHeaderLayoutCount() + this.mData.size();
    }

    public final void setEmptyView(int layoutResId, ViewGroup viewGroup) {
        Intrinsics.checkNotNull(viewGroup);
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(layoutResId, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        setEmptyView(view);
    }

    @Deprecated(message = "")
    public final void setEmptyView(int layoutResId) {
        checkNotNull();
        setEmptyView(layoutResId, this.recyclerView);
    }

    public final void setEmptyView(View emptyView) {
        boolean z;
        Intrinsics.checkNotNullParameter(emptyView, "emptyView");
        int itemCount = getItemCount();
        if (this.mEmptyLayout == null) {
            this.mEmptyLayout = new FrameLayout(emptyView.getContext());
            RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, -1);
            ViewGroup.LayoutParams layoutParams2 = emptyView.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams.width = layoutParams2.width;
                layoutParams.height = layoutParams2.height;
            }
            FrameLayout frameLayout = this.mEmptyLayout;
            Intrinsics.checkNotNull(frameLayout);
            frameLayout.setLayoutParams(layoutParams);
            z = true;
        } else {
            z = false;
        }
        FrameLayout frameLayout2 = this.mEmptyLayout;
        Intrinsics.checkNotNull(frameLayout2);
        frameLayout2.removeAllViews();
        FrameLayout frameLayout3 = this.mEmptyLayout;
        Intrinsics.checkNotNull(frameLayout3);
        frameLayout3.addView(emptyView);
        this.mIsUseEmpty = true;
        if (z && getEmptyViewCount() == 1) {
            int i = (!this.mHeadAndEmptyEnable || getHeaderLayoutCount() == 0) ? 0 : 1;
            if (getItemCount() > itemCount) {
                notifyItemInserted(i);
            } else {
                notifyDataSetChanged();
            }
        }
    }

    public final void setHeaderAndEmpty(boolean isHeadAndEmpty) {
        setHeaderFooterEmpty(isHeadAndEmpty, false);
    }

    public final void setHeaderFooterEmpty(boolean isHeadAndEmpty, boolean isFootAndEmpty) {
        this.mHeadAndEmptyEnable = isHeadAndEmpty;
        this.mFootAndEmptyEnable = isFootAndEmpty;
    }

    public final void isUseEmpty(boolean isUseEmpty) {
        this.mIsUseEmpty = isUseEmpty;
    }

    public final View getEmptyView() {
        return this.mEmptyLayout;
    }

    public final void setPreLoadNumber(int preLoadNumber) {
        if (preLoadNumber > 1) {
            this.mPreLoadNumber = preLoadNumber;
        }
    }

    private final void autoLoadMore(int position) {
        if (getLoadMoreViewCount() != 0 && position >= getItemCount() - this.mPreLoadNumber && this.mLoadMoreView.getLoadMoreStatus() == 1) {
            this.mLoadMoreView.setLoadMoreStatus(2);
            if (this.isLoading) {
                return;
            }
            this.isLoading = true;
            RecyclerView recyclerView = this.recyclerView;
            if (recyclerView != null) {
                Intrinsics.checkNotNull(recyclerView);
                recyclerView.post(new Runnable() { // from class: com.glority.android.adapterhelper.BaseQuickAdapter$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseQuickAdapter.m7688autoLoadMore$lambda8(BaseQuickAdapter.this);
                    }
                });
            } else {
                RequestLoadMoreListener requestLoadMoreListener = this.mRequestLoadMoreListener;
                Intrinsics.checkNotNull(requestLoadMoreListener);
                requestLoadMoreListener.onLoadMoreRequested();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: autoLoadMore$lambda-8, reason: not valid java name */
    public static final void m7688autoLoadMore$lambda8(BaseQuickAdapter this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        RequestLoadMoreListener requestLoadMoreListener = this$0.mRequestLoadMoreListener;
        Intrinsics.checkNotNull(requestLoadMoreListener);
        requestLoadMoreListener.onLoadMoreRequested();
    }

    private final void addAnimation(RecyclerView.ViewHolder holder) {
        if (this.mOpenAnimationEnable) {
            if (!this.mFirstOnlyEnable || holder.getLayoutPosition() > this.mLastPosition) {
                BaseAnimation baseAnimation = this.mCustomAnimation;
                if (baseAnimation == null) {
                    baseAnimation = this.mSelectAnimation;
                }
                Intrinsics.checkNotNull(baseAnimation);
                View view = holder.itemView;
                Intrinsics.checkNotNullExpressionValue(view, "holder.itemView");
                Animator[] animators = baseAnimation.getAnimators(view);
                int length = animators.length;
                int i = 0;
                while (i < length) {
                    Animator animator = animators[i];
                    i++;
                    startAnim(animator, holder.getLayoutPosition());
                }
                this.mLastPosition = holder.getLayoutPosition();
            }
        }
    }

    protected final void startAnim(Animator anim, int index) {
        Intrinsics.checkNotNullParameter(anim, "anim");
        anim.setDuration(this.mDuration).start();
        anim.setInterpolator(this.mInterpolator);
    }

    protected View getItemView(int layoutResId, ViewGroup parent) {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        Intrinsics.checkNotNull(layoutInflater);
        View inflate = layoutInflater.inflate(layoutResId, parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "mLayoutInflater!!.inflat…youtResId, parent, false)");
        return inflate;
    }

    public final void openLoadAnimation(@AnimationType int animationType) {
        this.mOpenAnimationEnable = true;
        this.mCustomAnimation = null;
        if (animationType == 1) {
            this.mSelectAnimation = new AlphaInAnimation(0.0f, 1, null);
            return;
        }
        if (animationType == 2) {
            this.mSelectAnimation = new ScaleInAnimation(0.0f, 1, null);
            return;
        }
        if (animationType == 3) {
            this.mSelectAnimation = new SlideInBottomAnimation();
        } else if (animationType == 4) {
            this.mSelectAnimation = new SlideInLeftAnimation();
        } else {
            if (animationType != 5) {
                return;
            }
            this.mSelectAnimation = new SlideInRightAnimation();
        }
    }

    public final void openLoadAnimation(BaseAnimation animation) {
        this.mOpenAnimationEnable = true;
        this.mCustomAnimation = animation;
    }

    public final void openLoadAnimation() {
        this.mOpenAnimationEnable = true;
    }

    public final void closeLoadAnimation() {
        this.mOpenAnimationEnable = false;
    }

    public final void isFirstOnly(boolean firstOnly) {
        this.mFirstOnlyEnable = firstOnly;
    }

    public final View getViewByPosition(int position, int viewId) {
        checkNotNull();
        return getViewByPosition(this.recyclerView, position, viewId);
    }

    public final View getViewByPosition(RecyclerView recyclerView, int position, int viewId) {
        BaseViewHolder baseViewHolder;
        if (recyclerView == null || (baseViewHolder = (BaseViewHolder) recyclerView.findViewHolderForLayoutPosition(position)) == null) {
            return null;
        }
        return baseViewHolder.getView(viewId);
    }

    private final int getItemPosition(T item) {
        if (item == null || this.mData.isEmpty()) {
            return -1;
        }
        return this.mData.indexOf(item);
    }

    /* compiled from: BaseQuickAdapter.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000eX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/glority/android/adapterhelper/BaseQuickAdapter$Companion;", "", "()V", "ALPHA", "", "EMPTY_VIEW", "FOOTER_VIEW", "HEADER_VIEW", "LOADING_VIEW", "SCALING", "SLIDING_BOTTOM", "SLIDING_LEFT", "SLIDING_RIGHT", "TAG", "", "kotlin.jvm.PlatformType", "getTAG", "()Ljava/lang/String;", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        protected final String getTAG() {
            return BaseQuickAdapter.TAG;
        }
    }

    private final List<T> assertMDataIsMutable() {
        if (TypeIntrinsics.isMutableList(this.mData)) {
            return TypeIntrinsics.asMutableList(this.mData);
        }
        throw new Exception("data must be mutable");
    }
}
