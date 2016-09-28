package com.smscountry.models.GroupCalls;

/**
 * Created by jaya on 27/09/16.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GroupCall {

    @SerializedName("GroupCallUUID")
    @Expose
    private String groupCallUUID;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("WelcomeSound")
    @Expose
    private String welcomeSound;
    @SerializedName("WaitSound")
    @Expose
    private String waitSound;
    @SerializedName("StartGroupCallOnEnter")
    @Expose
    private String startGroupCallOnEnter;
    @SerializedName("EndGroupCallOnExit")
    @Expose
    private String endGroupCallOnExit;
    @SerializedName("AnswerUrl")
    @Expose
    private String answerUrl;
    @SerializedName("Participants")
    @Expose
    private Participant[] participants;

    public String getGroupCallUUID() {
        return groupCallUUID;
    }

    public void setGroupCallUUID(String groupCallUUID) {
        this.groupCallUUID = groupCallUUID;
    }

    /**
     *
     * @return
     * The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The Name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     * The welcomeSound
     */
    public String getWelcomeSound() {
        return welcomeSound;
    }

    /**
     *
     * @param welcomeSound
     * The WelcomeSound
     */
    public void setWelcomeSound(String welcomeSound) {
        this.welcomeSound = welcomeSound;
    }

    /**
     *
     * @return
     * The waitSound
     */
    public String getWaitSound() {
        return waitSound;
    }

    /**
     *
     * @param waitSound
     * The WaitSound
     */
    public void setWaitSound(String waitSound) {
        this.waitSound = waitSound;
    }

    /**
     *
     * @return
     * The startGroupCallOnEnter
     */
    public String getStartGroupCallOnEnter() {
        return startGroupCallOnEnter;
    }

    /**
     *
     * @param startGroupCallOnEnter
     * The StartGroupCallOnEnter
     */
    public void setStartGroupCallOnEnter(String startGroupCallOnEnter) {
        this.startGroupCallOnEnter = startGroupCallOnEnter;
    }

    /**
     *
     * @return
     * The endGroupCallOnExit
     */
    public String getEndGroupCallOnExit() {
        return endGroupCallOnExit;
    }

    /**
     *
     * @param endGroupCallOnExit
     * The EndGroupCallOnExit
     */
    public void setEndGroupCallOnExit(String endGroupCallOnExit) {
        this.endGroupCallOnExit = endGroupCallOnExit;
    }

    public String getAnswerUrl() {
        return answerUrl;
    }

    public void setAnswerUrl(String answerUrl) {
        this.answerUrl = answerUrl;
    }

    /**
     *
     * @return
     * The participants
     */
    public Participant[] getParticipants() {
        return participants;
    }

    /**
     *
     * @param participants
     * The Participants
     */
    public void setParticipants(Participant[] participants) {
        this.participants = participants;
    }

}