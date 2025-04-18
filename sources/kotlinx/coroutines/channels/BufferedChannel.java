package kotlinx.coroutines.channels;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.i;
import eb.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.internal.LowPriorityInOverloadResolution;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.Volatile;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.a;
import kotlin.time.DurationKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.internal.ConcurrentLinkedListKt;
import kotlinx.coroutines.internal.ConcurrentLinkedListNode;
import kotlinx.coroutines.internal.InlineList;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.SegmentOrClosed;
import kotlinx.coroutines.internal.StackTraceRecoveryKt;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.selects.SelectClause1;
import kotlinx.coroutines.selects.SelectClause1Impl;
import kotlinx.coroutines.selects.SelectClause2;
import kotlinx.coroutines.selects.SelectClause2Impl;
import kotlinx.coroutines.selects.SelectImplementation;
import kotlinx.coroutines.selects.SelectInstance;
import kotlinx.coroutines.selects.TrySelectDetailedResult;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\"\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0004Þ\u0001ß\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\"\b\u0002\u0010\u0005\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\b¢\u0006\u0002\u0010\tJ\u0010\u0010P\u001a\u00020\u001c2\u0006\u0010Q\u001a\u00020\u0010H\u0002J\u0006\u0010R\u001a\u00020\u0007J\u0010\u0010R\u001a\u00020\u001c2\b\u0010S\u001a\u0004\u0018\u00010\u0016J\u0016\u0010R\u001a\u00020\u00072\u000e\u0010S\u001a\n\u0018\u00010Tj\u0004\u0018\u0001`UJ\u0017\u0010V\u001a\u00020\u001c2\b\u0010S\u001a\u0004\u0018\u00010\u0016H\u0010¢\u0006\u0002\bWJ\u001e\u0010X\u001a\u00020\u00072\f\u0010Y\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010K\u001a\u00020\u0010H\u0002J\u0006\u0010Z\u001a\u00020\u0007J\u0012\u0010[\u001a\u00020\u001c2\b\u0010S\u001a\u0004\u0018\u00010\u0016H\u0016J\u000e\u0010\\\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0002J\u001a\u0010]\u001a\u00020\u001c2\b\u0010S\u001a\u0004\u0018\u00010\u00162\u0006\u0010R\u001a\u00020\u001cH\u0014J\u0010\u0010^\u001a\u00020\u00072\u0006\u0010_\u001a\u00020\u0010H\u0002J\u0016\u0010`\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010_\u001a\u00020\u0010H\u0002J\b\u0010a\u001a\u00020\u0007H\u0002J\u0010\u0010b\u001a\u00020\u00072\u0006\u0010c\u001a\u00020\u0010H\u0004J\b\u0010d\u001a\u00020\u0007H\u0002J.\u0010e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00142\u0006\u0010f\u001a\u00020\u00102\f\u0010g\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010h\u001a\u00020\u0010H\u0002J&\u0010i\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00142\u0006\u0010f\u001a\u00020\u00102\f\u0010g\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0002J&\u0010j\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00142\u0006\u0010f\u001a\u00020\u00102\f\u0010g\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0002J\r\u0010k\u001a\u00020\u001cH\u0000¢\u0006\u0002\blJ\u0012\u0010m\u001a\u00020\u00072\b\b\u0002\u0010n\u001a\u00020\u0010H\u0002J\b\u0010o\u001a\u00020\u0007H\u0002J-\u0010p\u001a\u00020\u00072#\u0010q\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0016¢\u0006\f\b:\u0012\b\b;\u0012\u0004\b\b(S\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J&\u0010r\u001a\u00020\u001c2\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0006\u0010u\u001a\u00020\u0010H\u0002J\u0018\u0010v\u001a\u00020\u001c2\u0006\u0010w\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u000f\u0010x\u001a\b\u0012\u0004\u0012\u00028\u00000yH\u0096\u0002J\u0016\u0010z\u001a\u00020\u00102\f\u0010Y\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0002J\b\u0010{\u001a\u00020\u0007H\u0002J\b\u0010|\u001a\u00020\u0007H\u0002J\b\u0010}\u001a\u00020\u0007H\u0002J\u001e\u0010~\u001a\u00020\u00072\u0006\u0010f\u001a\u00020\u00102\f\u0010g\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0002J\b\u0010\u007f\u001a\u00020\u0007H\u0014J\"\u0010\u0080\u0001\u001a\u00020\u00072\u0014\u0010\u0081\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000,0\u0082\u0001H\u0002ø\u0001\u0000J\u0019\u0010\u0083\u0001\u001a\u00020\u00072\u000e\u0010\u0081\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0082\u0001H\u0002J\u0015\u0010\u0084\u0001\u001a\u00020\u00072\n\u0010<\u001a\u0006\u0012\u0002\b\u000309H\u0002J$\u0010\u0085\u0001\u001a\u00020\u00072\u0007\u0010\u0086\u0001\u001a\u00028\u00002\n\u0010<\u001a\u0006\u0012\u0002\b\u000309H\u0002¢\u0006\u0003\u0010\u0087\u0001J\u001c\u0010\u0088\u0001\u001a\u00020\u00072\u0007\u0010\u0086\u0001\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0003\u0010\u0089\u0001J(\u0010\u008a\u0001\u001a\u00020\u00072\u0007\u0010\u0086\u0001\u001a\u00028\u00002\u000e\u0010\u0081\u0001\u001a\t\u0012\u0004\u0012\u00020\u00070\u0082\u0001H\u0002¢\u0006\u0003\u0010\u008b\u0001J\t\u0010\u008c\u0001\u001a\u00020\u0007H\u0014J\t\u0010\u008d\u0001\u001a\u00020\u0007H\u0014J!\u0010\u008e\u0001\u001a\u0004\u0018\u00010\f2\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010\f2\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010\fH\u0002J!\u0010\u0091\u0001\u001a\u0004\u0018\u00010\f2\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010\f2\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010\fH\u0002J!\u0010\u0092\u0001\u001a\u0004\u0018\u00010\f2\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010\f2\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010\fH\u0002J!\u0010\u0093\u0001\u001a\u0004\u0018\u00010\f2\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010\f2\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010\fH\u0002J\u0013\u0010\u0094\u0001\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0003\u0010\u0095\u0001J%\u0010\u0096\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000,H\u0096@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0006\b\u0097\u0001\u0010\u0095\u0001JD\u0010\u0098\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000,2\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0007\u0010\u0099\u0001\u001a\u00020\u0010H\u0082@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\u008c\u0002\u0010\u009c\u0001\u001a\u0003H\u009d\u0001\"\u0005\b\u0001\u0010\u009d\u00012\t\u0010\u009e\u0001\u001a\u0004\u0018\u00010\f2$\u0010\u009f\u0001\u001a\u001f\u0012\u0014\u0012\u00128\u0000¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(\u0086\u0001\u0012\u0005\u0012\u0003H\u009d\u00010\u00062V\u0010 \u0001\u001aQ\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(¡\u0001\u0012\u0014\u0012\u00120\u0004¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(¢\u0001\u0012\u0014\u0012\u00120\u0010¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(\u0099\u0001\u0012\u0005\u0012\u0003H\u009d\u0001082\u000f\u0010£\u0001\u001a\n\u0012\u0005\u0012\u0003H\u009d\u00010¤\u00012X\b\u0002\u0010¥\u0001\u001aQ\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(¡\u0001\u0012\u0014\u0012\u00120\u0004¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(¢\u0001\u0012\u0014\u0012\u00120\u0010¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(\u0099\u0001\u0012\u0005\u0012\u0003H\u009d\u000108H\u0082\b¢\u0006\u0003\u0010¦\u0001Jh\u0010§\u0001\u001a\u00020\u00072\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0007\u0010\u0099\u0001\u001a\u00020\u00102\b\u0010\u009e\u0001\u001a\u00030¨\u00012#\u0010\u009f\u0001\u001a\u001e\u0012\u0014\u0012\u00128\u0000¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(\u0086\u0001\u0012\u0004\u0012\u00020\u00070\u00062\u000e\u0010£\u0001\u001a\t\u0012\u0004\u0012\u00020\u00070¤\u0001H\u0082\bJ2\u0010©\u0001\u001a\u00028\u00002\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0007\u0010\u0099\u0001\u001a\u00020\u0010H\u0082@ø\u0001\u0000¢\u0006\u0003\u0010\u009b\u0001J \u0010ª\u0001\u001a\u00020\u00072\n\u0010<\u001a\u0006\u0012\u0002\b\u0003092\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010\fH\u0002J \u0010«\u0001\u001a\u00020\u00072\n\u0010<\u001a\u0006\u0012\u0002\b\u0003092\t\u0010\u0086\u0001\u001a\u0004\u0018\u00010\fH\u0014J\u0017\u0010¬\u0001\u001a\u00020\u00072\f\u0010Y\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0002J\u001c\u0010\u00ad\u0001\u001a\u00020\u00072\u0007\u0010\u0086\u0001\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0003\u0010\u0089\u0001J\u001f\u0010®\u0001\u001a\u00020\u001c2\u0007\u0010\u0086\u0001\u001a\u00028\u0000H\u0090@ø\u0001\u0000¢\u0006\u0006\b¯\u0001\u0010\u0089\u0001J\u0082\u0002\u0010°\u0001\u001a\u0003H\u009d\u0001\"\u0005\b\u0001\u0010\u009d\u00012\u0007\u0010\u0086\u0001\u001a\u00028\u00002\t\u0010\u009e\u0001\u001a\u0004\u0018\u00010\f2\u000f\u0010±\u0001\u001a\n\u0012\u0005\u0012\u0003H\u009d\u00010¤\u00012A\u0010 \u0001\u001a<\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(¡\u0001\u0012\u0014\u0012\u00120\u0004¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(¢\u0001\u0012\u0005\u0012\u0003H\u009d\u00010²\u00012\u000f\u0010£\u0001\u001a\n\u0012\u0005\u0012\u0003H\u009d\u00010¤\u00012o\b\u0002\u0010¥\u0001\u001ah\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(¡\u0001\u0012\u0014\u0012\u00120\u0004¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(¢\u0001\u0012\u0014\u0012\u00128\u0000¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(\u0086\u0001\u0012\u0014\u0012\u00120\u0010¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(´\u0001\u0012\u0005\u0012\u0003H\u009d\u00010³\u0001H\u0084\b¢\u0006\u0003\u0010µ\u0001Jb\u0010¶\u0001\u001a\u00020\u00072\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0007\u0010\u0086\u0001\u001a\u00028\u00002\u0007\u0010´\u0001\u001a\u00020\u00102\b\u0010\u009e\u0001\u001a\u00030¨\u00012\u000e\u0010±\u0001\u001a\t\u0012\u0004\u0012\u00020\u00070¤\u00012\u000e\u0010£\u0001\u001a\t\u0012\u0004\u0012\u00020\u00070¤\u0001H\u0082\b¢\u0006\u0003\u0010·\u0001J;\u0010¸\u0001\u001a\u00020\u00072\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0007\u0010\u0086\u0001\u001a\u00028\u00002\u0007\u0010´\u0001\u001a\u00020\u0010H\u0082@ø\u0001\u0000¢\u0006\u0003\u0010¹\u0001J\u000f\u0010º\u0001\u001a\u00020\u001cH\u0010¢\u0006\u0003\b»\u0001J\u0012\u0010º\u0001\u001a\u00020\u001c2\u0007\u0010¼\u0001\u001a\u00020\u0010H\u0003J\n\u0010½\u0001\u001a\u00030¾\u0001H\u0016J\u0010\u0010¿\u0001\u001a\u00030¾\u0001H\u0000¢\u0006\u0003\bÀ\u0001J!\u0010Á\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000,H\u0016ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0006\bÂ\u0001\u0010Ã\u0001J*\u0010Ä\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070,2\u0007\u0010\u0086\u0001\u001a\u00028\u0000H\u0016ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0006\bÅ\u0001\u0010Æ\u0001J(\u0010Ç\u0001\u001a\u00020\u001c2\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0007\u0010È\u0001\u001a\u00020\u0010H\u0002J(\u0010É\u0001\u001a\u00020\u001c2\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0007\u0010È\u0001\u001a\u00020\u0010H\u0002J5\u0010Ê\u0001\u001a\u0004\u0018\u00010\f2\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0007\u0010\u0099\u0001\u001a\u00020\u00102\t\u0010\u009e\u0001\u001a\u0004\u0018\u00010\fH\u0002J5\u0010Ë\u0001\u001a\u0004\u0018\u00010\f2\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0007\u0010\u0099\u0001\u001a\u00020\u00102\t\u0010\u009e\u0001\u001a\u0004\u0018\u00010\fH\u0002JK\u0010Ì\u0001\u001a\u00020\u00042\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0007\u0010\u0086\u0001\u001a\u00028\u00002\u0007\u0010´\u0001\u001a\u00020\u00102\t\u0010\u009e\u0001\u001a\u0004\u0018\u00010\f2\u0007\u0010Í\u0001\u001a\u00020\u001cH\u0002¢\u0006\u0003\u0010Î\u0001JK\u0010Ï\u0001\u001a\u00020\u00042\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0007\u0010\u0086\u0001\u001a\u00028\u00002\u0007\u0010´\u0001\u001a\u00020\u00102\t\u0010\u009e\u0001\u001a\u0004\u0018\u00010\f2\u0007\u0010Í\u0001\u001a\u00020\u001cH\u0002¢\u0006\u0003\u0010Î\u0001J\u0012\u0010Ð\u0001\u001a\u00020\u00072\u0007\u0010Ñ\u0001\u001a\u00020\u0010H\u0002J\u0012\u0010Ò\u0001\u001a\u00020\u00072\u0007\u0010Ñ\u0001\u001a\u00020\u0010H\u0002J\u0017\u0010Ó\u0001\u001a\u00020\u00072\u0006\u0010u\u001a\u00020\u0010H\u0000¢\u0006\u0003\bÔ\u0001J$\u0010Õ\u0001\u001a\u00020\u0007*\u00030¨\u00012\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u0004H\u0002J$\u0010Ö\u0001\u001a\u00020\u0007*\u00030¨\u00012\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u0004H\u0002J\u000e\u0010×\u0001\u001a\u00020\u0007*\u00030¨\u0001H\u0002J\u000e\u0010Ø\u0001\u001a\u00020\u0007*\u00030¨\u0001H\u0002J\u0017\u0010Ù\u0001\u001a\u00020\u0007*\u00030¨\u00012\u0007\u0010Ú\u0001\u001a\u00020\u001cH\u0002J\u001c\u0010Û\u0001\u001a\u00020\u001c*\u00020\f2\u0007\u0010\u0086\u0001\u001a\u00028\u0000H\u0002¢\u0006\u0003\u0010Ü\u0001J#\u0010Ý\u0001\u001a\u00020\u001c*\u00020\f2\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u0004H\u0002R\u0011\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bX\u0082\u0004R\t\u0010\r\u001a\u00020\u000eX\u0082\u0004R\u0014\u0010\u000f\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u000bX\u0082\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00168DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bX\u0082\u0004R\t\u0010\u001a\u001a\u00020\u000eX\u0082\u0004R\u001a\u0010\u001b\u001a\u00020\u001c8VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001fR\u001a\u0010 \u001a\u00020\u001c8VX\u0097\u0004¢\u0006\f\u0012\u0004\b!\u0010\u001e\u001a\u0004\b \u0010\u001fR\u0014\u0010\"\u001a\u00020\u001c8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u001fR\u001a\u0010#\u001a\u00020\u001c8VX\u0097\u0004¢\u0006\f\u0012\u0004\b$\u0010\u001e\u001a\u0004\b#\u0010\u001fR\u0014\u0010%\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u001fR \u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000'8VX\u0096\u0004¢\u0006\f\u0012\u0004\b(\u0010\u001e\u001a\u0004\b)\u0010*R)\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000,0'8VX\u0096\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b-\u0010\u001e\u001a\u0004\b.\u0010*R\"\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000'8VX\u0096\u0004¢\u0006\f\u0012\u0004\b0\u0010\u001e\u001a\u0004\b1\u0010*R,\u00102\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000038VX\u0096\u0004¢\u0006\f\u0012\u0004\b4\u0010\u001e\u001a\u0004\b5\u00106R*\u0010\u0005\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\b8\u0000X\u0081\u0004¢\u0006\u0002\n\u0000Ru\u00107\u001ac\u0012\u0017\u0012\u0015\u0012\u0002\b\u000309¢\u0006\f\b:\u0012\b\b;\u0012\u0004\b\b(<\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b:\u0012\b\b;\u0012\u0004\b\b(=\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b:\u0012\b\b;\u0012\u0004\b\b(>\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u000108j\u0004\u0018\u0001`?X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b@\u0010\u001eR\u0014\u0010A\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bB\u0010\u0018R\u0015\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u000bX\u0082\u0004R\t\u0010D\u001a\u00020\u000eX\u0082\u0004R\u0014\u0010E\u001a\u00020\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bF\u0010\u0012R\u0014\u0010G\u001a\u00020\u00168DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bH\u0010\u0018R\u0015\u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u000bX\u0082\u0004R\t\u0010J\u001a\u00020\u000eX\u0082\u0004R\u0014\u0010K\u001a\u00020\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bL\u0010\u0012R\u0018\u0010M\u001a\u00020\u001c*\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0018\u0010O\u001a\u00020\u001c*\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bO\u0010N\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006à\u0001"}, d2 = {"Lkotlinx/coroutines/channels/BufferedChannel;", "E", "Lkotlinx/coroutines/channels/Channel;", "capacity", "", "onUndeliveredElement", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "(ILkotlin/jvm/functions/Function1;)V", "_closeCause", "Lkotlinx/atomicfu/AtomicRef;", "", "bufferEnd", "Lkotlinx/atomicfu/AtomicLong;", "bufferEndCounter", "", "getBufferEndCounter", "()J", "bufferEndSegment", "Lkotlinx/coroutines/channels/ChannelSegment;", "closeCause", "", "getCloseCause", "()Ljava/lang/Throwable;", "closeHandler", "completedExpandBuffersAndPauseFlag", "isClosedForReceive", "", "isClosedForReceive$annotations", "()V", "()Z", "isClosedForSend", "isClosedForSend$annotations", "isConflatedDropOldest", "isEmpty", "isEmpty$annotations", "isRendezvousOrUnlimited", "onReceive", "Lkotlinx/coroutines/selects/SelectClause1;", "getOnReceive$annotations", "getOnReceive", "()Lkotlinx/coroutines/selects/SelectClause1;", "onReceiveCatching", "Lkotlinx/coroutines/channels/ChannelResult;", "getOnReceiveCatching$annotations", "getOnReceiveCatching", "onReceiveOrNull", "getOnReceiveOrNull$annotations", "getOnReceiveOrNull", "onSend", "Lkotlinx/coroutines/selects/SelectClause2;", "getOnSend$annotations", "getOnSend", "()Lkotlinx/coroutines/selects/SelectClause2;", "onUndeliveredElementReceiveCancellationConstructor", "Lkotlin/Function3;", "Lkotlinx/coroutines/selects/SelectInstance;", "Lkotlin/ParameterName;", "name", "select", "param", "internalResult", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "getOnUndeliveredElementReceiveCancellationConstructor$annotations", "receiveException", "getReceiveException", "receiveSegment", "receivers", "receiversCounter", "getReceiversCounter$kotlinx_coroutines_core", "sendException", "getSendException", "sendSegment", "sendersAndCloseStatus", "sendersCounter", "getSendersCounter$kotlinx_coroutines_core", "isClosedForReceive0", "(J)Z", "isClosedForSend0", "bufferOrRendezvousSend", "curSenders", "cancel", "cause", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cancelImpl", "cancelImpl$kotlinx_coroutines_core", "cancelSuspendedReceiveRequests", "lastSegment", "checkSegmentStructureInvariants", "close", "closeLinkedList", "closeOrCancelImpl", "completeCancel", "sendersCur", "completeClose", "completeCloseOrCancel", "dropFirstElementUntilTheSpecifiedCellIsInTheBuffer", "globalCellIndex", "expandBuffer", "findSegmentBufferEnd", "id", "startFrom", "currentBufferEndCounter", "findSegmentReceive", "findSegmentSend", "hasElements", "hasElements$kotlinx_coroutines_core", "incCompletedExpandBufferAttempts", "nAttempts", "invokeCloseHandler", "invokeOnClose", "handler", "isCellNonEmpty", "segment", "index", "globalIndex", "isClosed", "sendersAndCloseStatusCur", "iterator", "Lkotlinx/coroutines/channels/ChannelIterator;", "markAllEmptyCellsAsClosed", "markCancellationStarted", "markCancelled", "markClosed", "moveSegmentBufferEndToSpecifiedOrLast", "onClosedIdempotent", "onClosedReceiveCatchingOnNoWaiterSuspend", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "onClosedReceiveOnNoWaiterSuspend", "onClosedSelectOnReceive", "onClosedSelectOnSend", "element", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/SelectInstance;)V", "onClosedSend", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onClosedSendOnNoWaiterSuspend", "(Ljava/lang/Object;Lkotlinx/coroutines/CancellableContinuation;)V", "onReceiveDequeued", "onReceiveEnqueued", "processResultSelectReceive", "ignoredParam", "selectResult", "processResultSelectReceiveCatching", "processResultSelectReceiveOrNull", "processResultSelectSend", "receive", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "receiveCatching", "receiveCatching-JP2dKIU", "receiveCatchingOnNoWaiterSuspend", CampaignEx.JSON_KEY_AD_R, "receiveCatchingOnNoWaiterSuspend-GKJJFZk", "(Lkotlinx/coroutines/channels/ChannelSegment;IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "receiveImpl", "R", "waiter", "onElementRetrieved", "onSuspend", "segm", i.a, "onClosed", "Lkotlin/Function0;", "onNoWaiterSuspend", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "receiveImplOnNoWaiter", "Lkotlinx/coroutines/Waiter;", "receiveOnNoWaiterSuspend", "registerSelectForReceive", "registerSelectForSend", "removeUnprocessedElements", "send", "sendBroadcast", "sendBroadcast$kotlinx_coroutines_core", "sendImpl", "onRendezvousOrBuffered", "Lkotlin/Function2;", "Lkotlin/Function4;", "s", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function4;)Ljava/lang/Object;", "sendImplOnNoWaiter", "(Lkotlinx/coroutines/channels/ChannelSegment;ILjava/lang/Object;JLkotlinx/coroutines/Waiter;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "sendOnNoWaiterSuspend", "(Lkotlinx/coroutines/channels/ChannelSegment;ILjava/lang/Object;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shouldSendSuspend", "shouldSendSuspend$kotlinx_coroutines_core", "curSendersAndCloseStatus", "toString", "", "toStringDebug", "toStringDebug$kotlinx_coroutines_core", "tryReceive", "tryReceive-PtdJZtk", "()Ljava/lang/Object;", "trySend", "trySend-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "updateCellExpandBuffer", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "updateCellExpandBufferSlow", "updateCellReceive", "updateCellReceiveSlow", "updateCellSend", "closed", "(Lkotlinx/coroutines/channels/ChannelSegment;ILjava/lang/Object;JLjava/lang/Object;Z)I", "updateCellSendSlow", "updateReceiversCounterIfLower", AppMeasurementSdk.ConditionalUserProperty.VALUE, "updateSendersCounterIfLower", "waitExpandBufferCompletion", "waitExpandBufferCompletion$kotlinx_coroutines_core", "prepareReceiverForSuspension", "prepareSenderForSuspension", "resumeReceiverOnClosedChannel", "resumeSenderOnCancelledChannel", "resumeWaiterOnClosedChannel", "receiver", "tryResumeReceiver", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "tryResumeSender", "BufferedChannelIterator", "SendBroadcast", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannelKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 5 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 6 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 7 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$sendImpl$1\n+ 8 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$receiveImpl$1\n+ 9 InlineList.kt\nkotlinx/coroutines/internal/InlineList\n+ 10 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n+ 11 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,3055:1\n273#1,6:3058\n280#1,68:3065\n374#1,18:3156\n244#1:3174\n269#1,10:3175\n280#1,48:3186\n395#1:3234\n334#1,14:3235\n399#1,3:3250\n244#1:3263\n269#1,10:3264\n280#1,68:3275\n244#1:3353\n269#1,10:3354\n280#1,68:3365\n244#1:3437\n269#1,10:3438\n280#1,68:3449\n886#1,52:3519\n964#1,8:3575\n858#1:3583\n882#1,33:3584\n974#1:3617\n916#1,14:3618\n935#1,3:3633\n979#1,6:3636\n886#1,52:3650\n964#1,8:3706\n858#1:3714\n882#1,33:3715\n974#1:3748\n916#1,14:3749\n935#1,3:3764\n979#1,6:3767\n858#1:3782\n882#1,48:3783\n935#1,3:3832\n858#1:3835\n882#1,48:3836\n935#1,3:3885\n244#1:3897\n269#1,10:3898\n280#1,68:3909\n858#1:3978\n882#1,48:3979\n935#1,3:4028\n1#2:3056\n3038#3:3057\n3038#3:3064\n3038#3:3185\n3038#3:3274\n3038#3:3364\n3038#3:3436\n3038#3:3448\n3038#3:3518\n3038#3:3781\n3038#3:3888\n3038#3:3889\n3052#3:3890\n3052#3:3891\n3051#3:3892\n3051#3:3893\n3051#3:3894\n3052#3:3895\n3051#3:3896\n3038#3:3908\n3039#3:4031\n3038#3:4032\n3038#3:4033\n3038#3:4034\n3039#3:4035\n3038#3:4036\n3039#3:4059\n3038#3:4060\n3038#3:4061\n3039#3:4062\n3038#3:4112\n3039#3:4113\n3039#3:4114\n3039#3:4132\n3039#3:4133\n314#4,9:3133\n323#4,2:3150\n332#4,4:3152\n336#4,8:3253\n314#4,9:3344\n323#4,2:3434\n332#4,4:3571\n336#4,8:3642\n332#4,4:3702\n336#4,8:3773\n220#5:3142\n221#5:3145\n220#5:3146\n221#5:3149\n61#6,2:3143\n61#6,2:3147\n61#6,2:3261\n269#7:3249\n269#7:3343\n269#7:3433\n269#7:3517\n269#7:3977\n882#8:3632\n882#8:3763\n882#8:3831\n882#8:3884\n882#8:4027\n37#9,11:4037\n37#9,11:4048\n72#10,3:4063\n46#10,8:4066\n72#10,3:4074\n46#10,8:4077\n46#10,8:4085\n72#10,3:4093\n46#10,8:4096\n46#10,8:4104\n766#11:4115\n857#11,2:4116\n2310#11,14:4118\n766#11:4134\n857#11,2:4135\n2310#11,14:4137\n766#11:4151\n857#11,2:4152\n2310#11,14:4154\n*S KotlinDebug\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel\n*L\n113#1:3058,6\n113#1:3065,68\n154#1:3156,18\n154#1:3174\n154#1:3175,10\n154#1:3186,48\n154#1:3234\n154#1:3235,14\n154#1:3250,3\n194#1:3263\n194#1:3264,10\n194#1:3275,68\n225#1:3353\n225#1:3354,10\n225#1:3365,68\n391#1:3437\n391#1:3438,10\n391#1:3449,68\n667#1:3519,52\n696#1:3575,8\n696#1:3583\n696#1:3584,33\n696#1:3617\n696#1:3618,14\n696#1:3633,3\n696#1:3636,6\n732#1:3650,52\n748#1:3706,8\n748#1:3714\n748#1:3715,33\n748#1:3748\n748#1:3749,14\n748#1:3764,3\n748#1:3767,6\n781#1:3782\n781#1:3783,48\n781#1:3832,3\n971#1:3835\n971#1:3836,48\n971#1:3885,3\n1464#1:3897\n1464#1:3898,10\n1464#1:3909,68\n1512#1:3978\n1512#1:3979,48\n1512#1:4028,3\n70#1:3057\n113#1:3064\n154#1:3185\n194#1:3274\n225#1:3364\n278#1:3436\n391#1:3448\n606#1:3518\n771#1:3781\n1007#1:3888\n1056#1:3889\n1374#1:3890\n1376#1:3891\n1406#1:3892\n1416#1:3893\n1425#1:3894\n1426#1:3895\n1433#1:3896\n1464#1:3908\n1865#1:4031\n1867#1:4032\n1869#1:4033\n1882#1:4034\n1893#1:4035\n1894#1:4036\n2196#1:4059\n2209#1:4060\n2219#1:4061\n2222#1:4062\n2539#1:4112\n2541#1:4113\n2566#1:4114\n2628#1:4132\n2629#1:4133\n134#1:3133,9\n134#1:3150,2\n153#1:3152,4\n153#1:3253,8\n221#1:3344,9\n221#1:3434,2\n695#1:3571,4\n695#1:3642,8\n746#1:3702,4\n746#1:3773,8\n138#1:3142\n138#1:3145\n141#1:3146\n141#1:3149\n138#1:3143,2\n141#1:3147,2\n183#1:3261,2\n154#1:3249\n194#1:3343\n225#1:3433\n391#1:3517\n1464#1:3977\n696#1:3632\n748#1:3763\n781#1:3831\n971#1:3884\n1512#1:4027\n2098#1:4037,11\n2153#1:4048,11\n2361#1:4063,3\n2361#1:4066,8\n2416#1:4074,3\n2416#1:4077,8\n2435#1:4085,8\n2465#1:4093,3\n2465#1:4096,8\n2526#1:4104,8\n2575#1:4115\n2575#1:4116,2\n2576#1:4118,14\n2640#1:4134\n2640#1:4135,2\n2641#1:4137,14\n2681#1:4151\n2681#1:4152,2\n2682#1:4154,14\n*E\n"})
/* loaded from: classes3.dex */
public class BufferedChannel<E> implements Channel<E> {

