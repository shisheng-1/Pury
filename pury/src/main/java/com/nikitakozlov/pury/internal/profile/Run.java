package com.nikitakozlov.pury.internal.profile;

public class Run {
    private final Stage mRootStage;

    public static Run startRun(String rootStageName, int rootStageOrder) {
        return new Run(rootStageName, rootStageOrder);
    }

    private Run(String rootStageName, int rootStageOrder) {
        mRootStage = new Stage(rootStageName, rootStageOrder);
        mRootStage.start();
    }

    public StageError startStage(String stageName, int stageOrder) {
        return mRootStage.startStage(stageName, stageOrder);
    }

    public StageError stopStage(String stageName) {
         return mRootStage.stop(stageName);
    }

    public boolean isStopped() {
        return mRootStage.isStopped();
    }

    public Stage getRootStage() {
        return mRootStage;
    }
}
