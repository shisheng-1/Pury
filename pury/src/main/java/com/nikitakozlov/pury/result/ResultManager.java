package com.nikitakozlov.pury.result;

import com.nikitakozlov.pury.result.model.ProfileResult;

import java.util.HashMap;
import java.util.Map;

public class ResultManager {

    public Map<String, ResultHandler> resultHandlers = new HashMap<>();

    public void dispatchResult(ProfileResult result) {
        for (String key : resultHandlers.keySet()) {
            resultHandlers.get(key).handleResult(result);
        }
    }

    public void addResultHander(String key, ResultHandler resultHandler) {
        resultHandlers.put(key, resultHandler);
    }

//    StringBuilder result = new StringBuilder("Profiling results");
//    String methodId = mProfilerId.getProfilerName();
//    if (!methodId.isEmpty()) {
//        result.append(" for ");
//        result.append(methodId);
//    }
//    result.append(":\n");
//    result.append(profileResult);
//    mLogger.result(LOG_TAG, result.toString());

}