    @Volatile
    private volatile Object _closeCause;

    @Volatile
    private volatile long bufferEnd;

    @Volatile
    private volatile Object bufferEndSegment;
    private final int capacity;

    @Volatile
    private volatile Object closeHandler;

    @Volatile
    private volatile long completedExpandBuffersAndPauseFlag;

    @JvmField
    public final Function1<E, Unit> onUndeliveredElement;
    private final Function3<SelectInstance<?>, Object, Object, Function1<Throwable, Unit>> onUndeliveredElementReceiveCancellationConstructor;

    @Volatile
    private volatile Object receiveSegment;

    @Volatile
    private volatile long receivers;

    @Volatile
    private volatile Object sendSegment;

    @Volatile
    private volatile long sendersAndCloseStatus;
    private static final AtomicLongFieldUpdater sendersAndCloseStatus$FU = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "sendersAndCloseStatus");
    private static final AtomicLongFieldUpdater receivers$FU = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "receivers");
    private static final AtomicLongFieldUpdater bufferEnd$FU = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "bufferEnd");
    private static final AtomicLongFieldUpdater completedExpandBuffersAndPauseFlag$FU = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "completedExpandBuffersAndPauseFlag");
    private static final AtomicReferenceFieldUpdater sendSegment$FU = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "sendSegment");
    private static final AtomicReferenceFieldUpdater receiveSegment$FU = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "receiveSegment");
    private static final AtomicReferenceFieldUpdater bufferEndSegment$FU = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "bufferEndSegment");
    private static final AtomicReferenceFieldUpdater _closeCause$FU = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "_closeCause");
    private static final AtomicReferenceFieldUpdater closeHandler$FU = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "closeHandler");

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0011\u0010\t\u001a\u00020\u0006H\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\nJ/\u0010\u000b\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0012J\u001c\u0010\u0013\u001a\u00020\u00142\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u000e\u0010\u0016\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0006H\u0002J\b\u0010\u0019\u001a\u00020\u0014H\u0002J\u0013\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00028\u0000¢\u0006\u0002\u0010\u001cJ\u0006\u0010\u001d\u001a\u00020\u0014R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lkotlinx/coroutines/channels/BufferedChannel$BufferedChannelIterator;", "Lkotlinx/coroutines/channels/ChannelIterator;", "Lkotlinx/coroutines/Waiter;", "(Lkotlinx/coroutines/channels/BufferedChannel;)V", "continuation", "Lkotlinx/coroutines/CancellableContinuationImpl;", "", "receiveResult", "", "hasNext", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hasNextOnNoWaiterSuspend", "segment", "Lkotlinx/coroutines/channels/ChannelSegment;", "index", "", CampaignEx.JSON_KEY_AD_R, "", "(Lkotlinx/coroutines/channels/ChannelSegment;IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invokeOnCancellation", "", "Lkotlinx/coroutines/internal/Segment;", "next", "()Ljava/lang/Object;", "onClosedHasNext", "onClosedHasNextNoWaiterSuspend", "tryResumeHasNext", "element", "(Ljava/lang/Object;)Z", "tryResumeHasNextOnClosedChannel", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$BufferedChannelIterator\n+ 2 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$receiveImpl$1\n+ 5 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3055:1\n886#2,52:3056\n964#2,8:3112\n858#2:3120\n882#2,33:3121\n974#2:3154\n916#2,14:3155\n935#2,3:3170\n979#2,6:3173\n332#3,4:3108\n336#3,8:3179\n882#4:3169\n61#5,2:3187\n61#5,2:3190\n1#6:3189\n*S KotlinDebug\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$BufferedChannelIterator\n*L\n1590#1:3056,52\n1627#1:3112,8\n1627#1:3120\n1627#1:3121,33\n1627#1:3154\n1627#1:3155,14\n1627#1:3170,3\n1627#1:3173,6\n1625#1:3108,4\n1625#1:3179,8\n1627#1:3169\n1663#1:3187,2\n1708#1:3190,2\n*E\n"})
    /* loaded from: classes3.dex */
    public final class BufferedChannelIterator implements ChannelIterator<E>, Waiter {
        private CancellableContinuationImpl<? super Boolean> continuation;
        private Object receiveResult = BufferedChannelKt.access$getNO_RECEIVE_RESULT$p();

        public BufferedChannelIterator() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Object hasNextOnNoWaiterSuspend(ChannelSegment<E> channelSegment, int i10, long j3, Continuation<? super Boolean> continuation) {
            Boolean boxBoolean;
            BufferedChannel<E> bufferedChannel = BufferedChannel.this;
            CancellableContinuationImpl orCreateCancellableContinuation = CancellableContinuationKt.getOrCreateCancellableContinuation(IntrinsicsKt.intercepted(continuation));
            try {
                this.continuation = orCreateCancellableContinuation;
                Object updateCellReceive = bufferedChannel.updateCellReceive(channelSegment, i10, j3, this);
                if (updateCellReceive == BufferedChannelKt.access$getSUSPEND$p()) {
                    bufferedChannel.prepareReceiverForSuspension(this, channelSegment, i10);
                } else {
                    Function1<Throwable, Unit> function1 = null;
                    if (updateCellReceive == BufferedChannelKt.access$getFAILED$p()) {
                        if (j3 < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                            channelSegment.cleanPrev();
                        }
                        ChannelSegment channelSegment2 = (ChannelSegment) BufferedChannel.receiveSegment$FU.get(bufferedChannel);
                        while (true) {
                            if (bufferedChannel.isClosedForReceive()) {
                                onClosedHasNextNoWaiterSuspend();
                                break;
                            }
                            long andIncrement = BufferedChannel.receivers$FU.getAndIncrement(bufferedChannel);
                            int i11 = BufferedChannelKt.SEGMENT_SIZE;
                            long j10 = andIncrement / i11;
                            int i12 = (int) (andIncrement % i11);
                            if (channelSegment2.id != j10) {
                                ChannelSegment findSegmentReceive = bufferedChannel.findSegmentReceive(j10, channelSegment2);
                                if (findSegmentReceive != null) {
                                    channelSegment2 = findSegmentReceive;
                                }
                            }
                            Object updateCellReceive2 = bufferedChannel.updateCellReceive(channelSegment2, i12, andIncrement, this);
                            if (updateCellReceive2 == BufferedChannelKt.access$getSUSPEND$p()) {
                                bufferedChannel.prepareReceiverForSuspension(this, channelSegment2, i12);
                                break;
                            }
                            if (updateCellReceive2 == BufferedChannelKt.access$getFAILED$p()) {
                                if (andIncrement < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                                    channelSegment2.cleanPrev();
                                }
                            } else if (updateCellReceive2 != BufferedChannelKt.access$getSUSPEND_NO_WAITER$p()) {
                                channelSegment2.cleanPrev();
                                this.receiveResult = updateCellReceive2;
                                this.continuation = null;
                                boxBoolean = Boxing.boxBoolean(true);
                                Function1<E, Unit> function12 = bufferedChannel.onUndeliveredElement;
                                if (function12 != null) {
                                    function1 = OnUndeliveredElementKt.bindCancellationFun(function12, updateCellReceive2, orCreateCancellableContinuation.getContext());
                                }
                            } else {
                                throw new IllegalStateException("unexpected".toString());
                            }
                        }
                    } else {
                        channelSegment.cleanPrev();
                        this.receiveResult = updateCellReceive;
                        this.continuation = null;
                        boxBoolean = Boxing.boxBoolean(true);
                        Function1<E, Unit> function13 = bufferedChannel.onUndeliveredElement;
                        if (function13 != null) {
                            function1 = OnUndeliveredElementKt.bindCancellationFun(function13, updateCellReceive, orCreateCancellableContinuation.getContext());
                        }
                    }
                    orCreateCancellableContinuation.resume(boxBoolean, function1);
                }
                Object result = orCreateCancellableContinuation.getResult();
                if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(continuation);
                }
                return result;
            } catch (Throwable th2) {
                orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
                throw th2;
            }
        }

        private final boolean onClosedHasNext() {
            this.receiveResult = BufferedChannelKt.getCHANNEL_CLOSED();
            Throwable closeCause = BufferedChannel.this.getCloseCause();
            if (closeCause == null) {
                return false;
            }
            throw StackTraceRecoveryKt.recoverStackTrace(closeCause);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void onClosedHasNextNoWaiterSuspend() {
            CancellableContinuationImpl<? super Boolean> cancellableContinuationImpl = this.continuation;
            Intrinsics.checkNotNull(cancellableContinuationImpl);
            this.continuation = null;
            this.receiveResult = BufferedChannelKt.getCHANNEL_CLOSED();
            Throwable closeCause = BufferedChannel.this.getCloseCause();
            if (closeCause == null) {
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuationImpl.resumeWith(Result.m145constructorimpl(Boolean.FALSE));
            } else {
                Result.Companion companion2 = Result.INSTANCE;
                cancellableContinuationImpl.resumeWith(Result.m145constructorimpl(ResultKt.createFailure(closeCause)));
            }
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        public Object hasNext(Continuation<? super Boolean> continuation) {
            ChannelSegment<E> channelSegment;
            BufferedChannel<E> bufferedChannel = BufferedChannel.this;
            ChannelSegment<E> channelSegment2 = (ChannelSegment) BufferedChannel.receiveSegment$FU.get(bufferedChannel);
            while (!bufferedChannel.isClosedForReceive()) {
                long andIncrement = BufferedChannel.receivers$FU.getAndIncrement(bufferedChannel);
                int i10 = BufferedChannelKt.SEGMENT_SIZE;
                long j3 = andIncrement / i10;
                int i11 = (int) (andIncrement % i10);
                if (channelSegment2.id != j3) {
                    ChannelSegment<E> findSegmentReceive = bufferedChannel.findSegmentReceive(j3, channelSegment2);
                    if (findSegmentReceive == null) {
                        continue;
                    } else {
                        channelSegment = findSegmentReceive;
                    }
                } else {
                    channelSegment = channelSegment2;
                }
                Object updateCellReceive = bufferedChannel.updateCellReceive(channelSegment, i11, andIncrement, null);
                if (updateCellReceive != BufferedChannelKt.access$getSUSPEND$p()) {
                    if (updateCellReceive == BufferedChannelKt.access$getFAILED$p()) {
                        if (andIncrement < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                            channelSegment.cleanPrev();
                        }
                        channelSegment2 = channelSegment;
                    } else {
                        if (updateCellReceive == BufferedChannelKt.access$getSUSPEND_NO_WAITER$p()) {
                            return hasNextOnNoWaiterSuspend(channelSegment, i11, andIncrement, continuation);
                        }
                        channelSegment.cleanPrev();
                        this.receiveResult = updateCellReceive;
                        return Boxing.boxBoolean(true);
                    }
                } else {
                    throw new IllegalStateException("unreachable".toString());
                }
            }
            return Boxing.boxBoolean(onClosedHasNext());
        }

        @Override // kotlinx.coroutines.Waiter
        public void invokeOnCancellation(Segment<?> segment, int index) {
            CancellableContinuationImpl<? super Boolean> cancellableContinuationImpl = this.continuation;
            if (cancellableContinuationImpl != null) {
                cancellableContinuationImpl.invokeOnCancellation(segment, index);
            }
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
        @JvmName(name = "next")
        public /* synthetic */ Object next(Continuation continuation) {
            return ChannelIterator.DefaultImpls.next(this, continuation);
        }

        public final boolean tryResumeHasNext(E element) {
            CancellableContinuationImpl<? super Boolean> cancellableContinuationImpl = this.continuation;
            Intrinsics.checkNotNull(cancellableContinuationImpl);
            Function1<Throwable, Unit> function1 = null;
            this.continuation = null;
            this.receiveResult = element;
            Boolean bool = Boolean.TRUE;
            Function1<E, Unit> function12 = BufferedChannel.this.onUndeliveredElement;
            if (function12 != null) {
                function1 = OnUndeliveredElementKt.bindCancellationFun(function12, element, cancellableContinuationImpl.getContext());
            }
            return BufferedChannelKt.access$tryResume0(cancellableContinuationImpl, bool, function1);
        }

        public final void tryResumeHasNextOnClosedChannel() {
            CancellableContinuationImpl<? super Boolean> cancellableContinuationImpl = this.continuation;
            Intrinsics.checkNotNull(cancellableContinuationImpl);
            this.continuation = null;
            this.receiveResult = BufferedChannelKt.getCHANNEL_CLOSED();
            Throwable closeCause = BufferedChannel.this.getCloseCause();
            if (closeCause == null) {
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuationImpl.resumeWith(Result.m145constructorimpl(Boolean.FALSE));
            } else {
                Result.Companion companion2 = Result.INSTANCE;
                cancellableContinuationImpl.resumeWith(Result.m145constructorimpl(ResultKt.createFailure(closeCause)));
            }
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        public E next() {
            E e2 = (E) this.receiveResult;
            if (e2 != BufferedChannelKt.access$getNO_RECEIVE_RESULT$p()) {
                this.receiveResult = BufferedChannelKt.access$getNO_RECEIVE_RESULT$p();
                if (e2 != BufferedChannelKt.getCHANNEL_CLOSED()) {
                    return e2;
                }
                throw StackTraceRecoveryKt.recoverStackTrace(BufferedChannel.this.getReceiveException());
            }
            throw new IllegalStateException("`hasNext()` has not been invoked".toString());
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u001d\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\f\u001a\u00020\rH\u0096\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/channels/BufferedChannel$SendBroadcast;", "Lkotlinx/coroutines/Waiter;", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "", "(Lkotlinx/coroutines/CancellableContinuation;)V", "getCont", "()Lkotlinx/coroutines/CancellableContinuation;", "invokeOnCancellation", "", "segment", "Lkotlinx/coroutines/internal/Segment;", "index", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class SendBroadcast implements Waiter {
        private final /* synthetic */ CancellableContinuationImpl<Boolean> $$delegate_0;
        private final CancellableContinuation<Boolean> cont;

        /* JADX WARN: Multi-variable type inference failed */
        public SendBroadcast(CancellableContinuation<? super Boolean> cancellableContinuation) {
            this.cont = cancellableContinuation;
            Intrinsics.checkNotNull(cancellableContinuation, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuationImpl<kotlin.Boolean>");
            this.$$delegate_0 = (CancellableContinuationImpl) cancellableContinuation;
        }

        public final CancellableContinuation<Boolean> getCont() {
            return this.cont;
        }

        @Override // kotlinx.coroutines.Waiter
        public void invokeOnCancellation(Segment<?> segment, int index) {
            this.$$delegate_0.invokeOnCancellation(segment, index);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [kotlin.jvm.functions.Function1<? super E, kotlin.Unit>, kotlin.jvm.functions.Function1<E, kotlin.Unit>] */
    public BufferedChannel(int i10, Function1<? super E, Unit> function1) {
        this.capacity = i10;
        this.onUndeliveredElement = function1;
        if (i10 >= 0) {
            this.bufferEnd = BufferedChannelKt.access$initialBufferEnd(i10);
            this.completedExpandBuffersAndPauseFlag = getBufferEndCounter();
            ChannelSegment channelSegment = new ChannelSegment(0L, null, this, 3);
            this.sendSegment = channelSegment;
            this.receiveSegment = channelSegment;
            if (isRendezvousOrUnlimited()) {
                channelSegment = BufferedChannelKt.access$getNULL_SEGMENT$p();
                Intrinsics.checkNotNull(channelSegment, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
            }
            this.bufferEndSegment = channelSegment;
            this.onUndeliveredElementReceiveCancellationConstructor = function1 != 0 ? new Function3<SelectInstance<?>, Object, Object, Function1<? super Throwable, ? extends Unit>>(this) { // from class: kotlinx.coroutines.channels.BufferedChannel$onUndeliveredElementReceiveCancellationConstructor$1$1
                final /* synthetic */ BufferedChannel<E> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                    this.this$0 = this;
                }

                @Override // kotlin.jvm.functions.Function3
                public final Function1<Throwable, Unit> invoke(final SelectInstance<?> selectInstance, Object obj, final Object obj2) {
                    final BufferedChannel<E> bufferedChannel = this.this$0;
                    return new Function1<Throwable, Unit>() { // from class: kotlinx.coroutines.channels.BufferedChannel$onUndeliveredElementReceiveCancellationConstructor$1$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                            invoke2(th2);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(Throwable th2) {
                            if (obj2 != BufferedChannelKt.getCHANNEL_CLOSED()) {
                                OnUndeliveredElementKt.callUndeliveredElement(bufferedChannel.onUndeliveredElement, obj2, selectInstance.getContext());
                            }
                        }
                    };
                }
            } : null;
            this._closeCause = BufferedChannelKt.access$getNO_CLOSE_CAUSE$p();
            return;
        }
        throw new IllegalArgumentException(a.i("Invalid channel capacity: ", i10, ", should be >=0").toString());
    }

    private final boolean bufferOrRendezvousSend(long curSenders) {
        return curSenders < getBufferEndCounter() || curSenders < getReceiversCounter$kotlinx_coroutines_core() + ((long) this.capacity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void cancelSuspendedReceiveRequests(ChannelSegment<E> lastSegment, long sendersCounter) {
        Object m1705constructorimpl$default = InlineList.m1705constructorimpl$default(null, 1, null);
        loop0: while (lastSegment != null) {
            for (int i10 = BufferedChannelKt.SEGMENT_SIZE - 1; -1 < i10; i10--) {
                if ((lastSegment.id * BufferedChannelKt.SEGMENT_SIZE) + i10 < sendersCounter) {
                    break loop0;
                }
                while (true) {
                    Object state$kotlinx_coroutines_core = lastSegment.getState$kotlinx_coroutines_core(i10);
                    if (state$kotlinx_coroutines_core != null && state$kotlinx_coroutines_core != BufferedChannelKt.access$getIN_BUFFER$p()) {
                        if (state$kotlinx_coroutines_core instanceof WaiterEB) {
                            if (lastSegment.casState$kotlinx_coroutines_core(i10, state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                                m1705constructorimpl$default = InlineList.m1710plusFjFbRPM(m1705constructorimpl$default, ((WaiterEB) state$kotlinx_coroutines_core).waiter);
                                lastSegment.onCancelledRequest(i10, true);
                                break;
                            }
                        } else {
                            if (!(state$kotlinx_coroutines_core instanceof Waiter)) {
                                break;
                            }
                            if (lastSegment.casState$kotlinx_coroutines_core(i10, state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                                m1705constructorimpl$default = InlineList.m1710plusFjFbRPM(m1705constructorimpl$default, state$kotlinx_coroutines_core);
                                lastSegment.onCancelledRequest(i10, true);
                                break;
                            }
                        }
                    } else if (lastSegment.casState$kotlinx_coroutines_core(i10, state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                        lastSegment.onSlotCleaned();
                        break;
                    }
                }
            }
            lastSegment = (ChannelSegment) lastSegment.getPrev();
        }
        if (m1705constructorimpl$default != null) {
            if (!(m1705constructorimpl$default instanceof ArrayList)) {
                resumeReceiverOnClosedChannel((Waiter) m1705constructorimpl$default);
                return;
            }
            Intrinsics.checkNotNull(m1705constructorimpl$default, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
            ArrayList arrayList = (ArrayList) m1705constructorimpl$default;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                resumeReceiverOnClosedChannel((Waiter) arrayList.get(size));
            }
        }
    }

    private final ChannelSegment<E> closeLinkedList() {
        Object obj = bufferEndSegment$FU.get(this);
        ChannelSegment channelSegment = (ChannelSegment) sendSegment$FU.get(this);
        if (channelSegment.id > ((ChannelSegment) obj).id) {
            obj = channelSegment;
        }
        ChannelSegment channelSegment2 = (ChannelSegment) receiveSegment$FU.get(this);
        if (channelSegment2.id > ((ChannelSegment) obj).id) {
            obj = channelSegment2;
        }
        return (ChannelSegment) ConcurrentLinkedListKt.close((ConcurrentLinkedListNode) obj);
    }

    private final void completeCancel(long sendersCur) {
        removeUnprocessedElements(completeClose(sendersCur));
    }

    private final ChannelSegment<E> completeClose(long sendersCur) {
        ChannelSegment<E> closeLinkedList = closeLinkedList();
        if (isConflatedDropOldest()) {
            long markAllEmptyCellsAsClosed = markAllEmptyCellsAsClosed(closeLinkedList);
            if (markAllEmptyCellsAsClosed != -1) {
                dropFirstElementUntilTheSpecifiedCellIsInTheBuffer(markAllEmptyCellsAsClosed);
            }
        }
        cancelSuspendedReceiveRequests(closeLinkedList, sendersCur);
        return closeLinkedList;
    }

    private final void completeCloseOrCancel() {
        isClosedForSend();
    }

    private final void expandBuffer() {
        if (isRendezvousOrUnlimited()) {
            return;
        }
        ChannelSegment<E> channelSegment = (ChannelSegment) bufferEndSegment$FU.get(this);
        while (true) {
            long andIncrement = bufferEnd$FU.getAndIncrement(this);
            int i10 = BufferedChannelKt.SEGMENT_SIZE;
            long j3 = andIncrement / i10;
            if (getSendersCounter$kotlinx_coroutines_core() <= andIncrement) {
                if (channelSegment.id < j3 && channelSegment.getNext() != 0) {
                    moveSegmentBufferEndToSpecifiedOrLast(j3, channelSegment);
                }
                incCompletedExpandBufferAttempts$default(this, 0L, 1, null);
                return;
            }
            if (channelSegment.id != j3) {
                ChannelSegment<E> findSegmentBufferEnd = findSegmentBufferEnd(j3, channelSegment, andIncrement);
                if (findSegmentBufferEnd == null) {
                    continue;
                } else {
                    channelSegment = findSegmentBufferEnd;
                }
            }
            if (updateCellExpandBuffer(channelSegment, (int) (andIncrement % i10), andIncrement)) {
                incCompletedExpandBufferAttempts$default(this, 0L, 1, null);
                return;
            }
            incCompletedExpandBufferAttempts$default(this, 0L, 1, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x002a, code lost:
    
        r11 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final kotlinx.coroutines.channels.ChannelSegment<E> findSegmentBufferEnd(long r16, kotlinx.coroutines.channels.ChannelSegment<E> r18, long r19) {
        /*
            r15 = this;
            r6 = r15
            r0 = r16
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.channels.BufferedChannel.bufferEndSegment$FU
            kotlin.reflect.KFunction r3 = kotlinx.coroutines.channels.BufferedChannelKt.createSegmentFunction()
            kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3
            r4 = r18
        Ld:
            java.lang.Object r5 = kotlinx.coroutines.internal.ConcurrentLinkedListKt.findSegmentInternal(r4, r0, r3)
            boolean r7 = kotlinx.coroutines.internal.SegmentOrClosed.m1722isClosedimpl(r5)
            r8 = 1
            if (r7 != 0) goto L5b
            kotlinx.coroutines.internal.Segment r7 = kotlinx.coroutines.internal.SegmentOrClosed.m1720getSegmentimpl(r5)
        L1c:
            java.lang.Object r9 = r2.get(r15)
            kotlinx.coroutines.internal.Segment r9 = (kotlinx.coroutines.internal.Segment) r9
            long r10 = r9.id
            long r12 = r7.id
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 < 0) goto L2c
        L2a:
            r11 = r8
            goto L4e
        L2c:
            boolean r10 = r7.tryIncPointers$kotlinx_coroutines_core()
            r11 = 0
            if (r10 != 0) goto L34
            goto L4e
        L34:
            boolean r10 = r2.compareAndSet(r15, r9, r7)
            if (r10 == 0) goto L3c
            r11 = r8
            goto L42
        L3c:
            java.lang.Object r10 = r2.get(r15)
            if (r10 == r9) goto L34
        L42:
            if (r11 == 0) goto L51
            boolean r7 = r9.decPointers$kotlinx_coroutines_core()
            if (r7 == 0) goto L2a
            r9.remove()
            goto L2a
        L4e:
            if (r11 == 0) goto Ld
            goto L5b
        L51:
            boolean r9 = r7.decPointers$kotlinx_coroutines_core()
            if (r9 == 0) goto L1c
            r7.remove()
            goto L1c
        L5b:
            boolean r2 = kotlinx.coroutines.internal.SegmentOrClosed.m1722isClosedimpl(r5)
            r9 = 0
            r7 = 0
            if (r2 == 0) goto L6e
            r15.completeCloseOrCancel()
            r15.moveSegmentBufferEndToSpecifiedOrLast(r16, r18)
            incCompletedExpandBufferAttempts$default(r15, r9, r8, r7)
            goto L9d
        L6e:
            kotlinx.coroutines.internal.Segment r2 = kotlinx.coroutines.internal.SegmentOrClosed.m1720getSegmentimpl(r5)
            r11 = r2
            kotlinx.coroutines.channels.ChannelSegment r11 = (kotlinx.coroutines.channels.ChannelSegment) r11
            long r2 = r11.id
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L9c
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.bufferEnd$FU
            r4 = 1
            long r4 = r19 + r4
            int r12 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r13 = (long) r12
            long r13 = r13 * r2
            r1 = r15
            r2 = r4
            r4 = r13
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L98
            long r0 = r11.id
            long r2 = (long) r12
            long r0 = r0 * r2
            long r0 = r0 - r19
            r15.incCompletedExpandBufferAttempts(r0)
            goto L9d
        L98:
            incCompletedExpandBufferAttempts$default(r15, r9, r8, r7)
            goto L9d
        L9c:
            r7 = r11
        L9d:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.findSegmentBufferEnd(long, kotlinx.coroutines.channels.ChannelSegment, long):kotlinx.coroutines.channels.ChannelSegment");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChannelSegment<E> findSegmentReceive(long id2, ChannelSegment<E> startFrom) {
        Object findSegmentInternal;
        boolean z10;
        boolean z11;
        boolean z12;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = receiveSegment$FU;
        Function2 function2 = (Function2) BufferedChannelKt.createSegmentFunction();
        do {
            findSegmentInternal = ConcurrentLinkedListKt.findSegmentInternal(startFrom, id2, function2);
            if (SegmentOrClosed.m1722isClosedimpl(findSegmentInternal)) {
                break;
            }
            Segment m1720getSegmentimpl = SegmentOrClosed.m1720getSegmentimpl(findSegmentInternal);
            while (true) {
                Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                if (segment.id >= m1720getSegmentimpl.id) {
                    break;
                }
                if (!m1720getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                    z11 = false;
                    break;
                }
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, segment, m1720getSegmentimpl)) {
                        z12 = true;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != segment) {
                        z12 = false;
                        break;
                    }
                }
                if (z12) {
                    if (segment.decPointers$kotlinx_coroutines_core()) {
                        segment.remove();
                    }
                } else if (m1720getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                    m1720getSegmentimpl.remove();
                }
            }
            z11 = true;
        } while (!z11);
        if (SegmentOrClosed.m1722isClosedimpl(findSegmentInternal)) {
            completeCloseOrCancel();
            if (startFrom.id * BufferedChannelKt.SEGMENT_SIZE >= getSendersCounter$kotlinx_coroutines_core()) {
                return null;
            }
            startFrom.cleanPrev();
            return null;
        }
        ChannelSegment<E> channelSegment = (ChannelSegment) SegmentOrClosed.m1720getSegmentimpl(findSegmentInternal);
        if (!isRendezvousOrUnlimited() && id2 <= getBufferEndCounter() / BufferedChannelKt.SEGMENT_SIZE) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = bufferEndSegment$FU;
            while (true) {
                Segment segment2 = (Segment) atomicReferenceFieldUpdater2.get(this);
                if (segment2.id >= channelSegment.id) {
                    break;
                }
                if (!channelSegment.tryIncPointers$kotlinx_coroutines_core()) {
                    break;
                }
                while (true) {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, segment2, channelSegment)) {
                        z10 = true;
                        break;
                    }
                    if (atomicReferenceFieldUpdater2.get(this) != segment2) {
                        z10 = false;
                        break;
                    }
                }
                if (z10) {
                    if (segment2.decPointers$kotlinx_coroutines_core()) {
                        segment2.remove();
                    }
                } else if (channelSegment.decPointers$kotlinx_coroutines_core()) {
                    channelSegment.remove();
                }
            }
        }
        long j3 = channelSegment.id;
        if (j3 > id2) {
            int i10 = BufferedChannelKt.SEGMENT_SIZE;
            updateReceiversCounterIfLower(j3 * i10);
            if (channelSegment.id * i10 >= getSendersCounter$kotlinx_coroutines_core()) {
                return null;
            }
            channelSegment.cleanPrev();
            return null;
        }
        return channelSegment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChannelSegment<E> findSegmentSend(long id2, ChannelSegment<E> startFrom) {
        Object findSegmentInternal;
        boolean z10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = sendSegment$FU;
        Function2 function2 = (Function2) BufferedChannelKt.createSegmentFunction();
        do {
            findSegmentInternal = ConcurrentLinkedListKt.findSegmentInternal(startFrom, id2, function2);
            if (SegmentOrClosed.m1722isClosedimpl(findSegmentInternal)) {
                break;
            }
            Segment m1720getSegmentimpl = SegmentOrClosed.m1720getSegmentimpl(findSegmentInternal);
            while (true) {
                Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                z10 = true;
                if (segment.id >= m1720getSegmentimpl.id) {
                    break;
                }
                boolean z11 = false;
                if (!m1720getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                    z10 = false;
                    break;
                }
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, segment, m1720getSegmentimpl)) {
                        z11 = true;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != segment) {
                        break;
                    }
                }
                if (z11) {
                    if (segment.decPointers$kotlinx_coroutines_core()) {
                        segment.remove();
                    }
                } else if (m1720getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                    m1720getSegmentimpl.remove();
                }
            }
        } while (!z10);
        if (SegmentOrClosed.m1722isClosedimpl(findSegmentInternal)) {
            completeCloseOrCancel();
            if (startFrom.id * BufferedChannelKt.SEGMENT_SIZE >= getReceiversCounter$kotlinx_coroutines_core()) {
                return null;
            }
            startFrom.cleanPrev();
            return null;
        }
        ChannelSegment<E> channelSegment = (ChannelSegment) SegmentOrClosed.m1720getSegmentimpl(findSegmentInternal);
        long j3 = channelSegment.id;
        if (j3 > id2) {
            int i10 = BufferedChannelKt.SEGMENT_SIZE;
            updateSendersCounterIfLower(j3 * i10);
            if (channelSegment.id * i10 >= getReceiversCounter$kotlinx_coroutines_core()) {
                return null;
            }
            channelSegment.cleanPrev();
            return null;
        }
        return channelSegment;
    }

    private final Object getAndUpdate$atomicfu(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Function1<Object, ? extends Object> function1, Object obj) {
        Object obj2;
        boolean z10;
        do {
            obj2 = atomicReferenceFieldUpdater.get(obj);
            Object invoke = function1.invoke(obj2);
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(obj, obj2, invoke)) {
                    z10 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(obj) != obj2) {
                    z10 = false;
                    break;
                }
            }
        } while (!z10);
        return obj2;
    }

    private final long getBufferEndCounter() {
        return bufferEnd$FU.get(this);
    }

    public static /* synthetic */ void getOnReceive$annotations() {
    }

    public static /* synthetic */ void getOnReceiveCatching$annotations() {
    }

    public static /* synthetic */ void getOnReceiveOrNull$annotations() {
    }

    public static /* synthetic */ void getOnSend$annotations() {
    }

    private static /* synthetic */ void getOnUndeliveredElementReceiveCancellationConstructor$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Throwable getReceiveException() {
        Throwable closeCause = getCloseCause();
        return closeCause == null ? new ClosedReceiveChannelException(ChannelsKt.DEFAULT_CLOSE_MESSAGE) : closeCause;
    }

    private final void incCompletedExpandBufferAttempts(long nAttempts) {
        boolean z10;
        boolean z11;
        if ((completedExpandBuffersAndPauseFlag$FU.addAndGet(this, nAttempts) & 4611686018427387904L) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return;
        }
        do {
            if ((completedExpandBuffersAndPauseFlag$FU.get(this) & 4611686018427387904L) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
        } while (z11);
    }

    public static /* synthetic */ void incCompletedExpandBufferAttempts$default(BufferedChannel bufferedChannel, long j3, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
        }
        if ((i10 & 1) != 0) {
            j3 = 1;
        }
        bufferedChannel.incCompletedExpandBufferAttempts(j3);
    }

    private final void invokeCloseHandler() {
        Object obj;
        Symbol access$getCLOSE_HANDLER_INVOKED$p;
        boolean z10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = closeHandler$FU;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                access$getCLOSE_HANDLER_INVOKED$p = BufferedChannelKt.access$getCLOSE_HANDLER_CLOSED$p();
            } else {
                access$getCLOSE_HANDLER_INVOKED$p = BufferedChannelKt.access$getCLOSE_HANDLER_INVOKED$p();
            }
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, access$getCLOSE_HANDLER_INVOKED$p)) {
                    z10 = true;
                    break;
                } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                    z10 = false;
                    break;
                }
            }
        } while (!z10);
        if (obj == null) {
            return;
        }
        ((Function1) obj).invoke(getCloseCause());
    }

    private final boolean isCellNonEmpty(ChannelSegment<E> segment, int index, long globalIndex) {
        Object state$kotlinx_coroutines_core;
        do {
            state$kotlinx_coroutines_core = segment.getState$kotlinx_coroutines_core(index);
            if (state$kotlinx_coroutines_core != null && state$kotlinx_coroutines_core != BufferedChannelKt.access$getIN_BUFFER$p()) {
                if (state$kotlinx_coroutines_core == BufferedChannelKt.BUFFERED) {
                    return true;
                }
                if (state$kotlinx_coroutines_core == BufferedChannelKt.access$getINTERRUPTED_SEND$p() || state$kotlinx_coroutines_core == BufferedChannelKt.getCHANNEL_CLOSED() || state$kotlinx_coroutines_core == BufferedChannelKt.access$getDONE_RCV$p() || state$kotlinx_coroutines_core == BufferedChannelKt.access$getPOISONED$p()) {
                    return false;
                }
                if (state$kotlinx_coroutines_core == BufferedChannelKt.access$getRESUMING_BY_EB$p()) {
                    return true;
                }
                if (state$kotlinx_coroutines_core == BufferedChannelKt.access$getRESUMING_BY_RCV$p() || globalIndex != getReceiversCounter$kotlinx_coroutines_core()) {
                    return false;
                }
                return true;
            }
        } while (!segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, BufferedChannelKt.access$getPOISONED$p()));
        expandBuffer();
        return false;
    }

    private final boolean isClosed(long sendersAndCloseStatusCur, boolean isClosedForReceive) {
        int i10 = (int) (sendersAndCloseStatusCur >> 60);
        if (i10 == 0 || i10 == 1) {
            return false;
        }
        if (i10 != 2) {
            if (i10 == 3) {
                completeCancel(sendersAndCloseStatusCur & 1152921504606846975L);
            } else {
                throw new IllegalStateException(j.i("unexpected close status: ", i10).toString());
            }
        } else {
            completeClose(sendersAndCloseStatusCur & 1152921504606846975L);
            if (isClosedForReceive && hasElements$kotlinx_coroutines_core()) {
                return false;
            }
        }
        return true;
    }

    @ExperimentalCoroutinesApi
    public static /* synthetic */ void isClosedForReceive$annotations() {
    }

    private final boolean isClosedForReceive0(long j3) {
        return isClosed(j3, true);
    }

    @ExperimentalCoroutinesApi
    public static /* synthetic */ void isClosedForSend$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isClosedForSend0(long j3) {
        return isClosed(j3, false);
    }

    @ExperimentalCoroutinesApi
    public static /* synthetic */ void isEmpty$annotations() {
    }

    private final boolean isRendezvousOrUnlimited() {
        long bufferEndCounter = getBufferEndCounter();
        return bufferEndCounter == 0 || bufferEndCounter == Long.MAX_VALUE;
    }

    private final void loop$atomicfu(AtomicLongFieldUpdater atomicLongFieldUpdater, Function1<? super Long, Unit> function1, Object obj) {
        while (true) {
            function1.invoke(Long.valueOf(atomicLongFieldUpdater.get(obj)));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        r8 = (kotlinx.coroutines.channels.ChannelSegment) r8.getPrev();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long markAllEmptyCellsAsClosed(kotlinx.coroutines.channels.ChannelSegment<E> r8) {
        /*
            r7 = this;
        L0:
            int r0 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            int r0 = r0 + (-1)
        L4:
            r1 = -1
            r3 = -1
            if (r3 >= r0) goto L3c
            long r3 = r8.id
            int r5 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r5 = (long) r5
            long r3 = r3 * r5
            long r5 = (long) r0
            long r3 = r3 + r5
            long r5 = r7.getReceiversCounter$kotlinx_coroutines_core()
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 >= 0) goto L1a
            return r1
        L1a:
            java.lang.Object r1 = r8.getState$kotlinx_coroutines_core(r0)
            if (r1 == 0) goto L2c
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.BufferedChannelKt.access$getIN_BUFFER$p()
            if (r1 != r2) goto L27
            goto L2c
        L27:
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED
            if (r1 != r2) goto L39
            return r3
        L2c:
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()
            boolean r1 = r8.casState$kotlinx_coroutines_core(r0, r1, r2)
            if (r1 == 0) goto L1a
            r8.onSlotCleaned()
        L39:
            int r0 = r0 + (-1)
            goto L4
        L3c:
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r8 = r8.getPrev()
            kotlinx.coroutines.channels.ChannelSegment r8 = (kotlinx.coroutines.channels.ChannelSegment) r8
            if (r8 != 0) goto L0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.markAllEmptyCellsAsClosed(kotlinx.coroutines.channels.ChannelSegment):long");
    }

    private final void markCancellationStarted() {
        long j3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = sendersAndCloseStatus$FU;
        do {
            j3 = atomicLongFieldUpdater.get(this);
            if (((int) (j3 >> 60)) != 0) {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j3, BufferedChannelKt.access$constructSendersAndCloseStatus(1152921504606846975L & j3, 1)));
    }

    private final void markCancelled() {
        long j3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = sendersAndCloseStatus$FU;
        do {
            j3 = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j3, BufferedChannelKt.access$constructSendersAndCloseStatus(1152921504606846975L & j3, 3)));
    }

    private final void markClosed() {
        long j3;
        long access$constructSendersAndCloseStatus;
        AtomicLongFieldUpdater atomicLongFieldUpdater = sendersAndCloseStatus$FU;
        do {
            j3 = atomicLongFieldUpdater.get(this);
            int i10 = (int) (j3 >> 60);
            if (i10 != 0) {
                if (i10 != 1) {
                    return;
                } else {
                    access$constructSendersAndCloseStatus = BufferedChannelKt.access$constructSendersAndCloseStatus(j3 & 1152921504606846975L, 3);
                }
            } else {
                access$constructSendersAndCloseStatus = BufferedChannelKt.access$constructSendersAndCloseStatus(j3 & 1152921504606846975L, 2);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j3, access$constructSendersAndCloseStatus));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void moveSegmentBufferEndToSpecifiedOrLast(long id2, ChannelSegment<E> startFrom) {
        boolean z10;
        ChannelSegment<E> channelSegment;
        ChannelSegment<E> channelSegment2;
        while (startFrom.id < id2 && (channelSegment2 = (ChannelSegment) startFrom.getNext()) != null) {
            startFrom = channelSegment2;
        }
        while (true) {
            if (startFrom.isRemoved() && (channelSegment = (ChannelSegment) startFrom.getNext()) != null) {
                startFrom = channelSegment;
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = bufferEndSegment$FU;
                while (true) {
                    Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                    z10 = true;
                    if (segment.id >= startFrom.id) {
                        break;
                    }
                    boolean z11 = false;
                    if (!startFrom.tryIncPointers$kotlinx_coroutines_core()) {
                        z10 = false;
                        break;
                    }
                    while (true) {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, segment, startFrom)) {
                            z11 = true;
                            break;
                        } else if (atomicReferenceFieldUpdater.get(this) != segment) {
                            break;
                        }
                    }
                    if (z11) {
                        if (segment.decPointers$kotlinx_coroutines_core()) {
                            segment.remove();
                        }
                    } else if (startFrom.decPointers$kotlinx_coroutines_core()) {
                        startFrom.remove();
                    }
                }
                if (z10) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClosedReceiveCatchingOnNoWaiterSuspend(CancellableContinuation<? super ChannelResult<? extends E>> cont) {
        Result.Companion companion = Result.INSTANCE;
        cont.resumeWith(Result.m145constructorimpl(ChannelResult.m1669boximpl(ChannelResult.INSTANCE.m1682closedJP2dKIU(getCloseCause()))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClosedReceiveOnNoWaiterSuspend(CancellableContinuation<? super E> cont) {
        Result.Companion companion = Result.INSTANCE;
        cont.resumeWith(Result.m145constructorimpl(ResultKt.createFailure(getReceiveException())));
    }

    private final void onClosedSelectOnReceive(SelectInstance<?> select) {
        select.selectInRegistrationPhase(BufferedChannelKt.getCHANNEL_CLOSED());
    }

    private final void onClosedSelectOnSend(E element, SelectInstance<?> select) {
        Function1<E, Unit> function1 = this.onUndeliveredElement;
        if (function1 != null) {
            OnUndeliveredElementKt.callUndeliveredElement(function1, element, select.getContext());
        }
        select.selectInRegistrationPhase(BufferedChannelKt.getCHANNEL_CLOSED());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object onClosedSend(E e2, Continuation<? super Unit> continuation) {
        UndeliveredElementException callUndeliveredElementCatchingException$default;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        Function1<E, Unit> function1 = this.onUndeliveredElement;
        if (function1 != null && (callUndeliveredElementCatchingException$default = OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(function1, e2, null, 2, null)) != null) {
            ExceptionsKt.addSuppressed(callUndeliveredElementCatchingException$default, getSendException());
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuationImpl.resumeWith(Result.m145constructorimpl(ResultKt.createFailure(callUndeliveredElementCatchingException$default)));
        } else {
            Throwable sendException = getSendException();
            Result.Companion companion2 = Result.INSTANCE;
            cancellableContinuationImpl.resumeWith(Result.m145constructorimpl(ResultKt.createFailure(sendException)));
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return result;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClosedSendOnNoWaiterSuspend(E element, CancellableContinuation<? super Unit> cont) {
        Function1<E, Unit> function1 = this.onUndeliveredElement;
        if (function1 != null) {
            OnUndeliveredElementKt.callUndeliveredElement(function1, element, cont.getContext());
        }
        Throwable sendException = getSendException();
        Result.Companion companion = Result.INSTANCE;
        cont.resumeWith(Result.m145constructorimpl(ResultKt.createFailure(sendException)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void prepareReceiverForSuspension(Waiter waiter, ChannelSegment<E> channelSegment, int i10) {
        onReceiveEnqueued();
        waiter.invokeOnCancellation(channelSegment, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void prepareSenderForSuspension(Waiter waiter, ChannelSegment<E> channelSegment, int i10) {
        waiter.invokeOnCancellation(channelSegment, i10 + BufferedChannelKt.SEGMENT_SIZE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object processResultSelectReceive(Object ignoredParam, Object selectResult) {
        if (selectResult != BufferedChannelKt.getCHANNEL_CLOSED()) {
            return selectResult;
        }
        throw getReceiveException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object processResultSelectReceiveCatching(Object ignoredParam, Object selectResult) {
        Object m1684successJP2dKIU;
        if (selectResult == BufferedChannelKt.getCHANNEL_CLOSED()) {
            m1684successJP2dKIU = ChannelResult.INSTANCE.m1682closedJP2dKIU(getCloseCause());
        } else {
            m1684successJP2dKIU = ChannelResult.INSTANCE.m1684successJP2dKIU(selectResult);
        }
        return ChannelResult.m1669boximpl(m1684successJP2dKIU);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object processResultSelectReceiveOrNull(Object ignoredParam, Object selectResult) {
        if (selectResult == BufferedChannelKt.getCHANNEL_CLOSED()) {
            if (getCloseCause() == null) {
                return null;
            }
            throw getReceiveException();
        }
        return selectResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object processResultSelectSend(Object ignoredParam, Object selectResult) {
        if (selectResult != BufferedChannelKt.getCHANNEL_CLOSED()) {
            return this;
        }
        throw getSendException();
    }

    public static /* synthetic */ <E> Object receive$suspendImpl(BufferedChannel<E> bufferedChannel, Continuation<? super E> continuation) {
        ChannelSegment<E> channelSegment;
        ChannelSegment<E> channelSegment2 = (ChannelSegment) receiveSegment$FU.get(bufferedChannel);
        while (!bufferedChannel.isClosedForReceive()) {
            long andIncrement = receivers$FU.getAndIncrement(bufferedChannel);
            int i10 = BufferedChannelKt.SEGMENT_SIZE;
            long j3 = andIncrement / i10;
            int i11 = (int) (andIncrement % i10);
            if (channelSegment2.id != j3) {
                ChannelSegment<E> findSegmentReceive = bufferedChannel.findSegmentReceive(j3, channelSegment2);
                if (findSegmentReceive == null) {
                    continue;
                } else {
                    channelSegment = findSegmentReceive;
                }
            } else {
                channelSegment = channelSegment2;
            }
            Object updateCellReceive = bufferedChannel.updateCellReceive(channelSegment, i11, andIncrement, null);
            if (updateCellReceive != BufferedChannelKt.access$getSUSPEND$p()) {
                if (updateCellReceive == BufferedChannelKt.access$getFAILED$p()) {
                    if (andIncrement < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                        channelSegment.cleanPrev();
                    }
                    channelSegment2 = channelSegment;
                } else {
                    if (updateCellReceive == BufferedChannelKt.access$getSUSPEND_NO_WAITER$p()) {
                        return bufferedChannel.receiveOnNoWaiterSuspend(channelSegment, i11, andIncrement, continuation);
                    }
                    channelSegment.cleanPrev();
                    return updateCellReceive;
                }
            } else {
                throw new IllegalStateException("unexpected".toString());
            }
        }
        throw StackTraceRecoveryKt.recoverStackTrace(bufferedChannel.getReceiveException());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: receiveCatching-JP2dKIU$suspendImpl, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ <E> java.lang.Object m1661receiveCatchingJP2dKIU$suspendImpl(kotlinx.coroutines.channels.BufferedChannel<E> r14, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelResult<? extends E>> r15) {
        /*
            boolean r0 = r15 instanceof kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1
            if (r0 == 0) goto L13
            r0 = r15
            kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1 r0 = (kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1 r0 = new kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1
            r0.<init>(r14, r15)
        L18:
            r6 = r0
            java.lang.Object r15 = r6.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            kotlin.ResultKt.throwOnFailure(r15)
            kotlinx.coroutines.channels.ChannelResult r15 = (kotlinx.coroutines.channels.ChannelResult) r15
            java.lang.Object r14 = r15.getHolder()
            goto Lb6
        L31:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L39:
            kotlin.ResultKt.throwOnFailure(r15)
            r15 = 0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = access$getReceiveSegment$FU$p()
            java.lang.Object r1 = r1.get(r14)
            kotlinx.coroutines.channels.ChannelSegment r1 = (kotlinx.coroutines.channels.ChannelSegment) r1
        L47:
            boolean r3 = r14.isClosedForReceive()
            if (r3 == 0) goto L59
            kotlinx.coroutines.channels.ChannelResult$Companion r15 = kotlinx.coroutines.channels.ChannelResult.INSTANCE
            java.lang.Throwable r14 = r14.getCloseCause()
            java.lang.Object r14 = r15.m1682closedJP2dKIU(r14)
            goto Lb6
        L59:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = access$getReceivers$FU$p()
            long r4 = r3.getAndIncrement(r14)
            int r3 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r7 = (long) r3
            long r7 = r4 / r7
            long r9 = (long) r3
            long r9 = r4 % r9
            int r3 = (int) r9
            long r9 = r1.id
            int r9 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r9 == 0) goto L79
            kotlinx.coroutines.channels.ChannelSegment r7 = access$findSegmentReceive(r14, r7, r1)
            if (r7 != 0) goto L77
            goto L47
        L77:
            r13 = r7
            goto L7a
        L79:
            r13 = r1
        L7a:
            r7 = r14
            r8 = r13
            r9 = r3
            r10 = r4
            r12 = r15
            java.lang.Object r1 = access$updateCellReceive(r7, r8, r9, r10, r12)
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.channels.BufferedChannelKt.access$getSUSPEND$p()
            if (r1 == r7) goto Lb7
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.channels.BufferedChannelKt.access$getFAILED$p()
            if (r1 != r7) goto L9c
            long r7 = r14.getSendersCounter$kotlinx_coroutines_core()
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 >= 0) goto L9a
            r13.cleanPrev()
        L9a:
            r1 = r13
            goto L47
        L9c:
            kotlinx.coroutines.internal.Symbol r15 = kotlinx.coroutines.channels.BufferedChannelKt.access$getSUSPEND_NO_WAITER$p()
            if (r1 != r15) goto Lad
            r6.label = r2
            r1 = r14
            r2 = r13
            java.lang.Object r14 = r1.m1662receiveCatchingOnNoWaiterSuspendGKJJFZk(r2, r3, r4, r6)
            if (r14 != r0) goto Lb6
            return r0
        Lad:
            r13.cleanPrev()
            kotlinx.coroutines.channels.ChannelResult$Companion r14 = kotlinx.coroutines.channels.ChannelResult.INSTANCE
            java.lang.Object r14 = r14.m1684successJP2dKIU(r1)
        Lb6:
            return r14
        Lb7:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "unexpected"
            java.lang.String r15 = r15.toString()
            r14.<init>(r15)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.m1661receiveCatchingJP2dKIU$suspendImpl(kotlinx.coroutines.channels.BufferedChannel, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: receiveCatchingOnNoWaiterSuspend-GKJJFZk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m1662receiveCatchingOnNoWaiterSuspendGKJJFZk(kotlinx.coroutines.channels.ChannelSegment<E> r11, int r12, long r13, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelResult<? extends E>> r15) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.m1662receiveCatchingOnNoWaiterSuspendGKJJFZk(kotlinx.coroutines.channels.ChannelSegment, int, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final <R> R receiveImpl(Object waiter, Function1<? super E, ? extends R> onElementRetrieved, Function3<? super ChannelSegment<E>, ? super Integer, ? super Long, ? extends R> onSuspend, Function0<? extends R> onClosed, Function3<? super ChannelSegment<E>, ? super Integer, ? super Long, ? extends R> onNoWaiterSuspend) {
        Waiter waiter2;
        ChannelSegment channelSegment = (ChannelSegment) receiveSegment$FU.get(this);
        while (!isClosedForReceive()) {
            long andIncrement = receivers$FU.getAndIncrement(this);
            int i10 = BufferedChannelKt.SEGMENT_SIZE;
            long j3 = andIncrement / i10;
            int i11 = (int) (andIncrement % i10);
            if (channelSegment.id != j3) {
                ChannelSegment findSegmentReceive = findSegmentReceive(j3, channelSegment);
                if (findSegmentReceive == null) {
                    continue;
                } else {
                    channelSegment = findSegmentReceive;
                }
            }
            Symbol symbol = (Object) updateCellReceive(channelSegment, i11, andIncrement, waiter);
            if (symbol == BufferedChannelKt.access$getSUSPEND$p()) {
                if (waiter instanceof Waiter) {
                    waiter2 = (Waiter) waiter;
                } else {
                    waiter2 = null;
                }
                if (waiter2 != null) {
                    prepareReceiverForSuspension(waiter2, channelSegment, i11);
                }
                return onSuspend.invoke(channelSegment, Integer.valueOf(i11), Long.valueOf(andIncrement));
            }
            if (symbol == BufferedChannelKt.access$getFAILED$p()) {
                if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                    channelSegment.cleanPrev();
                }
            } else {
                if (symbol == BufferedChannelKt.access$getSUSPEND_NO_WAITER$p()) {
                    return onNoWaiterSuspend.invoke(channelSegment, Integer.valueOf(i11), Long.valueOf(andIncrement));
                }
                channelSegment.cleanPrev();
                return onElementRetrieved.invoke(symbol);
            }
        }
        return onClosed.invoke();
    }

    public static /* synthetic */ Object receiveImpl$default(BufferedChannel bufferedChannel, Object obj, Function1 function1, Function3 function3, Function0 function0, Function3 function32, int i10, Object obj2) {
        Waiter waiter;
        if (obj2 == null) {
            if ((i10 & 16) != 0) {
                function32 = new Function3() { // from class: kotlinx.coroutines.channels.BufferedChannel$receiveImpl$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                        return invoke((ChannelSegment) obj3, ((Number) obj4).intValue(), ((Number) obj5).longValue());
                    }

                    public final Void invoke(ChannelSegment<E> channelSegment, int i11, long j3) {
                        throw new IllegalStateException("unexpected".toString());
                    }
                };
            }
            ChannelSegment channelSegment = (ChannelSegment) receiveSegment$FU.get(bufferedChannel);
            while (!bufferedChannel.isClosedForReceive()) {
                long andIncrement = receivers$FU.getAndIncrement(bufferedChannel);
                int i11 = BufferedChannelKt.SEGMENT_SIZE;
                long j3 = andIncrement / i11;
                int i12 = (int) (andIncrement % i11);
                if (channelSegment.id != j3) {
                    ChannelSegment findSegmentReceive = bufferedChannel.findSegmentReceive(j3, channelSegment);
                    if (findSegmentReceive == null) {
                        continue;
                    } else {
                        channelSegment = findSegmentReceive;
                    }
                }
                Object updateCellReceive = bufferedChannel.updateCellReceive(channelSegment, i12, andIncrement, obj);
                if (updateCellReceive == BufferedChannelKt.access$getSUSPEND$p()) {
                    if (obj instanceof Waiter) {
                        waiter = (Waiter) obj;
                    } else {
                        waiter = null;
                    }
                    if (waiter != null) {
                        bufferedChannel.prepareReceiverForSuspension(waiter, channelSegment, i12);
                    }
                    return function3.invoke(channelSegment, Integer.valueOf(i12), Long.valueOf(andIncrement));
                }
                if (updateCellReceive == BufferedChannelKt.access$getFAILED$p()) {
                    if (andIncrement < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                        channelSegment.cleanPrev();
                    }
                } else {
                    if (updateCellReceive == BufferedChannelKt.access$getSUSPEND_NO_WAITER$p()) {
                        return function32.invoke(channelSegment, Integer.valueOf(i12), Long.valueOf(andIncrement));
                    }
                    channelSegment.cleanPrev();
                    return function1.invoke(updateCellReceive);
                }
            }
            return function0.invoke();
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: receiveImpl");
    }

    private final void receiveImplOnNoWaiter(ChannelSegment<E> segment, int index, long r6, Waiter waiter, Function1<? super E, Unit> onElementRetrieved, Function0<Unit> onClosed) {
        Symbol symbol = (Object) updateCellReceive(segment, index, r6, waiter);
        if (symbol == BufferedChannelKt.access$getSUSPEND$p()) {
            prepareReceiverForSuspension(waiter, segment, index);
            return;
        }
        if (symbol == BufferedChannelKt.access$getFAILED$p()) {
            if (r6 < getSendersCounter$kotlinx_coroutines_core()) {
                segment.cleanPrev();
            }
            ChannelSegment channelSegment = (ChannelSegment) receiveSegment$FU.get(this);
            while (!isClosedForReceive()) {
                long andIncrement = receivers$FU.getAndIncrement(this);
                int i10 = BufferedChannelKt.SEGMENT_SIZE;
                long j3 = andIncrement / i10;
                int i11 = (int) (andIncrement % i10);
                if (channelSegment.id != j3) {
                    ChannelSegment findSegmentReceive = findSegmentReceive(j3, channelSegment);
                    if (findSegmentReceive == null) {
                        continue;
                    } else {
                        channelSegment = findSegmentReceive;
                    }
                }
                Symbol symbol2 = (Object) updateCellReceive(channelSegment, i11, andIncrement, waiter);
                if (symbol2 == BufferedChannelKt.access$getSUSPEND$p()) {
                    if (!(waiter instanceof Waiter)) {
                        waiter = null;
                    }
                    if (waiter != null) {
                        prepareReceiverForSuspension(waiter, channelSegment, i11);
                    }
                    Unit unit = Unit.INSTANCE;
                    return;
                }
                if (symbol2 == BufferedChannelKt.access$getFAILED$p()) {
                    if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                        channelSegment.cleanPrev();
                    }
                } else {
                    if (symbol2 != BufferedChannelKt.access$getSUSPEND_NO_WAITER$p()) {
                        channelSegment.cleanPrev();
                        onElementRetrieved.invoke(symbol2);
                        return;
                    }
                    throw new IllegalStateException("unexpected".toString());
                }
            }
            onClosed.invoke();
            return;
        }
        segment.cleanPrev();
        onElementRetrieved.invoke(symbol);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object receiveOnNoWaiterSuspend(ChannelSegment<E> channelSegment, int i10, long j3, Continuation<? super E> continuation) {
        CancellableContinuationImpl orCreateCancellableContinuation = CancellableContinuationKt.getOrCreateCancellableContinuation(IntrinsicsKt.intercepted(continuation));
        try {
            Object updateCellReceive = updateCellReceive(channelSegment, i10, j3, orCreateCancellableContinuation);
            if (updateCellReceive == BufferedChannelKt.access$getSUSPEND$p()) {
                prepareReceiverForSuspension(orCreateCancellableContinuation, channelSegment, i10);
            } else {
                Function1<Throwable, Unit> function1 = null;
                function1 = null;
                CancellableContinuationImpl cancellableContinuationImpl = null;
                if (updateCellReceive == BufferedChannelKt.access$getFAILED$p()) {
                    if (j3 < getSendersCounter$kotlinx_coroutines_core()) {
                        channelSegment.cleanPrev();
                    }
                    ChannelSegment channelSegment2 = (ChannelSegment) receiveSegment$FU.get(this);
                    while (true) {
                        if (isClosedForReceive()) {
                            onClosedReceiveOnNoWaiterSuspend(orCreateCancellableContinuation);
                            break;
                        }
                        long andIncrement = receivers$FU.getAndIncrement(this);
                        int i11 = BufferedChannelKt.SEGMENT_SIZE;
                        long j10 = andIncrement / i11;
                        int i12 = (int) (andIncrement % i11);
                        if (channelSegment2.id != j10) {
                            ChannelSegment findSegmentReceive = findSegmentReceive(j10, channelSegment2);
                            if (findSegmentReceive != null) {
                                channelSegment2 = findSegmentReceive;
                            }
                        }
                        updateCellReceive = updateCellReceive(channelSegment2, i12, andIncrement, orCreateCancellableContinuation);
                        if (updateCellReceive == BufferedChannelKt.access$getSUSPEND$p()) {
                            if (orCreateCancellableContinuation instanceof Waiter) {
                                cancellableContinuationImpl = orCreateCancellableContinuation;
                            }
                            if (cancellableContinuationImpl != null) {
                                prepareReceiverForSuspension(cancellableContinuationImpl, channelSegment2, i12);
                            }
                        } else if (updateCellReceive == BufferedChannelKt.access$getFAILED$p()) {
                            if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                                channelSegment2.cleanPrev();
                            }
                        } else if (updateCellReceive != BufferedChannelKt.access$getSUSPEND_NO_WAITER$p()) {
                            channelSegment2.cleanPrev();
                            Function1<E, Unit> function12 = this.onUndeliveredElement;
                            if (function12 != null) {
                                function1 = OnUndeliveredElementKt.bindCancellationFun(function12, updateCellReceive, orCreateCancellableContinuation.getContext());
                            }
                        } else {
                            throw new IllegalStateException("unexpected".toString());
                        }
                    }
                } else {
                    channelSegment.cleanPrev();
                    Function1<E, Unit> function13 = this.onUndeliveredElement;
                    if (function13 != null) {
                        function1 = OnUndeliveredElementKt.bindCancellationFun(function13, updateCellReceive, orCreateCancellableContinuation.getContext());
                    }
                }
                orCreateCancellableContinuation.resume(updateCellReceive, function1);
            }
            Object result = orCreateCancellableContinuation.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result;
        } catch (Throwable th2) {
            orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerSelectForReceive(SelectInstance<?> select, Object ignoredParam) {
        Waiter waiter;
        ChannelSegment channelSegment = (ChannelSegment) receiveSegment$FU.get(this);
        while (!isClosedForReceive()) {
            long andIncrement = receivers$FU.getAndIncrement(this);
            int i10 = BufferedChannelKt.SEGMENT_SIZE;
            long j3 = andIncrement / i10;
            int i11 = (int) (andIncrement % i10);
            if (channelSegment.id != j3) {
                ChannelSegment findSegmentReceive = findSegmentReceive(j3, channelSegment);
                if (findSegmentReceive == null) {
                    continue;
                } else {
                    channelSegment = findSegmentReceive;
                }
            }
            Object updateCellReceive = updateCellReceive(channelSegment, i11, andIncrement, select);
            if (updateCellReceive == BufferedChannelKt.access$getSUSPEND$p()) {
                if (select instanceof Waiter) {
                    waiter = (Waiter) select;
                } else {
                    waiter = null;
                }
                if (waiter != null) {
                    prepareReceiverForSuspension(waiter, channelSegment, i11);
                    return;
                }
                return;
            }
            if (updateCellReceive == BufferedChannelKt.access$getFAILED$p()) {
                if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                    channelSegment.cleanPrev();
                }
            } else {
                if (updateCellReceive != BufferedChannelKt.access$getSUSPEND_NO_WAITER$p()) {
                    channelSegment.cleanPrev();
                    select.selectInRegistrationPhase(updateCellReceive);
                    return;
                }
                throw new IllegalStateException("unexpected".toString());
            }
        }
        onClosedSelectOnReceive(select);
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x00b3, code lost:
    
        r12 = (kotlinx.coroutines.channels.ChannelSegment) r12.getPrev();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void removeUnprocessedElements(kotlinx.coroutines.channels.ChannelSegment<E> r12) {
        /*
            r11 = this;
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r0 = r11.onUndeliveredElement
            r1 = 0
            r2 = 1
            java.lang.Object r3 = kotlinx.coroutines.internal.InlineList.m1705constructorimpl$default(r1, r2, r1)
        L8:
            int r4 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            int r4 = r4 - r2
        Lb:
            r5 = -1
            if (r5 >= r4) goto Lb3
            long r6 = r12.id
            int r8 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r8 = (long) r8
            long r6 = r6 * r8
            long r8 = (long) r4
            long r6 = r6 + r8
        L16:
            java.lang.Object r8 = r12.getState$kotlinx_coroutines_core(r4)
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.channels.BufferedChannelKt.access$getDONE_RCV$p()
            if (r8 == r9) goto Lbb
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED
            if (r8 != r9) goto L48
            long r9 = r11.getReceiversCounter$kotlinx_coroutines_core()
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto Lbb
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()
            boolean r8 = r12.casState$kotlinx_coroutines_core(r4, r8, r9)
            if (r8 == 0) goto L16
            if (r0 == 0) goto L40
            java.lang.Object r5 = r12.getElement$kotlinx_coroutines_core(r4)
            kotlinx.coroutines.internal.UndeliveredElementException r1 = kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElementCatchingException(r0, r5, r1)
        L40:
            r12.cleanElement$kotlinx_coroutines_core(r4)
            r12.onSlotCleaned()
            goto Laf
        L48:
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.channels.BufferedChannelKt.access$getIN_BUFFER$p()
            if (r8 == r9) goto La2
            if (r8 != 0) goto L51
            goto La2
        L51:
            boolean r9 = r8 instanceof kotlinx.coroutines.Waiter
            if (r9 != 0) goto L6e
            boolean r9 = r8 instanceof kotlinx.coroutines.channels.WaiterEB
            if (r9 == 0) goto L5a
            goto L6e
        L5a:
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.channels.BufferedChannelKt.access$getRESUMING_BY_EB$p()
            if (r8 == r9) goto Lbb
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.channels.BufferedChannelKt.access$getRESUMING_BY_RCV$p()
            if (r8 != r9) goto L67
            goto Lbb
        L67:
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.channels.BufferedChannelKt.access$getRESUMING_BY_EB$p()
            if (r8 == r9) goto L16
            goto Laf
        L6e:
            long r9 = r11.getReceiversCounter$kotlinx_coroutines_core()
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto Lbb
            boolean r9 = r8 instanceof kotlinx.coroutines.channels.WaiterEB
            if (r9 == 0) goto L80
            r9 = r8
            kotlinx.coroutines.channels.WaiterEB r9 = (kotlinx.coroutines.channels.WaiterEB) r9
            kotlinx.coroutines.Waiter r9 = r9.waiter
            goto L83
        L80:
            r9 = r8
            kotlinx.coroutines.Waiter r9 = (kotlinx.coroutines.Waiter) r9
        L83:
            kotlinx.coroutines.internal.Symbol r10 = kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()
            boolean r8 = r12.casState$kotlinx_coroutines_core(r4, r8, r10)
            if (r8 == 0) goto L16
            if (r0 == 0) goto L97
            java.lang.Object r5 = r12.getElement$kotlinx_coroutines_core(r4)
            kotlinx.coroutines.internal.UndeliveredElementException r1 = kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElementCatchingException(r0, r5, r1)
        L97:
            java.lang.Object r3 = kotlinx.coroutines.internal.InlineList.m1710plusFjFbRPM(r3, r9)
            r12.cleanElement$kotlinx_coroutines_core(r4)
            r12.onSlotCleaned()
            goto Laf
        La2:
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()
            boolean r8 = r12.casState$kotlinx_coroutines_core(r4, r8, r9)
            if (r8 == 0) goto L16
            r12.onSlotCleaned()
        Laf:
            int r4 = r4 + (-1)
            goto Lb
        Lb3:
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r12 = r12.getPrev()
            kotlinx.coroutines.channels.ChannelSegment r12 = (kotlinx.coroutines.channels.ChannelSegment) r12
            if (r12 != 0) goto L8
        Lbb:
            if (r3 == 0) goto Le1
            boolean r12 = r3 instanceof java.util.ArrayList
            if (r12 != 0) goto Lc7
            kotlinx.coroutines.Waiter r3 = (kotlinx.coroutines.Waiter) r3
            r11.resumeSenderOnCancelledChannel(r3)
            goto Le1
        Lc7:
            java.lang.String r12 = "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r12)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r12 = r3.size()
            int r12 = r12 - r2
        Ld3:
            if (r5 >= r12) goto Le1
            java.lang.Object r0 = r3.get(r12)
            kotlinx.coroutines.Waiter r0 = (kotlinx.coroutines.Waiter) r0
            r11.resumeSenderOnCancelledChannel(r0)
            int r12 = r12 + (-1)
            goto Ld3
        Le1:
            if (r1 != 0) goto Le4
            return
        Le4:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.removeUnprocessedElements(kotlinx.coroutines.channels.ChannelSegment):void");
    }

    private final void resumeReceiverOnClosedChannel(Waiter waiter) {
        resumeWaiterOnClosedChannel(waiter, true);
    }

    private final void resumeSenderOnCancelledChannel(Waiter waiter) {
        resumeWaiterOnClosedChannel(waiter, false);
    }

    private final void resumeWaiterOnClosedChannel(Waiter waiter, boolean z10) {
        Throwable sendException;
        if (waiter instanceof SendBroadcast) {
            CancellableContinuation<Boolean> cont = ((SendBroadcast) waiter).getCont();
            Result.Companion companion = Result.INSTANCE;
            cont.resumeWith(Result.m145constructorimpl(Boolean.FALSE));
            return;
        }
        if (waiter instanceof CancellableContinuation) {
            Continuation continuation = (Continuation) waiter;
            Result.Companion companion2 = Result.INSTANCE;
            if (z10) {
                sendException = getReceiveException();
            } else {
                sendException = getSendException();
            }
            continuation.resumeWith(Result.m145constructorimpl(ResultKt.createFailure(sendException)));
            return;
        }
        if (waiter instanceof ReceiveCatching) {
            CancellableContinuationImpl<ChannelResult<? extends E>> cancellableContinuationImpl = ((ReceiveCatching) waiter).cont;
            Result.Companion companion3 = Result.INSTANCE;
            cancellableContinuationImpl.resumeWith(Result.m145constructorimpl(ChannelResult.m1669boximpl(ChannelResult.INSTANCE.m1682closedJP2dKIU(getCloseCause()))));
        } else if (waiter instanceof BufferedChannelIterator) {
            ((BufferedChannelIterator) waiter).tryResumeHasNextOnClosedChannel();
        } else if (waiter instanceof SelectInstance) {
            ((SelectInstance) waiter).trySelect(this, BufferedChannelKt.getCHANNEL_CLOSED());
        } else {
            throw new IllegalStateException(("Unexpected waiter: " + waiter).toString());
        }
    }

    public static /* synthetic */ <E> Object send$suspendImpl(BufferedChannel<E> bufferedChannel, E e2, Continuation<? super Unit> continuation) {
        ChannelSegment<E> channelSegment;
        ChannelSegment<E> channelSegment2 = (ChannelSegment) sendSegment$FU.get(bufferedChannel);
        while (true) {
            long andIncrement = sendersAndCloseStatus$FU.getAndIncrement(bufferedChannel);
            long j3 = andIncrement & 1152921504606846975L;
            boolean isClosedForSend0 = bufferedChannel.isClosedForSend0(andIncrement);
            int i10 = BufferedChannelKt.SEGMENT_SIZE;
            long j10 = j3 / i10;
            int i11 = (int) (j3 % i10);
            if (channelSegment2.id != j10) {
                ChannelSegment<E> findSegmentSend = bufferedChannel.findSegmentSend(j10, channelSegment2);
                if (findSegmentSend == null) {
                    if (isClosedForSend0) {
                        Object onClosedSend = bufferedChannel.onClosedSend(e2, continuation);
                        if (onClosedSend == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            return onClosedSend;
                        }
                    }
                } else {
                    channelSegment = findSegmentSend;
                }
            } else {
                channelSegment = channelSegment2;
            }
            int updateCellSend = bufferedChannel.updateCellSend(channelSegment, i11, e2, j3, null, isClosedForSend0);
            if (updateCellSend != 0) {
                if (updateCellSend == 1) {
                    break;
                }
                if (updateCellSend != 2) {
                    if (updateCellSend != 3) {
                        if (updateCellSend != 4) {
                            if (updateCellSend == 5) {
                                channelSegment.cleanPrev();
                            }
                            channelSegment2 = channelSegment;
                        } else {
                            if (j3 < bufferedChannel.getReceiversCounter$kotlinx_coroutines_core()) {
                                channelSegment.cleanPrev();
                            }
                            Object onClosedSend2 = bufferedChannel.onClosedSend(e2, continuation);
                            if (onClosedSend2 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                return onClosedSend2;
                            }
                        }
                    } else {
                        Object sendOnNoWaiterSuspend = bufferedChannel.sendOnNoWaiterSuspend(channelSegment, i11, e2, j3, continuation);
                        if (sendOnNoWaiterSuspend == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            return sendOnNoWaiterSuspend;
                        }
                    }
                } else if (isClosedForSend0) {
                    channelSegment.onSlotCleaned();
                    Object onClosedSend3 = bufferedChannel.onClosedSend(e2, continuation);
                    if (onClosedSend3 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        return onClosedSend3;
                    }
                }
            } else {
                channelSegment.cleanPrev();
                break;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b6, code lost:
    
        r0 = kotlin.Result.INSTANCE;
        r9.resumeWith(kotlin.Result.m145constructorimpl(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ <E> java.lang.Object sendBroadcast$suspendImpl(kotlinx.coroutines.channels.BufferedChannel<E> r18, E r19, kotlin.coroutines.Continuation<? super java.lang.Boolean> r20) {
        /*
            r8 = r18
            kotlinx.coroutines.CancellableContinuationImpl r9 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r20)
            r10 = 1
            r9.<init>(r0, r10)
            r9.initCancellability()
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r0 = r8.onUndeliveredElement
            r11 = 0
            if (r0 != 0) goto L16
            r0 = r10
            goto L17
        L16:
            r0 = r11
        L17:
            if (r0 == 0) goto Ld1
            kotlinx.coroutines.channels.BufferedChannel$SendBroadcast r12 = new kotlinx.coroutines.channels.BufferedChannel$SendBroadcast
            r12.<init>(r9)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = access$getSendSegment$FU$p()
            java.lang.Object r0 = r0.get(r8)
            kotlinx.coroutines.channels.ChannelSegment r0 = (kotlinx.coroutines.channels.ChannelSegment) r0
        L28:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = access$getSendersAndCloseStatus$FU$p()
            long r1 = r1.getAndIncrement(r8)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r13 = r1 & r3
            boolean r15 = access$isClosedForSend0(r8, r1)
            int r1 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r2 = (long) r1
            long r2 = r13 / r2
            long r4 = (long) r1
            long r4 = r13 % r4
            int r7 = (int) r4
            long r4 = r0.id
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L55
            kotlinx.coroutines.channels.ChannelSegment r1 = access$findSegmentSend(r8, r2, r0)
            if (r1 != 0) goto L53
            if (r15 == 0) goto L28
            goto L9b
        L53:
            r6 = r1
            goto L56
        L55:
            r6 = r0
        L56:
            r0 = r18
            r1 = r6
            r2 = r7
            r3 = r19
            r4 = r13
            r16 = r6
            r6 = r12
            r17 = r7
            r7 = r15
            int r0 = access$updateCellSend(r0, r1, r2, r3, r4, r6, r7)
            if (r0 == 0) goto Lb1
            if (r0 == r10) goto Lb6
            r1 = 2
            if (r0 == r1) goto L96
            r1 = 3
            if (r0 == r1) goto L8a
            r1 = 4
            if (r0 == r1) goto L7e
            r1 = 5
            if (r0 == r1) goto L78
            goto L7b
        L78:
            r16.cleanPrev()
        L7b:
            r0 = r16
            goto L28
        L7e:
            long r0 = r18.getReceiversCounter$kotlinx_coroutines_core()
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 >= 0) goto L9b
            r16.cleanPrev()
            goto L9b
        L8a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "unexpected"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L96:
            if (r15 == 0) goto La9
            r16.onSlotCleaned()
        L9b:
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r11)
            java.lang.Object r0 = kotlin.Result.m145constructorimpl(r0)
            r9.resumeWith(r0)
            goto Lc3
        La9:
            r1 = r16
            r0 = r17
            access$prepareSenderForSuspension(r8, r12, r1, r0)
            goto Lc3
        Lb1:
            r1 = r16
            r1.cleanPrev()
        Lb6:
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r10)
            java.lang.Object r0 = kotlin.Result.m145constructorimpl(r0)
            r9.resumeWith(r0)
        Lc3:
            java.lang.Object r0 = r9.getResult()
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto Ld0
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r20)
        Ld0:
            return r0
        Ld1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "the `onUndeliveredElement` feature is unsupported for `sendBroadcast(e)`"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.sendBroadcast$suspendImpl(kotlinx.coroutines.channels.BufferedChannel, java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object sendImpl$default(BufferedChannel bufferedChannel, Object obj, Object obj2, Function0 function0, Function2 function2, Function0 function02, Function4 function4, int i10, Object obj3) {
        Function4 function42;
        ChannelSegment channelSegment;
        Waiter waiter;
        if (obj3 == null) {
            if ((i10 & 32) != 0) {
                function42 = new Function4() { // from class: kotlinx.coroutines.channels.BufferedChannel$sendImpl$1
                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                        return invoke((ChannelSegment<int>) obj4, ((Number) obj5).intValue(), (int) obj6, ((Number) obj7).longValue());
                    }

                    public final Void invoke(ChannelSegment<E> channelSegment2, int i11, E e2, long j3) {
                        throw new IllegalStateException("unexpected".toString());
                    }
                };
            } else {
                function42 = function4;
            }
            ChannelSegment channelSegment2 = (ChannelSegment) sendSegment$FU.get(bufferedChannel);
            while (true) {
                long andIncrement = sendersAndCloseStatus$FU.getAndIncrement(bufferedChannel);
                long j3 = andIncrement & 1152921504606846975L;
                boolean isClosedForSend0 = bufferedChannel.isClosedForSend0(andIncrement);
                int i11 = BufferedChannelKt.SEGMENT_SIZE;
                long j10 = j3 / i11;
                int i12 = (int) (j3 % i11);
                if (channelSegment2.id != j10) {
                    ChannelSegment findSegmentSend = bufferedChannel.findSegmentSend(j10, channelSegment2);
                    if (findSegmentSend == null) {
                        if (isClosedForSend0) {
                            return function02.invoke();
                        }
                    } else {
                        channelSegment = findSegmentSend;
                    }
                } else {
                    channelSegment = channelSegment2;
                }
                int updateCellSend = bufferedChannel.updateCellSend(channelSegment, i12, obj, j3, obj2, isClosedForSend0);
                if (updateCellSend != 0) {
                    if (updateCellSend != 1) {
                        if (updateCellSend != 2) {
                            if (updateCellSend != 3) {
                                if (updateCellSend != 4) {
                                    if (updateCellSend == 5) {
                                        channelSegment.cleanPrev();
                                    }
                                    channelSegment2 = channelSegment;
                                } else {
                                    if (j3 < bufferedChannel.getReceiversCounter$kotlinx_coroutines_core()) {
                                        channelSegment.cleanPrev();
                                    }
                                    return function02.invoke();
                                }
                            } else {
                                return function42.invoke(channelSegment, Integer.valueOf(i12), obj, Long.valueOf(j3));
                            }
                        } else {
                            if (isClosedForSend0) {
                                channelSegment.onSlotCleaned();
                                return function02.invoke();
                            }
                            if (obj2 instanceof Waiter) {
                                waiter = (Waiter) obj2;
                            } else {
                                waiter = null;
                            }
                            if (waiter != null) {
                                bufferedChannel.prepareSenderForSuspension(waiter, channelSegment, i12);
                            }
                            return function2.invoke(channelSegment, Integer.valueOf(i12));
                        }
                    } else {
                        return function0.invoke();
                    }
                } else {
                    channelSegment.cleanPrev();
                    return function0.invoke();
                }
            }
        } else {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendImpl");
        }
    }

    private final void sendImplOnNoWaiter(ChannelSegment<E> segment, int index, E element, long s5, Waiter waiter, Function0<Unit> onRendezvousOrBuffered, Function0<Unit> onClosed) {
        ChannelSegment channelSegment;
        Waiter waiter2 = waiter;
        int updateCellSend = updateCellSend(segment, index, element, s5, waiter, false);
        if (updateCellSend != 0) {
            if (updateCellSend != 1) {
                if (updateCellSend != 2) {
                    if (updateCellSend != 4) {
                        if (updateCellSend == 5) {
                            segment.cleanPrev();
                            ChannelSegment channelSegment2 = (ChannelSegment) sendSegment$FU.get(this);
                            while (true) {
                                long andIncrement = sendersAndCloseStatus$FU.getAndIncrement(this);
                                long j3 = andIncrement & 1152921504606846975L;
                                boolean isClosedForSend0 = isClosedForSend0(andIncrement);
                                int i10 = BufferedChannelKt.SEGMENT_SIZE;
                                long j10 = j3 / i10;
                                int i11 = (int) (j3 % i10);
                                if (channelSegment2.id != j10) {
                                    ChannelSegment findSegmentSend = findSegmentSend(j10, channelSegment2);
                                    if (findSegmentSend == null) {
                                        if (isClosedForSend0) {
                                            onClosed.invoke();
                                            return;
                                        }
                                    } else {
                                        channelSegment = findSegmentSend;
                                    }
                                } else {
                                    channelSegment = channelSegment2;
                                }
                                ChannelSegment channelSegment3 = channelSegment;
                                int updateCellSend2 = updateCellSend(channelSegment, i11, element, j3, waiter, isClosedForSend0);
                                if (updateCellSend2 != 0) {
                                    if (updateCellSend2 != 1) {
                                        if (updateCellSend2 != 2) {
                                            if (updateCellSend2 != 3) {
                                                if (updateCellSend2 != 4) {
                                                    if (updateCellSend2 == 5) {
                                                        channelSegment3.cleanPrev();
                                                    }
                                                    channelSegment2 = channelSegment3;
                                                } else {
                                                    if (j3 < getReceiversCounter$kotlinx_coroutines_core()) {
                                                        channelSegment3.cleanPrev();
                                                    }
                                                    onClosed.invoke();
                                                    return;
                                                }
                                            } else {
                                                throw new IllegalStateException("unexpected".toString());
                                            }
                                        } else {
                                            if (isClosedForSend0) {
                                                channelSegment3.onSlotCleaned();
                                                onClosed.invoke();
                                                return;
                                            }
                                            if (!(waiter2 instanceof Waiter)) {
                                                waiter2 = null;
                                            }
                                            if (waiter2 != null) {
                                                prepareSenderForSuspension(waiter2, channelSegment3, i11);
                                            }
                                            Unit unit = Unit.INSTANCE;
                                            return;
                                        }
                                    } else {
                                        onRendezvousOrBuffered.invoke();
                                        return;
                                    }
                                } else {
                                    channelSegment3.cleanPrev();
                                    onRendezvousOrBuffered.invoke();
                                    return;
                                }
                            }
                        } else {
                            throw new IllegalStateException("unexpected".toString());
                        }
                    } else {
                        if (s5 < getReceiversCounter$kotlinx_coroutines_core()) {
                            segment.cleanPrev();
                        }
                        onClosed.invoke();
                    }
                } else {
                    prepareSenderForSuspension(waiter2, segment, index);
                }
            } else {
                onRendezvousOrBuffered.invoke();
            }
        } else {
            segment.cleanPrev();
            onRendezvousOrBuffered.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0122 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object sendOnNoWaiterSuspend(kotlinx.coroutines.channels.ChannelSegment<E> r21, int r22, E r23, long r24, kotlin.coroutines.Continuation<? super kotlin.Unit> r26) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.sendOnNoWaiterSuspend(kotlinx.coroutines.channels.ChannelSegment, int, java.lang.Object, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final boolean shouldSendSuspend(long curSendersAndCloseStatus) {
        if (isClosedForSend0(curSendersAndCloseStatus)) {
            return false;
        }
        return !bufferOrRendezvousSend(curSendersAndCloseStatus & 1152921504606846975L);
    }

    private final boolean tryResumeReceiver(Object obj, E e2) {
        if (obj instanceof SelectInstance) {
            return ((SelectInstance) obj).trySelect(this, e2);
        }
        Function1<Throwable, Unit> function1 = null;
        if (obj instanceof ReceiveCatching) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            ReceiveCatching receiveCatching = (ReceiveCatching) obj;
            CancellableContinuationImpl<ChannelResult<? extends E>> cancellableContinuationImpl = receiveCatching.cont;
            ChannelResult m1669boximpl = ChannelResult.m1669boximpl(ChannelResult.INSTANCE.m1684successJP2dKIU(e2));
            Function1<E, Unit> function12 = this.onUndeliveredElement;
            if (function12 != null) {
                function1 = OnUndeliveredElementKt.bindCancellationFun(function12, e2, receiveCatching.cont.getContext());
            }
            return BufferedChannelKt.access$tryResume0(cancellableContinuationImpl, m1669boximpl, function1);
        }
        if (obj instanceof BufferedChannelIterator) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((BufferedChannelIterator) obj).tryResumeHasNext(e2);
        }
        if (obj instanceof CancellableContinuation) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            CancellableContinuation cancellableContinuation = (CancellableContinuation) obj;
            Function1<E, Unit> function13 = this.onUndeliveredElement;
            if (function13 != null) {
                function1 = OnUndeliveredElementKt.bindCancellationFun(function13, e2, cancellableContinuation.getContext());
            }
            return BufferedChannelKt.access$tryResume0(cancellableContinuation, e2, function1);
        }
        throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
    }

    private final boolean tryResumeSender(Object obj, ChannelSegment<E> channelSegment, int i10) {
        if (obj instanceof CancellableContinuation) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return BufferedChannelKt.tryResume0$default((CancellableContinuation) obj, Unit.INSTANCE, null, 2, null);
        }
        if (obj instanceof SelectInstance) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            TrySelectDetailedResult trySelectDetailed = ((SelectImplementation) obj).trySelectDetailed(this, Unit.INSTANCE);
            if (trySelectDetailed == TrySelectDetailedResult.REREGISTER) {
                channelSegment.cleanElement$kotlinx_coroutines_core(i10);
            }
            if (trySelectDetailed == TrySelectDetailedResult.SUCCESSFUL) {
                return true;
            }
            return false;
        }
        if (obj instanceof SendBroadcast) {
            return BufferedChannelKt.tryResume0$default(((SendBroadcast) obj).getCont(), Boolean.TRUE, null, 2, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    private final void update$atomicfu(AtomicLongFieldUpdater atomicLongFieldUpdater, Function1<? super Long, Long> function1, Object obj) {
        long j3;
        do {
            j3 = atomicLongFieldUpdater.get(obj);
        } while (!atomicLongFieldUpdater.compareAndSet(obj, j3, function1.invoke(Long.valueOf(j3)).longValue()));
    }

    private final boolean updateCellExpandBuffer(ChannelSegment<E> segment, int index, long b3) {
        Object state$kotlinx_coroutines_core = segment.getState$kotlinx_coroutines_core(index);
        if ((state$kotlinx_coroutines_core instanceof Waiter) && b3 >= receivers$FU.get(this) && segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, BufferedChannelKt.access$getRESUMING_BY_EB$p())) {
            if (tryResumeSender(state$kotlinx_coroutines_core, segment, index)) {
                segment.setState$kotlinx_coroutines_core(index, BufferedChannelKt.BUFFERED);
                return true;
            }
            segment.setState$kotlinx_coroutines_core(index, BufferedChannelKt.access$getINTERRUPTED_SEND$p());
            segment.onCancelledRequest(index, false);
            return false;
        }
        return updateCellExpandBufferSlow(segment, index, b3);
    }

    private final boolean updateCellExpandBufferSlow(ChannelSegment<E> segment, int index, long b3) {
        while (true) {
            Object state$kotlinx_coroutines_core = segment.getState$kotlinx_coroutines_core(index);
            if (state$kotlinx_coroutines_core instanceof Waiter) {
                if (b3 < receivers$FU.get(this)) {
                    if (segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, new WaiterEB((Waiter) state$kotlinx_coroutines_core))) {
                        return true;
                    }
                } else if (segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, BufferedChannelKt.access$getRESUMING_BY_EB$p())) {
                    if (tryResumeSender(state$kotlinx_coroutines_core, segment, index)) {
                        segment.setState$kotlinx_coroutines_core(index, BufferedChannelKt.BUFFERED);
                        return true;
                    }
                    segment.setState$kotlinx_coroutines_core(index, BufferedChannelKt.access$getINTERRUPTED_SEND$p());
                    segment.onCancelledRequest(index, false);
                    return false;
                }
            } else {
                if (state$kotlinx_coroutines_core == BufferedChannelKt.access$getINTERRUPTED_SEND$p()) {
                    return false;
                }
                if (state$kotlinx_coroutines_core == null) {
                    if (segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, BufferedChannelKt.access$getIN_BUFFER$p())) {
                        return true;
                    }
                } else {
                    if (state$kotlinx_coroutines_core == BufferedChannelKt.BUFFERED || state$kotlinx_coroutines_core == BufferedChannelKt.access$getPOISONED$p() || state$kotlinx_coroutines_core == BufferedChannelKt.access$getDONE_RCV$p() || state$kotlinx_coroutines_core == BufferedChannelKt.access$getINTERRUPTED_RCV$p() || state$kotlinx_coroutines_core == BufferedChannelKt.getCHANNEL_CLOSED()) {
                        return true;
                    }
                    if (state$kotlinx_coroutines_core != BufferedChannelKt.access$getRESUMING_BY_RCV$p()) {
                        throw new IllegalStateException(("Unexpected cell state: " + state$kotlinx_coroutines_core).toString());
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object updateCellReceive(ChannelSegment<E> segment, int index, long r6, Object waiter) {
        Object state$kotlinx_coroutines_core = segment.getState$kotlinx_coroutines_core(index);
        if (state$kotlinx_coroutines_core == null) {
            if (r6 >= (sendersAndCloseStatus$FU.get(this) & 1152921504606846975L)) {
                if (waiter == null) {
                    return BufferedChannelKt.access$getSUSPEND_NO_WAITER$p();
                }
                if (segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, waiter)) {
                    expandBuffer();
                    return BufferedChannelKt.access$getSUSPEND$p();
                }
            }
        } else if (state$kotlinx_coroutines_core == BufferedChannelKt.BUFFERED && segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, BufferedChannelKt.access$getDONE_RCV$p())) {
            expandBuffer();
            return segment.retrieveElement$kotlinx_coroutines_core(index);
        }
        return updateCellReceiveSlow(segment, index, r6, waiter);
    }

    private final Object updateCellReceiveSlow(ChannelSegment<E> segment, int index, long r6, Object waiter) {
        while (true) {
            Object state$kotlinx_coroutines_core = segment.getState$kotlinx_coroutines_core(index);
            if (state$kotlinx_coroutines_core != null && state$kotlinx_coroutines_core != BufferedChannelKt.access$getIN_BUFFER$p()) {
                if (state$kotlinx_coroutines_core == BufferedChannelKt.BUFFERED) {
                    if (segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, BufferedChannelKt.access$getDONE_RCV$p())) {
                        expandBuffer();
                        return segment.retrieveElement$kotlinx_coroutines_core(index);
                    }
                } else {
                    if (state$kotlinx_coroutines_core == BufferedChannelKt.access$getINTERRUPTED_SEND$p()) {
                        return BufferedChannelKt.access$getFAILED$p();
                    }
                    if (state$kotlinx_coroutines_core == BufferedChannelKt.access$getPOISONED$p()) {
                        return BufferedChannelKt.access$getFAILED$p();
                    }
                    if (state$kotlinx_coroutines_core == BufferedChannelKt.getCHANNEL_CLOSED()) {
                        expandBuffer();
                        return BufferedChannelKt.access$getFAILED$p();
                    }
                    if (state$kotlinx_coroutines_core != BufferedChannelKt.access$getRESUMING_BY_EB$p() && segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, BufferedChannelKt.access$getRESUMING_BY_RCV$p())) {
                        boolean z10 = state$kotlinx_coroutines_core instanceof WaiterEB;
                        if (z10) {
                            state$kotlinx_coroutines_core = ((WaiterEB) state$kotlinx_coroutines_core).waiter;
                        }
                        if (tryResumeSender(state$kotlinx_coroutines_core, segment, index)) {
                            segment.setState$kotlinx_coroutines_core(index, BufferedChannelKt.access$getDONE_RCV$p());
                            expandBuffer();
                            return segment.retrieveElement$kotlinx_coroutines_core(index);
                        }
                        segment.setState$kotlinx_coroutines_core(index, BufferedChannelKt.access$getINTERRUPTED_SEND$p());
                        segment.onCancelledRequest(index, false);
                        if (z10) {
                            expandBuffer();
                        }
                        return BufferedChannelKt.access$getFAILED$p();
                    }
                }
            } else if (r6 < (sendersAndCloseStatus$FU.get(this) & 1152921504606846975L)) {
                if (segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, BufferedChannelKt.access$getPOISONED$p())) {
                    expandBuffer();
                    return BufferedChannelKt.access$getFAILED$p();
                }
            } else {
                if (waiter == null) {
                    return BufferedChannelKt.access$getSUSPEND_NO_WAITER$p();
                }
                if (segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, waiter)) {
                    expandBuffer();
                    return BufferedChannelKt.access$getSUSPEND$p();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int updateCellSend(ChannelSegment<E> segment, int index, E element, long s5, Object waiter, boolean closed) {
        segment.storeElement$kotlinx_coroutines_core(index, element);
        if (closed) {
            return updateCellSendSlow(segment, index, element, s5, waiter, closed);
        }
        Object state$kotlinx_coroutines_core = segment.getState$kotlinx_coroutines_core(index);
        if (state$kotlinx_coroutines_core == null) {
            if (bufferOrRendezvousSend(s5)) {
                if (segment.casState$kotlinx_coroutines_core(index, null, BufferedChannelKt.BUFFERED)) {
                    return 1;
                }
            } else {
                if (waiter == null) {
                    return 3;
                }
                if (segment.casState$kotlinx_coroutines_core(index, null, waiter)) {
                    return 2;
                }
            }
        } else if (state$kotlinx_coroutines_core instanceof Waiter) {
            segment.cleanElement$kotlinx_coroutines_core(index);
            if (tryResumeReceiver(state$kotlinx_coroutines_core, element)) {
                segment.setState$kotlinx_coroutines_core(index, BufferedChannelKt.access$getDONE_RCV$p());
                onReceiveDequeued();
                return 0;
            }
            if (segment.getAndSetState$kotlinx_coroutines_core(index, BufferedChannelKt.access$getINTERRUPTED_RCV$p()) != BufferedChannelKt.access$getINTERRUPTED_RCV$p()) {
                segment.onCancelledRequest(index, true);
            }
            return 5;
        }
        return updateCellSendSlow(segment, index, element, s5, waiter, closed);
    }

    private final int updateCellSendSlow(ChannelSegment<E> segment, int index, E element, long s5, Object waiter, boolean closed) {
        while (true) {
            Object state$kotlinx_coroutines_core = segment.getState$kotlinx_coroutines_core(index);
            if (state$kotlinx_coroutines_core == null) {
                if (bufferOrRendezvousSend(s5) && !closed) {
                    if (segment.casState$kotlinx_coroutines_core(index, null, BufferedChannelKt.BUFFERED)) {
                        return 1;
                    }
                } else if (closed) {
                    if (segment.casState$kotlinx_coroutines_core(index, null, BufferedChannelKt.access$getINTERRUPTED_SEND$p())) {
                        segment.onCancelledRequest(index, false);
                        return 4;
                    }
                } else {
                    if (waiter == null) {
                        return 3;
                    }
                    if (segment.casState$kotlinx_coroutines_core(index, null, waiter)) {
                        return 2;
                    }
                }
            } else if (state$kotlinx_coroutines_core == BufferedChannelKt.access$getIN_BUFFER$p()) {
                if (segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, BufferedChannelKt.BUFFERED)) {
                    return 1;
                }
            } else {
                if (state$kotlinx_coroutines_core == BufferedChannelKt.access$getINTERRUPTED_RCV$p()) {
                    segment.cleanElement$kotlinx_coroutines_core(index);
                    return 5;
                }
                if (state$kotlinx_coroutines_core == BufferedChannelKt.access$getPOISONED$p()) {
                    segment.cleanElement$kotlinx_coroutines_core(index);
                    return 5;
                }
                if (state$kotlinx_coroutines_core == BufferedChannelKt.getCHANNEL_CLOSED()) {
                    segment.cleanElement$kotlinx_coroutines_core(index);
                    completeCloseOrCancel();
                    return 4;
                }
                segment.cleanElement$kotlinx_coroutines_core(index);
                if (state$kotlinx_coroutines_core instanceof WaiterEB) {
                    state$kotlinx_coroutines_core = ((WaiterEB) state$kotlinx_coroutines_core).waiter;
                }
                if (tryResumeReceiver(state$kotlinx_coroutines_core, element)) {
                    segment.setState$kotlinx_coroutines_core(index, BufferedChannelKt.access$getDONE_RCV$p());
                    onReceiveDequeued();
                    return 0;
                }
                if (segment.getAndSetState$kotlinx_coroutines_core(index, BufferedChannelKt.access$getINTERRUPTED_RCV$p()) != BufferedChannelKt.access$getINTERRUPTED_RCV$p()) {
                    segment.onCancelledRequest(index, true);
                }
                return 5;
            }
        }
    }

    private final void updateReceiversCounterIfLower(long value) {
        long j3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = receivers$FU;
        do {
            j3 = atomicLongFieldUpdater.get(this);
            if (j3 >= value) {
                return;
            }
        } while (!receivers$FU.compareAndSet(this, j3, value));
    }

    private final void updateSendersCounterIfLower(long value) {
        long j3;
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = sendersAndCloseStatus$FU;
        do {
            j3 = atomicLongFieldUpdater.get(this);
            j10 = 1152921504606846975L & j3;
            if (j10 >= value) {
                return;
            }
        } while (!sendersAndCloseStatus$FU.compareAndSet(this, j3, BufferedChannelKt.access$constructSendersAndCloseStatus(j10, (int) (j3 >> 60))));
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final boolean cancel(Throwable cause) {
        return cancelImpl$kotlinx_coroutines_core(cause);
    }

    public boolean cancelImpl$kotlinx_coroutines_core(Throwable cause) {
        if (cause == null) {
            cause = new CancellationException("Channel was cancelled");
        }
        return closeOrCancelImpl(cause, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01e5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void checkSegmentStructureInvariants() {
        /*
            Method dump skipped, instructions count: 564
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.checkSegmentStructureInvariants():void");
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean close(Throwable cause) {
        return closeOrCancelImpl(cause, false);
    }

    public boolean closeOrCancelImpl(Throwable cause, boolean cancel) {
        boolean z10;
        if (cancel) {
            markCancellationStarted();
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _closeCause$FU;
        Symbol access$getNO_CLOSE_CAUSE$p = BufferedChannelKt.access$getNO_CLOSE_CAUSE$p();
        while (true) {
            if (atomicReferenceFieldUpdater.compareAndSet(this, access$getNO_CLOSE_CAUSE$p, cause)) {
                z10 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != access$getNO_CLOSE_CAUSE$p) {
                z10 = false;
                break;
            }
        }
        if (cancel) {
            markCancelled();
        } else {
            markClosed();
        }
        completeCloseOrCancel();
        onClosedIdempotent();
        if (z10) {
            invokeCloseHandler();
        }
        return z10;
    }

    public final void dropFirstElementUntilTheSpecifiedCellIsInTheBuffer(long globalCellIndex) {
        UndeliveredElementException callUndeliveredElementCatchingException$default;
        ChannelSegment<E> channelSegment = (ChannelSegment) receiveSegment$FU.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = receivers$FU;
            long j3 = atomicLongFieldUpdater.get(this);
            if (globalCellIndex < Math.max(this.capacity + j3, getBufferEndCounter())) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j3, j3 + 1)) {
                int i10 = BufferedChannelKt.SEGMENT_SIZE;
                long j10 = j3 / i10;
                int i11 = (int) (j3 % i10);
                if (channelSegment.id != j10) {
                    ChannelSegment<E> findSegmentReceive = findSegmentReceive(j10, channelSegment);
                    if (findSegmentReceive == null) {
                        continue;
                    } else {
                        channelSegment = findSegmentReceive;
                    }
                }
                Object updateCellReceive = updateCellReceive(channelSegment, i11, j3, null);
                if (updateCellReceive == BufferedChannelKt.access$getFAILED$p()) {
                    if (j3 < getSendersCounter$kotlinx_coroutines_core()) {
                        channelSegment.cleanPrev();
                    }
                } else {
                    channelSegment.cleanPrev();
                    Function1<E, Unit> function1 = this.onUndeliveredElement;
                    if (function1 != null && (callUndeliveredElementCatchingException$default = OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(function1, updateCellReceive, null, 2, null)) != null) {
                        throw callUndeliveredElementCatchingException$default;
                    }
                }
            }
        }
    }

    public final Throwable getCloseCause() {
        return (Throwable) _closeCause$FU.get(this);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public SelectClause1<E> getOnReceive() {
        BufferedChannel$onReceive$1 bufferedChannel$onReceive$1 = BufferedChannel$onReceive$1.INSTANCE;
        Intrinsics.checkNotNull(bufferedChannel$onReceive$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        Function3 function3 = (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(bufferedChannel$onReceive$1, 3);
        BufferedChannel$onReceive$2 bufferedChannel$onReceive$2 = BufferedChannel$onReceive$2.INSTANCE;
        Intrinsics.checkNotNull(bufferedChannel$onReceive$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new SelectClause1Impl(this, function3, (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(bufferedChannel$onReceive$2, 3), this.onUndeliveredElementReceiveCancellationConstructor);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public SelectClause1<ChannelResult<E>> getOnReceiveCatching() {
        BufferedChannel$onReceiveCatching$1 bufferedChannel$onReceiveCatching$1 = BufferedChannel$onReceiveCatching$1.INSTANCE;
        Intrinsics.checkNotNull(bufferedChannel$onReceiveCatching$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        Function3 function3 = (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(bufferedChannel$onReceiveCatching$1, 3);
        BufferedChannel$onReceiveCatching$2 bufferedChannel$onReceiveCatching$2 = BufferedChannel$onReceiveCatching$2.INSTANCE;
        Intrinsics.checkNotNull(bufferedChannel$onReceiveCatching$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new SelectClause1Impl(this, function3, (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(bufferedChannel$onReceiveCatching$2, 3), this.onUndeliveredElementReceiveCancellationConstructor);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public SelectClause1<E> getOnReceiveOrNull() {
        BufferedChannel$onReceiveOrNull$1 bufferedChannel$onReceiveOrNull$1 = BufferedChannel$onReceiveOrNull$1.INSTANCE;
        Intrinsics.checkNotNull(bufferedChannel$onReceiveOrNull$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        Function3 function3 = (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(bufferedChannel$onReceiveOrNull$1, 3);
        BufferedChannel$onReceiveOrNull$2 bufferedChannel$onReceiveOrNull$2 = BufferedChannel$onReceiveOrNull$2.INSTANCE;
        Intrinsics.checkNotNull(bufferedChannel$onReceiveOrNull$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new SelectClause1Impl(this, function3, (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(bufferedChannel$onReceiveOrNull$2, 3), this.onUndeliveredElementReceiveCancellationConstructor);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public SelectClause2<E, BufferedChannel<E>> getOnSend() {
        BufferedChannel$onSend$1 bufferedChannel$onSend$1 = BufferedChannel$onSend$1.INSTANCE;
        Intrinsics.checkNotNull(bufferedChannel$onSend$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        Function3 function3 = (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(bufferedChannel$onSend$1, 3);
        BufferedChannel$onSend$2 bufferedChannel$onSend$2 = BufferedChannel$onSend$2.INSTANCE;
        Intrinsics.checkNotNull(bufferedChannel$onSend$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new SelectClause2Impl(this, function3, (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(bufferedChannel$onSend$2, 3), null, 8, null);
    }

    public final long getReceiversCounter$kotlinx_coroutines_core() {
        return receivers$FU.get(this);
    }

    public final Throwable getSendException() {
        Throwable closeCause = getCloseCause();
        return closeCause == null ? new ClosedSendChannelException(ChannelsKt.DEFAULT_CLOSE_MESSAGE) : closeCause;
    }

    public final long getSendersCounter$kotlinx_coroutines_core() {
        return sendersAndCloseStatus$FU.get(this) & 1152921504606846975L;
    }

    public final boolean hasElements$kotlinx_coroutines_core() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = receiveSegment$FU;
            ChannelSegment<E> channelSegment = (ChannelSegment) atomicReferenceFieldUpdater.get(this);
            long receiversCounter$kotlinx_coroutines_core = getReceiversCounter$kotlinx_coroutines_core();
            if (getSendersCounter$kotlinx_coroutines_core() <= receiversCounter$kotlinx_coroutines_core) {
                return false;
            }
            int i10 = BufferedChannelKt.SEGMENT_SIZE;
            long j3 = receiversCounter$kotlinx_coroutines_core / i10;
            if (channelSegment.id != j3 && (channelSegment = findSegmentReceive(j3, channelSegment)) == null) {
                if (((ChannelSegment) atomicReferenceFieldUpdater.get(this)).id < j3) {
                    return false;
                }
            } else {
                channelSegment.cleanPrev();
                if (isCellNonEmpty(channelSegment, (int) (receiversCounter$kotlinx_coroutines_core % i10), receiversCounter$kotlinx_coroutines_core)) {
                    return true;
                }
                receivers$FU.compareAndSet(this, receiversCounter$kotlinx_coroutines_core, receiversCounter$kotlinx_coroutines_core + 1);
            }
        }
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public void invokeOnClose(Function1<? super Throwable, Unit> handler) {
        boolean z10;
        boolean z11;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = closeHandler$FU;
        while (true) {
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, handler)) {
                z10 = true;
                break;
            } else if (atomicReferenceFieldUpdater.get(this) != null) {
                z10 = false;
                break;
            }
        }
        if (z10) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = closeHandler$FU;
        do {
            Object obj = atomicReferenceFieldUpdater2.get(this);
            if (obj == BufferedChannelKt.access$getCLOSE_HANDLER_CLOSED$p()) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = closeHandler$FU;
                Symbol access$getCLOSE_HANDLER_CLOSED$p = BufferedChannelKt.access$getCLOSE_HANDLER_CLOSED$p();
                Symbol access$getCLOSE_HANDLER_INVOKED$p = BufferedChannelKt.access$getCLOSE_HANDLER_INVOKED$p();
                while (true) {
                    if (atomicReferenceFieldUpdater3.compareAndSet(this, access$getCLOSE_HANDLER_CLOSED$p, access$getCLOSE_HANDLER_INVOKED$p)) {
                        z11 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater3.get(this) != access$getCLOSE_HANDLER_CLOSED$p) {
                        z11 = false;
                        break;
                    }
                }
            } else {
                if (obj == BufferedChannelKt.access$getCLOSE_HANDLER_INVOKED$p()) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked".toString());
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
        } while (!z11);
        handler.invoke(getCloseCause());
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public boolean isClosedForReceive() {
        return isClosedForReceive0(sendersAndCloseStatus$FU.get(this));
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean isClosedForSend() {
        return isClosedForSend0(sendersAndCloseStatus$FU.get(this));
    }

    public boolean isConflatedDropOldest() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public boolean isEmpty() {
        if (isClosedForReceive() || hasElements$kotlinx_coroutines_core()) {
            return false;
        }
        return !isClosedForReceive();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public ChannelIterator<E> iterator() {
        return new BufferedChannelIterator();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E e2) {
        return Channel.DefaultImpls.offer(this, e2);
    }

    public void onClosedIdempotent() {
    }

    public void onReceiveDequeued() {
    }

    public void onReceiveEnqueued() {
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @ReplaceWith(expression = "tryReceive().getOrNull()", imports = {}))
    public E poll() {
        return (E) Channel.DefaultImpls.poll(this);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public Object receive(Continuation<? super E> continuation) {
        return receive$suspendImpl(this, continuation);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* renamed from: receiveCatching-JP2dKIU, reason: not valid java name */
    public Object mo1663receiveCatchingJP2dKIU(Continuation<? super ChannelResult<? extends E>> continuation) {
        return m1661receiveCatchingJP2dKIU$suspendImpl(this, continuation);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
    @LowPriorityInOverloadResolution
    public Object receiveOrNull(Continuation<? super E> continuation) {
        return Channel.DefaultImpls.receiveOrNull(this, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0088, code lost:
    
        r14.selectInRegistrationPhase(kotlin.Unit.INSTANCE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x008d, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void registerSelectForSend(kotlinx.coroutines.selects.SelectInstance<?> r14, java.lang.Object r15) {
        /*
            r13 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = access$getSendSegment$FU$p()
            java.lang.Object r0 = r0.get(r13)
            kotlinx.coroutines.channels.ChannelSegment r0 = (kotlinx.coroutines.channels.ChannelSegment) r0
        La:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = access$getSendersAndCloseStatus$FU$p()
            long r1 = r1.getAndIncrement(r13)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r3 = r3 & r1
            boolean r1 = access$isClosedForSend0(r13, r1)
            int r2 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r5 = (long) r2
            long r5 = r3 / r5
            long r7 = (long) r2
            long r7 = r3 % r7
            int r2 = (int) r7
            long r7 = r0.id
            int r7 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r7 == 0) goto L35
            kotlinx.coroutines.channels.ChannelSegment r5 = access$findSegmentSend(r13, r5, r0)
            if (r5 != 0) goto L34
            if (r1 == 0) goto La
            goto L73
        L34:
            r0 = r5
        L35:
            r5 = r13
            r6 = r0
            r7 = r2
            r8 = r15
            r9 = r3
            r11 = r14
            r12 = r1
            int r5 = access$updateCellSend(r5, r6, r7, r8, r9, r11, r12)
            if (r5 == 0) goto L85
            r6 = 1
            if (r5 == r6) goto L88
            r6 = 2
            if (r5 == r6) goto L6e
            r1 = 3
            if (r5 == r1) goto L62
            r1 = 4
            if (r5 == r1) goto L56
            r1 = 5
            if (r5 == r1) goto L52
            goto La
        L52:
            r0.cleanPrev()
            goto La
        L56:
            long r1 = r13.getReceiversCounter$kotlinx_coroutines_core()
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 >= 0) goto L73
            r0.cleanPrev()
            goto L73
        L62:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "unexpected"
            java.lang.String r15 = r15.toString()
            r14.<init>(r15)
            throw r14
        L6e:
            if (r1 == 0) goto L77
            r0.onSlotCleaned()
        L73:
            r13.onClosedSelectOnSend(r15, r14)
            goto L8d
        L77:
            boolean r15 = r14 instanceof kotlinx.coroutines.Waiter
            if (r15 == 0) goto L7e
            kotlinx.coroutines.Waiter r14 = (kotlinx.coroutines.Waiter) r14
            goto L7f
        L7e:
            r14 = 0
        L7f:
            if (r14 == 0) goto L8d
            access$prepareSenderForSuspension(r13, r14, r0, r2)
            goto L8d
        L85:
            r0.cleanPrev()
        L88:
            kotlin.Unit r15 = kotlin.Unit.INSTANCE
            r14.selectInRegistrationPhase(r15)
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.registerSelectForSend(kotlinx.coroutines.selects.SelectInstance, java.lang.Object):void");
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public Object send(E e2, Continuation<? super Unit> continuation) {
        return send$suspendImpl(this, e2, continuation);
    }

    public Object sendBroadcast$kotlinx_coroutines_core(E e2, Continuation<? super Boolean> continuation) {
        return sendBroadcast$suspendImpl(this, e2, continuation);
    }

    public final <R> R sendImpl(E element, Object waiter, Function0<? extends R> onRendezvousOrBuffered, Function2<? super ChannelSegment<E>, ? super Integer, ? extends R> onSuspend, Function0<? extends R> onClosed, Function4<? super ChannelSegment<E>, ? super Integer, ? super E, ? super Long, ? extends R> onNoWaiterSuspend) {
        ChannelSegment channelSegment;
        Waiter waiter2;
        ChannelSegment channelSegment2 = (ChannelSegment) sendSegment$FU.get(this);
        while (true) {
            long andIncrement = sendersAndCloseStatus$FU.getAndIncrement(this);
            long j3 = andIncrement & 1152921504606846975L;
            boolean isClosedForSend0 = isClosedForSend0(andIncrement);
            int i10 = BufferedChannelKt.SEGMENT_SIZE;
            long j10 = j3 / i10;
            int i11 = (int) (j3 % i10);
            if (channelSegment2.id != j10) {
                ChannelSegment findSegmentSend = findSegmentSend(j10, channelSegment2);
                if (findSegmentSend == null) {
                    if (isClosedForSend0) {
                        return onClosed.invoke();
                    }
                } else {
                    channelSegment = findSegmentSend;
                }
            } else {
                channelSegment = channelSegment2;
            }
            int updateCellSend = updateCellSend(channelSegment, i11, element, j3, waiter, isClosedForSend0);
            if (updateCellSend != 0) {
                if (updateCellSend != 1) {
                    if (updateCellSend != 2) {
                        if (updateCellSend != 3) {
                            if (updateCellSend != 4) {
                                if (updateCellSend == 5) {
                                    channelSegment.cleanPrev();
                                }
                                channelSegment2 = channelSegment;
                            } else {
                                if (j3 < getReceiversCounter$kotlinx_coroutines_core()) {
                                    channelSegment.cleanPrev();
                                }
                                return onClosed.invoke();
                            }
                        } else {
                            return onNoWaiterSuspend.invoke(channelSegment, Integer.valueOf(i11), element, Long.valueOf(j3));
                        }
                    } else {
                        if (isClosedForSend0) {
                            channelSegment.onSlotCleaned();
                            return onClosed.invoke();
                        }
                        if (waiter instanceof Waiter) {
                            waiter2 = (Waiter) waiter;
                        } else {
                            waiter2 = null;
                        }
                        if (waiter2 != null) {
                            prepareSenderForSuspension(waiter2, channelSegment, i11);
                        }
                        return onSuspend.invoke(channelSegment, Integer.valueOf(i11));
                    }
                } else {
                    return onRendezvousOrBuffered.invoke();
                }
            } else {
                channelSegment.cleanPrev();
                return onRendezvousOrBuffered.invoke();
            }
        }
    }

    public boolean shouldSendSuspend$kotlinx_coroutines_core() {
        return shouldSendSuspend(sendersAndCloseStatus$FU.get(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x01d8, code lost:
    
        r3 = (kotlinx.coroutines.channels.ChannelSegment) r3.getNext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01df, code lost:
    
        if (r3 != null) goto L101;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 522
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.toString():java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toStringDebug$kotlinx_coroutines_core() {
        String str;
        String str2;
        String valueOf;
        boolean z10;
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder("S=");
        sb3.append(getSendersCounter$kotlinx_coroutines_core());
        sb3.append(",R=");
        sb3.append(getReceiversCounter$kotlinx_coroutines_core());
        sb3.append(",B=");
        sb3.append(getBufferEndCounter());
        sb3.append(",B'=");
        sb3.append(completedExpandBuffersAndPauseFlag$FU.get(this));
        sb3.append(",C=");
        AtomicLongFieldUpdater atomicLongFieldUpdater = sendersAndCloseStatus$FU;
        sb3.append((int) (atomicLongFieldUpdater.get(this) >> 60));
        sb3.append(AbstractJsonLexerKt.COMMA);
        sb2.append(sb3.toString());
        int i10 = (int) (atomicLongFieldUpdater.get(this) >> 60);
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    sb2.append("CANCELLED,");
                }
            } else {
                sb2.append("CLOSED,");
            }
        } else {
            sb2.append("CANCELLATION_STARTED,");
        }
        StringBuilder sb4 = new StringBuilder("SEND_SEGM=");
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = sendSegment$FU;
        sb4.append(DebugStringsKt.getHexAddress(atomicReferenceFieldUpdater.get(this)));
        sb4.append(",RCV_SEGM=");
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = receiveSegment$FU;
        sb4.append(DebugStringsKt.getHexAddress(atomicReferenceFieldUpdater2.get(this)));
        sb2.append(sb4.toString());
        if (!isRendezvousOrUnlimited()) {
            sb2.append(",EB_SEGM=" + DebugStringsKt.getHexAddress(bufferEndSegment$FU.get(this)));
        }
        sb2.append("  ");
        List listOf = CollectionsKt.listOf((Object[]) new ChannelSegment[]{atomicReferenceFieldUpdater2.get(this), atomicReferenceFieldUpdater.get(this), bufferEndSegment$FU.get(this)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listOf) {
            if (((ChannelSegment) obj) != BufferedChannelKt.access$getNULL_SEGMENT$p()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                long j3 = ((ChannelSegment) next).id;
                do {
                    Object next2 = it.next();
                    long j10 = ((ChannelSegment) next2).id;
                    if (j3 > j10) {
                        next = next2;
                        j3 = j10;
                    }
                } while (it.hasNext());
            }
            ChannelSegment channelSegment = (ChannelSegment) next;
            do {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(DebugStringsKt.getHexAddress(channelSegment));
                sb5.append("=[");
                if (channelSegment.isRemoved()) {
                    str = "*";
                } else {
                    str = "";
                }
                sb5.append(str);
                sb5.append(channelSegment.id);
                sb5.append(",prev=");
                ChannelSegment channelSegment2 = (ChannelSegment) channelSegment.getPrev();
                String str3 = null;
                if (channelSegment2 != null) {
                    str2 = DebugStringsKt.getHexAddress(channelSegment2);
                } else {
                    str2 = null;
                }
                sb5.append(str2);
                sb5.append(AbstractJsonLexerKt.COMMA);
                sb2.append(sb5.toString());
                int i11 = BufferedChannelKt.SEGMENT_SIZE;
                for (int i12 = 0; i12 < i11; i12++) {
                    Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i12);
                    Object element$kotlinx_coroutines_core = channelSegment.getElement$kotlinx_coroutines_core(i12);
                    if (state$kotlinx_coroutines_core instanceof CancellableContinuation) {
                        valueOf = "cont";
                    } else if (state$kotlinx_coroutines_core instanceof SelectInstance) {
                        valueOf = "select";
                    } else if (state$kotlinx_coroutines_core instanceof ReceiveCatching) {
                        valueOf = "receiveCatching";
                    } else if (state$kotlinx_coroutines_core instanceof SendBroadcast) {
                        valueOf = "send(broadcast)";
                    } else if (state$kotlinx_coroutines_core instanceof WaiterEB) {
                        valueOf = "EB(" + state$kotlinx_coroutines_core + ')';
                    } else {
                        valueOf = String.valueOf(state$kotlinx_coroutines_core);
                    }
                    sb2.append("[" + i12 + "]=(" + valueOf + AbstractJsonLexerKt.COMMA + element$kotlinx_coroutines_core + "),");
                }
                StringBuilder sb6 = new StringBuilder("next=");
                ChannelSegment channelSegment3 = (ChannelSegment) channelSegment.getNext();
                if (channelSegment3 != null) {
                    str3 = DebugStringsKt.getHexAddress(channelSegment3);
                }
                sb6.append(str3);
                sb6.append("]  ");
                sb2.append(sb6.toString());
                channelSegment = (ChannelSegment) channelSegment.getNext();
            } while (channelSegment != null);
            return sb2.toString();
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* renamed from: tryReceive-PtdJZtk, reason: not valid java name */
    public Object mo1664tryReceivePtdJZtk() {
        ChannelSegment channelSegment;
        Waiter waiter;
        long j3 = receivers$FU.get(this);
        long j10 = sendersAndCloseStatus$FU.get(this);
        if (isClosedForReceive0(j10)) {
            return ChannelResult.INSTANCE.m1682closedJP2dKIU(getCloseCause());
        }
        if (j3 >= (j10 & 1152921504606846975L)) {
            return ChannelResult.INSTANCE.m1683failurePtdJZtk();
        }
        Object access$getINTERRUPTED_RCV$p = BufferedChannelKt.access$getINTERRUPTED_RCV$p();
        ChannelSegment channelSegment2 = (ChannelSegment) receiveSegment$FU.get(this);
        while (!isClosedForReceive()) {
            long andIncrement = receivers$FU.getAndIncrement(this);
            int i10 = BufferedChannelKt.SEGMENT_SIZE;
            long j11 = andIncrement / i10;
            int i11 = (int) (andIncrement % i10);
            if (channelSegment2.id != j11) {
                ChannelSegment findSegmentReceive = findSegmentReceive(j11, channelSegment2);
                if (findSegmentReceive == null) {
                    continue;
                } else {
                    channelSegment = findSegmentReceive;
                }
            } else {
                channelSegment = channelSegment2;
            }
            Object updateCellReceive = updateCellReceive(channelSegment, i11, andIncrement, access$getINTERRUPTED_RCV$p);
            if (updateCellReceive == BufferedChannelKt.access$getSUSPEND$p()) {
                if (access$getINTERRUPTED_RCV$p instanceof Waiter) {
                    waiter = (Waiter) access$getINTERRUPTED_RCV$p;
                } else {
                    waiter = null;
                }
                if (waiter != null) {
                    prepareReceiverForSuspension(waiter, channelSegment, i11);
                }
                waitExpandBufferCompletion$kotlinx_coroutines_core(andIncrement);
                channelSegment.onSlotCleaned();
                return ChannelResult.INSTANCE.m1683failurePtdJZtk();
            }
            if (updateCellReceive == BufferedChannelKt.access$getFAILED$p()) {
                if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                    channelSegment.cleanPrev();
                }
                channelSegment2 = channelSegment;
            } else {
                if (updateCellReceive != BufferedChannelKt.access$getSUSPEND_NO_WAITER$p()) {
                    channelSegment.cleanPrev();
                    return ChannelResult.INSTANCE.m1684successJP2dKIU(updateCellReceive);
                }
                throw new IllegalStateException("unexpected".toString());
            }
        }
        return ChannelResult.INSTANCE.m1682closedJP2dKIU(getCloseCause());
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00bb, code lost:
    
        return kotlinx.coroutines.channels.ChannelResult.INSTANCE.m1684successJP2dKIU(kotlin.Unit.INSTANCE);
     */
    @Override // kotlinx.coroutines.channels.SendChannel
    /* renamed from: trySend-JP2dKIU */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo1659trySendJP2dKIU(E r15) {
        /*
            r14 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.sendersAndCloseStatus$FU
            long r0 = r0.get(r14)
            boolean r0 = r14.shouldSendSuspend(r0)
            if (r0 == 0) goto L13
            kotlinx.coroutines.channels.ChannelResult$Companion r15 = kotlinx.coroutines.channels.ChannelResult.INSTANCE
            java.lang.Object r15 = r15.m1683failurePtdJZtk()
            return r15
        L13:
            kotlinx.coroutines.internal.Symbol r8 = kotlinx.coroutines.channels.BufferedChannelKt.access$getINTERRUPTED_SEND$p()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = access$getSendSegment$FU$p()
            java.lang.Object r0 = r0.get(r14)
            kotlinx.coroutines.channels.ChannelSegment r0 = (kotlinx.coroutines.channels.ChannelSegment) r0
        L21:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = access$getSendersAndCloseStatus$FU$p()
            long r1 = r1.getAndIncrement(r14)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r9 = r1 & r3
            boolean r11 = access$isClosedForSend0(r14, r1)
            int r1 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r2 = (long) r1
            long r2 = r9 / r2
            long r4 = (long) r1
            long r4 = r9 % r4
            int r12 = (int) r4
            long r4 = r0.id
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L4e
            kotlinx.coroutines.channels.ChannelSegment r1 = access$findSegmentSend(r14, r2, r0)
            if (r1 != 0) goto L4c
            if (r11 == 0) goto L21
            goto L8e
        L4c:
            r13 = r1
            goto L4f
        L4e:
            r13 = r0
        L4f:
            r0 = r14
            r1 = r13
            r2 = r12
            r3 = r15
            r4 = r9
            r6 = r8
            r7 = r11
            int r0 = access$updateCellSend(r0, r1, r2, r3, r4, r6, r7)
            if (r0 == 0) goto Lb0
            r1 = 1
            if (r0 == r1) goto Lb3
            r1 = 2
            if (r0 == r1) goto L89
            r1 = 3
            if (r0 == r1) goto L7d
            r1 = 4
            if (r0 == r1) goto L71
            r1 = 5
            if (r0 == r1) goto L6c
            goto L6f
        L6c:
            r13.cleanPrev()
        L6f:
            r0 = r13
            goto L21
        L71:
            long r0 = r14.getReceiversCounter$kotlinx_coroutines_core()
            int r15 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r15 >= 0) goto L8e
            r13.cleanPrev()
            goto L8e
        L7d:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected"
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        L89:
            if (r11 == 0) goto L99
            r13.onSlotCleaned()
        L8e:
            kotlinx.coroutines.channels.ChannelResult$Companion r15 = kotlinx.coroutines.channels.ChannelResult.INSTANCE
            java.lang.Throwable r0 = r14.getSendException()
            java.lang.Object r15 = r15.m1682closedJP2dKIU(r0)
            goto Lbb
        L99:
            boolean r15 = r8 instanceof kotlinx.coroutines.Waiter
            if (r15 == 0) goto La0
            kotlinx.coroutines.Waiter r8 = (kotlinx.coroutines.Waiter) r8
            goto La1
        La0:
            r8 = 0
        La1:
            if (r8 == 0) goto La6
            access$prepareSenderForSuspension(r14, r8, r13, r12)
        La6:
            r13.onSlotCleaned()
            kotlinx.coroutines.channels.ChannelResult$Companion r15 = kotlinx.coroutines.channels.ChannelResult.INSTANCE
            java.lang.Object r15 = r15.m1683failurePtdJZtk()
            goto Lbb
        Lb0:
            r13.cleanPrev()
        Lb3:
            kotlinx.coroutines.channels.ChannelResult$Companion r15 = kotlinx.coroutines.channels.ChannelResult.INSTANCE
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            java.lang.Object r15 = r15.m1684successJP2dKIU(r0)
        Lbb:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.mo1659trySendJP2dKIU(java.lang.Object):java.lang.Object");
    }

    public final void waitExpandBufferCompletion$kotlinx_coroutines_core(long globalIndex) {
        long j3;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        boolean z10;
        long j10;
        if (isRendezvousOrUnlimited()) {
            return;
        }
        do {
        } while (getBufferEndCounter() <= globalIndex);
        int access$getEXPAND_BUFFER_COMPLETION_WAIT_ITERATIONS$p = BufferedChannelKt.access$getEXPAND_BUFFER_COMPLETION_WAIT_ITERATIONS$p();
        for (int i10 = 0; i10 < access$getEXPAND_BUFFER_COMPLETION_WAIT_ITERATIONS$p; i10++) {
            long bufferEndCounter = getBufferEndCounter();
            if (bufferEndCounter == (DurationKt.MAX_MILLIS & completedExpandBuffersAndPauseFlag$FU.get(this)) && bufferEndCounter == getBufferEndCounter()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = completedExpandBuffersAndPauseFlag$FU;
        do {
            j3 = atomicLongFieldUpdater2.get(this);
        } while (!atomicLongFieldUpdater2.compareAndSet(this, j3, BufferedChannelKt.access$constructEBCompletedAndPauseFlag(j3 & DurationKt.MAX_MILLIS, true)));
        while (true) {
            long bufferEndCounter2 = getBufferEndCounter();
            atomicLongFieldUpdater = completedExpandBuffersAndPauseFlag$FU;
            long j11 = atomicLongFieldUpdater.get(this);
            long j12 = j11 & DurationKt.MAX_MILLIS;
            if ((4611686018427387904L & j11) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (bufferEndCounter2 == j12 && bufferEndCounter2 == getBufferEndCounter()) {
                break;
            } else if (!z10) {
                atomicLongFieldUpdater.compareAndSet(this, j11, BufferedChannelKt.access$constructEBCompletedAndPauseFlag(j12, true));
            }
        }
        do {
            j10 = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, BufferedChannelKt.access$constructEBCompletedAndPauseFlag(j10 & DurationKt.MAX_MILLIS, false)));
    }

    private final void loop$atomicfu(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Function1<Object, Unit> function1, Object obj) {
        while (true) {
            function1.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final void cancel() {
        cancelImpl$kotlinx_coroutines_core(null);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final void cancel(CancellationException cause) {
        cancelImpl$kotlinx_coroutines_core(cause);
    }

    public /* synthetic */ BufferedChannel(int i10, Function1 function1, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i11 & 2) != 0 ? null : function1);
    }
}
