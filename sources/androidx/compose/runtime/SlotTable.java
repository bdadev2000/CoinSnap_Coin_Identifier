package androidx.compose.runtime;

import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableIntSet;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.glority.android.core.data.LogEventArguments;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.text.StringsKt;

/* compiled from: SlotTable.kt */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010(\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0005¢\u0006\u0002\u0010\u0004J\u000e\u0010:\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\u001cJ\u000e\u0010<\u001a\u00020\u001c2\u0006\u0010:\u001a\u00020\u0007J=\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@2&\u0010,\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020.\u0018\u00010-j\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020.\u0018\u0001`/H\u0000¢\u0006\u0002\bAJ\u008f\u0001\u0010=\u001a\u00020>2\u0006\u00108\u001a\u00020B2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001c2\u000e\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$2\u0006\u0010*\u001a\u00020\u001c2\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b2&\u0010,\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020.\u0018\u00010-j\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020.\u0018\u0001`/2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0000¢\u0006\u0004\bA\u0010CJ\u0006\u0010D\u001a\u00020>J\u0006\u0010E\u001a\u00020>J\u0006\u0010F\u001a\u00020!J\u000e\u0010G\u001a\b\u0012\u0004\u0012\u00020\u001c0HH\u0002J\u0012\u0010I\u001a\u0004\u0018\u00010\u00032\u0006\u0010J\u001a\u00020%H\u0016J\u0012\u0010K\u001a\u0004\u0018\u00010L2\u0006\u0010M\u001a\u00020\u001cH\u0002J\u0016\u0010N\u001a\u00020!2\u0006\u0010O\u001a\u00020\u001c2\u0006\u0010:\u001a\u00020\u0007J\u000e\u0010P\u001a\b\u0012\u0004\u0012\u00020\u001c0HH\u0002J\u001d\u0010Q\u001a\n\u0012\u0004\u0012\u00020L\u0018\u00010H2\u0006\u0010R\u001a\u00020\u001cH\u0000¢\u0006\u0002\bSJ\u000f\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00030UH\u0096\u0002J\u000e\u0010V\u001a\b\u0012\u0004\u0012\u00020\u001c0HH\u0002J\u000e\u0010W\u001a\b\u0012\u0004\u0012\u00020\u001c0HH\u0002J\u0006\u0010X\u001a\u00020@J\u0006\u0010Y\u001a\u00020BJ\u000e\u0010Z\u001a\u00020!2\u0006\u0010:\u001a\u00020\u0007J\u000e\u0010[\u001a\b\u0012\u0004\u0012\u00020\u001c0HH\u0002J7\u0010\\\u001a\u0002H]\"\u0004\b\u0000\u0010]2!\u0010^\u001a\u001d\u0012\u0013\u0012\u00110@¢\u0006\f\b`\u0012\b\ba\u0012\u0004\b\b(?\u0012\u0004\u0012\u0002H]0_H\u0086\b¢\u0006\u0002\u0010bJ\u0087\u0001\u0010c\u001a\u00020>2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001c2\u000e\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$2\u0006\u0010*\u001a\u00020\u001c2\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b2&\u0010,\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020.\u0018\u00010-j\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020.\u0018\u0001`/2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0000¢\u0006\u0004\bd\u0010eJ\u001f\u0010f\u001a\u0004\u0018\u00010%2\u0006\u0010M\u001a\u00020\u001c2\u0006\u0010g\u001a\u00020\u001cH\u0000¢\u0006\u0002\bhJ\u001d\u0010i\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0H2\u0006\u0010M\u001a\u00020\u001cH\u0000¢\u0006\u0002\bjJ\u0010\u0010k\u001a\u0004\u0018\u00010.2\u0006\u0010M\u001a\u00020\u001cJ\u0006\u0010l\u001a\u00020mJ\u0012\u0010n\u001a\u0004\u0018\u00010\u00072\u0006\u0010;\u001a\u00020\u001cH\u0002J\u0006\u0010o\u001a\u00020>J7\u0010p\u001a\u0002H]\"\u0004\b\u0000\u0010]2!\u0010^\u001a\u001d\u0012\u0013\u0012\u00110B¢\u0006\f\b`\u0012\b\ba\u0012\u0004\b\b(8\u0012\u0004\u0012\u0002H]0_H\u0086\b¢\u0006\u0002\u0010bJ \u0010q\u001a\u00020\u001c*\u00060rj\u0002`s2\u0006\u0010;\u001a\u00020\u001c2\u0006\u0010t\u001a\u00020\u001cH\u0002R*\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0018@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u001c@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\"R\u000e\u0010#\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R0\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$2\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$@BX\u0086\u000e¢\u0006\n\n\u0002\u0010)\u001a\u0004\b'\u0010(R\u001e\u0010*\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u001c@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001fR:\u0010,\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020.\u0018\u00010-j\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020.\u0018\u0001`/X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001a\u00104\u001a\u00020\u001cX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u001f\"\u0004\b6\u00107R\u001e\u00108\u001a\u00020!2\u0006\u0010\u0017\u001a\u00020!@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\"¨\u0006u"}, d2 = {"Landroidx/compose/runtime/SlotTable;", "Landroidx/compose/runtime/tooling/CompositionData;", "", "Landroidx/compose/runtime/tooling/CompositionGroup;", "()V", "anchors", "Ljava/util/ArrayList;", "Landroidx/compose/runtime/Anchor;", "Lkotlin/collections/ArrayList;", "getAnchors$runtime_release", "()Ljava/util/ArrayList;", "setAnchors$runtime_release", "(Ljava/util/ArrayList;)V", "calledByMap", "Landroidx/collection/MutableIntObjectMap;", "Landroidx/collection/MutableIntSet;", "getCalledByMap$runtime_release", "()Landroidx/collection/MutableIntObjectMap;", "setCalledByMap$runtime_release", "(Landroidx/collection/MutableIntObjectMap;)V", "compositionGroups", "getCompositionGroups", "()Ljava/lang/Iterable;", "<set-?>", "", "groups", "getGroups", "()[I", "", "groupsSize", "getGroupsSize", "()I", "isEmpty", "", "()Z", "readers", "", "", "slots", "getSlots", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "slotsSize", "getSlotsSize", "sourceInformationMap", "Ljava/util/HashMap;", "Landroidx/compose/runtime/GroupSourceInformation;", "Lkotlin/collections/HashMap;", "getSourceInformationMap$runtime_release", "()Ljava/util/HashMap;", "setSourceInformationMap$runtime_release", "(Ljava/util/HashMap;)V", LogEventArguments.ARG_VERSION, "getVersion$runtime_release", "setVersion$runtime_release", "(I)V", "writer", "getWriter$runtime_release", "anchor", "index", "anchorIndex", "close", "", "reader", "Landroidx/compose/runtime/SlotReader;", "close$runtime_release", "Landroidx/compose/runtime/SlotWriter;", "(Landroidx/compose/runtime/SlotWriter;[II[Ljava/lang/Object;ILjava/util/ArrayList;Ljava/util/HashMap;Landroidx/collection/MutableIntObjectMap;)V", "collectCalledByInformation", "collectSourceInformation", "containsMark", "dataIndexes", "", "find", "identityToFind", "findEffectiveRecomposeScope", "Landroidx/compose/runtime/RecomposeScopeImpl;", "group", "groupContainsAnchor", "groupIndex", "groupSizes", "invalidateGroupsWithKey", "target", "invalidateGroupsWithKey$runtime_release", "iterator", "", UserMetadata.KEYDATA_FILENAME, "nodes", "openReader", "openWriter", "ownsAnchor", "parentIndexes", "read", ExifInterface.GPS_DIRECTION_TRUE, "block", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "setTo", "setTo$runtime_release", "([II[Ljava/lang/Object;ILjava/util/ArrayList;Ljava/util/HashMap;Landroidx/collection/MutableIntObjectMap;)V", "slot", "slotIndex", "slot$runtime_release", "slotsOf", "slotsOf$runtime_release", "sourceInformationOf", "toDebugString", "", "tryAnchor", "verifyWellFormed", "write", "emitGroup", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", FirebaseAnalytics.Param.LEVEL, "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes8.dex */
public final class SlotTable implements CompositionData, Iterable<CompositionGroup>, KMappedMarker {
    public static final int $stable = 8;
    private MutableIntObjectMap<MutableIntSet> calledByMap;
    private int groupsSize;
    private int readers;
    private int slotsSize;
    private HashMap<Anchor, GroupSourceInformation> sourceInformationMap;
    private int version;
    private boolean writer;
    private int[] groups = new int[0];
    private Object[] slots = new Object[0];
    private ArrayList<Anchor> anchors = new ArrayList<>();

    public final int[] getGroups() {
        return this.groups;
    }

    public final int getGroupsSize() {
        return this.groupsSize;
    }

    public final Object[] getSlots() {
        return this.slots;
    }

    public final int getSlotsSize() {
        return this.slotsSize;
    }

    /* renamed from: getWriter$runtime_release, reason: from getter */
    public final boolean getWriter() {
        return this.writer;
    }

    /* renamed from: getVersion$runtime_release, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    public final void setVersion$runtime_release(int i) {
        this.version = i;
    }

    public final ArrayList<Anchor> getAnchors$runtime_release() {
        return this.anchors;
    }

    public final void setAnchors$runtime_release(ArrayList<Anchor> arrayList) {
        this.anchors = arrayList;
    }

    public final HashMap<Anchor, GroupSourceInformation> getSourceInformationMap$runtime_release() {
        return this.sourceInformationMap;
    }

    public final void setSourceInformationMap$runtime_release(HashMap<Anchor, GroupSourceInformation> hashMap) {
        this.sourceInformationMap = hashMap;
    }

    public final MutableIntObjectMap<MutableIntSet> getCalledByMap$runtime_release() {
        return this.calledByMap;
    }

    public final void setCalledByMap$runtime_release(MutableIntObjectMap<MutableIntSet> mutableIntObjectMap) {
        this.calledByMap = mutableIntObjectMap;
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public boolean isEmpty() {
        return this.groupsSize == 0;
    }

    public final <T> T read(Function1<? super SlotReader, ? extends T> block) {
        SlotReader openReader = openReader();
        try {
            return block.invoke(openReader);
        } finally {
            InlineMarker.finallyStart(1);
            openReader.close();
            InlineMarker.finallyEnd(1);
        }
    }

    public final <T> T write(Function1<? super SlotWriter, ? extends T> block) {
        SlotWriter openWriter = openWriter();
        try {
            T invoke = block.invoke(openWriter);
            InlineMarker.finallyStart(1);
            openWriter.close(true);
            InlineMarker.finallyEnd(1);
            return invoke;
        } catch (Throwable th) {
            InlineMarker.finallyStart(1);
            openWriter.close(false);
            InlineMarker.finallyEnd(1);
            throw th;
        }
    }

    public final SlotReader openReader() {
        if (this.writer) {
            throw new IllegalStateException("Cannot read while a writer is pending".toString());
        }
        this.readers++;
        return new SlotReader(this);
    }

    public final SlotWriter openWriter() {
        if (!(!this.writer)) {
            ComposerKt.composeImmediateRuntimeError("Cannot start a writer when another writer is pending");
        }
        if (!(this.readers <= 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot start a writer when a reader is pending");
        }
        this.writer = true;
        this.version++;
        return new SlotWriter(this);
    }

    public final Anchor anchor(int index) {
        if (!(!this.writer)) {
            ComposerKt.composeImmediateRuntimeError("use active SlotWriter to create an anchor location instead");
        }
        boolean z = false;
        if (index >= 0 && index < this.groupsSize) {
            z = true;
        }
        if (!z) {
            PreconditionsKt.throwIllegalArgumentException("Parameter index is out of range");
        }
        ArrayList<Anchor> arrayList = this.anchors;
        int access$search = SlotTableKt.access$search(arrayList, index, this.groupsSize);
        if (access$search < 0) {
            Anchor anchor = new Anchor(index);
            arrayList.add(-(access$search + 1), anchor);
            return anchor;
        }
        return arrayList.get(access$search);
    }

    private final Anchor tryAnchor(int index) {
        int i;
        if (!(!this.writer)) {
            ComposerKt.composeImmediateRuntimeError("use active SlotWriter to crate an anchor for location instead");
        }
        if (index < 0 || index >= (i = this.groupsSize)) {
            return null;
        }
        return SlotTableKt.access$find(this.anchors, index, i);
    }

    public final int anchorIndex(Anchor anchor) {
        if (!(!this.writer)) {
            ComposerKt.composeImmediateRuntimeError("Use active SlotWriter to determine anchor location instead");
        }
        if (!anchor.getValid()) {
            PreconditionsKt.throwIllegalArgumentException("Anchor refers to a group that was removed");
        }
        return anchor.getLocation();
    }

    public final boolean ownsAnchor(Anchor anchor) {
        int access$search;
        return anchor.getValid() && (access$search = SlotTableKt.access$search(this.anchors, anchor.getLocation(), this.groupsSize)) >= 0 && Intrinsics.areEqual(this.anchors.get(access$search), anchor);
    }

    public final boolean groupContainsAnchor(int groupIndex, Anchor anchor) {
        if (!(!this.writer)) {
            ComposerKt.composeImmediateRuntimeError("Writer is active");
        }
        if (!(groupIndex >= 0 && groupIndex < this.groupsSize)) {
            ComposerKt.composeImmediateRuntimeError("Invalid group index");
        }
        if (ownsAnchor(anchor)) {
            int access$groupSize = SlotTableKt.access$groupSize(this.groups, groupIndex) + groupIndex;
            int location = anchor.getLocation();
            if (groupIndex <= location && location < access$groupSize) {
                return true;
            }
        }
        return false;
    }

    public final void close$runtime_release(SlotReader reader, HashMap<Anchor, GroupSourceInformation> sourceInformationMap) {
        if (!(reader.getTable() == this && this.readers > 0)) {
            ComposerKt.composeImmediateRuntimeError("Unexpected reader close()");
        }
        this.readers--;
        if (sourceInformationMap != null) {
            synchronized (this) {
                HashMap<Anchor, GroupSourceInformation> hashMap = this.sourceInformationMap;
                if (hashMap != null) {
                    hashMap.putAll(sourceInformationMap);
                } else {
                    this.sourceInformationMap = sourceInformationMap;
                }
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public final void close$runtime_release(SlotWriter writer, int[] groups, int groupsSize, Object[] slots, int slotsSize, ArrayList<Anchor> anchors, HashMap<Anchor, GroupSourceInformation> sourceInformationMap, MutableIntObjectMap<MutableIntSet> calledByMap) {
        if (!(writer.getTable() == this && this.writer)) {
            PreconditionsKt.throwIllegalArgumentException("Unexpected writer close()");
        }
        this.writer = false;
        setTo$runtime_release(groups, groupsSize, slots, slotsSize, anchors, sourceInformationMap, calledByMap);
    }

    public final void setTo$runtime_release(int[] groups, int groupsSize, Object[] slots, int slotsSize, ArrayList<Anchor> anchors, HashMap<Anchor, GroupSourceInformation> sourceInformationMap, MutableIntObjectMap<MutableIntSet> calledByMap) {
        this.groups = groups;
        this.groupsSize = groupsSize;
        this.slots = slots;
        this.slotsSize = slotsSize;
        this.anchors = anchors;
        this.sourceInformationMap = sourceInformationMap;
        this.calledByMap = calledByMap;
    }

    public final List<RecomposeScopeImpl> invalidateGroupsWithKey$runtime_release(int target) {
        MutableIntSet mutableIntSet;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        MutableIntSet mutableIntSet2 = new MutableIntSet(0, 1, null);
        mutableIntSet2.add(target);
        mutableIntSet2.add(-3);
        MutableIntObjectMap<MutableIntSet> mutableIntObjectMap = this.calledByMap;
        if (mutableIntObjectMap != null && (mutableIntSet = mutableIntObjectMap.get(target)) != null) {
            mutableIntSet2.addAll(mutableIntSet);
        }
        SlotReader openReader = openReader();
        try {
            invalidateGroupsWithKey$lambda$20$scanGroup(openReader, mutableIntSet2, arrayList, booleanRef, this, arrayList2);
            Unit unit = Unit.INSTANCE;
            openReader.close();
            SlotWriter openWriter = openWriter();
            try {
                openWriter.startGroup();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    Anchor anchor = (Anchor) arrayList.get(i);
                    if (anchor.toIndexFor(openWriter) >= openWriter.getCurrentGroup()) {
                        openWriter.seek(anchor);
                        openWriter.bashCurrentGroup();
                    }
                }
                openWriter.skipToGroupEnd();
                openWriter.endGroup();
                openWriter.close(true);
                if (booleanRef.element) {
                    return arrayList2;
                }
                return null;
            } catch (Throwable th) {
                openWriter.close(false);
                throw th;
            }
        } catch (Throwable th2) {
            openReader.close();
            throw th2;
        }
    }

    private static final void invalidateGroupsWithKey$lambda$20$scanGroup(SlotReader slotReader, MutableIntSet mutableIntSet, List<Anchor> list, Ref.BooleanRef booleanRef, SlotTable slotTable, List<RecomposeScopeImpl> list2) {
        RecomposeScopeImpl findEffectiveRecomposeScope;
        int groupKey = slotReader.getGroupKey();
        if (mutableIntSet.contains(groupKey)) {
            if (groupKey != -3) {
                list.add(SlotReader.anchor$default(slotReader, 0, 1, null));
            }
            if (booleanRef.element) {
                RecomposeScopeImpl findEffectiveRecomposeScope2 = slotTable.findEffectiveRecomposeScope(slotReader.getCurrentGroup());
                if (findEffectiveRecomposeScope2 != null) {
                    list2.add(findEffectiveRecomposeScope2);
                    Anchor anchor = findEffectiveRecomposeScope2.getAnchor();
                    if (anchor != null && anchor.getLocation() == slotReader.getCurrentGroup() && (findEffectiveRecomposeScope = slotTable.findEffectiveRecomposeScope(slotReader.getParent())) != null) {
                        list2.add(findEffectiveRecomposeScope);
                    }
                } else {
                    booleanRef.element = false;
                    list2.clear();
                }
            }
            slotReader.skipGroup();
            return;
        }
        slotReader.startGroup();
        while (!slotReader.isGroupEnd()) {
            invalidateGroupsWithKey$lambda$20$scanGroup(slotReader, mutableIntSet, list, booleanRef, slotTable, list2);
        }
        slotReader.endGroup();
    }

    public final boolean containsMark() {
        return this.groupsSize > 0 && SlotTableKt.access$containsMark(this.groups, 0);
    }

    public final GroupSourceInformation sourceInformationOf(int group) {
        Anchor tryAnchor;
        HashMap<Anchor, GroupSourceInformation> hashMap = this.sourceInformationMap;
        if (hashMap == null || (tryAnchor = tryAnchor(group)) == null) {
            return null;
        }
        return hashMap.get(tryAnchor);
    }

    private final RecomposeScopeImpl findEffectiveRecomposeScope(int group) {
        int i = group;
        while (i > 0) {
            Iterator<Object> it = new DataIterator(this, i).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof RecomposeScopeImpl) {
                    RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) next;
                    if (recomposeScopeImpl.getUsed() && i != group) {
                        return recomposeScopeImpl;
                    }
                    recomposeScopeImpl.setForcedRecompose(true);
                }
            }
            i = SlotTableKt.access$parentAnchor(this.groups, i);
        }
        return null;
    }

    public final void verifyWellFormed() {
        Ref.IntRef intRef = new Ref.IntRef();
        int i = -1;
        if (this.groupsSize > 0) {
            while (intRef.element < this.groupsSize) {
                verifyWellFormed$validateGroup(intRef, this, -1, intRef.element + SlotTableKt.access$groupSize(this.groups, intRef.element));
            }
            if (!(intRef.element == this.groupsSize)) {
                PreconditionsKt.throwIllegalStateException("Incomplete group at root " + intRef.element + " expected to be " + this.groupsSize);
            }
        }
        int length = this.slots.length;
        for (int i2 = this.slotsSize; i2 < length; i2++) {
            if (!(this.slots[i2] == null)) {
                PreconditionsKt.throwIllegalStateException("Non null value in the slot gap at index " + i2);
            }
        }
        ArrayList<Anchor> arrayList = this.anchors;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            int indexFor = arrayList.get(i3).toIndexFor(this);
            if (!(indexFor >= 0 && indexFor <= this.groupsSize)) {
                PreconditionsKt.throwIllegalArgumentException("Invalid anchor, location out of bound");
            }
            if (!(i < indexFor)) {
                PreconditionsKt.throwIllegalArgumentException("Anchor is out of order");
            }
            i3++;
            i = indexFor;
        }
        HashMap<Anchor, GroupSourceInformation> hashMap = this.sourceInformationMap;
        if (hashMap != null) {
            for (Map.Entry<Anchor, GroupSourceInformation> entry : hashMap.entrySet()) {
                Anchor key = entry.getKey();
                GroupSourceInformation value = entry.getValue();
                if (!key.getValid()) {
                    PreconditionsKt.throwIllegalArgumentException("Source map contains invalid anchor");
                }
                if (!ownsAnchor(key)) {
                    PreconditionsKt.throwIllegalArgumentException("Source map anchor is not owned by the slot table");
                }
                verifyWellFormed$verifySourceGroup(this, value);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    private static final int verifyWellFormed$validateGroup(Ref.IntRef intRef, SlotTable slotTable, int i, int i2) {
        int i3 = intRef.element;
        int i4 = i3 + 1;
        intRef.element = i4;
        int access$parentAnchor = SlotTableKt.access$parentAnchor(slotTable.groups, i3);
        if ((access$parentAnchor == i) == false) {
            PreconditionsKt.throwIllegalStateException("Invalid parent index detected at " + i3 + ", expected parent index to be " + i + " found " + access$parentAnchor);
        }
        int access$groupSize = SlotTableKt.access$groupSize(slotTable.groups, i3) + i3;
        if ((access$groupSize <= slotTable.groupsSize) == false) {
            PreconditionsKt.throwIllegalStateException("A group extends past the end of the table at " + i3);
        }
        if ((access$groupSize <= i2) == false) {
            PreconditionsKt.throwIllegalStateException("A group extends past its parent group at " + i3);
        }
        int access$dataAnchor = SlotTableKt.access$dataAnchor(slotTable.groups, i3);
        int access$dataAnchor2 = i3 >= slotTable.groupsSize - 1 ? slotTable.slotsSize : SlotTableKt.access$dataAnchor(slotTable.groups, i4);
        if ((access$dataAnchor2 <= slotTable.slots.length) == false) {
            PreconditionsKt.throwIllegalStateException("Slots for " + i3 + " extend past the end of the slot table");
        }
        if ((access$dataAnchor <= access$dataAnchor2) == false) {
            PreconditionsKt.throwIllegalStateException("Invalid data anchor at " + i3);
        }
        if ((SlotTableKt.access$slotAnchor(slotTable.groups, i3) <= access$dataAnchor2) == false) {
            PreconditionsKt.throwIllegalStateException("Slots start out of range at " + i3);
        }
        if ((access$dataAnchor2 - access$dataAnchor >= ((SlotTableKt.access$isNode(slotTable.groups, i3) ? 1 : 0) + (SlotTableKt.access$hasObjectKey(slotTable.groups, i3) ? 1 : 0)) + (SlotTableKt.access$hasAux(slotTable.groups, i3) ? 1 : 0)) == false) {
            PreconditionsKt.throwIllegalStateException("Not enough slots added for group " + i3);
        }
        boolean access$isNode = SlotTableKt.access$isNode(slotTable.groups, i3);
        if (((access$isNode && slotTable.slots[SlotTableKt.access$nodeIndex(slotTable.groups, i3)] == null) ? false : true) == false) {
            PreconditionsKt.throwIllegalStateException("No node recorded for a node group at " + i3);
        }
        int i5 = 0;
        while (intRef.element < access$groupSize) {
            i5 += verifyWellFormed$validateGroup(intRef, slotTable, i3, access$groupSize);
        }
        int access$nodeCount = SlotTableKt.access$nodeCount(slotTable.groups, i3);
        int access$groupSize2 = SlotTableKt.access$groupSize(slotTable.groups, i3);
        if ((access$nodeCount == i5) == false) {
            PreconditionsKt.throwIllegalStateException("Incorrect node count detected at " + i3 + ", expected " + access$nodeCount + ", received " + i5);
        }
        int i6 = intRef.element - i3;
        if ((access$groupSize2 == i6) == false) {
            PreconditionsKt.throwIllegalStateException("Incorrect slot count detected at " + i3 + ", expected " + access$groupSize2 + ", received " + i6);
        }
        if (SlotTableKt.access$containsAnyMark(slotTable.groups, i3)) {
            if (!(i3 <= 0 || SlotTableKt.access$containsMark(slotTable.groups, i))) {
                PreconditionsKt.throwIllegalStateException("Expected group " + i + " to record it contains a mark because " + i3 + " does");
            }
        }
        if (access$isNode) {
            return 1;
        }
        return i5;
    }

    private static final void verifyWellFormed$verifySourceGroup(SlotTable slotTable, GroupSourceInformation groupSourceInformation) {
        ArrayList<Object> groups = groupSourceInformation.getGroups();
        if (groups != null) {
            ArrayList<Object> arrayList = groups;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                Object obj = arrayList.get(i);
                if (obj instanceof Anchor) {
                    Anchor anchor = (Anchor) obj;
                    if (!anchor.getValid()) {
                        PreconditionsKt.throwIllegalArgumentException("Source map contains invalid anchor");
                    }
                    if (!slotTable.ownsAnchor(anchor)) {
                        PreconditionsKt.throwIllegalArgumentException("Source map anchor is not owned by the slot table");
                    }
                } else if (obj instanceof GroupSourceInformation) {
                    verifyWellFormed$verifySourceGroup(slotTable, (GroupSourceInformation) obj);
                }
            }
        }
    }

    public final void collectCalledByInformation() {
        this.calledByMap = new MutableIntObjectMap<>(0, 1, null);
    }

    public final void collectSourceInformation() {
        this.sourceInformationMap = new HashMap<>();
    }

    public final String toDebugString() {
        if (this.writer) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append('\n');
        int i = this.groupsSize;
        if (i > 0) {
            int i2 = 0;
            while (i2 < i) {
                i2 += emitGroup(sb, i2, 0);
            }
        } else {
            sb.append("<EMPTY>");
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    private final int emitGroup(StringBuilder sb, int i, int i2) {
        String sourceInformation;
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append(' ');
        }
        sb.append("Group(");
        sb.append(i);
        sb.append(")");
        GroupSourceInformation sourceInformationOf = sourceInformationOf(i);
        if (sourceInformationOf != null && (sourceInformation = sourceInformationOf.getSourceInformation()) != null && (StringsKt.startsWith$default(sourceInformation, "C(", false, 2, (Object) null) || StringsKt.startsWith$default(sourceInformation, "CC(", false, 2, (Object) null))) {
            String str = sourceInformation;
            int indexOf$default = StringsKt.indexOf$default((CharSequence) str, "(", 0, false, 6, (Object) null) + 1;
            int indexOf$default2 = StringsKt.indexOf$default((CharSequence) str, ')', 0, false, 6, (Object) null);
            sb.append(" ");
            String substring = sourceInformation.substring(indexOf$default, indexOf$default2);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            sb.append(substring);
            sb.append("()");
        }
        sb.append(" key=");
        sb.append(SlotTableKt.access$key(this.groups, i));
        int access$groupSize = SlotTableKt.access$groupSize(this.groups, i);
        sb.append(", nodes=");
        sb.append(SlotTableKt.access$nodeCount(this.groups, i));
        sb.append(", size=");
        sb.append(access$groupSize);
        if (SlotTableKt.access$hasMark(this.groups, i)) {
            sb.append(", mark");
        }
        if (SlotTableKt.access$containsMark(this.groups, i)) {
            sb.append(", contains mark");
        }
        int emitGroup$dataIndex = emitGroup$dataIndex(this, i);
        int i4 = i + 1;
        int emitGroup$dataIndex2 = emitGroup$dataIndex(this, i4);
        if (emitGroup$dataIndex >= 0 && emitGroup$dataIndex <= emitGroup$dataIndex2 && emitGroup$dataIndex2 <= this.slotsSize) {
            if (SlotTableKt.access$hasObjectKey(this.groups, i)) {
                sb.append(" objectKey=" + SlotTableKt.access$summarize(String.valueOf(this.slots[SlotTableKt.access$objectKeyIndex(this.groups, i)]), 10));
            }
            if (SlotTableKt.access$isNode(this.groups, i)) {
                sb.append(" node=" + SlotTableKt.access$summarize(String.valueOf(this.slots[SlotTableKt.access$nodeIndex(this.groups, i)]), 10));
            }
            if (SlotTableKt.access$hasAux(this.groups, i)) {
                sb.append(" aux=" + SlotTableKt.access$summarize(String.valueOf(this.slots[SlotTableKt.access$auxIndex(this.groups, i)]), 10));
            }
            int access$slotAnchor = SlotTableKt.access$slotAnchor(this.groups, i);
            if (access$slotAnchor < emitGroup$dataIndex2) {
                sb.append(", slots=[");
                sb.append(access$slotAnchor);
                sb.append(": ");
                for (int i5 = access$slotAnchor; i5 < emitGroup$dataIndex2; i5++) {
                    if (i5 != access$slotAnchor) {
                        sb.append(", ");
                    }
                    sb.append(SlotTableKt.access$summarize(String.valueOf(this.slots[i5]), 10));
                }
                sb.append("]");
            }
        } else {
            sb.append(", *invalid data offsets " + emitGroup$dataIndex + '-' + emitGroup$dataIndex2 + '*');
        }
        sb.append('\n');
        int i6 = i + access$groupSize;
        while (i4 < i6) {
            i4 += emitGroup(sb, i4, i2 + 1);
        }
        return access$groupSize;
    }

    private static final int emitGroup$dataIndex(SlotTable slotTable, int i) {
        return i >= slotTable.groupsSize ? slotTable.slotsSize : SlotTableKt.access$dataAnchor(slotTable.groups, i);
    }

    private final List<Integer> keys() {
        return SlotTableKt.access$keys(this.groups, this.groupsSize * 5);
    }

    private final List<Integer> nodes() {
        return SlotTableKt.access$nodeCounts(this.groups, this.groupsSize * 5);
    }

    private final List<Integer> parentIndexes() {
        return SlotTableKt.access$parentAnchors(this.groups, this.groupsSize * 5);
    }

    private final List<Integer> dataIndexes() {
        return SlotTableKt.access$dataAnchors(this.groups, this.groupsSize * 5);
    }

    private final List<Integer> groupSizes() {
        return SlotTableKt.access$groupSizes(this.groups, this.groupsSize * 5);
    }

    public final List<Object> slotsOf$runtime_release(int group) {
        int access$dataAnchor = SlotTableKt.access$dataAnchor(this.groups, group);
        int i = group + 1;
        return ArraysKt.toList(this.slots).subList(access$dataAnchor, i < this.groupsSize ? SlotTableKt.access$dataAnchor(this.groups, i) : this.slots.length);
    }

    public final Object slot$runtime_release(int group, int slotIndex) {
        int access$slotAnchor = SlotTableKt.access$slotAnchor(this.groups, group);
        int i = group + 1;
        return (slotIndex < 0 || slotIndex >= (i < this.groupsSize ? SlotTableKt.access$dataAnchor(this.groups, i) : this.slots.length) - access$slotAnchor) ? Composer.INSTANCE.getEmpty() : this.slots[access$slotAnchor + slotIndex];
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public Iterable<CompositionGroup> getCompositionGroups() {
        return this;
    }

    @Override // java.lang.Iterable
    public Iterator<CompositionGroup> iterator() {
        return new GroupIterator(this, 0, this.groupsSize);
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public CompositionGroup find(Object identityToFind) {
        return new SlotTableGroup(this, 0, 0, 4, null).find(identityToFind);
    }
}
