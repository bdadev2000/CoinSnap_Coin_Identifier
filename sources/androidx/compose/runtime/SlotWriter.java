package androidx.compose.runtime;

import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableIntSet;
import androidx.collection.MutableObjectList;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.data.LogEventArguments;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: SlotTable.kt */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\bK\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 Ë\u00012\u00020\u0001:\u0002Ë\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020\rJ\u0010\u0010F\u001a\u00020\u00072\b\b\u0002\u0010G\u001a\u00020\rJ\u000e\u0010H\u001a\u00020\r2\u0006\u0010F\u001a\u00020\u0007J\u0018\u0010I\u001a\u00020D2\u0006\u0010F\u001a\u00020\u00072\b\u0010J\u001a\u0004\u0018\u00010\u0001J\u0006\u0010K\u001a\u00020DJ\u0006\u0010L\u001a\u00020DJ\u0010\u0010M\u001a\u00020\u00112\u0006\u0010N\u001a\u00020\rH\u0002J\b\u0010O\u001a\u00020DH\u0002J\u000e\u0010P\u001a\u00020D2\u0006\u0010Q\u001a\u00020\u0011J\u0010\u0010R\u001a\u00020\u00112\u0006\u0010N\u001a\u00020\rH\u0002J\u0010\u0010S\u001a\u00020\u00112\u0006\u0010N\u001a\u00020\rH\u0002J \u0010T\u001a\u00020\r2\u0006\u0010F\u001a\u00020\r2\u0006\u0010U\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010V\u001a\u00020\r2\u0006\u0010G\u001a\u00020\rH\u0002J\u0010\u0010W\u001a\u00020\r2\u0006\u0010V\u001a\u00020\rH\u0002J(\u0010X\u001a\u00020\r2\u0006\u0010G\u001a\u00020\r2\u0006\u0010Y\u001a\u00020\r2\u0006\u0010U\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0006\u0010Z\u001a\u00020\rJ\u0006\u0010[\u001a\u00020DJ\u000e\u0010\\\u001a\u00020D2\u0006\u0010F\u001a\u00020\u0007J\u000e\u0010\\\u001a\u00020D2\u0006\u0010G\u001a\u00020\rJ \u0010]\u001a\u00020D2\u0006\u0010.\u001a\u00020\r2\u0006\u0010Z\u001a\u00020\r2\u0006\u0010^\u001a\u00020\rH\u0002JK\u0010_\u001a\u00020D2\u0006\u0010N\u001a\u00020\r28\u0010`\u001a4\u0012\u0013\u0012\u00110\r¢\u0006\f\bb\u0012\b\bc\u0012\u0004\b\b(G\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\bb\u0012\b\bc\u0012\u0004\b\b(d\u0012\u0004\u0012\u00020D0aH\u0086\bJK\u0010e\u001a\u00020D2\u0006\u0010N\u001a\u00020\r28\u0010`\u001a4\u0012\u0013\u0012\u00110\r¢\u0006\f\bb\u0012\b\bc\u0012\u0004\b\b(G\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\bb\u0012\b\bc\u0012\u0004\b\b(d\u0012\u0004\u0012\u00020D0aH\u0086\bJ5\u0010f\u001a\u00020D2\u0006\u0010g\u001a\u00020\r2\u0006\u0010h\u001a\u00020\r2\u001a\u0010`\u001a\u0016\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020D0aH\u0086\bJ\u0010\u0010i\u001a\u0004\u0018\u00010\u00012\u0006\u0010G\u001a\u00020\rJ\u0010\u0010j\u001a\u00020\r2\u0006\u0010G\u001a\u00020\rH\u0002J\u000e\u0010k\u001a\u00020\r2\u0006\u0010G\u001a\u00020\rJ\u0010\u0010l\u001a\u0004\u0018\u00010\u00012\u0006\u0010G\u001a\u00020\rJ\u000e\u0010m\u001a\u00020\r2\u0006\u0010G\u001a\u00020\rJ\u000e\u0010n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010oJ\u001c\u0010p\u001a\u0004\u0018\u00010>2\u0006\u0010.\u001a\u00020\r2\b\u0010q\u001a\u0004\u0018\u00010rH\u0002J\u000e\u0010s\u001a\u00020\u00112\u0006\u0010G\u001a\u00020\rJ\u0016\u0010t\u001a\u00020\u00112\u0006\u0010G\u001a\u00020\r2\u0006\u0010N\u001a\u00020\rJ\u000e\u0010u\u001a\u00020\u00112\u0006\u0010G\u001a\u00020\rJ\u0010\u0010v\u001a\u00020D2\b\u0010J\u001a\u0004\u0018\u00010\u0001J\u0010\u0010w\u001a\u00020D2\u0006\u00102\u001a\u00020\rH\u0002J\u0018\u0010x\u001a\u00020D2\u0006\u00102\u001a\u00020\r2\u0006\u0010N\u001a\u00020\rH\u0002J\u000e\u0010+\u001a\u00020\u00112\u0006\u0010G\u001a\u00020\rJ\u000e\u0010y\u001a\b\u0012\u0004\u0012\u00020\r0zH\u0002J\u0010\u0010{\u001a\u00020D2\b\b\u0002\u0010N\u001a\u00020\rJ \u0010|\u001a\u00020D2\u0006\u0010}\u001a\u00020\r2\u0006\u0010~\u001a\u00020\r2\u0006\u00102\u001a\u00020\rH\u0002J'\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020\u00070z2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010G\u001a\u00020\r2\t\b\u0002\u0010\u0080\u0001\u001a\u00020\u0011J\u0010\u0010\u0081\u0001\u001a\u00020D2\u0007\u0010\u0082\u0001\u001a\u00020\rJ\u0011\u0010\u0083\u0001\u001a\u00020D2\u0006\u0010G\u001a\u00020\rH\u0002J&\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070z2\u0007\u0010\u0082\u0001\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010G\u001a\u00020\rJ\u0019\u0010\u0085\u0001\u001a\u00020D2\u0006\u0010G\u001a\u00020\r2\u0006\u0010N\u001a\u00020\rH\u0002J'\u0010\u0086\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070z2\u0006\u0010F\u001a\u00020\u00072\u0007\u0010\u0082\u0001\u001a\u00020\r2\u0007\u0010\u0087\u0001\u001a\u00020\u0000J\u0011\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u00012\u0006\u0010F\u001a\u00020\u0007J\u0011\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u00012\u0006\u0010G\u001a\u00020\rJ\u000e\u0010,\u001a\u00020\r2\u0006\u0010G\u001a\u00020\rJ\u000e\u0010.\u001a\u00020\r2\u0006\u0010F\u001a\u00020\u0007J\u000e\u0010.\u001a\u00020\r2\u0006\u0010G\u001a\u00020\rJ\u0011\u0010\u0089\u0001\u001a\u00020\r2\u0006\u0010G\u001a\u00020\rH\u0002J\u0019\u0010\u008a\u0001\u001a\u00020\r2\u0006\u0010G\u001a\u00020\r2\u0006\u0010Y\u001a\u00020\rH\u0002J\u0015\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u00012\b\u0010J\u001a\u0004\u0018\u00010\u0001H\u0002J\t\u0010\u008c\u0001\u001a\u00020DH\u0002J\u000f\u0010\u008d\u0001\u001a\u00020D2\u0006\u0010q\u001a\u00020rJ\u0007\u0010\u008e\u0001\u001a\u00020DJ\u0018\u0010\u008f\u0001\u001a\u00020D2\u0007\u0010\u0090\u0001\u001a\u00020\r2\u0006\u0010J\u001a\u00020rJA\u0010\u0091\u0001\u001a\u00020\u00112\u0006\u0010Y\u001a\u00020\r2\u0006\u00102\u001a\u00020\r2&\u0010<\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020>\u0018\u00010=j\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020>\u0018\u0001`?H\u0002J\u0007\u0010\u0092\u0001\u001a\u00020\u0011J\u001b\u0010\u0093\u0001\u001a\u00020\u00112\u0007\u0010\u0094\u0001\u001a\u00020\r2\u0007\u0010\u0095\u0001\u001a\u00020\rH\u0002J#\u0010\u0096\u0001\u001a\u00020D2\u0007\u0010\u0094\u0001\u001a\u00020\r2\u0007\u0010\u0095\u0001\u001a\u00020\r2\u0006\u0010N\u001a\u00020\rH\u0002J\u0007\u0010\u0097\u0001\u001a\u00020DJ\t\u0010\u0098\u0001\u001a\u00020\rH\u0002J\t\u0010\u0099\u0001\u001a\u00020DH\u0002J\u000f\u0010\u009a\u0001\u001a\u00020D2\u0006\u0010F\u001a\u00020\u0007J\u0011\u0010\u009b\u0001\u001a\u00020D2\b\u0010J\u001a\u0004\u0018\u00010\u0001J\u001b\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u00012\u0006\u0010G\u001a\u00020\r2\b\u0010J\u001a\u0004\u0018\u00010\u0001J#\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u00012\u0006\u0010N\u001a\u00020\r2\u0006\u0010G\u001a\u00020\r2\b\u0010J\u001a\u0004\u0018\u00010\u0001J\t\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u0001J\u0007\u0010\u009d\u0001\u001a\u00020\rJ\u0007\u0010\u009e\u0001\u001a\u00020DJ\u0019\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u00012\u0006\u0010F\u001a\u00020\u00072\u0006\u0010G\u001a\u00020\rJ\u0019\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u00012\u0006\u0010g\u001a\u00020\r2\u0006\u0010G\u001a\u00020\rJ\u0017\u0010 \u0001\u001a\u00020\r2\u0006\u0010N\u001a\u00020\r2\u0006\u0010G\u001a\u00020\rJ\u0017\u0010¡\u0001\u001a\u00020\r2\u0006\u0010g\u001a\u00020\rH\u0000¢\u0006\u0003\b¢\u0001J\u0017\u0010£\u0001\u001a\u00020\r2\u0006\u0010g\u001a\u00020\rH\u0000¢\u0006\u0003\b¤\u0001J\u0017\u0010¥\u0001\u001a\u00020\r2\u0006\u0010g\u001a\u00020\rH\u0000¢\u0006\u0003\b¦\u0001J\u0013\u0010§\u0001\u001a\u0004\u0018\u00010>2\u0006\u0010N\u001a\u00020\rH\u0002J\u001b\u0010¨\u0001\u001a\u00020D2\u0007\u0010\u0090\u0001\u001a\u00020\r2\t\u0010©\u0001\u001a\u0004\u0018\u00010\u0001J&\u0010¨\u0001\u001a\u00020D2\u0007\u0010\u0090\u0001\u001a\u00020\r2\t\u0010ª\u0001\u001a\u0004\u0018\u00010\u00012\t\u0010©\u0001\u001a\u0004\u0018\u00010\u0001J\u0007\u0010«\u0001\u001a\u00020DJ\u0010\u0010«\u0001\u001a\u00020D2\u0007\u0010\u0090\u0001\u001a\u00020\rJ\u001b\u0010«\u0001\u001a\u00020D2\u0007\u0010\u0090\u0001\u001a\u00020\r2\t\u0010¬\u0001\u001a\u0004\u0018\u00010\u0001J0\u0010«\u0001\u001a\u00020D2\u0007\u0010\u0090\u0001\u001a\u00020\r2\t\u0010ª\u0001\u001a\u0004\u0018\u00010\u00012\u0006\u0010+\u001a\u00020\u00112\t\u0010©\u0001\u001a\u0004\u0018\u00010\u0001H\u0002J\u001b\u0010\u00ad\u0001\u001a\u00020D2\u0007\u0010\u0090\u0001\u001a\u00020\r2\t\u0010ª\u0001\u001a\u0004\u0018\u00010\u0001J&\u0010\u00ad\u0001\u001a\u00020D2\u0007\u0010\u0090\u0001\u001a\u00020\r2\t\u0010ª\u0001\u001a\u0004\u0018\u00010\u00012\t\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0001J\u0007\u0010®\u0001\u001a\u00020rJ\t\u0010¯\u0001\u001a\u00020rH\u0016J\u000f\u0010°\u0001\u001a\u00020D2\u0006\u0010h\u001a\u00020\rJ\u0019\u0010±\u0001\u001a\u0004\u0018\u00010\u00072\u0006\u0010N\u001a\u00020\rH\u0000¢\u0006\u0003\b²\u0001J\u0013\u0010³\u0001\u001a\u0004\u0018\u00010\u00012\b\u0010J\u001a\u0004\u0018\u00010\u0001J\u001b\u0010´\u0001\u001a\u00020D2\u0007\u0010µ\u0001\u001a\u00020\r2\u0007\u0010¶\u0001\u001a\u00020\rH\u0002J\u0011\u0010·\u0001\u001a\u00020D2\b\u0010J\u001a\u0004\u0018\u00010\u0001J\u0011\u0010¸\u0001\u001a\u00020D2\u0006\u0010N\u001a\u00020\rH\u0002J\u001a\u0010¹\u0001\u001a\u00020D2\u0006\u0010N\u001a\u00020\r2\u0007\u0010\u009b\u0001\u001a\u000201H\u0002J\u0019\u0010º\u0001\u001a\u00020D2\u0006\u0010F\u001a\u00020\u00072\b\u0010J\u001a\u0004\u0018\u00010\u0001J\u0011\u0010º\u0001\u001a\u00020D2\b\u0010J\u001a\u0004\u0018\u00010\u0001J\u001b\u0010»\u0001\u001a\u00020D2\u0006\u0010G\u001a\u00020\r2\b\u0010J\u001a\u0004\u0018\u00010\u0001H\u0002J\u0011\u0010¼\u0001\u001a\u00020D2\b\u0010J\u001a\u0004\u0018\u00010\u0001J\u0007\u0010½\u0001\u001a\u00020DJ\u000f\u0010¾\u0001\u001a\u00020DH\u0000¢\u0006\u0003\b¿\u0001J\u000f\u0010À\u0001\u001a\u00020DH\u0000¢\u0006\u0003\bÁ\u0001J\u0016\u0010Â\u0001\u001a\u00020\r*\u00020(2\u0007\u0010Ã\u0001\u001a\u00020\rH\u0002J\u0015\u0010V\u001a\u00020\r*\u00020(2\u0007\u0010Ã\u0001\u001a\u00020\rH\u0002J\u0013\u0010Ä\u0001\u001a\b\u0012\u0004\u0012\u00020\r0z*\u00020(H\u0002J\u001b\u0010Å\u0001\u001a\u00020D*\b0Æ\u0001j\u0003`Ç\u00012\u0006\u0010G\u001a\u00020\rH\u0002J\u0016\u0010È\u0001\u001a\u00020\r*\u00020(2\u0007\u0010Ã\u0001\u001a\u00020\rH\u0002J\u0014\u0010.\u001a\u00020\r*\u00020(2\u0006\u0010G\u001a\u00020\rH\u0002J\u0016\u0010É\u0001\u001a\u00020\r*\u00020(2\u0007\u0010Ã\u0001\u001a\u00020\rH\u0002J\u001e\u0010Ê\u0001\u001a\u00020D*\u00020(2\u0007\u0010Ã\u0001\u001a\u00020\r2\u0006\u0010V\u001a\u00020\rH\u0002R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014R\u001e\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000fR\u001e\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u000fR\u0014\u0010\u001d\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u000fR\u000e\u0010\u001f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010!\u001a\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\"\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010*\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b*\u0010\u0014R\u0011\u0010+\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b+\u0010\u0014R\u000e\u0010,\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010.\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u000fR\u0010\u00100\u001a\u0004\u0018\u000101X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u00102\u001a\u00020\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\u000fR\u0018\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000105X\u0082\u000e¢\u0006\u0004\n\u0002\u00106R\u000e\u00107\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010:\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b;\u0010\u000fR.\u0010<\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020>\u0018\u00010=j\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020>\u0018\u0001`?X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010B¨\u0006Ì\u0001"}, d2 = {"Landroidx/compose/runtime/SlotWriter;", "", "table", "Landroidx/compose/runtime/SlotTable;", "(Landroidx/compose/runtime/SlotTable;)V", "anchors", "Ljava/util/ArrayList;", "Landroidx/compose/runtime/Anchor;", "Lkotlin/collections/ArrayList;", "calledByMap", "Landroidx/collection/MutableIntObjectMap;", "Landroidx/collection/MutableIntSet;", "capacity", "", "getCapacity", "()I", "<set-?>", "", "closed", "getClosed", "()Z", "collectingCalledInformation", "getCollectingCalledInformation", "collectingSourceInformation", "getCollectingSourceInformation", "currentGroup", "getCurrentGroup", "currentGroupEnd", "getCurrentGroupEnd", "currentGroupSlotIndex", "getCurrentGroupSlotIndex", "currentSlot", "currentSlotEnd", "deferredSlotWrites", "Landroidx/collection/MutableObjectList;", "endStack", "Landroidx/compose/runtime/IntStack;", "groupGapLen", "groupGapStart", "groups", "", "insertCount", "isGroupEnd", "isNode", "nodeCount", "nodeCountStack", "parent", "getParent", "pendingRecalculateMarks", "Landroidx/compose/runtime/PrioritySet;", LogEventArguments.ARG_SIZE, "getSize$runtime_release", "slots", "", "[Ljava/lang/Object;", "slotsGapLen", "slotsGapOwner", "slotsGapStart", "slotsSize", "getSlotsSize", "sourceInformationMap", "Ljava/util/HashMap;", "Landroidx/compose/runtime/GroupSourceInformation;", "Lkotlin/collections/HashMap;", "startStack", "getTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "advanceBy", "", "amount", "anchor", "index", "anchorIndex", "appendSlot", "value", "bashCurrentGroup", "beginInsert", "childContainsAnyMarks", "group", "clearSlotGap", "close", "normalClose", "containsAnyGroupMarks", "containsGroupMark", "dataAnchorToDataIndex", "gapLen", "dataIndex", "dataIndexToDataAddress", "dataIndexToDataAnchor", "gapStart", "endGroup", "endInsert", "ensureStarted", "fixParentAnchorsFor", "firstChild", "forAllData", "block", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "data", "forEachData", "forEachTailSlot", "groupIndex", "count", "groupAux", "groupIndexToAddress", "groupKey", "groupObjectKey", "groupSize", "groupSlots", "", "groupSourceInformationFor", "sourceInformation", "", "indexInCurrentGroup", "indexInGroup", "indexInParent", "insertAux", "insertGroups", "insertSlots", UserMetadata.KEYDATA_FILENAME, "", "markGroup", "moveAnchors", "originalLocation", "newLocation", "moveFrom", "removeSourceGroup", "moveGroup", TypedValues.CycleType.S_WAVE_OFFSET, "moveGroupGapTo", "moveIntoGroupFrom", "moveSlotGapTo", "moveTo", "writer", "node", "parentAnchorToIndex", "parentIndexToAnchor", "rawUpdate", "recalculateMarks", "recordGroupSourceInformation", "recordGrouplessCallSourceInformationEnd", "recordGrouplessCallSourceInformationStart", "key", "removeAnchors", "removeGroup", "removeGroups", "start", "len", "removeSlots", "reset", "restoreCurrentGroupEnd", "saveCurrentGroupEnd", "seek", "set", "skip", "skipGroup", "skipToGroupEnd", "slot", "slotIndexOfGroupSlotIndex", "slotsEndAllIndex", "slotsEndAllIndex$runtime_release", "slotsEndIndex", "slotsEndIndex$runtime_release", "slotsStartIndex", "slotsStartIndex$runtime_release", "sourceInformationOf", "startData", "aux", "objectKey", "startGroup", "dataKey", "startNode", "toDebugString", "toString", "trimTailSlots", "tryAnchor", "tryAnchor$runtime_release", "update", "updateAnchors", "previousGapStart", "newGapStart", "updateAux", "updateContainsMark", "updateContainsMarkNow", "updateNode", "updateNodeOfGroup", "updateParentNode", "updateToTableMaps", "verifyDataAnchors", "verifyDataAnchors$runtime_release", "verifyParentAnchors", "verifyParentAnchors$runtime_release", "auxIndex", "address", "dataIndexes", "groupAsString", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "nodeIndex", "slotIndex", "updateDataIndex", "Companion", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes8.dex */
public final class SlotWriter {
    private ArrayList<Anchor> anchors;
    private MutableIntObjectMap<MutableIntSet> calledByMap;
    private boolean closed;
    private int currentGroup;
    private int currentGroupEnd;
    private int currentSlot;
    private int currentSlotEnd;
    private MutableIntObjectMap<MutableObjectList<Object>> deferredSlotWrites;
    private int groupGapLen;
    private int groupGapStart;
    private int[] groups;
    private int insertCount;
    private int nodeCount;
    private PrioritySet pendingRecalculateMarks;
    private Object[] slots;
    private int slotsGapLen;
    private int slotsGapOwner;
    private int slotsGapStart;
    private HashMap<Anchor, GroupSourceInformation> sourceInformationMap;
    private final SlotTable table;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final IntStack startStack = new IntStack();
    private final IntStack endStack = new IntStack();
    private final IntStack nodeCountStack = new IntStack();
    private int parent = -1;

    private final int dataAnchorToDataIndex(int anchor, int gapLen, int capacity) {
        return anchor < 0 ? (capacity - gapLen) + anchor + 1 : anchor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dataIndexToDataAnchor(int index, int gapStart, int gapLen, int capacity) {
        return index > gapStart ? -(((capacity - gapLen) - index) + 1) : index;
    }

    public SlotWriter(SlotTable slotTable) {
        this.table = slotTable;
        this.groups = slotTable.getGroups();
        this.slots = slotTable.getSlots();
        this.anchors = slotTable.getAnchors$runtime_release();
        this.sourceInformationMap = slotTable.getSourceInformationMap$runtime_release();
        this.calledByMap = slotTable.getCalledByMap$runtime_release();
        this.groupGapStart = slotTable.getGroupsSize();
        this.groupGapLen = (this.groups.length / 5) - slotTable.getGroupsSize();
        this.slotsGapStart = slotTable.getSlotsSize();
        this.slotsGapLen = this.slots.length - slotTable.getSlotsSize();
        this.slotsGapOwner = slotTable.getGroupsSize();
        this.currentGroupEnd = slotTable.getGroupsSize();
    }

    /* renamed from: getTable$runtime_release, reason: from getter */
    public final SlotTable getTable() {
        return this.table;
    }

    public final int getCurrentGroup() {
        return this.currentGroup;
    }

    public final int getCurrentGroupEnd() {
        return this.currentGroupEnd;
    }

    public final boolean isGroupEnd() {
        return this.currentGroup == this.currentGroupEnd;
    }

    public final int getSlotsSize() {
        return this.slots.length - this.slotsGapLen;
    }

    public final boolean isNode() {
        int i = this.currentGroup;
        return i < this.currentGroupEnd && SlotTableKt.access$isNode(this.groups, groupIndexToAddress(i));
    }

    public final boolean getCollectingSourceInformation() {
        return this.sourceInformationMap != null;
    }

    public final boolean getCollectingCalledInformation() {
        return this.calledByMap != null;
    }

    public final boolean isNode(int index) {
        return SlotTableKt.access$isNode(this.groups, groupIndexToAddress(index));
    }

    public final int nodeCount(int index) {
        return SlotTableKt.access$nodeCount(this.groups, groupIndexToAddress(index));
    }

    public final int groupKey(int index) {
        return SlotTableKt.access$key(this.groups, groupIndexToAddress(index));
    }

    public final Object groupObjectKey(int index) {
        int groupIndexToAddress = groupIndexToAddress(index);
        if (SlotTableKt.access$hasObjectKey(this.groups, groupIndexToAddress)) {
            return this.slots[SlotTableKt.access$objectKeyIndex(this.groups, groupIndexToAddress)];
        }
        return null;
    }

    public final int groupSize(int index) {
        return SlotTableKt.access$groupSize(this.groups, groupIndexToAddress(index));
    }

    public final Object groupAux(int index) {
        int groupIndexToAddress = groupIndexToAddress(index);
        return SlotTableKt.access$hasAux(this.groups, groupIndexToAddress) ? this.slots[auxIndex(this.groups, groupIndexToAddress)] : Composer.INSTANCE.getEmpty();
    }

    public final boolean indexInParent(int index) {
        int i = this.parent;
        return (index > i && index < this.currentGroupEnd) || (i == 0 && index == 0);
    }

    public final boolean indexInCurrentGroup(int index) {
        return indexInGroup(index, this.currentGroup);
    }

    public final boolean indexInGroup(int index, int group) {
        int capacity;
        int groupSize;
        if (group == this.parent) {
            capacity = this.currentGroupEnd;
        } else {
            if (group > this.startStack.peekOr(0)) {
                groupSize = groupSize(group);
            } else {
                int indexOf = this.startStack.indexOf(group);
                if (indexOf < 0) {
                    groupSize = groupSize(group);
                } else {
                    capacity = (getCapacity() - this.groupGapLen) - this.endStack.peek(indexOf);
                }
            }
            capacity = groupSize + group;
        }
        return index > group && index < capacity;
    }

    public final Object node(int index) {
        int groupIndexToAddress = groupIndexToAddress(index);
        if (SlotTableKt.access$isNode(this.groups, groupIndexToAddress)) {
            return this.slots[dataIndexToDataAddress(nodeIndex(this.groups, groupIndexToAddress))];
        }
        return null;
    }

    public final Object node(Anchor anchor) {
        return node(anchor.toIndexFor(this));
    }

    public final int getParent() {
        return this.parent;
    }

    public final int parent(int index) {
        return parent(this.groups, index);
    }

    public final int parent(Anchor anchor) {
        if (anchor.getValid()) {
            return parent(this.groups, anchorIndex(anchor));
        }
        return -1;
    }

    public final boolean getClosed() {
        return this.closed;
    }

    public final void close(boolean normalClose) {
        this.closed = true;
        if (normalClose && this.startStack.isEmpty()) {
            moveGroupGapTo(getSize$runtime_release());
            moveSlotGapTo(this.slots.length - this.slotsGapLen, this.groupGapStart);
            clearSlotGap();
            recalculateMarks();
        }
        this.table.close$runtime_release(this, this.groups, this.groupGapStart, this.slots, this.slotsGapStart, this.anchors, this.sourceInformationMap, this.calledByMap);
    }

    public final void reset() {
        if (!(this.insertCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot reset when inserting");
        }
        recalculateMarks();
        this.currentGroup = 0;
        this.currentGroupEnd = getCapacity() - this.groupGapLen;
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
        this.nodeCount = 0;
    }

    public final Object update(Object value) {
        if (this.insertCount > 0 && this.currentSlot != this.slotsGapStart) {
            MutableIntObjectMap<MutableObjectList<Object>> mutableIntObjectMap = this.deferredSlotWrites;
            DefaultConstructorMarker defaultConstructorMarker = null;
            int i = 1;
            int i2 = 0;
            if (mutableIntObjectMap == null) {
                mutableIntObjectMap = new MutableIntObjectMap<>(i2, i, defaultConstructorMarker);
            }
            this.deferredSlotWrites = mutableIntObjectMap;
            int i3 = this.parent;
            MutableObjectList<Object> mutableObjectList = mutableIntObjectMap.get(i3);
            if (mutableObjectList == null) {
                mutableObjectList = new MutableObjectList<>(i2, i, defaultConstructorMarker);
                mutableIntObjectMap.set(i3, mutableObjectList);
            }
            mutableObjectList.add(value);
            return Composer.INSTANCE.getEmpty();
        }
        return rawUpdate(value);
    }

    private final Object rawUpdate(Object value) {
        Object skip = skip();
        set(value);
        return skip;
    }

    public final void appendSlot(Anchor anchor, Object value) {
        if (!(this.insertCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("Can only append a slot if not current inserting");
        }
        int i = this.currentSlot;
        int i2 = this.currentSlotEnd;
        int anchorIndex = anchorIndex(anchor);
        int dataIndex = dataIndex(this.groups, groupIndexToAddress(anchorIndex + 1));
        this.currentSlot = dataIndex;
        this.currentSlotEnd = dataIndex;
        insertSlots(1, anchorIndex);
        if (i >= dataIndex) {
            i++;
            i2++;
        }
        this.slots[dataIndex] = value;
        this.currentSlot = i;
        this.currentSlotEnd = i2;
    }

    public final void trimTailSlots(int count) {
        ComposerKt.runtimeCheck(count > 0);
        int i = this.parent;
        int slotIndex = slotIndex(this.groups, groupIndexToAddress(i));
        int dataIndex = dataIndex(this.groups, groupIndexToAddress(i + 1)) - count;
        ComposerKt.runtimeCheck(dataIndex >= slotIndex);
        removeSlots(dataIndex, count, i);
        int i2 = this.currentSlot;
        if (i2 >= slotIndex) {
            this.currentSlot = i2 - count;
        }
    }

    public final void updateAux(Object value) {
        int groupIndexToAddress = groupIndexToAddress(this.currentGroup);
        if (!SlotTableKt.access$hasAux(this.groups, groupIndexToAddress)) {
            ComposerKt.composeImmediateRuntimeError("Updating the data of a group that was not created with a data slot");
        }
        this.slots[dataIndexToDataAddress(auxIndex(this.groups, groupIndexToAddress))] = value;
    }

    public final void insertAux(Object value) {
        if (!(this.insertCount >= 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot insert auxiliary data when not inserting");
        }
        int i = this.parent;
        int groupIndexToAddress = groupIndexToAddress(i);
        if (!(!SlotTableKt.access$hasAux(this.groups, groupIndexToAddress))) {
            ComposerKt.composeImmediateRuntimeError("Group already has auxiliary data");
        }
        insertSlots(1, i);
        int auxIndex = auxIndex(this.groups, groupIndexToAddress);
        int dataIndexToDataAddress = dataIndexToDataAddress(auxIndex);
        int i2 = this.currentSlot;
        if (i2 > auxIndex) {
            int i3 = i2 - auxIndex;
            if (!(i3 < 3)) {
                PreconditionsKt.throwIllegalStateException("Moving more than two slot not supported");
            }
            if (i3 > 1) {
                Object[] objArr = this.slots;
                objArr[dataIndexToDataAddress + 2] = objArr[dataIndexToDataAddress + 1];
            }
            Object[] objArr2 = this.slots;
            objArr2[dataIndexToDataAddress + 1] = objArr2[dataIndexToDataAddress];
        }
        SlotTableKt.access$addAux(this.groups, groupIndexToAddress);
        this.slots[dataIndexToDataAddress] = value;
        this.currentSlot++;
    }

    public final void updateToTableMaps() {
        this.sourceInformationMap = this.table.getSourceInformationMap$runtime_release();
        this.calledByMap = this.table.getCalledByMap$runtime_release();
    }

    public final void recordGroupSourceInformation(String sourceInformation) {
        if (this.insertCount > 0) {
            groupSourceInformationFor(this.parent, sourceInformation);
        }
    }

    public final void recordGrouplessCallSourceInformationStart(int key, String value) {
        if (this.insertCount > 0) {
            MutableIntObjectMap<MutableIntSet> mutableIntObjectMap = this.calledByMap;
            if (mutableIntObjectMap != null) {
                SlotTableKt.access$add(mutableIntObjectMap, key, groupKey(this.parent));
            }
            GroupSourceInformation groupSourceInformationFor = groupSourceInformationFor(this.parent, null);
            if (groupSourceInformationFor != null) {
                groupSourceInformationFor.startGrouplessCall(key, value, getCurrentGroupSlotIndex());
            }
        }
    }

    public final void recordGrouplessCallSourceInformationEnd() {
        GroupSourceInformation groupSourceInformationFor;
        if (this.insertCount <= 0 || (groupSourceInformationFor = groupSourceInformationFor(this.parent, null)) == null) {
            return;
        }
        groupSourceInformationFor.endGrouplessCall(getCurrentGroupSlotIndex());
    }

    private final GroupSourceInformation groupSourceInformationFor(int parent, String sourceInformation) {
        HashMap<Anchor, GroupSourceInformation> hashMap = this.sourceInformationMap;
        if (hashMap == null) {
            return null;
        }
        HashMap<Anchor, GroupSourceInformation> hashMap2 = hashMap;
        Anchor anchor = anchor(parent);
        GroupSourceInformation groupSourceInformation = hashMap2.get(anchor);
        if (groupSourceInformation == null) {
            groupSourceInformation = new GroupSourceInformation(0, sourceInformation, 0);
            if (sourceInformation == null) {
                int i = parent + 1;
                int i2 = this.currentGroup;
                while (i < i2) {
                    groupSourceInformation.reportGroup(this, i);
                    i += SlotTableKt.access$groupSize(this.groups, i);
                }
            }
            hashMap2.put(anchor, groupSourceInformation);
        }
        return groupSourceInformation;
    }

    public final void updateNode(Object value) {
        updateNodeOfGroup(this.currentGroup, value);
    }

    public final void updateNode(Anchor anchor, Object value) {
        updateNodeOfGroup(anchor.toIndexFor(this), value);
    }

    public final void updateParentNode(Object value) {
        updateNodeOfGroup(this.parent, value);
    }

    public final void set(Object value) {
        if (!(this.currentSlot <= this.currentSlotEnd)) {
            ComposerKt.composeImmediateRuntimeError("Writing to an invalid slot");
        }
        this.slots[dataIndexToDataAddress(this.currentSlot - 1)] = value;
    }

    public final Object set(int index, Object value) {
        return set(this.currentGroup, index, value);
    }

    public final int slotIndexOfGroupSlotIndex(int group, int index) {
        int slotIndex = slotIndex(this.groups, groupIndexToAddress(group));
        int i = slotIndex + index;
        if (!(i >= slotIndex && i < dataIndex(this.groups, groupIndexToAddress(group + 1)))) {
            ComposerKt.composeImmediateRuntimeError("Write to an invalid slot index " + index + " for group " + group);
        }
        return i;
    }

    public final Object set(int group, int index, Object value) {
        int dataIndexToDataAddress = dataIndexToDataAddress(slotIndexOfGroupSlotIndex(group, index));
        Object[] objArr = this.slots;
        Object obj = objArr[dataIndexToDataAddress];
        objArr[dataIndexToDataAddress] = value;
        return obj;
    }

    public final Object skip() {
        if (this.insertCount > 0) {
            insertSlots(1, this.parent);
        }
        Object[] objArr = this.slots;
        int i = this.currentSlot;
        this.currentSlot = i + 1;
        return objArr[dataIndexToDataAddress(i)];
    }

    public final Object slot(Anchor anchor, int index) {
        return slot(anchorIndex(anchor), index);
    }

    public final Object slot(int groupIndex, int index) {
        int slotIndex = slotIndex(this.groups, groupIndexToAddress(groupIndex));
        int dataIndex = dataIndex(this.groups, groupIndexToAddress(groupIndex + 1));
        int i = index + slotIndex;
        if (slotIndex > i || i >= dataIndex) {
            return Composer.INSTANCE.getEmpty();
        }
        return this.slots[dataIndexToDataAddress(i)];
    }

    public final void forEachTailSlot(int groupIndex, int count, Function2<? super Integer, Object, Unit> block) {
        int slotsStartIndex$runtime_release = slotsStartIndex$runtime_release(groupIndex);
        int slotsEndIndex$runtime_release = slotsEndIndex$runtime_release(groupIndex);
        for (int max = Math.max(slotsStartIndex$runtime_release, slotsEndIndex$runtime_release - count); max < slotsEndIndex$runtime_release; max++) {
            block.invoke(Integer.valueOf(max), this.slots[dataIndexToDataAddress(max)]);
        }
    }

    public final int slotsStartIndex$runtime_release(int groupIndex) {
        return slotIndex(this.groups, groupIndexToAddress(groupIndex));
    }

    public final int slotsEndIndex$runtime_release(int groupIndex) {
        return dataIndex(this.groups, groupIndexToAddress(groupIndex + 1));
    }

    public final int slotsEndAllIndex$runtime_release(int groupIndex) {
        return dataIndex(this.groups, groupIndexToAddress(groupIndex + groupSize(groupIndex)));
    }

    private final int getCurrentGroupSlotIndex() {
        MutableObjectList<Object> mutableObjectList;
        int slotsStartIndex$runtime_release = this.currentSlot - slotsStartIndex$runtime_release(this.parent);
        MutableIntObjectMap<MutableObjectList<Object>> mutableIntObjectMap = this.deferredSlotWrites;
        return slotsStartIndex$runtime_release + ((mutableIntObjectMap == null || (mutableObjectList = mutableIntObjectMap.get(this.parent)) == null) ? 0 : mutableObjectList.getSize());
    }

    public final void advanceBy(int amount) {
        if (!(amount >= 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot seek backwards");
        }
        if (!(this.insertCount <= 0)) {
            PreconditionsKt.throwIllegalStateException("Cannot call seek() while inserting");
        }
        if (amount == 0) {
            return;
        }
        int i = this.currentGroup + amount;
        if (!(i >= this.parent && i <= this.currentGroupEnd)) {
            ComposerKt.composeImmediateRuntimeError("Cannot seek outside the current group (" + this.parent + '-' + this.currentGroupEnd + ')');
        }
        this.currentGroup = i;
        int dataIndex = dataIndex(this.groups, groupIndexToAddress(i));
        this.currentSlot = dataIndex;
        this.currentSlotEnd = dataIndex;
    }

    public final void seek(Anchor anchor) {
        advanceBy(anchor.toIndexFor(this) - this.currentGroup);
    }

    public final void skipToGroupEnd() {
        int i = this.currentGroupEnd;
        this.currentGroup = i;
        this.currentSlot = dataIndex(this.groups, groupIndexToAddress(i));
    }

    public final void beginInsert() {
        int i = this.insertCount;
        this.insertCount = i + 1;
        if (i == 0) {
            saveCurrentGroupEnd();
        }
    }

    public final void endInsert() {
        if (!(this.insertCount > 0)) {
            PreconditionsKt.throwIllegalStateException("Unbalanced begin/end insert");
        }
        int i = this.insertCount - 1;
        this.insertCount = i;
        if (i == 0) {
            if (!(this.nodeCountStack.getTos() == this.startStack.getTos())) {
                ComposerKt.composeImmediateRuntimeError("startGroup/endGroup mismatch while inserting");
            }
            restoreCurrentGroupEnd();
        }
    }

    public final void startGroup() {
        if (!(this.insertCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("Key must be supplied when inserting");
        }
        startGroup(0, Composer.INSTANCE.getEmpty(), false, Composer.INSTANCE.getEmpty());
    }

    public final void startGroup(int key) {
        startGroup(key, Composer.INSTANCE.getEmpty(), false, Composer.INSTANCE.getEmpty());
    }

    public final void startGroup(int key, Object dataKey) {
        startGroup(key, dataKey, false, Composer.INSTANCE.getEmpty());
    }

    public final void startNode(int key, Object objectKey) {
        startGroup(key, objectKey, true, Composer.INSTANCE.getEmpty());
    }

    public final void startNode(int key, Object objectKey, Object node) {
        startGroup(key, objectKey, true, node);
    }

    public final void startData(int key, Object objectKey, Object aux) {
        startGroup(key, objectKey, false, aux);
    }

    public final void startData(int key, Object aux) {
        startGroup(key, Composer.INSTANCE.getEmpty(), false, aux);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void startGroup(int key, Object objectKey, boolean isNode, Object aux) {
        int access$groupSize;
        GroupSourceInformation sourceInformationOf;
        int i = this.parent;
        byte b = this.insertCount > 0;
        this.nodeCountStack.push(this.nodeCount);
        if (b != false) {
            int i2 = this.currentGroup;
            int dataIndex = dataIndex(this.groups, groupIndexToAddress(i2));
            insertGroups(1);
            this.currentSlot = dataIndex;
            this.currentSlotEnd = dataIndex;
            int groupIndexToAddress = groupIndexToAddress(i2);
            int i3 = objectKey != Composer.INSTANCE.getEmpty() ? 1 : 0;
            int i4 = (isNode || aux == Composer.INSTANCE.getEmpty()) ? 0 : 1;
            int dataIndexToDataAnchor = dataIndexToDataAnchor(dataIndex, this.slotsGapStart, this.slotsGapLen, this.slots.length);
            if (dataIndexToDataAnchor >= 0 && this.slotsGapOwner < i2) {
                dataIndexToDataAnchor = -(((this.slots.length - this.slotsGapLen) - dataIndexToDataAnchor) + 1);
            }
            SlotTableKt.access$initGroup(this.groups, groupIndexToAddress, key, isNode, i3, i4, this.parent, dataIndexToDataAnchor);
            int i5 = (isNode ? 1 : 0) + i3 + i4;
            if (i5 > 0) {
                insertSlots(i5, i2);
                Object[] objArr = this.slots;
                int i6 = this.currentSlot;
                if (isNode) {
                    objArr[i6] = aux;
                    i6++;
                }
                if (i3 != 0) {
                    objArr[i6] = objectKey;
                    i6++;
                }
                if (i4 != 0) {
                    objArr[i6] = aux;
                    i6++;
                }
                this.currentSlot = i6;
            }
            this.nodeCount = 0;
            access$groupSize = i2 + 1;
            this.parent = i2;
            this.currentGroup = access$groupSize;
            if (i >= 0 && (sourceInformationOf = sourceInformationOf(i)) != null) {
                sourceInformationOf.reportGroup(this, i2);
            }
        } else {
            this.startStack.push(i);
            saveCurrentGroupEnd();
            int i7 = this.currentGroup;
            int groupIndexToAddress2 = groupIndexToAddress(i7);
            if (!Intrinsics.areEqual(aux, Composer.INSTANCE.getEmpty())) {
                if (isNode) {
                    updateNode(aux);
                } else {
                    updateAux(aux);
                }
            }
            this.currentSlot = slotIndex(this.groups, groupIndexToAddress2);
            this.currentSlotEnd = dataIndex(this.groups, groupIndexToAddress(this.currentGroup + 1));
            this.nodeCount = SlotTableKt.access$nodeCount(this.groups, groupIndexToAddress2);
            this.parent = i7;
            this.currentGroup = i7 + 1;
            access$groupSize = i7 + SlotTableKt.access$groupSize(this.groups, groupIndexToAddress2);
        }
        this.currentGroupEnd = access$groupSize;
    }

    public final int endGroup() {
        MutableObjectList<Object> mutableObjectList;
        boolean z = this.insertCount > 0;
        int i = this.currentGroup;
        int i2 = this.currentGroupEnd;
        int i3 = this.parent;
        int groupIndexToAddress = groupIndexToAddress(i3);
        int i4 = this.nodeCount;
        int i5 = i - i3;
        boolean access$isNode = SlotTableKt.access$isNode(this.groups, groupIndexToAddress);
        if (z) {
            MutableIntObjectMap<MutableObjectList<Object>> mutableIntObjectMap = this.deferredSlotWrites;
            if (mutableIntObjectMap != null && (mutableObjectList = mutableIntObjectMap.get(i3)) != null) {
                MutableObjectList<Object> mutableObjectList2 = mutableObjectList;
                Object[] objArr = mutableObjectList2.content;
                int i6 = mutableObjectList2._size;
                for (int i7 = 0; i7 < i6; i7++) {
                    rawUpdate(objArr[i7]);
                }
                mutableIntObjectMap.remove(i3);
            }
            SlotTableKt.access$updateGroupSize(this.groups, groupIndexToAddress, i5);
            SlotTableKt.access$updateNodeCount(this.groups, groupIndexToAddress, i4);
            this.nodeCount = this.nodeCountStack.pop() + (access$isNode ? 1 : i4);
            int parent = parent(this.groups, i3);
            this.parent = parent;
            int size$runtime_release = parent < 0 ? getSize$runtime_release() : groupIndexToAddress(parent + 1);
            int dataIndex = size$runtime_release >= 0 ? dataIndex(this.groups, size$runtime_release) : 0;
            this.currentSlot = dataIndex;
            this.currentSlotEnd = dataIndex;
        } else {
            if (!(i == i2)) {
                ComposerKt.composeImmediateRuntimeError("Expected to be at the end of a group");
            }
            int access$groupSize = SlotTableKt.access$groupSize(this.groups, groupIndexToAddress);
            int access$nodeCount = SlotTableKt.access$nodeCount(this.groups, groupIndexToAddress);
            SlotTableKt.access$updateGroupSize(this.groups, groupIndexToAddress, i5);
            SlotTableKt.access$updateNodeCount(this.groups, groupIndexToAddress, i4);
            int pop = this.startStack.pop();
            restoreCurrentGroupEnd();
            this.parent = pop;
            int parent2 = parent(this.groups, i3);
            int pop2 = this.nodeCountStack.pop();
            this.nodeCount = pop2;
            if (parent2 == pop) {
                this.nodeCount = pop2 + (access$isNode ? 0 : i4 - access$nodeCount);
            } else {
                int i8 = i5 - access$groupSize;
                int i9 = access$isNode ? 0 : i4 - access$nodeCount;
                if (i8 != 0 || i9 != 0) {
                    while (parent2 != 0 && parent2 != pop && (i9 != 0 || i8 != 0)) {
                        int groupIndexToAddress2 = groupIndexToAddress(parent2);
                        if (i8 != 0) {
                            SlotTableKt.access$updateGroupSize(this.groups, groupIndexToAddress2, SlotTableKt.access$groupSize(this.groups, groupIndexToAddress2) + i8);
                        }
                        if (i9 != 0) {
                            int[] iArr = this.groups;
                            SlotTableKt.access$updateNodeCount(iArr, groupIndexToAddress2, SlotTableKt.access$nodeCount(iArr, groupIndexToAddress2) + i9);
                        }
                        if (SlotTableKt.access$isNode(this.groups, groupIndexToAddress2)) {
                            i9 = 0;
                        }
                        parent2 = parent(this.groups, parent2);
                    }
                }
                this.nodeCount += i9;
            }
        }
        return i4;
    }

    public final void ensureStarted(int index) {
        if (!(this.insertCount <= 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot call ensureStarted() while inserting");
        }
        int i = this.parent;
        if (i != index) {
            if (!(index >= i && index < this.currentGroupEnd)) {
                ComposerKt.composeImmediateRuntimeError("Started group at " + index + " must be a subgroup of the group at " + i);
            }
            int i2 = this.currentGroup;
            int i3 = this.currentSlot;
            int i4 = this.currentSlotEnd;
            this.currentGroup = index;
            startGroup();
            this.currentGroup = i2;
            this.currentSlot = i3;
            this.currentSlotEnd = i4;
        }
    }

    public final void ensureStarted(Anchor anchor) {
        ensureStarted(anchor.toIndexFor(this));
    }

    public final int skipGroup() {
        int groupIndexToAddress = groupIndexToAddress(this.currentGroup);
        int access$groupSize = this.currentGroup + SlotTableKt.access$groupSize(this.groups, groupIndexToAddress);
        this.currentGroup = access$groupSize;
        this.currentSlot = dataIndex(this.groups, groupIndexToAddress(access$groupSize));
        if (SlotTableKt.access$isNode(this.groups, groupIndexToAddress)) {
            return 1;
        }
        return SlotTableKt.access$nodeCount(this.groups, groupIndexToAddress);
    }

    public final boolean removeGroup() {
        Anchor tryAnchor$runtime_release;
        if (!(this.insertCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot remove group while inserting");
        }
        int i = this.currentGroup;
        int i2 = this.currentSlot;
        int dataIndex = dataIndex(this.groups, groupIndexToAddress(i));
        int skipGroup = skipGroup();
        GroupSourceInformation sourceInformationOf = sourceInformationOf(this.parent);
        if (sourceInformationOf != null && (tryAnchor$runtime_release = tryAnchor$runtime_release(i)) != null) {
            sourceInformationOf.removeAnchor(tryAnchor$runtime_release);
        }
        PrioritySet prioritySet = this.pendingRecalculateMarks;
        if (prioritySet != null) {
            while (prioritySet.isNotEmpty() && prioritySet.peek() >= i) {
                prioritySet.takeMax();
            }
        }
        boolean removeGroups = removeGroups(i, this.currentGroup - i);
        removeSlots(dataIndex, this.currentSlot - dataIndex, i - 1);
        this.currentGroup = i;
        this.currentSlot = i2;
        this.nodeCount -= skipGroup;
        return removeGroups;
    }

    public final Iterator<Object> groupSlots() {
        int dataIndex = dataIndex(this.groups, groupIndexToAddress(this.currentGroup));
        int[] iArr = this.groups;
        int i = this.currentGroup;
        return new SlotWriter$groupSlots$1(dataIndex, dataIndex(iArr, groupIndexToAddress(i + groupSize(i))), this);
    }

    public final void forEachData(int group, Function2<? super Integer, Object, Unit> block) {
        int slotIndex = slotIndex(this.groups, groupIndexToAddress(group));
        int dataIndex = dataIndex(this.groups, groupIndexToAddress(group + 1));
        for (int i = slotIndex; i < dataIndex; i++) {
            block.invoke(Integer.valueOf(i - slotIndex), this.slots[dataIndexToDataAddress(i)]);
        }
    }

    public final void forAllData(int group, Function2<? super Integer, Object, Unit> block) {
        int dataIndex = dataIndex(this.groups, groupIndexToAddress(getCurrentGroup() + groupSize(getCurrentGroup())));
        for (int dataIndex2 = dataIndex(this.groups, groupIndexToAddress(group)); dataIndex2 < dataIndex; dataIndex2++) {
            block.invoke(Integer.valueOf(dataIndex2), this.slots[dataIndexToDataAddress(dataIndex2)]);
        }
    }

    public final void moveGroup(int offset) {
        if (!(this.insertCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot move a group while inserting");
        }
        if (!(offset >= 0)) {
            ComposerKt.composeImmediateRuntimeError("Parameter offset is out of bounds");
        }
        if (offset == 0) {
            return;
        }
        int i = this.currentGroup;
        int i2 = this.parent;
        int i3 = this.currentGroupEnd;
        int i4 = i;
        for (int i5 = offset; i5 > 0; i5--) {
            i4 += SlotTableKt.access$groupSize(this.groups, groupIndexToAddress(i4));
            if (!(i4 <= i3)) {
                ComposerKt.composeImmediateRuntimeError("Parameter offset is out of bounds");
            }
        }
        int access$groupSize = SlotTableKt.access$groupSize(this.groups, groupIndexToAddress(i4));
        int dataIndex = dataIndex(this.groups, groupIndexToAddress(this.currentGroup));
        int dataIndex2 = dataIndex(this.groups, groupIndexToAddress(i4));
        int i6 = i4 + access$groupSize;
        int dataIndex3 = dataIndex(this.groups, groupIndexToAddress(i6));
        int i7 = dataIndex3 - dataIndex2;
        insertSlots(i7, Math.max(this.currentGroup - 1, 0));
        insertGroups(access$groupSize);
        int[] iArr = this.groups;
        int groupIndexToAddress = groupIndexToAddress(i6) * 5;
        ArraysKt.copyInto(iArr, iArr, groupIndexToAddress(i) * 5, groupIndexToAddress, (access$groupSize * 5) + groupIndexToAddress);
        if (i7 > 0) {
            Object[] objArr = this.slots;
            ArraysKt.copyInto(objArr, objArr, dataIndex, dataIndexToDataAddress(dataIndex2 + i7), dataIndexToDataAddress(dataIndex3 + i7));
        }
        int i8 = dataIndex2 + i7;
        int i9 = i8 - dataIndex;
        int i10 = this.slotsGapStart;
        int i11 = this.slotsGapLen;
        int length = this.slots.length;
        int i12 = this.slotsGapOwner;
        int i13 = i + access$groupSize;
        int i14 = i;
        while (i14 < i13) {
            int groupIndexToAddress2 = groupIndexToAddress(i14);
            int i15 = i10;
            int i16 = i9;
            updateDataIndex(iArr, groupIndexToAddress2, dataIndexToDataAnchor(dataIndex(iArr, groupIndexToAddress2) - i9, i12 < groupIndexToAddress2 ? 0 : i15, i11, length));
            i14++;
            i10 = i15;
            i9 = i16;
        }
        moveAnchors(i6, i, access$groupSize);
        if (!(!removeGroups(i6, access$groupSize))) {
            ComposerKt.composeImmediateRuntimeError("Unexpectedly removed anchors");
        }
        fixParentAnchorsFor(i2, this.currentGroupEnd, i);
        if (i7 > 0) {
            removeSlots(i8, i7, i6 - 1);
        }
    }

    /* compiled from: SlotTable.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J@\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0002¨\u0006\u000f"}, d2 = {"Landroidx/compose/runtime/SlotWriter$Companion;", "", "()V", "moveGroup", "", "Landroidx/compose/runtime/Anchor;", "fromWriter", "Landroidx/compose/runtime/SlotWriter;", "fromIndex", "", "toWriter", "updateFromCursor", "", "updateToCursor", "removeSourceGroup", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        static /* synthetic */ List moveGroup$default(Companion companion, SlotWriter slotWriter, int i, SlotWriter slotWriter2, boolean z, boolean z2, boolean z3, int i2, Object obj) {
            if ((i2 & 32) != 0) {
                z3 = true;
            }
            return companion.moveGroup(slotWriter, i, slotWriter2, z, z2, z3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:56:0x01c5  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x01d4  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x01e0  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x01ec  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x01d6  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.util.List<androidx.compose.runtime.Anchor> moveGroup(androidx.compose.runtime.SlotWriter r24, int r25, androidx.compose.runtime.SlotWriter r26, boolean r27, boolean r28, boolean r29) {
            /*
                Method dump skipped, instructions count: 496
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SlotWriter.Companion.moveGroup(androidx.compose.runtime.SlotWriter, int, androidx.compose.runtime.SlotWriter, boolean, boolean, boolean):java.util.List");
        }
    }

    public final List<Anchor> moveTo(Anchor anchor, int offset, SlotWriter writer) {
        ComposerKt.runtimeCheck(writer.insertCount > 0);
        ComposerKt.runtimeCheck(this.insertCount == 0);
        ComposerKt.runtimeCheck(anchor.getValid());
        int anchorIndex = anchorIndex(anchor) + offset;
        int i = this.currentGroup;
        ComposerKt.runtimeCheck(i <= anchorIndex && anchorIndex < this.currentGroupEnd);
        int parent = parent(anchorIndex);
        int groupSize = groupSize(anchorIndex);
        int nodeCount = isNode(anchorIndex) ? 1 : nodeCount(anchorIndex);
        List<Anchor> moveGroup$default = Companion.moveGroup$default(INSTANCE, this, anchorIndex, writer, false, false, false, 32, null);
        updateContainsMark(parent);
        boolean z = nodeCount > 0;
        while (parent >= i) {
            int groupIndexToAddress = groupIndexToAddress(parent);
            int[] iArr = this.groups;
            SlotTableKt.access$updateGroupSize(iArr, groupIndexToAddress, SlotTableKt.access$groupSize(iArr, groupIndexToAddress) - groupSize);
            if (z) {
                if (SlotTableKt.access$isNode(this.groups, groupIndexToAddress)) {
                    z = false;
                } else {
                    int[] iArr2 = this.groups;
                    SlotTableKt.access$updateNodeCount(iArr2, groupIndexToAddress, SlotTableKt.access$nodeCount(iArr2, groupIndexToAddress) - nodeCount);
                }
            }
            parent = parent(parent);
        }
        if (z) {
            ComposerKt.runtimeCheck(this.nodeCount >= nodeCount);
            this.nodeCount -= nodeCount;
        }
        return moveGroup$default;
    }

    public static /* synthetic */ List moveFrom$default(SlotWriter slotWriter, SlotTable slotTable, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        return slotWriter.moveFrom(slotTable, i, z);
    }

    public final List<Anchor> moveFrom(SlotTable table, int index, boolean removeSourceGroup) {
        ComposerKt.runtimeCheck(this.insertCount > 0);
        if (index == 0 && this.currentGroup == 0 && this.table.getGroupsSize() == 0 && SlotTableKt.access$groupSize(table.getGroups(), index) == table.getGroupsSize()) {
            int[] iArr = this.groups;
            Object[] objArr = this.slots;
            ArrayList<Anchor> arrayList = this.anchors;
            HashMap<Anchor, GroupSourceInformation> hashMap = this.sourceInformationMap;
            MutableIntObjectMap<MutableIntSet> mutableIntObjectMap = this.calledByMap;
            int[] groups = table.getGroups();
            int groupsSize = table.getGroupsSize();
            Object[] slots = table.getSlots();
            int slotsSize = table.getSlotsSize();
            HashMap<Anchor, GroupSourceInformation> sourceInformationMap$runtime_release = table.getSourceInformationMap$runtime_release();
            MutableIntObjectMap<MutableIntSet> calledByMap$runtime_release = table.getCalledByMap$runtime_release();
            this.groups = groups;
            this.slots = slots;
            this.anchors = table.getAnchors$runtime_release();
            this.groupGapStart = groupsSize;
            this.groupGapLen = (groups.length / 5) - groupsSize;
            this.slotsGapStart = slotsSize;
            this.slotsGapLen = slots.length - slotsSize;
            this.slotsGapOwner = groupsSize;
            this.sourceInformationMap = sourceInformationMap$runtime_release;
            this.calledByMap = calledByMap$runtime_release;
            table.setTo$runtime_release(iArr, 0, objArr, 0, arrayList, hashMap, mutableIntObjectMap);
            return this.anchors;
        }
        SlotWriter openWriter = table.openWriter();
        try {
            List<Anchor> moveGroup = INSTANCE.moveGroup(openWriter, index, this, true, true, removeSourceGroup);
            openWriter.close(true);
            return moveGroup;
        } catch (Throwable th) {
            openWriter.close(false);
            throw th;
        }
    }

    public final void bashCurrentGroup() {
        SlotTableKt.access$updateGroupKey(this.groups, this.currentGroup, -3);
    }

    public final List<Anchor> moveIntoGroupFrom(int offset, SlotTable table, int index) {
        ComposerKt.runtimeCheck(this.insertCount <= 0 && groupSize(this.currentGroup + offset) == 1);
        int i = this.currentGroup;
        int i2 = this.currentSlot;
        int i3 = this.currentSlotEnd;
        advanceBy(offset);
        startGroup();
        beginInsert();
        SlotWriter openWriter = table.openWriter();
        try {
            List<Anchor> moveGroup$default = Companion.moveGroup$default(INSTANCE, openWriter, index, this, false, true, false, 32, null);
            openWriter.close(true);
            endInsert();
            endGroup();
            this.currentGroup = i;
            this.currentSlot = i2;
            this.currentSlotEnd = i3;
            return moveGroup$default;
        } catch (Throwable th) {
            openWriter.close(false);
            throw th;
        }
    }

    public static /* synthetic */ Anchor anchor$default(SlotWriter slotWriter, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = slotWriter.currentGroup;
        }
        return slotWriter.anchor(i);
    }

    public final Anchor anchor(int index) {
        ArrayList<Anchor> arrayList = this.anchors;
        int access$search = SlotTableKt.access$search(arrayList, index, getSize$runtime_release());
        if (access$search < 0) {
            if (index > this.groupGapStart) {
                index = -(getSize$runtime_release() - index);
            }
            Anchor anchor = new Anchor(index);
            arrayList.add(-(access$search + 1), anchor);
            return anchor;
        }
        return arrayList.get(access$search);
    }

    public static /* synthetic */ void markGroup$default(SlotWriter slotWriter, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = slotWriter.parent;
        }
        slotWriter.markGroup(i);
    }

    public final void markGroup(int group) {
        int groupIndexToAddress = groupIndexToAddress(group);
        if (SlotTableKt.access$hasMark(this.groups, groupIndexToAddress)) {
            return;
        }
        SlotTableKt.access$updateMark(this.groups, groupIndexToAddress, true);
        if (SlotTableKt.access$containsMark(this.groups, groupIndexToAddress)) {
            return;
        }
        updateContainsMark(parent(group));
    }

    private final boolean containsGroupMark(int group) {
        return group >= 0 && SlotTableKt.access$containsMark(this.groups, groupIndexToAddress(group));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean containsAnyGroupMarks(int group) {
        return group >= 0 && SlotTableKt.access$containsAnyMark(this.groups, groupIndexToAddress(group));
    }

    private final void recalculateMarks() {
        PrioritySet prioritySet = this.pendingRecalculateMarks;
        if (prioritySet != null) {
            while (prioritySet.isNotEmpty()) {
                updateContainsMarkNow(prioritySet.takeMax(), prioritySet);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateContainsMark(int group) {
        if (group >= 0) {
            PrioritySet prioritySet = this.pendingRecalculateMarks;
            if (prioritySet == null) {
                prioritySet = new PrioritySet(null, 1, 0 == true ? 1 : 0);
                this.pendingRecalculateMarks = prioritySet;
            }
            prioritySet.add(group);
        }
    }

    private final void updateContainsMarkNow(int group, PrioritySet set) {
        int groupIndexToAddress = groupIndexToAddress(group);
        boolean childContainsAnyMarks = childContainsAnyMarks(group);
        if (SlotTableKt.access$containsMark(this.groups, groupIndexToAddress) != childContainsAnyMarks) {
            SlotTableKt.access$updateContainsMark(this.groups, groupIndexToAddress, childContainsAnyMarks);
            int parent = parent(group);
            if (parent >= 0) {
                set.add(parent);
            }
        }
    }

    private final boolean childContainsAnyMarks(int group) {
        int i = group + 1;
        int groupSize = group + groupSize(group);
        while (i < groupSize) {
            if (SlotTableKt.access$containsAnyMark(this.groups, groupIndexToAddress(i))) {
                return true;
            }
            i += groupSize(i);
        }
        return false;
    }

    public final int anchorIndex(Anchor anchor) {
        int location = anchor.getLocation();
        return location < 0 ? location + getSize$runtime_release() : location;
    }

    public String toString() {
        return "SlotWriter(current = " + this.currentGroup + " end=" + this.currentGroupEnd + " size = " + getSize$runtime_release() + " gap=" + this.groupGapStart + '-' + (this.groupGapStart + this.groupGapLen) + ')';
    }

    private final void saveCurrentGroupEnd() {
        this.endStack.push((getCapacity() - this.groupGapLen) - this.currentGroupEnd);
    }

    private final int restoreCurrentGroupEnd() {
        int capacity = (getCapacity() - this.groupGapLen) - this.endStack.pop();
        this.currentGroupEnd = capacity;
        return capacity;
    }

    private final void fixParentAnchorsFor(int parent, int endGroup, int firstChild) {
        int parentIndexToAnchor = parentIndexToAnchor(parent, this.groupGapStart);
        while (firstChild < endGroup) {
            SlotTableKt.access$updateParentAnchor(this.groups, groupIndexToAddress(firstChild), parentIndexToAnchor);
            int access$groupSize = SlotTableKt.access$groupSize(this.groups, groupIndexToAddress(firstChild)) + firstChild;
            fixParentAnchorsFor(firstChild, access$groupSize, firstChild + 1);
            firstChild = access$groupSize;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void moveGroupGapTo(int index) {
        int i = this.groupGapLen;
        int i2 = this.groupGapStart;
        if (i2 != index) {
            if (!this.anchors.isEmpty()) {
                updateAnchors(i2, index);
            }
            if (i > 0) {
                int[] iArr = this.groups;
                int i3 = index * 5;
                int i4 = i * 5;
                int i5 = i2 * 5;
                if (index < i2) {
                    ArraysKt.copyInto(iArr, iArr, i4 + i3, i3, i5);
                } else {
                    ArraysKt.copyInto(iArr, iArr, i5, i5 + i4, i3 + i4);
                }
            }
            if (index < i2) {
                i2 = index + i;
            }
            int capacity = getCapacity();
            ComposerKt.runtimeCheck(i2 < capacity);
            while (i2 < capacity) {
                int access$parentAnchor = SlotTableKt.access$parentAnchor(this.groups, i2);
                int parentIndexToAnchor = parentIndexToAnchor(parentAnchorToIndex(access$parentAnchor), index);
                if (parentIndexToAnchor != access$parentAnchor) {
                    SlotTableKt.access$updateParentAnchor(this.groups, i2, parentIndexToAnchor);
                }
                i2++;
                if (i2 == index) {
                    i2 += i;
                }
            }
        }
        this.groupGapStart = index;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void moveSlotGapTo(int index, int group) {
        int i = this.slotsGapLen;
        int i2 = this.slotsGapStart;
        int i3 = this.slotsGapOwner;
        if (i2 != index) {
            Object[] objArr = this.slots;
            if (index < i2) {
                ArraysKt.copyInto(objArr, objArr, index + i, index, i2);
            } else {
                ArraysKt.copyInto(objArr, objArr, i2, i2 + i, index + i);
            }
        }
        int min = Math.min(group + 1, getSize$runtime_release());
        if (i3 != min) {
            int length = this.slots.length - i;
            if (min < i3) {
                int groupIndexToAddress = groupIndexToAddress(min);
                int groupIndexToAddress2 = groupIndexToAddress(i3);
                int i4 = this.groupGapStart;
                while (groupIndexToAddress < groupIndexToAddress2) {
                    int access$dataAnchor = SlotTableKt.access$dataAnchor(this.groups, groupIndexToAddress);
                    if (!(access$dataAnchor >= 0)) {
                        ComposerKt.composeImmediateRuntimeError("Unexpected anchor value, expected a positive anchor");
                    }
                    SlotTableKt.access$updateDataAnchor(this.groups, groupIndexToAddress, -((length - access$dataAnchor) + 1));
                    groupIndexToAddress++;
                    if (groupIndexToAddress == i4) {
                        groupIndexToAddress += this.groupGapLen;
                    }
                }
            } else {
                int groupIndexToAddress3 = groupIndexToAddress(i3);
                int groupIndexToAddress4 = groupIndexToAddress(min);
                while (groupIndexToAddress3 < groupIndexToAddress4) {
                    int access$dataAnchor2 = SlotTableKt.access$dataAnchor(this.groups, groupIndexToAddress3);
                    if (!(access$dataAnchor2 < 0)) {
                        ComposerKt.composeImmediateRuntimeError("Unexpected anchor value, expected a negative anchor");
                    }
                    SlotTableKt.access$updateDataAnchor(this.groups, groupIndexToAddress3, access$dataAnchor2 + length + 1);
                    groupIndexToAddress3++;
                    if (groupIndexToAddress3 == this.groupGapStart) {
                        groupIndexToAddress3 += this.groupGapLen;
                    }
                }
            }
            this.slotsGapOwner = min;
        }
        this.slotsGapStart = index;
    }

    private final void clearSlotGap() {
        int i = this.slotsGapStart;
        ArraysKt.fill(this.slots, (Object) null, i, this.slotsGapLen + i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void insertGroups(int size) {
        if (size > 0) {
            int i = this.currentGroup;
            moveGroupGapTo(i);
            int i2 = this.groupGapStart;
            int i3 = this.groupGapLen;
            int[] iArr = this.groups;
            int length = iArr.length / 5;
            int i4 = length - i3;
            if (i3 < size) {
                int max = Math.max(Math.max(length * 2, i4 + size), 32);
                int[] iArr2 = new int[max * 5];
                int i5 = max - i4;
                ArraysKt.copyInto(iArr, iArr2, 0, 0, i2 * 5);
                ArraysKt.copyInto(iArr, iArr2, (i2 + i5) * 5, (i3 + i2) * 5, length * 5);
                this.groups = iArr2;
                i3 = i5;
            }
            int i6 = this.currentGroupEnd;
            if (i6 >= i2) {
                this.currentGroupEnd = i6 + size;
            }
            int i7 = i2 + size;
            this.groupGapStart = i7;
            this.groupGapLen = i3 - size;
            int dataIndexToDataAnchor = dataIndexToDataAnchor(i4 > 0 ? dataIndex(i + size) : 0, this.slotsGapOwner >= i2 ? this.slotsGapStart : 0, this.slotsGapLen, this.slots.length);
            for (int i8 = i2; i8 < i7; i8++) {
                SlotTableKt.access$updateDataAnchor(this.groups, i8, dataIndexToDataAnchor);
            }
            int i9 = this.slotsGapOwner;
            if (i9 >= i2) {
                this.slotsGapOwner = i9 + size;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void insertSlots(int size, int group) {
        if (size > 0) {
            moveSlotGapTo(this.currentSlot, group);
            int i = this.slotsGapStart;
            int i2 = this.slotsGapLen;
            if (i2 < size) {
                Object[] objArr = this.slots;
                int length = objArr.length;
                int i3 = length - i2;
                int max = Math.max(Math.max(length * 2, i3 + size), 32);
                Object[] objArr2 = new Object[max];
                for (int i4 = 0; i4 < max; i4++) {
                    objArr2[i4] = null;
                }
                int i5 = max - i3;
                ArraysKt.copyInto(objArr, objArr2, 0, 0, i);
                ArraysKt.copyInto(objArr, objArr2, i + i5, i2 + i, length);
                this.slots = objArr2;
                i2 = i5;
            }
            int i6 = this.currentSlotEnd;
            if (i6 >= i) {
                this.currentSlotEnd = i6 + size;
            }
            this.slotsGapStart = i + size;
            this.slotsGapLen = i2 - size;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean removeGroups(int start, int len) {
        if (len > 0) {
            ArrayList<Anchor> arrayList = this.anchors;
            moveGroupGapTo(start);
            r0 = arrayList.isEmpty() ^ true ? removeAnchors(start, len, this.sourceInformationMap) : false;
            this.groupGapStart = start;
            this.groupGapLen += len;
            int i = this.slotsGapOwner;
            if (i > start) {
                this.slotsGapOwner = Math.max(start, i - len);
            }
            int i2 = this.currentGroupEnd;
            if (i2 >= this.groupGapStart) {
                this.currentGroupEnd = i2 - len;
            }
            int i3 = this.parent;
            if (containsGroupMark(i3)) {
                updateContainsMark(i3);
            }
        }
        return r0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GroupSourceInformation sourceInformationOf(int group) {
        Anchor tryAnchor$runtime_release;
        HashMap<Anchor, GroupSourceInformation> hashMap = this.sourceInformationMap;
        if (hashMap == null || (tryAnchor$runtime_release = tryAnchor$runtime_release(group)) == null) {
            return null;
        }
        return hashMap.get(tryAnchor$runtime_release);
    }

    public final Anchor tryAnchor$runtime_release(int group) {
        if (group < 0 || group >= getSize$runtime_release()) {
            return null;
        }
        return SlotTableKt.access$find(this.anchors, group, getSize$runtime_release());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeSlots(int start, int len, int group) {
        if (len > 0) {
            int i = this.slotsGapLen;
            int i2 = start + len;
            moveSlotGapTo(i2, group);
            this.slotsGapStart = start;
            this.slotsGapLen = i + len;
            ArraysKt.fill(this.slots, (Object) null, start, i2);
            int i3 = this.currentSlotEnd;
            if (i3 >= start) {
                this.currentSlotEnd = i3 - len;
            }
        }
    }

    private final void updateNodeOfGroup(int index, Object value) {
        int groupIndexToAddress = groupIndexToAddress(index);
        int[] iArr = this.groups;
        if (!(groupIndexToAddress < iArr.length && SlotTableKt.access$isNode(iArr, groupIndexToAddress))) {
            ComposerKt.composeImmediateRuntimeError("Updating the node of a group at " + index + " that was not created with as a node group");
        }
        this.slots[dataIndexToDataAddress(nodeIndex(this.groups, groupIndexToAddress))] = value;
    }

    private final void updateAnchors(int previousGapStart, int newGapStart) {
        Anchor anchor;
        int location;
        Anchor anchor2;
        int location2;
        int i;
        int capacity = getCapacity() - this.groupGapLen;
        if (previousGapStart < newGapStart) {
            for (int access$locationOf = SlotTableKt.access$locationOf(this.anchors, previousGapStart, capacity); access$locationOf < this.anchors.size() && (location2 = (anchor2 = this.anchors.get(access$locationOf)).getLocation()) < 0 && (i = location2 + capacity) < newGapStart; access$locationOf++) {
                anchor2.setLocation$runtime_release(i);
            }
            return;
        }
        for (int access$locationOf2 = SlotTableKt.access$locationOf(this.anchors, newGapStart, capacity); access$locationOf2 < this.anchors.size() && (location = (anchor = this.anchors.get(access$locationOf2)).getLocation()) >= 0; access$locationOf2++) {
            anchor.setLocation$runtime_release(-(capacity - location));
        }
    }

    private final boolean removeAnchors(int gapStart, int size, HashMap<Anchor, GroupSourceInformation> sourceInformationMap) {
        int i = size + gapStart;
        int access$locationOf = SlotTableKt.access$locationOf(this.anchors, i, getCapacity() - this.groupGapLen);
        if (access$locationOf >= this.anchors.size()) {
            access$locationOf--;
        }
        int i2 = access$locationOf + 1;
        int i3 = 0;
        while (access$locationOf >= 0) {
            Anchor anchor = this.anchors.get(access$locationOf);
            int anchorIndex = anchorIndex(anchor);
            if (anchorIndex < gapStart) {
                break;
            }
            if (anchorIndex < i) {
                anchor.setLocation$runtime_release(Integer.MIN_VALUE);
                if (sourceInformationMap != null) {
                    sourceInformationMap.remove(anchor);
                }
                if (i3 == 0) {
                    i3 = access$locationOf + 1;
                }
                i2 = access$locationOf;
            }
            access$locationOf--;
        }
        boolean z = i2 < i3;
        if (z) {
            this.anchors.subList(i2, i3).clear();
        }
        return z;
    }

    private final void moveAnchors(int originalLocation, int newLocation, int size) {
        Anchor anchor;
        int anchorIndex;
        int i = size + originalLocation;
        int size$runtime_release = getSize$runtime_release();
        int access$locationOf = SlotTableKt.access$locationOf(this.anchors, originalLocation, size$runtime_release);
        ArrayList arrayList = new ArrayList();
        if (access$locationOf >= 0) {
            while (access$locationOf < this.anchors.size() && (anchorIndex = anchorIndex((anchor = this.anchors.get(access$locationOf)))) >= originalLocation && anchorIndex < i) {
                arrayList.add(anchor);
                this.anchors.remove(access$locationOf);
            }
        }
        int i2 = newLocation - originalLocation;
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            Anchor anchor2 = (Anchor) arrayList.get(i3);
            int anchorIndex2 = anchorIndex(anchor2) + i2;
            if (anchorIndex2 >= this.groupGapStart) {
                anchor2.setLocation$runtime_release(-(size$runtime_release - anchorIndex2));
            } else {
                anchor2.setLocation$runtime_release(anchorIndex2);
            }
            this.anchors.add(SlotTableKt.access$locationOf(this.anchors, anchorIndex2, size$runtime_release), anchor2);
        }
    }

    public final String toDebugString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder append = sb.append(toString());
        Intrinsics.checkNotNullExpressionValue(append, "append(value)");
        Intrinsics.checkNotNullExpressionValue(append.append('\n'), "append('\\n')");
        StringBuilder append2 = sb.append("  parent:    " + this.parent);
        Intrinsics.checkNotNullExpressionValue(append2, "append(value)");
        Intrinsics.checkNotNullExpressionValue(append2.append('\n'), "append('\\n')");
        StringBuilder append3 = sb.append("  current:   " + this.currentGroup);
        Intrinsics.checkNotNullExpressionValue(append3, "append(value)");
        Intrinsics.checkNotNullExpressionValue(append3.append('\n'), "append('\\n')");
        StringBuilder append4 = sb.append("  group gap: " + this.groupGapStart + '-' + (this.groupGapStart + this.groupGapLen) + '(' + this.groupGapLen + ')');
        Intrinsics.checkNotNullExpressionValue(append4, "append(value)");
        Intrinsics.checkNotNullExpressionValue(append4.append('\n'), "append('\\n')");
        StringBuilder append5 = sb.append("  slots gap: " + this.slotsGapStart + '-' + (this.slotsGapStart + this.slotsGapLen) + '(' + this.slotsGapLen + ')');
        Intrinsics.checkNotNullExpressionValue(append5, "append(value)");
        Intrinsics.checkNotNullExpressionValue(append5.append('\n'), "append('\\n')");
        StringBuilder append6 = sb.append("  gap owner: " + this.slotsGapOwner);
        Intrinsics.checkNotNullExpressionValue(append6, "append(value)");
        Intrinsics.checkNotNullExpressionValue(append6.append('\n'), "append('\\n')");
        int size$runtime_release = getSize$runtime_release();
        for (int i = 0; i < size$runtime_release; i++) {
            groupAsString(sb, i);
            sb.append('\n');
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    private final void groupAsString(StringBuilder sb, int i) {
        int groupIndexToAddress = groupIndexToAddress(i);
        sb.append("Group(");
        if (i < 10) {
            sb.append(' ');
        }
        if (i < 100) {
            sb.append(' ');
        }
        if (i < 1000) {
            sb.append(' ');
        }
        sb.append(i);
        if (groupIndexToAddress != i) {
            sb.append("(");
            sb.append(groupIndexToAddress);
            sb.append(")");
        }
        sb.append('#');
        sb.append(SlotTableKt.access$groupSize(this.groups, groupIndexToAddress));
        sb.append('^');
        sb.append(parentAnchorToIndex(SlotTableKt.access$parentAnchor(this.groups, groupIndexToAddress)));
        sb.append(": key=");
        sb.append(SlotTableKt.access$key(this.groups, groupIndexToAddress));
        sb.append(", nodes=");
        sb.append(SlotTableKt.access$nodeCount(this.groups, groupIndexToAddress));
        sb.append(", dataAnchor=");
        sb.append(SlotTableKt.access$dataAnchor(this.groups, groupIndexToAddress));
        sb.append(", parentAnchor=");
        sb.append(SlotTableKt.access$parentAnchor(this.groups, groupIndexToAddress));
        if (SlotTableKt.access$isNode(this.groups, groupIndexToAddress)) {
            sb.append(", node=" + SlotTableKt.access$summarize(String.valueOf(this.slots[dataIndexToDataAddress(nodeIndex(this.groups, groupIndexToAddress))]), 10));
        }
        int slotIndex = slotIndex(this.groups, groupIndexToAddress);
        int dataIndex = dataIndex(this.groups, groupIndexToAddress(i + 1));
        if (dataIndex > slotIndex) {
            sb.append(", [");
            for (int i2 = slotIndex; i2 < dataIndex; i2++) {
                if (i2 != slotIndex) {
                    sb.append(", ");
                }
                sb.append(String.valueOf(SlotTableKt.access$summarize(String.valueOf(this.slots[dataIndexToDataAddress(i2)]), 10)));
            }
            sb.append(']');
        }
        sb.append(")");
    }

    public final void verifyDataAnchors$runtime_release() {
        int i = this.slotsGapOwner;
        int length = this.slots.length - this.slotsGapLen;
        int size$runtime_release = getSize$runtime_release();
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        while (i2 < size$runtime_release) {
            int groupIndexToAddress = groupIndexToAddress(i2);
            int access$dataAnchor = SlotTableKt.access$dataAnchor(this.groups, groupIndexToAddress);
            int dataIndex = dataIndex(this.groups, groupIndexToAddress);
            if (!(dataIndex >= i3)) {
                PreconditionsKt.throwIllegalStateException("Data index out of order at " + i2 + ", previous = " + i3 + ", current = " + dataIndex);
            }
            if (!(dataIndex <= length)) {
                PreconditionsKt.throwIllegalStateException("Data index, " + dataIndex + ", out of bound at " + i2);
            }
            if (access$dataAnchor < 0 && !z) {
                if (!(i == i2)) {
                    PreconditionsKt.throwIllegalStateException("Expected the slot gap owner to be " + i + " found gap at " + i2);
                }
                z = true;
            }
            i2++;
            i3 = dataIndex;
        }
    }

    public final void verifyParentAnchors$runtime_release() {
        int i = this.groupGapStart;
        int i2 = this.groupGapLen;
        int capacity = getCapacity();
        int i3 = 0;
        while (true) {
            if (i3 >= i) {
                break;
            }
            if (!(SlotTableKt.access$parentAnchor(this.groups, i3) > -2)) {
                PreconditionsKt.throwIllegalStateException("Expected a start relative anchor at " + i3);
            }
            i3++;
        }
        for (int i4 = i2 + i; i4 < capacity; i4++) {
            int access$parentAnchor = SlotTableKt.access$parentAnchor(this.groups, i4);
            if (parentAnchorToIndex(access$parentAnchor) < i) {
                if (!(access$parentAnchor > -2)) {
                    PreconditionsKt.throwIllegalStateException("Expected a start relative anchor at " + i4);
                }
            } else if (!(access$parentAnchor <= -2)) {
                PreconditionsKt.throwIllegalStateException("Expected an end relative anchor at " + i4);
            }
        }
    }

    public final int getSize$runtime_release() {
        return getCapacity() - this.groupGapLen;
    }

    private final int getCapacity() {
        return this.groups.length / 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int groupIndexToAddress(int index) {
        return index < this.groupGapStart ? index : index + this.groupGapLen;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dataIndexToDataAddress(int dataIndex) {
        return dataIndex < this.slotsGapStart ? dataIndex : dataIndex + this.slotsGapLen;
    }

    private final int parent(int[] iArr, int i) {
        return parentAnchorToIndex(SlotTableKt.access$parentAnchor(iArr, groupIndexToAddress(i)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dataIndex(int index) {
        return dataIndex(this.groups, groupIndexToAddress(index));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dataIndex(int[] iArr, int i) {
        return i >= getCapacity() ? this.slots.length - this.slotsGapLen : dataAnchorToDataIndex(SlotTableKt.access$dataAnchor(iArr, i), this.slotsGapLen, this.slots.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int slotIndex(int[] iArr, int i) {
        return i >= getCapacity() ? this.slots.length - this.slotsGapLen : dataAnchorToDataIndex(SlotTableKt.access$slotAnchor(iArr, i), this.slotsGapLen, this.slots.length);
    }

    private final void updateDataIndex(int[] iArr, int i, int i2) {
        SlotTableKt.access$updateDataAnchor(iArr, i, dataIndexToDataAnchor(i2, this.slotsGapStart, this.slotsGapLen, this.slots.length));
    }

    private final int nodeIndex(int[] iArr, int i) {
        return dataIndex(iArr, i);
    }

    private final int auxIndex(int[] iArr, int i) {
        return dataIndex(iArr, i) + SlotTableKt.access$countOneBits(SlotTableKt.access$groupInfo(iArr, i) >> 29);
    }

    private final List<Integer> dataIndexes(int[] iArr) {
        List dataAnchors$default = SlotTableKt.dataAnchors$default(this.groups, 0, 1, null);
        List plus = CollectionsKt.plus((Collection) CollectionsKt.slice(dataAnchors$default, RangesKt.until(0, this.groupGapStart)), (Iterable) CollectionsKt.slice(dataAnchors$default, RangesKt.until(this.groupGapStart + this.groupGapLen, iArr.length / 5)));
        ArrayList arrayList = new ArrayList(plus.size());
        int size = plus.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(Integer.valueOf(dataAnchorToDataIndex(((Number) plus.get(i)).intValue(), this.slotsGapLen, this.slots.length)));
        }
        return arrayList;
    }

    private final List<Integer> keys() {
        List keys$default = SlotTableKt.keys$default(this.groups, 0, 1, null);
        ArrayList arrayList = new ArrayList(keys$default.size());
        int size = keys$default.size();
        for (int i = 0; i < size; i++) {
            Object obj = keys$default.get(i);
            ((Number) obj).intValue();
            int i2 = this.groupGapStart;
            if (i < i2 || i >= i2 + this.groupGapLen) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final int parentIndexToAnchor(int index, int gapStart) {
        return index < gapStart ? index : -((getSize$runtime_release() - index) + 2);
    }

    private final int parentAnchorToIndex(int index) {
        return index > -2 ? index : getSize$runtime_release() + index + 2;
    }
}
