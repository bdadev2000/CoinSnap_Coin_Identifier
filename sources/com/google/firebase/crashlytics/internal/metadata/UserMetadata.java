package com.google.firebase.crashlytics.internal.metadata;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.applovin.impl.ft;
import com.facebook.appevents.b;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public class UserMetadata {
    public static final String INTERNAL_KEYDATA_FILENAME = "internal-keys";
    public static final String KEYDATA_FILENAME = "keys";

    @VisibleForTesting
    public static final int MAX_ATTRIBUTES = 64;

    @VisibleForTesting
    public static final int MAX_ATTRIBUTE_SIZE = 1024;

    @VisibleForTesting
    public static final int MAX_INTERNAL_KEY_SIZE = 8192;

    @VisibleForTesting
    public static final int MAX_ROLLOUT_ASSIGNMENTS = 128;
    public static final String ROLLOUTS_STATE_FILENAME = "rollouts-state";
    public static final String USERDATA_FILENAME = "user-data";
    private final CrashlyticsWorkers crashlyticsWorkers;
    private final MetaDataStore metaDataStore;
    private String sessionIdentifier;
    private final SerializeableKeysMap customKeys = new SerializeableKeysMap(false);
    private final SerializeableKeysMap internalKeys = new SerializeableKeysMap(true);
    private final RolloutAssignmentList rolloutsState = new RolloutAssignmentList(128);
    private final AtomicMarkableReference<String> userId = new AtomicMarkableReference<>(null, false);

    /* loaded from: classes3.dex */
    public class SerializeableKeysMap {
        private final boolean isInternal;
        final AtomicMarkableReference<KeysMap> map;
        private final AtomicReference<Runnable> queuedSerializer = new AtomicReference<>(null);

        public SerializeableKeysMap(boolean z2) {
            this.isInternal = z2;
            this.map = new AtomicMarkableReference<>(new KeysMap(64, z2 ? 8192 : 1024), false);
        }

        public /* synthetic */ void lambda$scheduleSerializationTaskIfNeeded$0() {
            this.queuedSerializer.set(null);
            serializeIfMarked();
        }

        private void scheduleSerializationTaskIfNeeded() {
            a aVar = new a(this, 0);
            AtomicReference<Runnable> atomicReference = this.queuedSerializer;
            while (!atomicReference.compareAndSet(null, aVar)) {
                if (atomicReference.get() != null) {
                    return;
                }
            }
            UserMetadata.this.crashlyticsWorkers.diskWrite.submit(aVar);
        }

        private void serializeIfMarked() {
            Map<String, String> map;
            synchronized (this) {
                try {
                    if (this.map.isMarked()) {
                        map = this.map.getReference().getKeys();
                        AtomicMarkableReference<KeysMap> atomicMarkableReference = this.map;
                        atomicMarkableReference.set(atomicMarkableReference.getReference(), false);
                    } else {
                        map = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (map != null) {
                UserMetadata.this.metaDataStore.writeKeyData(UserMetadata.this.sessionIdentifier, map, this.isInternal);
            }
        }

        public Map<String, String> getKeys() {
            return this.map.getReference().getKeys();
        }

        public boolean setKey(String str, String str2) {
            synchronized (this) {
                try {
                    if (!this.map.getReference().setKey(str, str2)) {
                        return false;
                    }
                    AtomicMarkableReference<KeysMap> atomicMarkableReference = this.map;
                    atomicMarkableReference.set(atomicMarkableReference.getReference(), true);
                    scheduleSerializationTaskIfNeeded();
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void setKeys(Map<String, String> map) {
            synchronized (this) {
                this.map.getReference().setKeys(map);
                AtomicMarkableReference<KeysMap> atomicMarkableReference = this.map;
                atomicMarkableReference.set(atomicMarkableReference.getReference(), true);
            }
            scheduleSerializationTaskIfNeeded();
        }
    }

    public UserMetadata(String str, FileStore fileStore, CrashlyticsWorkers crashlyticsWorkers) {
        this.sessionIdentifier = str;
        this.metaDataStore = new MetaDataStore(fileStore);
        this.crashlyticsWorkers = crashlyticsWorkers;
    }

    public /* synthetic */ void lambda$setNewSession$0(String str, Map map, List list) {
        if (getUserId() != null) {
            this.metaDataStore.writeUserData(str, getUserId());
        }
        if (!map.isEmpty()) {
            this.metaDataStore.writeKeyData(str, map);
        }
        if (list.isEmpty()) {
            return;
        }
        this.metaDataStore.writeRolloutState(str, list);
    }

    public /* synthetic */ void lambda$updateRolloutsState$1(List list) {
        this.metaDataStore.writeRolloutState(this.sessionIdentifier, list);
    }

    public static UserMetadata loadFromExistingSession(String str, FileStore fileStore, CrashlyticsWorkers crashlyticsWorkers) {
        MetaDataStore metaDataStore = new MetaDataStore(fileStore);
        UserMetadata userMetadata = new UserMetadata(str, fileStore, crashlyticsWorkers);
        userMetadata.customKeys.map.getReference().setKeys(metaDataStore.readKeyData(str, false));
        userMetadata.internalKeys.map.getReference().setKeys(metaDataStore.readKeyData(str, true));
        userMetadata.userId.set(metaDataStore.readUserId(str), false);
        userMetadata.rolloutsState.updateRolloutAssignmentList(metaDataStore.readRolloutsState(str));
        return userMetadata;
    }

    @Nullable
    public static String readUserId(String str, FileStore fileStore) {
        return new MetaDataStore(fileStore).readUserId(str);
    }

    public void serializeUserDataIfNeeded() {
        boolean z2;
        String str;
        synchronized (this.userId) {
            try {
                z2 = false;
                if (this.userId.isMarked()) {
                    str = getUserId();
                    this.userId.set(str, false);
                    z2 = true;
                } else {
                    str = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            this.metaDataStore.writeUserData(this.sessionIdentifier, str);
        }
    }

    public Map<String, String> getCustomKeys() {
        return this.customKeys.getKeys();
    }

    public Map<String, String> getInternalKeys() {
        return this.internalKeys.getKeys();
    }

    public List<CrashlyticsReport.Session.Event.RolloutAssignment> getRolloutsState() {
        return this.rolloutsState.getReportRolloutsState();
    }

    @Nullable
    public String getUserId() {
        return this.userId.getReference();
    }

    public boolean setCustomKey(String str, String str2) {
        return this.customKeys.setKey(str, str2);
    }

    public void setCustomKeys(Map<String, String> map) {
        this.customKeys.setKeys(map);
    }

    public boolean setInternalKey(String str, String str2) {
        return this.internalKeys.setKey(str, str2);
    }

    public void setNewSession(String str) {
        synchronized (this.sessionIdentifier) {
            this.sessionIdentifier = str;
            this.crashlyticsWorkers.diskWrite.submit(new ft(8, str, this, this.customKeys.getKeys(), this.rolloutsState.getRolloutAssignmentList()));
        }
    }

    public void setUserId(String str) {
        String sanitizeString = KeysMap.sanitizeString(str, 1024);
        synchronized (this.userId) {
            try {
                if (CommonUtils.nullSafeEquals(sanitizeString, this.userId.getReference())) {
                    return;
                }
                this.userId.set(sanitizeString, true);
                this.crashlyticsWorkers.diskWrite.submit(new a(this, 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @CanIgnoreReturnValue
    public boolean updateRolloutsState(List<RolloutAssignment> list) {
        synchronized (this.rolloutsState) {
            try {
                if (!this.rolloutsState.updateRolloutAssignmentList(list)) {
                    return false;
                }
                this.crashlyticsWorkers.diskWrite.submit(new b(12, this, this.rolloutsState.getRolloutAssignmentList()));
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
